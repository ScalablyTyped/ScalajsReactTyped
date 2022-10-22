package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPageurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Pageurl
}
object ApplicationjsonPageurl {
  
  inline def apply(applicationSlashjson: Pageurl): ApplicationjsonPageurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPageurl]
  }
  
  extension [Self <: ApplicationjsonPageurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Pageurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
