package typingsJapgolly.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCanaryResponse extends StObject {
  
  /**
    * The full details about the canary you have created.
    */
  var Canary: js.UndefOr[typingsJapgolly.awsSdk.clientsSyntheticsMod.Canary] = js.undefined
}
object CreateCanaryResponse {
  
  inline def apply(): CreateCanaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCanaryResponse]
  }
  
  extension [Self <: CreateCanaryResponse](x: Self) {
    
    inline def setCanary(value: Canary): Self = StObject.set(x, "Canary", value.asInstanceOf[js.Any])
    
    inline def setCanaryUndefined: Self = StObject.set(x, "Canary", js.undefined)
  }
}
