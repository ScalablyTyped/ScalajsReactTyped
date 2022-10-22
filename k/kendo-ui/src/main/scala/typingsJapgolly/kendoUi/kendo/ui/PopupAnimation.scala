package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupAnimation extends StObject {
  
  var close: js.UndefOr[PopupAnimationClose] = js.undefined
  
  var open: js.UndefOr[PopupAnimationOpen] = js.undefined
}
object PopupAnimation {
  
  inline def apply(): PopupAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupAnimation]
  }
  
  extension [Self <: PopupAnimation](x: Self) {
    
    inline def setClose(value: PopupAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: PopupAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
