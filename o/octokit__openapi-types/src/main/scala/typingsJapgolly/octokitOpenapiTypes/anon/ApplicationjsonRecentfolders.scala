package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRecentfolders extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Recentfolders
}
object ApplicationjsonRecentfolders {
  
  inline def apply(applicationSlashjson: Recentfolders): ApplicationjsonRecentfolders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRecentfolders]
  }
  
  extension [Self <: ApplicationjsonRecentfolders](x: Self) {
    
    inline def setApplicationSlashjson(value: Recentfolders): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
