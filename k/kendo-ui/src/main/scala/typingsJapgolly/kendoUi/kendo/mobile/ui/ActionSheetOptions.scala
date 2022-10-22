package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSheetOptions extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ ActionSheetEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ ActionSheetOpenEvent, Unit]] = js.undefined
  
  var popup: js.UndefOr[ActionSheetPopup] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ActionSheetOptions {
  
  inline def apply(): ActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSheetOptions]
  }
  
  extension [Self <: ActionSheetOptions](x: Self) {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setClose(value: /* e */ ActionSheetEvent => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: /* e */ ActionSheetEvent) => value(t0).runNow()))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ ActionSheetOpenEvent => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: /* e */ ActionSheetOpenEvent) => value(t0).runNow()))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPopup(value: ActionSheetPopup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
