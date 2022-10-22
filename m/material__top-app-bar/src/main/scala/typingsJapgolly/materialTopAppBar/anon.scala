package typingsJapgolly.materialTopAppBar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ACTIONITEMSELECTOR extends StObject {
    
    var ACTION_ITEM_SELECTOR: String
    
    var NAVIGATION_EVENT: String
    
    var NAVIGATION_ICON_SELECTOR: String
    
    var ROOT_SELECTOR: String
    
    var TITLE_SELECTOR: String
  }
  object ACTIONITEMSELECTOR {
    
    inline def apply(
      ACTION_ITEM_SELECTOR: String,
      NAVIGATION_EVENT: String,
      NAVIGATION_ICON_SELECTOR: String,
      ROOT_SELECTOR: String,
      TITLE_SELECTOR: String
    ): ACTIONITEMSELECTOR = {
      val __obj = js.Dynamic.literal(ACTION_ITEM_SELECTOR = ACTION_ITEM_SELECTOR.asInstanceOf[js.Any], NAVIGATION_EVENT = NAVIGATION_EVENT.asInstanceOf[js.Any], NAVIGATION_ICON_SELECTOR = NAVIGATION_ICON_SELECTOR.asInstanceOf[js.Any], ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACTIONITEMSELECTOR]
    }
    
    extension [Self <: ACTIONITEMSELECTOR](x: Self) {
      
      inline def setACTION_ITEM_SELECTOR(value: String): Self = StObject.set(x, "ACTION_ITEM_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setNAVIGATION_EVENT(value: String): Self = StObject.set(x, "NAVIGATION_EVENT", value.asInstanceOf[js.Any])
      
      inline def setNAVIGATION_ICON_SELECTOR(value: String): Self = StObject.set(x, "NAVIGATION_ICON_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setROOT_SELECTOR(value: String): Self = StObject.set(x, "ROOT_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setTITLE_SELECTOR(value: String): Self = StObject.set(x, "TITLE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait DEBOUNCETHROTTLERESIZETIMEMS extends StObject {
    
    var DEBOUNCE_THROTTLE_RESIZE_TIME_MS: Double
    
    var MAX_TOP_APP_BAR_HEIGHT: Double
  }
  object DEBOUNCETHROTTLERESIZETIMEMS {
    
    inline def apply(DEBOUNCE_THROTTLE_RESIZE_TIME_MS: Double, MAX_TOP_APP_BAR_HEIGHT: Double): DEBOUNCETHROTTLERESIZETIMEMS = {
      val __obj = js.Dynamic.literal(DEBOUNCE_THROTTLE_RESIZE_TIME_MS = DEBOUNCE_THROTTLE_RESIZE_TIME_MS.asInstanceOf[js.Any], MAX_TOP_APP_BAR_HEIGHT = MAX_TOP_APP_BAR_HEIGHT.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEBOUNCETHROTTLERESIZETIMEMS]
    }
    
    extension [Self <: DEBOUNCETHROTTLERESIZETIMEMS](x: Self) {
      
      inline def setDEBOUNCE_THROTTLE_RESIZE_TIME_MS(value: Double): Self = StObject.set(x, "DEBOUNCE_THROTTLE_RESIZE_TIME_MS", value.asInstanceOf[js.Any])
      
      inline def setMAX_TOP_APP_BAR_HEIGHT(value: Double): Self = StObject.set(x, "MAX_TOP_APP_BAR_HEIGHT", value.asInstanceOf[js.Any])
    }
  }
  
  trait FIXEDCLASS extends StObject {
    
    var FIXED_CLASS: String
    
    var FIXED_SCROLLED_CLASS: String
    
    var SHORT_CLASS: String
    
    var SHORT_COLLAPSED_CLASS: String
    
    var SHORT_HAS_ACTION_ITEM_CLASS: String
  }
  object FIXEDCLASS {
    
    inline def apply(
      FIXED_CLASS: String,
      FIXED_SCROLLED_CLASS: String,
      SHORT_CLASS: String,
      SHORT_COLLAPSED_CLASS: String,
      SHORT_HAS_ACTION_ITEM_CLASS: String
    ): FIXEDCLASS = {
      val __obj = js.Dynamic.literal(FIXED_CLASS = FIXED_CLASS.asInstanceOf[js.Any], FIXED_SCROLLED_CLASS = FIXED_SCROLLED_CLASS.asInstanceOf[js.Any], SHORT_CLASS = SHORT_CLASS.asInstanceOf[js.Any], SHORT_COLLAPSED_CLASS = SHORT_COLLAPSED_CLASS.asInstanceOf[js.Any], SHORT_HAS_ACTION_ITEM_CLASS = SHORT_HAS_ACTION_ITEM_CLASS.asInstanceOf[js.Any])
      __obj.asInstanceOf[FIXEDCLASS]
    }
    
    extension [Self <: FIXEDCLASS](x: Self) {
      
      inline def setFIXED_CLASS(value: String): Self = StObject.set(x, "FIXED_CLASS", value.asInstanceOf[js.Any])
      
      inline def setFIXED_SCROLLED_CLASS(value: String): Self = StObject.set(x, "FIXED_SCROLLED_CLASS", value.asInstanceOf[js.Any])
      
      inline def setSHORT_CLASS(value: String): Self = StObject.set(x, "SHORT_CLASS", value.asInstanceOf[js.Any])
      
      inline def setSHORT_COLLAPSED_CLASS(value: String): Self = StObject.set(x, "SHORT_COLLAPSED_CLASS", value.asInstanceOf[js.Any])
      
      inline def setSHORT_HAS_ACTION_ITEM_CLASS(value: String): Self = StObject.set(x, "SHORT_HAS_ACTION_ITEM_CLASS", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/top-app-bar.@material/top-app-bar/adapter.MDCTopAppBarAdapter> */
  trait PartialMDCTopAppBarAdapte extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var getTopAppBarHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getTotalActionItems: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getViewportScrollY: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var notifyNavigationIconClicked: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setStyle: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.undefined
  }
  object PartialMDCTopAppBarAdapte {
    
    inline def apply(): PartialMDCTopAppBarAdapte = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCTopAppBarAdapte]
    }
    
    extension [Self <: PartialMDCTopAppBarAdapte](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setGetTopAppBarHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getTopAppBarHeight", value.toJsFn)
      
      inline def setGetTopAppBarHeightUndefined: Self = StObject.set(x, "getTopAppBarHeight", js.undefined)
      
      inline def setGetTotalActionItems(value: CallbackTo[Double]): Self = StObject.set(x, "getTotalActionItems", value.toJsFn)
      
      inline def setGetTotalActionItemsUndefined: Self = StObject.set(x, "getTotalActionItems", js.undefined)
      
      inline def setGetViewportScrollY(value: CallbackTo[Double]): Self = StObject.set(x, "getViewportScrollY", value.toJsFn)
      
      inline def setGetViewportScrollYUndefined: Self = StObject.set(x, "getViewportScrollY", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setNotifyNavigationIconClicked(value: Callback): Self = StObject.set(x, "notifyNavigationIconClicked", value.toJsFn)
      
      inline def setNotifyNavigationIconClickedUndefined: Self = StObject.set(x, "notifyNavigationIconClicked", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetStyle(value: (/* property */ String, /* value */ String) => Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction2((t0: /* property */ String, t1: /* value */ String) => (value(t0, t1)).runNow()))
      
      inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    }
  }
}
