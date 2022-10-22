package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonExporturl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Exporturl
}
object ApplicationjsonExporturl {
  
  inline def apply(applicationSlashjson: Exporturl): ApplicationjsonExporturl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonExporturl]
  }
  
  extension [Self <: ApplicationjsonExporturl](x: Self) {
    
    inline def setApplicationSlashjson(value: Exporturl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
