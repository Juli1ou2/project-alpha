/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: specifications/WriteService.java 2015-03-11 buixuan.
 * ******************************************************/
package specifications;

import tools.Position;
import tools.Sound;

import java.util.ArrayList;

public interface WriteService {
  void setHeroesPosition(Position p);
  void setStepNumber(int n);
  void addPhantom(Position p);
  void setPhantoms(ArrayList<PhantomService> phantoms);
  void setSoundEffect(Sound.SOUND s);
  void addScore(int score);
}
