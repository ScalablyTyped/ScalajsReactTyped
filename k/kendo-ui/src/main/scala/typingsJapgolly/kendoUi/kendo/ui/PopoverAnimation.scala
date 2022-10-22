package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverAnimation extends StObject {
  
  var close: js.UndefOr[PopoverAnimationClose] = js.undefined
  
  var open: js.UndefOr[PopoverAnimationOpen] = js.undefined
}
object PopoverAnimation {
  
  inline def apply(): PopoverAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverAnimation]
  }
  
  extension [Self <: PopoverAnimation](x: Self) {
    
    inline def setClose(value: PopoverAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: PopoverAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
