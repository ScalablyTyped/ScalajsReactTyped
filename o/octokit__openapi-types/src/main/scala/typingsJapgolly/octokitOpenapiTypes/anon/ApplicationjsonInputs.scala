package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonInputs extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Inputs
}
object ApplicationjsonInputs {
  
  inline def apply(applicationSlashjson: Inputs): ApplicationjsonInputs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonInputs]
  }
  
  extension [Self <: ApplicationjsonInputs](x: Self) {
    
    inline def setApplicationSlashjson(value: Inputs): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
