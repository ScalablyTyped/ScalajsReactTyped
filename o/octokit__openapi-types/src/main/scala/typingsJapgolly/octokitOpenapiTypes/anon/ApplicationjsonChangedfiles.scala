package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonChangedfiles extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Changedfiles
}
object ApplicationjsonChangedfiles {
  
  inline def apply(applicationSlashjson: Changedfiles): ApplicationjsonChangedfiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonChangedfiles]
  }
  
  extension [Self <: ApplicationjsonChangedfiles](x: Self) {
    
    inline def setApplicationSlashjson(value: Changedfiles): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
