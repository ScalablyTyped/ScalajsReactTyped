package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonConfigEvents extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ConfigEvents
}
object ApplicationjsonConfigEvents {
  
  inline def apply(applicationSlashjson: ConfigEvents): ApplicationjsonConfigEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonConfigEvents]
  }
  
  extension [Self <: ApplicationjsonConfigEvents](x: Self) {
    
    inline def setApplicationSlashjson(value: ConfigEvents): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
