/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: specifications/ReadService.java 2015-03-11 buixuan.
 * ******************************************************/
package specifications;

import tools.Position;
import tools.Sound;

import java.util.ArrayList;

public interface ReadService {
  Position getHeroesPosition();
  double getHeroesWidth();
  double getHeroesHeight();
  double getPhantomWidth();
  double getPhantomHeight();
  int getStepNumber();
  int getScore();
  ArrayList<PhantomService> getPhantoms();
  Sound.SOUND getSoundEffect();
}
