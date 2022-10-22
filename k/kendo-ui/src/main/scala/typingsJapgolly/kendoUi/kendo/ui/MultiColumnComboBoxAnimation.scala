package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiColumnComboBoxAnimation extends StObject {
  
  var close: js.UndefOr[MultiColumnComboBoxAnimationClose] = js.undefined
  
  var open: js.UndefOr[MultiColumnComboBoxAnimationOpen] = js.undefined
}
object MultiColumnComboBoxAnimation {
  
  inline def apply(): MultiColumnComboBoxAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnComboBoxAnimation]
  }
  
  extension [Self <: MultiColumnComboBoxAnimation](x: Self) {
    
    inline def setClose(value: MultiColumnComboBoxAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: MultiColumnComboBoxAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
