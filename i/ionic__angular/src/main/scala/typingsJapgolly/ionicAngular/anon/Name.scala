package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.name
import typingsJapgolly.ionicAngular.ionicAngularStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var name: typingsJapgolly.ionicAngular.ionicAngularStrings.name
  
  var value: typingsJapgolly.ionicAngular.ionicAngularStrings.value
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal(color = "color", disabled = "disabled", mode = "mode", name = "name", value = "value")
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
