
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GraphDisplay extends JPanel implements MouseMotionListener
{
    GeometricObject[] gArray; //geometric objects
    private BufferedImage image; //background image
    String description; //description of map element
    
    /**
     * Parameterized constructor.
     */
    public GraphDisplay(int frameWidth, int frameHeight, GeometricObject[] g)
    {
        gArray = g;
        description = "";
        Dimension d = new Dimension(frameWidth, frameHeight);
        setPreferredSize(d); //sets the preferred size of this panel
        addMouseMotionListener(this);
        
        //opens/read image file
        try
        {
            image = ImageIO.read(new File("PokemonMap2.png"));
        }
        catch (IOException ex)
        {
            System.out.println("Image file not found!");
        }                
    }
    
    public void mouseDragged(MouseEvent e){}

    /**
     * Determines which element the mouse button is hovering on and sets 
     * output string accordingly.
     * 
     * @param e contains current location of mouse
     */
    public void mouseMoved(MouseEvent e)
    {
        //only for coordinates lookup; remove after project completion
        System.out.println("(" + e.getPoint().x + ", " +
                           e.getPoint().y + ")");
        
        //is current mouse location inside a geometric object?
        //Set description accordingly
        int x = e.getPoint().x;
        int y = e.getPoint().y;
        Point p = new Point(e.getPoint().x, e.getPoint().y);
               
        ////////////////////////////////////////////////////////////////////////
        for (GeometricObject obj : gArray) {
        if (obj instanceof Rectangle) {
            Rectangle rect = (Rectangle) obj;
            if (rect.isPointInRectangle(p)) {
                switch (rect.getIdentifier()) {
                    case "Palet Town":
                        description = "Palet Town\nPokemons:\nTentacool";
                        break;
                    case "Route 1":
                        description = "Route 1\nPokemons:\nPidgey\nRattata";
                        break;
                    case "Viridian City":
                        description = "Viridian City\nPokeom Center\nPokemon:\nPsyduck";
                        break;
                    case "Route 2":
                        description = "Route 2\nPokemons:\nCaterpice\nWeedle\nPidgey\nRattata";
                        break;
                    case "Viridian Forest":
                        description = "Viridian Forest\nPokemons:\nCaterpice\nMetapod\nWeedle\nKakuna\nPikachu";
                        break;
                    case "Diglett's Cave":
                        description = "Diglett's Cave\nPokemons:\nDiglett\nDugtrio";
                        break;
                    case "Pewter City":
                        description = "Pewter City\nPokemart\nTrainer Type:Rock\nScience Museum";
                        break;
                    case "Route 3":
                        description = "Route 3\nPokemons:\nPidgey\nSpearow\nNidoran\nJigglypuff\nMankey";
                        break;
                    case "Mt. Moon":
                        description = "Mt. Moon\nPokemons:\nClefairy\nZubat\nParas\nGeodude";
                        break;
                    case "Rout 4":
                        description = "Rout 4\nPokemons:\nRattata\nSpearow\nEkans\nMankey";
                        break;
                    case "Cerulean City":
                        description = "Cerulean City\nGym Type: Water\nBike Shop";
                        break;
                    case "Route 5":
                        description = "Route 5\nPokemons:\nPidgey\nOddish\nMeowth";
                        break;
                    case "Saffrone City":
                        description = "Saffrone City\nGym Type\nPsychic\nSilph Company Headquarters\nMr. Psychic\nMr. Psychic";
                        break;
                    case "Route 6":
                        description = "Route 6\nPokemons:\nPidgey\nOddish\nMeowth";
                        break;
                    case "Vermillion City":
                        description = "Vermillion City\nGym Type: Electric";
                        break;
                    case "Route 7":
                        description = "Route 7\nPokemons:\nPidgey\nOddish\nMeowth\nGrowlithe";
                        break;
                    case "Celando City":
                        description = "Celando City\nGym Type: Leaf\ngame Corner\nCeladon Mansion\nCeladon Department Store";
                        break;
                    case "Route 8":
                        description = "Route 8\nPokémon found\nPidgey\nEkans\nMeowth\nGrowlithe";
                        break;
                    case "Lavander Town":
                        description = "Lavander Town\nPokémon Tower\nMr. Fuji's house";
                        break;
                    case "Rout 9":
                        description = "Rout 9\nPokémon found:\nRattata\nSpearow\nEkans";
                        break;
                    case "Route 10":
                        description = "Route 10\nPokémon found:\nSpearow\nEkans\nVoltorb";
                        break;
                    case "Rock Tunnel":
                        description = "Rock Tunnel\nPokémon found:\nZubat\nMankey\nMachop\nGeodude\nOnix";
                        break;
                    case "Pokemon Tower":
                        description = "Pokemon Tower\nPokémon found:\nGastly\nCubone\nHunter";
                        break;
                    case "Route 11":
                        description = "Route 11\nPokémon found:\nSpearow\nEkans\nDrowzee"; 
                        break;
                    case "Route 12":
                        description = "Route 12\nContains Pokemons:\nGloom\nPidgey\nOddish\nVenonat";
                        break;
                    case "Route 13":
                        description = "Route 13\nContains Pokemons:\nGloom\nPidgey\nOddish\nVenonat";   
                        break;
                    case "Route 14":
                        description = "Route 14\nPokémon found:\nPidgey\nPidgeotto\nOddish\nGloom\nVenonat\nDitto";    
                        break;
                    case "Route 15":
                        description = "Route 15\nPokémon found:\nPidgey\nPidgeotto\nOddish\nGloom\nVenonat\nDitto"; 
                        break;
                    case "Fuschia City":
                        description = "Fuschia City\nGym Type:\nPoisn Type\nSafari Zone\nSafari Warden\nFishing Guru";
                        break;
                    case "Route 16":
                        description = "Route 16\nPokémon found:\nRattata\nRaticate\nSpearow\nDOduo";  
                        break;
                    case "Route 17":
                        description = "Route 17\nPokémon found:\nRattata\nRaticate\nSpearow\nDOduo\nFearow";  
                        break;
                    case "Sea Route 18":
                        description = "Sea Route 18\nPokémon found:\nRattata\nRaticate\nSpearow\nDoduo\nFearow";  
                        break;
                    case "Route 19":
                        description = "Route 19\nPokémon found:\nTentacool\nMagicarp\nKrabby\nHorsea\nPsyduck\nSeadra\nGyarados";  
                        break;
                    case "Sea Route 20":
                        description = "Sea Route 20\nPokémon found:\nTentacool\nMagicarp\nKrabby\nHorsea\nPsyduck\nSeadra\nGyarados"; 
                        break;
                    case "Seafoam Island":
                        description = "Seafoam Island\nPokémon found:\nPsyduck\nZubat\nGolbat";  
                        break;
                    case "Route 21":
                        description = "Route 21\nPokémon found:\nTanglea\nTentacool";  
                        break;
                    case "Cinnabar Island":
                        description = "Cinnabar Island\nGym Type:\nFire Type\nPokémon Lab\nRoom 1\nRoom 2\nRoom 3\nPokémon Mansion"; 
                        break;
                    case "Route 22":
                        description = "Route 22\nPokemons:\nRattata\nMankey\nSpearow"; 
                        break;
                    case "Route 23":
                        description = "Route 23"; 
                        break;
                    case "Victory Road":
                        description = "Victory Road\nPokémon found:\nArbok\nZubat\nGolbat\nMachop\nMachoke\nGeodude\nOnix\nMarowak"; 
                        break;
                    case "Indigo Plateau":
                        description = "Indigo Plateau"; 
                        break;
                    case "Route 24":
                        description = "Route 24\nPokemons:\nCaterpie\nMetapod\nWeedle\nKakuna\nPidgey\nOddish\nAbra"; 
                        break;
                    case "Route 25":
                        description = "Route 25\nPokemons:\nCaterpie\nMetapod\nWeedle\nKakuna\nPidgey\nOddish\nAbra"; 
                        break;
                    case "Bill's House":
                        description = "Bill's House";
                        break;
                    default:
                        description = "Unknown Rectangle";
                }
                repaint();
                return;
            }
        }
        }
        ////////////////////////////////////////////////////////////////////////
        
        repaint();
    }
    
    /**
     * Paints this panel; the system invokes it every time
     * it deems necessary to redraw the panel.
     */
    @Override
    public void paint(Graphics g)
    {        
        super.paint(g); //clears window
        
        //draws background image
        Dimension d = getSize();
        g.drawImage(image, 0, 0, d.width, d.height, this);
        
        //outputs description
        g.setColor(new Color(64, 64, 64, 128));
        //g.fillRoundRect(0, 420, 150, 30, 5, 5); //bottomleft textfield for output
        g.setColor(Color.BLACK);
        g.setFont(new Font("SansSerif", Font.BOLD, 12));
        // g.drawString(description, 460, 209); //outputs description of map element
        
        String[] lines = description.split("\n");
        for (int i = 0; i < lines.length; i++) {
            g.drawString(lines[i], 460, 209 + (i * 15)); 
        }
    }
}
