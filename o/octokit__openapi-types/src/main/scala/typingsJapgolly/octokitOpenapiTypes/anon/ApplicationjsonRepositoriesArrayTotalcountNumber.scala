package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoriesArrayTotalcountNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RepositoriesArrayTotalcountNumber
}
object ApplicationjsonRepositoriesArrayTotalcountNumber {
  
  inline def apply(applicationSlashjson: RepositoriesArrayTotalcountNumber): ApplicationjsonRepositoriesArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoriesArrayTotalcountNumber]
  }
  
  extension [Self <: ApplicationjsonRepositoriesArrayTotalcountNumber](x: Self) {
    
    inline def setApplicationSlashjson(value: RepositoriesArrayTotalcountNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
