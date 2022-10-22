package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSelectAnimation extends StObject {
  
  var close: js.UndefOr[MultiSelectAnimationClose] = js.undefined
  
  var open: js.UndefOr[MultiSelectAnimationOpen] = js.undefined
}
object MultiSelectAnimation {
  
  inline def apply(): MultiSelectAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectAnimation]
  }
  
  extension [Self <: MultiSelectAnimation](x: Self) {
    
    inline def setClose(value: MultiSelectAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: MultiSelectAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
