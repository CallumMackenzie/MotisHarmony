/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprunner;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import model.Encryption;
import model.MusicPlayerManager;
import model.PathsManager;
import model.YoutubeVideoPageParser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import view.MainViewRunner;

//import ws.schild.jave.process.ffmpeg.DefaultFFMPEGLocator;
//If you can't create a new fmxl file look here https://www.youtube.com/watch?v=knbw1MvMfBA&t=245s
/**
 *
 * @author Jake Yeo
 */
public class AppRunner {

    public static void main(String[] args) throws MalformedURLException, IOException, Exception {
        
        PathsManager.setUpFolders();
        PathsManager.clearDownloadedWebaDirectory();//This will delete all the weba files inside the downloadedWeba directory so that weba files don't start to collect and take up space
        MainViewRunner.launchPanel(args);
//playlist 511 index https://www.youtube.com/watch?v=RgKAFK5djSk&list=PLeCdlPO-XhWFzEVynMsmosfdRsIZXhZi0&index=1 // playlist with 5000 videos
        //   YoutubeDownloaderManager.downloadYoutubeVideoUrl("https://youtu.be/T_lC2O1oIew");       
        //  YoutubeDownloaderManager.downloadSongsFromPlaylist("https://www.youtube.com/watch?v=X4bgXH3sJ2Q&list=PLWwAypAcFRgKAIIFqBr9oy-ZYZnixa_Fj&index=399"); //Playlists to test https://www.youtube.com/watch?v=JpSuinPCxBU&list=PLuDoiEqVUgejiZy0AOEEOLY2YFFXncwEA  https://www.youtube.com/watch?v=1XtD4bgz7A0&list=PLleY9vT8KgEjaoNn9HwNceQ28i90HsqZE&index=2 
//YoutubeDownloaderManager.downloadYoutubeUrlAudioSourceToFile("https://www.youtube.com/watch?v=h_m-BjrxmgI");//System.out.print("Input a youtube video you want to download: ");
        //Scanner userInput = new Scanner(System.in);
        // YoutubeDownloaderManager.downloadYoutubeUrlAudioSourceToFile(userInput.next());
    }
}
