package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.allowEmptySelection
import typingsJapgolly.ionicAngular.ionicAngularStrings.name
import typingsJapgolly.ionicAngular.ionicAngularStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowEmptySelection extends StObject {
  
  var allowEmptySelection: typingsJapgolly.ionicAngular.ionicAngularStrings.allowEmptySelection
  
  var name: typingsJapgolly.ionicAngular.ionicAngularStrings.name
  
  var value: typingsJapgolly.ionicAngular.ionicAngularStrings.value
}
object AllowEmptySelection {
  
  inline def apply(): AllowEmptySelection = {
    val __obj = js.Dynamic.literal(allowEmptySelection = "allowEmptySelection", name = "name", value = "value")
    __obj.asInstanceOf[AllowEmptySelection]
  }
  
  extension [Self <: AllowEmptySelection](x: Self) {
    
    inline def setAllowEmptySelection(value: allowEmptySelection): Self = StObject.set(x, "allowEmptySelection", value.asInstanceOf[js.Any])
    
    inline def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
