package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewport {
  
  trait IAndroid
    extends StObject
       with IDefault {
    
    /** [Method] Returns the value of translatable
      * @returns Object
      */
    var getTranslatable: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of translatable
      * @param translatable Object The new value.
      */
    var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IAndroid {
    
    inline def apply(): IAndroid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAndroid]
    }
    
    extension [Self <: IAndroid](x: Self) {
      
      inline def setGetTranslatable(value: CallbackTo[Any]): Self = StObject.set(x, "getTranslatable", value.toJsFn)
      
      inline def setGetTranslatableUndefined: Self = StObject.set(x, "getTranslatable", js.undefined)
      
      inline def setSetTranslatable(value: /* translatable */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setTranslatable", js.Any.fromFunction1((t0: /* translatable */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetTranslatableUndefined: Self = StObject.set(x, "setTranslatable", js.undefined)
    }
  }
  
  trait IDefault
    extends StObject
       with IContainer {
    
    /** [Config Option] (Boolean) */
    var autoMaximize: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns the value of autoMaximize
      * @returns Boolean
      */
    var getAutoMaximize: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of layout
      * @returns Object/String
      */
    var getLayout: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the current orientation
      * @returns String portrait or landscape
      */
    var getOrientation: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of preventPanning
      * @returns Boolean
      */
    var getPreventPanning: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of preventZooming
      * @returns Boolean
      */
    var getPreventZooming: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of useBodyElement
      * @returns Boolean
      */
    var getUseBodyElement: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Retrieves the document height
      * @returns Number height in pixels.
      */
    var getWindowHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Retrieves the document width
      * @returns Number width in pixels.
      */
    var getWindowWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Hides all visible menus
      * @param animation Object
      */
    var hideAllMenus: js.UndefOr[js.Function1[/* animation */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Hides a menu specified by the menu s side
      * @param side String The side which the menu is placed.
      */
    var hideMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Hides all menus except for the side specified
      * @param side String Side(s) not to hide
      * @param animation String Animation to hide with
      */
    var hideOtherMenus: js.UndefOr[
        js.Function2[
          /* side */ js.UndefOr[java.lang.String], 
          /* animation */ js.UndefOr[java.lang.String], 
          Unit
        ]
      ] = js.undefined
    
    /** [Property] (Boolean) */
    var isReady: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var preventPanning: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var preventZooming: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Removes a menu from a specified side
      * @param side String The side to remove the menu from
      */
    var removeMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of autoMaximize
      * @param autoMaximize Boolean The new value.
      */
    var setAutoMaximize: js.UndefOr[js.Function1[/* autoMaximize */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets a menu for a given side of the Viewport
      * @param menu Ext.Menu The menu to assign to the viewport
      * @param config Object The configuration for the menu.
      */
    var setMenu: js.UndefOr[js.Function2[/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of preventPanning
      * @param preventPanning Boolean The new value.
      */
    var setPreventPanning: js.UndefOr[js.Function1[/* preventPanning */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of preventZooming
      * @param preventZooming Boolean The new value.
      */
    var setPreventZooming: js.UndefOr[js.Function1[/* preventZooming */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of useBodyElement
      * @param useBodyElement Boolean The new value.
      */
    var setUseBodyElement: js.UndefOr[js.Function1[/* useBodyElement */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Shows a menu specified by the menu s side
      * @param side String The side which the menu is placed.
      */
    var showMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Toggles the menu specified by side
      * @param side String The side which the menu is placed.
      */
    var toggleMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  }
  object IDefault {
    
    inline def apply(): IDefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefault]
    }
    
    extension [Self <: IDefault](x: Self) {
      
      inline def setAutoMaximize(value: Boolean): Self = StObject.set(x, "autoMaximize", value.asInstanceOf[js.Any])
      
      inline def setAutoMaximizeUndefined: Self = StObject.set(x, "autoMaximize", js.undefined)
      
      inline def setGetAutoMaximize(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoMaximize", value.toJsFn)
      
      inline def setGetAutoMaximizeUndefined: Self = StObject.set(x, "getAutoMaximize", js.undefined)
      
      inline def setGetLayout(value: CallbackTo[Any]): Self = StObject.set(x, "getLayout", value.toJsFn)
      
      inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      inline def setGetOrientation(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getOrientation", value.toJsFn)
      
      inline def setGetOrientationUndefined: Self = StObject.set(x, "getOrientation", js.undefined)
      
      inline def setGetPreventPanning(value: CallbackTo[Boolean]): Self = StObject.set(x, "getPreventPanning", value.toJsFn)
      
      inline def setGetPreventPanningUndefined: Self = StObject.set(x, "getPreventPanning", js.undefined)
      
      inline def setGetPreventZooming(value: CallbackTo[Boolean]): Self = StObject.set(x, "getPreventZooming", value.toJsFn)
      
      inline def setGetPreventZoomingUndefined: Self = StObject.set(x, "getPreventZooming", js.undefined)
      
      inline def setGetUseBodyElement(value: CallbackTo[Boolean]): Self = StObject.set(x, "getUseBodyElement", value.toJsFn)
      
      inline def setGetUseBodyElementUndefined: Self = StObject.set(x, "getUseBodyElement", js.undefined)
      
      inline def setGetWindowHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getWindowHeight", value.toJsFn)
      
      inline def setGetWindowHeightUndefined: Self = StObject.set(x, "getWindowHeight", js.undefined)
      
      inline def setGetWindowWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWindowWidth", value.toJsFn)
      
      inline def setGetWindowWidthUndefined: Self = StObject.set(x, "getWindowWidth", js.undefined)
      
      inline def setHideAllMenus(value: /* animation */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "hideAllMenus", js.Any.fromFunction1((t0: /* animation */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setHideAllMenusUndefined: Self = StObject.set(x, "hideAllMenus", js.undefined)
      
      inline def setHideMenu(value: /* side */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "hideMenu", js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setHideMenuUndefined: Self = StObject.set(x, "hideMenu", js.undefined)
      
      inline def setHideOtherMenus(
        value: (/* side */ js.UndefOr[java.lang.String], /* animation */ js.UndefOr[java.lang.String]) => Callback
      ): Self = StObject.set(x, "hideOtherMenus", js.Any.fromFunction2((t0: /* side */ js.UndefOr[java.lang.String], t1: /* animation */ js.UndefOr[java.lang.String]) => (value(t0, t1)).runNow()))
      
      inline def setHideOtherMenusUndefined: Self = StObject.set(x, "hideOtherMenus", js.undefined)
      
      inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
      
      inline def setIsReadyUndefined: Self = StObject.set(x, "isReady", js.undefined)
      
      inline def setPreventPanning(value: Boolean): Self = StObject.set(x, "preventPanning", value.asInstanceOf[js.Any])
      
      inline def setPreventPanningUndefined: Self = StObject.set(x, "preventPanning", js.undefined)
      
      inline def setPreventZooming(value: Boolean): Self = StObject.set(x, "preventZooming", value.asInstanceOf[js.Any])
      
      inline def setPreventZoomingUndefined: Self = StObject.set(x, "preventZooming", js.undefined)
      
      inline def setRemoveMenu(value: /* side */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "removeMenu", js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setRemoveMenuUndefined: Self = StObject.set(x, "removeMenu", js.undefined)
      
      inline def setSetAutoMaximize(value: /* autoMaximize */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAutoMaximize", js.Any.fromFunction1((t0: /* autoMaximize */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetAutoMaximizeUndefined: Self = StObject.set(x, "setAutoMaximize", js.undefined)
      
      inline def setSetMenu(value: (/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "setMenu", js.Any.fromFunction2((t0: /* menu */ js.UndefOr[IMenu], t1: /* config */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setSetMenuUndefined: Self = StObject.set(x, "setMenu", js.undefined)
      
      inline def setSetPreventPanning(value: /* preventPanning */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setPreventPanning", js.Any.fromFunction1((t0: /* preventPanning */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetPreventPanningUndefined: Self = StObject.set(x, "setPreventPanning", js.undefined)
      
      inline def setSetPreventZooming(value: /* preventZooming */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setPreventZooming", js.Any.fromFunction1((t0: /* preventZooming */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetPreventZoomingUndefined: Self = StObject.set(x, "setPreventZooming", js.undefined)
      
      inline def setSetUseBodyElement(value: /* useBodyElement */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setUseBodyElement", js.Any.fromFunction1((t0: /* useBodyElement */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetUseBodyElementUndefined: Self = StObject.set(x, "setUseBodyElement", js.undefined)
      
      inline def setShowMenu(value: /* side */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "showMenu", js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setShowMenuUndefined: Self = StObject.set(x, "showMenu", js.undefined)
      
      inline def setToggleMenu(value: /* side */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "toggleMenu", js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setToggleMenuUndefined: Self = StObject.set(x, "toggleMenu", js.undefined)
    }
  }
  
  type IIos = IDefault
  
  type IViewport = IBase
  
  trait IWP
    extends StObject
       with IDefault {
    
    /** [Method] Returns the value of translatable
      * @returns Object
      */
    var getTranslatable: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of translatable
      * @param translatable Object The new value.
      */
    var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IWP {
    
    inline def apply(): IWP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWP]
    }
    
    extension [Self <: IWP](x: Self) {
      
      inline def setGetTranslatable(value: CallbackTo[Any]): Self = StObject.set(x, "getTranslatable", value.toJsFn)
      
      inline def setGetTranslatableUndefined: Self = StObject.set(x, "getTranslatable", js.undefined)
      
      inline def setSetTranslatable(value: /* translatable */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setTranslatable", js.Any.fromFunction1((t0: /* translatable */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetTranslatableUndefined: Self = StObject.set(x, "setTranslatable", js.undefined)
    }
  }
  
  trait IWindowsPhone
    extends StObject
       with IDefault {
    
    /** [Method] Returns the value of translatable
      * @returns Object
      */
    var getTranslatable: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of translatable
      * @param translatable Object The new value.
      */
    var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IWindowsPhone {
    
    inline def apply(): IWindowsPhone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWindowsPhone]
    }
    
    extension [Self <: IWindowsPhone](x: Self) {
      
      inline def setGetTranslatable(value: CallbackTo[Any]): Self = StObject.set(x, "getTranslatable", value.toJsFn)
      
      inline def setGetTranslatableUndefined: Self = StObject.set(x, "getTranslatable", js.undefined)
      
      inline def setSetTranslatable(value: /* translatable */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setTranslatable", js.Any.fromFunction1((t0: /* translatable */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetTranslatableUndefined: Self = StObject.set(x, "setTranslatable", js.undefined)
    }
  }
}
