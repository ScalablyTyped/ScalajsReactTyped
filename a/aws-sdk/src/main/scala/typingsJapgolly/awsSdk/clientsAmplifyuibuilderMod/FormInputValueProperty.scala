package typingsJapgolly.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormInputValueProperty extends StObject {
  
  /**
    * The value to assign to the input field.
    */
  var value: js.UndefOr[String] = js.undefined
}
object FormInputValueProperty {
  
  inline def apply(): FormInputValueProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormInputValueProperty]
  }
  
  extension [Self <: FormInputValueProperty](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
