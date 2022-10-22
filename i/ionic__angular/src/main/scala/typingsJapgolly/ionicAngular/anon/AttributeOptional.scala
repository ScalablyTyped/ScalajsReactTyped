package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularBooleans.`true`
import typingsJapgolly.ionicAngular.ionicAngularStrings.tabs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeOptional extends StObject {
  
  var attribute: tabs
  
  var optional: `true`
}
object AttributeOptional {
  
  inline def apply(): AttributeOptional = {
    val __obj = js.Dynamic.literal(attribute = "tabs", optional = true)
    __obj.asInstanceOf[AttributeOptional]
  }
  
  extension [Self <: AttributeOptional](x: Self) {
    
    inline def setAttribute(value: tabs): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
