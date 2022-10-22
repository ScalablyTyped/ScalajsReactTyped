package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonHeadsha extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Headsha
}
object ApplicationjsonHeadsha {
  
  inline def apply(applicationSlashjson: Headsha): ApplicationjsonHeadsha = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonHeadsha]
  }
  
  extension [Self <: ApplicationjsonHeadsha](x: Self) {
    
    inline def setApplicationSlashjson(value: Headsha): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
