/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Amanda
 */
public class ImageLoader {
    
    /**
     * loads in the images to be used in the game
     * @param file name of the file images is in
     * @return null
     */
    public static BufferedImage image(String file){
        
        try {
            return ImageIO.read(ImageLoader.class.getResource("/textures/" + file));
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
