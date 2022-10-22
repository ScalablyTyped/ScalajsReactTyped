package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  var attribute: name
}
object Attribute {
  
  inline def apply(): Attribute = {
    val __obj = js.Dynamic.literal(attribute = "name")
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setAttribute(value: name): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
  }
}
