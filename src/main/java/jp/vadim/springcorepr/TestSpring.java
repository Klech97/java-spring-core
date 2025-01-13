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
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playListMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();

    }
}
