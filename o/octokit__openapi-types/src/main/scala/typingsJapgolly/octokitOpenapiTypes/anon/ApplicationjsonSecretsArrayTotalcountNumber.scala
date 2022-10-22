package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSecretsArrayTotalcountNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: SecretsArrayTotalcountNumber
}
object ApplicationjsonSecretsArrayTotalcountNumber {
  
  inline def apply(applicationSlashjson: SecretsArrayTotalcountNumber): ApplicationjsonSecretsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSecretsArrayTotalcountNumber]
  }
  
  extension [Self <: ApplicationjsonSecretsArrayTotalcountNumber](x: Self) {
    
    inline def setApplicationSlashjson(value: SecretsArrayTotalcountNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
