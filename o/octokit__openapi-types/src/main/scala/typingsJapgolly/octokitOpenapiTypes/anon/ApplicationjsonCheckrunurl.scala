package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCheckrunurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Checkrunurl
}
object ApplicationjsonCheckrunurl {
  
  inline def apply(applicationSlashjson: Checkrunurl): ApplicationjsonCheckrunurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCheckrunurl]
  }
  
  extension [Self <: ApplicationjsonCheckrunurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Checkrunurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
