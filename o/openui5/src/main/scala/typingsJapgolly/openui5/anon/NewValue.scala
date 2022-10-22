package typingsJapgolly.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValue extends StObject {
  
  /**
    * Current search string.
    */
  var newValue: js.UndefOr[String] = js.undefined
}
object NewValue {
  
  inline def apply(): NewValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewValue]
  }
  
  extension [Self <: NewValue](x: Self) {
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
  }
}
