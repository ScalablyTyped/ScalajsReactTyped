package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIgnored extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Ignored
}
object ApplicationjsonIgnored {
  
  inline def apply(applicationSlashjson: Ignored): ApplicationjsonIgnored = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIgnored]
  }
  
  extension [Self <: ApplicationjsonIgnored](x: Self) {
    
    inline def setApplicationSlashjson(value: Ignored): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
