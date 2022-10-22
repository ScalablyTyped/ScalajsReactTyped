package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDefaults extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Defaults
}
object ApplicationjsonDefaults {
  
  inline def apply(applicationSlashjson: Defaults): ApplicationjsonDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDefaults]
  }
  
  extension [Self <: ApplicationjsonDefaults](x: Self) {
    
    inline def setApplicationSlashjson(value: Defaults): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
