package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBadgeurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Badgeurl
}
object ApplicationjsonBadgeurl {
  
  inline def apply(applicationSlashjson: Badgeurl): ApplicationjsonBadgeurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBadgeurl]
  }
  
  extension [Self <: ApplicationjsonBadgeurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Badgeurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
