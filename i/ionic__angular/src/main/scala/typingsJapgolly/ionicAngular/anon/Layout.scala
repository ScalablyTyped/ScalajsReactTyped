package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.layout
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var layout: typingsJapgolly.ionicAngular.ionicAngularStrings.layout
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var `type`: typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
  
  var value: typingsJapgolly.ionicAngular.ionicAngularStrings.value
}
object Layout {
  
  inline def apply(): Layout = {
    val __obj = js.Dynamic.literal(disabled = "disabled", layout = "layout", mode = "mode", value = "value")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
