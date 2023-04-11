import java.util.ArrayList;

public class Songs {
    public class Songs {
    import java.util.Scanner;

        public class RecentlyPlayedSong {
            User user;
            Song song;
            RecentlyPlayedSong next;

            public RecentlyPlayedSong(User user, Song song, RecentlyPlayedSong next) {
                this.user = user;
                this.song = song;
                this.next = next;
            }
        }

        public class User{
            int user_id;
            String user_name;

            public User(int user_id, String user_name){
                this.user_id = user_id;
                this.user_name = user_name;
            }
        }

        public class Song{
            int song_id;
            String song_title;

            public Song(int song_id, String song_title){
                this.song_id = song_id;
                this.song_title = song_title;
            }
        }



        public class Solution{
            public int initial_capacity = 0;
            public static songsQueue = new ArrayList();
            public void playSong(Song song, User user){

                if ( songsQueue.length > 0){
                    if (songsQueue.length < initial_capacity){
                        RecentlyPlyaedSong s1 = new RececntlyPlayedSong(user, song, songsQueue.get(songsQueue.length-1));
                        ArrayList.add(s1);
                    } else{
                        RecentlyPlyaedSong s1 = new RececntlyPlayedSong(user, song, songsQueue.get(songsQueue.length-1));
                        ArrayList.add(s1);
                        ArrayList.remove(0);
                    }
                }
                else{
                    RecentlyPlyaedSong s1 = new RececntlyPlayedSong(user, song, new RecentlyPlayedSong());
                    ArrayList.add(s1);
                }


            }

            public ArrayList getQueue(){
                return songsQueue;
            }

            public ArrayList getQueueByUser(User user){
                return songsQueue.stream.filter(song -> user.user_id == song.user.user_id )
            }
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                initial_capacity = sc.nextInt();
                Solution s = new Solution();
                User user1 = new User(1, 'abc');
                User user2 = new User(2, 'abcd');
                Song song1 = new Song(1,'song1');
                Song song2 = new Song(2, 'song2');
                s.playSong(user1, song1);
                s.playSong(user2, song1);
                s.playSong(user1,song2);
                s.playSong(user2, song2);

            }
        }
    }

}
