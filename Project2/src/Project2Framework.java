
import javax.swing.*;

/**
 * Project 2 code skeleton; shows how to add a background image.
 * 
 * @author Antonio Hernandez
 */
public class Project2Framework
{
    public static void main(String[] args)
    {
        new Project2Framework();
    }
    
    public Project2Framework()
    {        
        //Defining the geometric objects that represent the problem data
        GeometricObject[] g = new GeometricObject[45];
        
        ////////////////////////////////////////////////////////////////////////
        g[0] = new Rectangle("Palet Town", new Point(87, 344), new Point(104, 367));
        g[1] = new Rectangle("Route 1", new Point(90, 285), new Point(102, 338));
        g[2] = new Rectangle("Viridian City", new Point(80, 241), new Point(112, 280));
        g[3] = new Rectangle("Route 2", new Point(90, 196), new Point(101, 234));
        g[4] = new Rectangle("Viridian Forest", new Point(86, 167), new Point(106, 191));
        g[41] = new Rectangle("Diglett's Cave", new Point(107, 138), new Point(128, 162));
        g[5] = new Rectangle("Pewter City", new Point(86, 110), new Point(106, 134));
        g[6] = new Rectangle("Route 3", new Point(107, 88), new Point(168, 128));
        g[7] = new Rectangle("Mt. Moon", new Point(172, 79), new Point(194, 104));
        g[8] = new Rectangle("Rout 4", new Point(197, 85), new Point(260, 99));
        g[9] = new Rectangle("Cerulean City", new Point(262, 80), new Point(282, 106));
        g[10] = new Rectangle("Route 5", new Point(267, 108), new Point(278, 163));
        g[11] = new Rectangle("Saffrone City", new Point(262, 167), new Point(284, 194));
        g[12] = new Rectangle("Route 6", new Point(267, 196), new Point(277, 280));
        g[13] = new Rectangle("Vermillion City", new Point(262, 285), new Point(283, 311));
        g[14] = new Rectangle("Route 7", new Point(218, 173), new Point(261, 188));
        g[15] = new Rectangle("Celando City", new Point(194, 167), new Point(218, 194));
        g[16] = new Rectangle("Route 8", new Point(284, 172), new Point(349, 187));
        g[17] = new Rectangle("Lavander Town", new Point(349, 167), new Point(371, 194));
        g[18] = new Rectangle("Rout 9", new Point(285, 86), new Point(367, 107));
        g[19] = new Rectangle("Route 10", new Point(354, 135), new Point(367, 164));
        g[20] = new Rectangle("Rock Tunnel", new Point(349, 110), new Point(371, 132));
        g[42] = new Rectangle("Pokemon Tower", new Point(373, 139), new Point(393, 162));
        g[21] = new Rectangle("Route 11", new Point(284, 290), new Point(353, 304));
        g[22] = new Rectangle("Route 12", new Point(355, 196), new Point(367, 363));
        g[23] = new Rectangle("Route 13", new Point(289, 348), new Point(367, 363));
        g[24] = new Rectangle("Route 14", new Point(291, 365), new Point(301, 421));
        g[25] = new Rectangle("Route 15", new Point(241, 406), new Point(287, 420));
        g[26] = new Rectangle("Fuschia City", new Point(216, 399), new Point(238, 428));
        g[27] = new Rectangle("Route 16", new Point(135, 173), new Point(193, 187));
        g[27] = new Rectangle("Route 17", new Point(135, 187), new Point(147, 404));
        g[28] = new Rectangle("Sea Route 18", new Point(133, 405), new Point(215, 420));
        g[29] = new Rectangle("Route 19", new Point(172, 432), new Point(233, 477));
        g[30] = new Rectangle("Sea Route 20", new Point(108, 464), new Point(151, 480));
        g[31] = new Rectangle("Seafoam Island", new Point(151, 462), new Point(173, 485));
        g[32] = new Rectangle("Route 21", new Point(89, 371), new Point(102, 457));
        g[33] = new Rectangle("Cinnabar Island", new Point(85, 459), new Point(107, 486));
        g[34] = new Rectangle("Route 22", new Point(46, 258), new Point(76, 276));
        g[35] = new Rectangle("Route 23", new Point(46, 166), new Point(57, 257));
        g[36] = new Rectangle("Victory Road", new Point(40, 138), new Point(63, 153));
        g[37] = new Rectangle("Indigo Plateau", new Point(34, 70), new Point(70, 116));
        g[38] = new Rectangle("Route 24", new Point(267, 41), new Point(277, 76));
        g[39] = new Rectangle("Route 25", new Point(266, 28), new Point(320, 42));
        g[40] = new Rectangle("Bill's House", new Point(321, 27), new Point(340, 44));
        ////////////////////////////////////////////////////////////////////////        
        
        //graphing
        FrameDisplay frame = new FrameDisplay(g);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
