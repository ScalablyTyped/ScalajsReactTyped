package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAuthorscount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Authorscount
}
object ApplicationjsonAuthorscount {
  
  inline def apply(applicationSlashjson: Authorscount): ApplicationjsonAuthorscount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAuthorscount]
  }
  
  extension [Self <: ApplicationjsonAuthorscount](x: Self) {
    
    inline def setApplicationSlashjson(value: Authorscount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
