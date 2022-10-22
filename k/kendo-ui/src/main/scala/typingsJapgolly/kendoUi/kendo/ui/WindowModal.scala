package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowModal extends StObject {
  
  var preventScroll: js.UndefOr[Boolean] = js.undefined
}
object WindowModal {
  
  inline def apply(): WindowModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowModal]
  }
  
  extension [Self <: WindowModal](x: Self) {
    
    inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
  }
}
