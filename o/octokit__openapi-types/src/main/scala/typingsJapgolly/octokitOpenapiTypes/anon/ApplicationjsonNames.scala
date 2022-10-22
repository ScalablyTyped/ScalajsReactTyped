package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNames extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Names
}
object ApplicationjsonNames {
  
  inline def apply(applicationSlashjson: Names): ApplicationjsonNames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNames]
  }
  
  extension [Self <: ApplicationjsonNames](x: Self) {
    
    inline def setApplicationSlashjson(value: Names): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
