package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTotalcountNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: TotalcountNumber
}
object ApplicationjsonTotalcountNumber {
  
  inline def apply(applicationSlashjson: TotalcountNumber): ApplicationjsonTotalcountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTotalcountNumber]
  }
  
  extension [Self <: ApplicationjsonTotalcountNumber](x: Self) {
    
    inline def setApplicationSlashjson(value: TotalcountNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
