package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var value: typingsJapgolly.ionicAngular.ionicAngularStrings.value
}
object Value {
  
  inline def apply(): Value = {
    val __obj = js.Dynamic.literal(disabled = "disabled", value = "value")
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setValue(value: value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
