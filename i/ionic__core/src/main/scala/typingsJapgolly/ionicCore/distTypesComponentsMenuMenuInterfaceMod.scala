package typingsJapgolly.ionicCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonMenuElement
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.mod.Side
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsMenuMenuInterfaceMod {
  
  trait MenuChangeEventDetail extends StObject {
    
    var disabled: Boolean
    
    var open: Boolean
  }
  object MenuChangeEventDetail {
    
    inline def apply(disabled: Boolean, open: Boolean): MenuChangeEventDetail = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuChangeEventDetail]
    }
    
    extension [Self <: MenuChangeEventDetail](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuControllerI extends StObject {
    
    def _createAnimation(`type`: String, menuCmp: MenuI): js.Promise[Animation]
    
    def _register(menu: MenuI): Unit
    
    def _setActiveMenu(menu: MenuI): Unit
    
    def _setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean]
    
    def _unregister(menu: MenuI): Unit
    
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]]
    
    def getOpenSync(): js.UndefOr[HTMLIonMenuElement]
  }
  object MenuControllerI {
    
    inline def apply(
      _createAnimation: (String, MenuI) => js.Promise[Animation],
      _register: MenuI => Callback,
      _setActiveMenu: MenuI => Callback,
      _setOpen: (MenuI, Boolean, Boolean) => js.Promise[Boolean],
      _unregister: MenuI => Callback,
      getMenus: CallbackTo[js.Promise[js.Array[HTMLIonMenuElement]]],
      getOpenSync: CallbackTo[js.UndefOr[HTMLIonMenuElement]]
    ): MenuControllerI = {
      val __obj = js.Dynamic.literal(_createAnimation = js.Any.fromFunction2(_createAnimation), _register = js.Any.fromFunction1((t0: MenuI) => _register(t0).runNow()), _setActiveMenu = js.Any.fromFunction1((t0: MenuI) => _setActiveMenu(t0).runNow()), _setOpen = js.Any.fromFunction3(_setOpen), _unregister = js.Any.fromFunction1((t0: MenuI) => _unregister(t0).runNow()), getMenus = getMenus.toJsFn, getOpenSync = getOpenSync.toJsFn)
      __obj.asInstanceOf[MenuControllerI]
    }
    
    extension [Self <: MenuControllerI](x: Self) {
      
      inline def setGetMenus(value: CallbackTo[js.Promise[js.Array[HTMLIonMenuElement]]]): Self = StObject.set(x, "getMenus", value.toJsFn)
      
      inline def setGetOpenSync(value: CallbackTo[js.UndefOr[HTMLIonMenuElement]]): Self = StObject.set(x, "getOpenSync", value.toJsFn)
      
      inline def set_createAnimation(value: (String, MenuI) => js.Promise[Animation]): Self = StObject.set(x, "_createAnimation", js.Any.fromFunction2(value))
      
      inline def set_register(value: MenuI => Callback): Self = StObject.set(x, "_register", js.Any.fromFunction1((t0: MenuI) => value(t0).runNow()))
      
      inline def set_setActiveMenu(value: MenuI => Callback): Self = StObject.set(x, "_setActiveMenu", js.Any.fromFunction1((t0: MenuI) => value(t0).runNow()))
      
      inline def set_setOpen(value: (MenuI, Boolean, Boolean) => js.Promise[Boolean]): Self = StObject.set(x, "_setOpen", js.Any.fromFunction3(value))
      
      inline def set_unregister(value: MenuI => Callback): Self = StObject.set(x, "_unregister", js.Any.fromFunction1((t0: MenuI) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait MenuCustomEvent[T]
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_MenuCustomEvent: T = js.native
    
    @JSName("target")
    var target_MenuCustomEvent: HTMLIonMenuElement = js.native
  }
  
  @js.native
  trait MenuI extends StObject {
    
    var _isOpen: Boolean = js.native
    
    def _setOpen(shouldOpen: Boolean): js.Promise[Boolean] = js.native
    def _setOpen(shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
    
    var backdropEl: js.UndefOr[HTMLElement] = js.native
    
    def close(): js.Promise[Boolean] = js.native
    def close(animated: Boolean): js.Promise[Boolean] = js.native
    
    var contentEl: js.UndefOr[HTMLElement] = js.native
    
    var disabled: Boolean = js.native
    
    var el: HTMLIonMenuElement = js.native
    
    def isActive(): js.Promise[Boolean] = js.native
    
    var isAnimating: Boolean = js.native
    
    var isEndSide: Boolean = js.native
    
    var menuCtrl: js.UndefOr[MenuControllerI] = js.native
    
    var menuId: js.UndefOr[String] = js.native
    
    var menuInnerEl: js.UndefOr[HTMLElement] = js.native
    
    def open(): js.Promise[Boolean] = js.native
    def open(animated: Boolean): js.Promise[Boolean] = js.native
    
    def setOpen(shouldOpen: Boolean): js.Promise[Boolean] = js.native
    def setOpen(shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
    
    var side: Side = js.native
    
    def toggle(): js.Promise[Boolean] = js.native
    def toggle(animated: Boolean): js.Promise[Boolean] = js.native
    
    var width: Double = js.native
  }
}
