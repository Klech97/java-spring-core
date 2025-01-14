package jp.vadim.springcorepr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml");
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());

        //Music music = (Music) context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer==secondMusicPlayer;

        System.out.println(comparison);

        firstMusicPlayer.playMusic();
        firstMusicPlayer.playListMusic();

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        context.close();

    }
}
