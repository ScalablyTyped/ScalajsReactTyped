package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyName
}
object ApplicationjsonBodyName {
  
  inline def apply(applicationSlashjson: BodyName): ApplicationjsonBodyName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyName]
  }
  
  extension [Self <: ApplicationjsonBodyName](x: Self) {
    
    inline def setApplicationSlashjson(value: BodyName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
