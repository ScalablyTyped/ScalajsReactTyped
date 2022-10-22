package typingsJapgolly.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationComponentStrategiesResponse extends StObject {
  
  /**
    *  A list of application component strategy recommendations. 
    */
  var applicationComponentStrategies: js.UndefOr[ApplicationComponentStrategies] = js.undefined
}
object GetApplicationComponentStrategiesResponse {
  
  inline def apply(): GetApplicationComponentStrategiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationComponentStrategiesResponse]
  }
  
  extension [Self <: GetApplicationComponentStrategiesResponse](x: Self) {
    
    inline def setApplicationComponentStrategies(value: ApplicationComponentStrategies): Self = StObject.set(x, "applicationComponentStrategies", value.asInstanceOf[js.Any])
    
    inline def setApplicationComponentStrategiesUndefined: Self = StObject.set(x, "applicationComponentStrategies", js.undefined)
    
    inline def setApplicationComponentStrategiesVarargs(value: ApplicationComponentStrategy*): Self = StObject.set(x, "applicationComponentStrategies", js.Array(value*))
  }
}
