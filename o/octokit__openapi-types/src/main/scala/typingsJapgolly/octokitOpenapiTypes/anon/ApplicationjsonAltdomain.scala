package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAltdomain extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Altdomain
}
object ApplicationjsonAltdomain {
  
  inline def apply(applicationSlashjson: Altdomain): ApplicationjsonAltdomain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAltdomain]
  }
  
  extension [Self <: ApplicationjsonAltdomain](x: Self) {
    
    inline def setApplicationSlashjson(value: Altdomain): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
