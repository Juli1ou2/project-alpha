/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: specifications/EngineService.java 2015-03-11 buixuan.
 * ******************************************************/
package specifications;

import tools.User;

public interface EngineService{
  void init();
  void start();
  void stop();
  void setHeroesCommand(User.COMMAND c);
  void releaseHeroesCommand(User.COMMAND c);
}
