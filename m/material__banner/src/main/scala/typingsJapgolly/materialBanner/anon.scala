package typingsJapgolly.materialBanner

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialBanner.constantsMod.Action
import typingsJapgolly.materialBanner.constantsMod.CloseReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@material/banner.@material/banner/adapter.MDCBannerAdapter> */
  trait PartialMDCBannerAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var getContentHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var notifyActionClicked: js.UndefOr[js.Function1[/* action */ Action, Unit]] = js.undefined
    
    var notifyClosed: js.UndefOr[js.Function1[/* reason */ CloseReason, Unit]] = js.undefined
    
    var notifyClosing: js.UndefOr[js.Function1[/* reason */ CloseReason, Unit]] = js.undefined
    
    var notifyOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var notifyOpening: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var releaseFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var setStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.undefined
    
    var trapFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PartialMDCBannerAdapter {
    
    inline def apply(): PartialMDCBannerAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCBannerAdapter]
    }
    
    extension [Self <: PartialMDCBannerAdapter](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setGetContentHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getContentHeight", value.toJsFn)
      
      inline def setGetContentHeightUndefined: Self = StObject.set(x, "getContentHeight", js.undefined)
      
      inline def setNotifyActionClicked(value: /* action */ Action => Callback): Self = StObject.set(x, "notifyActionClicked", js.Any.fromFunction1((t0: /* action */ Action) => value(t0).runNow()))
      
      inline def setNotifyActionClickedUndefined: Self = StObject.set(x, "notifyActionClicked", js.undefined)
      
      inline def setNotifyClosed(value: /* reason */ CloseReason => Callback): Self = StObject.set(x, "notifyClosed", js.Any.fromFunction1((t0: /* reason */ CloseReason) => value(t0).runNow()))
      
      inline def setNotifyClosedUndefined: Self = StObject.set(x, "notifyClosed", js.undefined)
      
      inline def setNotifyClosing(value: /* reason */ CloseReason => Callback): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1((t0: /* reason */ CloseReason) => value(t0).runNow()))
      
      inline def setNotifyClosingUndefined: Self = StObject.set(x, "notifyClosing", js.undefined)
      
      inline def setNotifyOpened(value: Callback): Self = StObject.set(x, "notifyOpened", value.toJsFn)
      
      inline def setNotifyOpenedUndefined: Self = StObject.set(x, "notifyOpened", js.undefined)
      
      inline def setNotifyOpening(value: Callback): Self = StObject.set(x, "notifyOpening", value.toJsFn)
      
      inline def setNotifyOpeningUndefined: Self = StObject.set(x, "notifyOpening", js.undefined)
      
      inline def setReleaseFocus(value: Callback): Self = StObject.set(x, "releaseFocus", value.toJsFn)
      
      inline def setReleaseFocusUndefined: Self = StObject.set(x, "releaseFocus", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetStyleProperty(value: (/* propertyName */ String, /* value */ String) => Callback): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* value */ String) => (value(t0, t1)).runNow()))
      
      inline def setSetStylePropertyUndefined: Self = StObject.set(x, "setStyleProperty", js.undefined)
      
      inline def setTrapFocus(value: Callback): Self = StObject.set(x, "trapFocus", value.toJsFn)
      
      inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
}
