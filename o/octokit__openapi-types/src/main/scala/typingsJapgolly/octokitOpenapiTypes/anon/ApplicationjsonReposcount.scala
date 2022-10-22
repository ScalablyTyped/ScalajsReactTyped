package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonReposcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Reposcount
}
object ApplicationjsonReposcount {
  
  inline def apply(applicationSlashjson: Reposcount): ApplicationjsonReposcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonReposcount]
  }
  
  extension [Self <: ApplicationjsonReposcount](x: Self) {
    
    inline def setApplicationSlashjson(value: Reposcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
