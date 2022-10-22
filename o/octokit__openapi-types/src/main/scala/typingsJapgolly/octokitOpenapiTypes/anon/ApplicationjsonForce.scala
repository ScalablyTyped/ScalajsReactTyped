package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonForce extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Force
}
object ApplicationjsonForce {
  
  inline def apply(applicationSlashjson: Force): ApplicationjsonForce = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonForce]
  }
  
  extension [Self <: ApplicationjsonForce](x: Self) {
    
    inline def setApplicationSlashjson(value: Force): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
