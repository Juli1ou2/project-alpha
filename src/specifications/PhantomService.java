/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: specifications/PhantomService.java 2015-03-11 buixuan.
 * ******************************************************/
package specifications;

import tools.Position;

public interface PhantomService{
  enum MOVE { LEFT, RIGHT, UP, DOWN }

    Position getPosition();
  MOVE getAction();
  void setPosition(Position p);
}
