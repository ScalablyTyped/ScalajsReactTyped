package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.animationInterfaceMod.Animation
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonMenuElement
import typingsJapgolly.ionicCore.menuInterfaceMod.MenuI
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/menu-controller", JSImport.Namespace)
@js.native
object utilsMenuControllerMod extends js.Object {
  @js.native
  object menuController extends js.Object {
    def _createAnimation(`type`: String, menuCmp: MenuI): js.Any = js.native
    def _getOpenSync(): js.UndefOr[HTMLIonMenuElement] = js.native
    def _register(menu: MenuI): Unit = js.native
    def _setActiveMenu(menu: MenuI): Unit = js.native
    def _setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
    def _unregister(menu: MenuI): Unit = js.native
    def close(): js.Promise[Boolean] = js.native
    def close(menu: String): js.Promise[Boolean] = js.native
    def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def isAnimating(): js.Promise[Boolean] = js.native
    def isEnabled(): js.Promise[Boolean] = js.native
    def isEnabled(menu: String): js.Promise[Boolean] = js.native
    def isOpen(): js.Promise[Boolean] = js.native
    def isOpen(menu: String): js.Promise[Boolean] = js.native
    def open(): js.Promise[Boolean] = js.native
    def open(menu: String): js.Promise[Boolean] = js.native
    def registerAnimation(name: String, animation: js.Function1[/* menu */ MenuI, Animation]): Unit = js.native
    def registerAnimation(name: String, animation: AnimationBuilder): Unit = js.native
    def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def toggle(): js.Promise[Boolean] = js.native
    def toggle(menu: String): js.Promise[Boolean] = js.native
  }
  
}

