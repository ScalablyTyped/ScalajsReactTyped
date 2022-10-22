package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMenuMenuInterfaceMod.MenuI
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonMenuElement
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMenuControllerMod {
  
  object menuController {
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def close(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Promise[Boolean]]
    inline def close(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def createAnimation(`type`: String, menuCmp: MenuI): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createAnimation")(`type`.asInstanceOf[js.Any], menuCmp.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(shouldEnable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    inline def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(shouldEnable.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    inline def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    inline def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    inline def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenus")().asInstanceOf[js.Promise[js.Array[HTMLIonMenuElement]]]
    
    inline def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpen")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    inline def getOpenSync(): js.UndefOr[HTMLIonMenuElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getOpenSync")().asInstanceOf[js.UndefOr[HTMLIonMenuElement]]
    
    inline def isAnimating(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimating")().asInstanceOf[js.Promise[Boolean]]
    
    inline def isEnabled(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[js.Promise[Boolean]]
    inline def isEnabled(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def isOpen(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")().asInstanceOf[js.Promise[Boolean]]
    inline def isOpen(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def open(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[js.Promise[Boolean]]
    inline def open(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def register(menu: MenuI): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_register")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerAnimation(name: String, animation: AnimationBuilder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(name.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setActiveMenu(menu: MenuI): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setActiveMenu")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("_setOpen")(menu.asInstanceOf[js.Any], shouldOpen.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    inline def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("swipeGesture")(shouldEnable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    inline def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("swipeGesture")(shouldEnable.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    inline def toggle(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[js.Promise[Boolean]]
    inline def toggle(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def unregister(menu: MenuI): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_unregister")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
