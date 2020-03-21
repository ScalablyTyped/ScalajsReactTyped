package typingsJapgolly.ionicCore.menuInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonMenuElement
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuControllerI extends js.Object {
  def _createAnimation(`type`: String, menuCmp: MenuI): js.Promise[Animation]
  def _register(menu: MenuI): Unit
  def _setActiveMenu(menu: MenuI): Unit
  def _setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean]
  def _unregister(menu: MenuI): Unit
  def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]]
  def getOpenSync(): js.UndefOr[HTMLIonMenuElement]
}

object MenuControllerI {
  @scala.inline
  def apply(
    _createAnimation: (String, MenuI) => CallbackTo[js.Promise[Animation]],
    _register: MenuI => Callback,
    _setActiveMenu: MenuI => Callback,
    _setOpen: (MenuI, Boolean, Boolean) => CallbackTo[js.Promise[Boolean]],
    _unregister: MenuI => Callback,
    getMenus: CallbackTo[js.Promise[js.Array[HTMLIonMenuElement]]],
    getOpenSync: CallbackTo[js.UndefOr[HTMLIonMenuElement]]
  ): MenuControllerI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_createAnimation")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.ionicCore.menuInterfaceMod.MenuI) => _createAnimation(t0, t1).runNow()))
    __obj.updateDynamic("_register")(js.Any.fromFunction1((t0: typingsJapgolly.ionicCore.menuInterfaceMod.MenuI) => _register(t0).runNow()))
    __obj.updateDynamic("_setActiveMenu")(js.Any.fromFunction1((t0: typingsJapgolly.ionicCore.menuInterfaceMod.MenuI) => _setActiveMenu(t0).runNow()))
    __obj.updateDynamic("_setOpen")(js.Any.fromFunction3((t0: typingsJapgolly.ionicCore.menuInterfaceMod.MenuI, t1: scala.Boolean, t2: scala.Boolean) => _setOpen(t0, t1, t2).runNow()))
    __obj.updateDynamic("_unregister")(js.Any.fromFunction1((t0: typingsJapgolly.ionicCore.menuInterfaceMod.MenuI) => _unregister(t0).runNow()))
    __obj.updateDynamic("getMenus")(getMenus.toJsFn)
    __obj.updateDynamic("getOpenSync")(getOpenSync.toJsFn)
    __obj.asInstanceOf[MenuControllerI]
  }
}

