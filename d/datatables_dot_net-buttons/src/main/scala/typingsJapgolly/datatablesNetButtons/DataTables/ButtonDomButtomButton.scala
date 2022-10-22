package typingsJapgolly.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonDomButtomButton
  extends StObject
     with ButtonDomButtomCommon {
  
  var active: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
}
object ButtonDomButtomButton {
  
  inline def apply(): ButtonDomButtomButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonDomButtomButton]
  }
  
  extension [Self <: ButtonDomButtomButton](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
