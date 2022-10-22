package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBillable extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Billable
}
object ApplicationjsonBillable {
  
  inline def apply(applicationSlashjson: Billable): ApplicationjsonBillable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBillable]
  }
  
  extension [Self <: ApplicationjsonBillable](x: Self) {
    
    inline def setApplicationSlashjson(value: Billable): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
