package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncludeallbranches extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Includeallbranches
}
object ApplicationjsonIncludeallbranches {
  
  inline def apply(applicationSlashjson: Includeallbranches): ApplicationjsonIncludeallbranches = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncludeallbranches]
  }
  
  extension [Self <: ApplicationjsonIncludeallbranches](x: Self) {
    
    inline def setApplicationSlashjson(value: Includeallbranches): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
