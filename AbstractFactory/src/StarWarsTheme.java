import javax.swing.*;
import javax.swing.JButton;

/**
 * Created by Yohan on 11/01/2017.
 */

public class StarWarsTheme implements IThemeFactory
{
    @Override
    public JButton createButton()
    {
        return new StarWarsThemeButton();
    }
}
