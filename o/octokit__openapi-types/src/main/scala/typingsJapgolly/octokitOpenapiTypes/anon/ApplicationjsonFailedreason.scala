package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonFailedreason extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Failedreason
}
object ApplicationjsonFailedreason {
  
  inline def apply(applicationSlashjson: Failedreason): ApplicationjsonFailedreason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonFailedreason]
  }
  
  extension [Self <: ApplicationjsonFailedreason](x: Self) {
    
    inline def setApplicationSlashjson(value: Failedreason): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
