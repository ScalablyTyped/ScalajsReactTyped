package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMaintainercanmodify extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Maintainercanmodify
}
object ApplicationjsonMaintainercanmodify {
  
  inline def apply(applicationSlashjson: Maintainercanmodify): ApplicationjsonMaintainercanmodify = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMaintainercanmodify]
  }
  
  extension [Self <: ApplicationjsonMaintainercanmodify](x: Self) {
    
    inline def setApplicationSlashjson(value: Maintainercanmodify): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
