package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationConfig extends StObject {
  
  /**
    * The destination configuration for failed invocations.
    */
  var OnFailure: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.OnFailure] = js.undefined
  
  /**
    * The destination configuration for successful invocations.
    */
  var OnSuccess: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.OnSuccess] = js.undefined
}
object DestinationConfig {
  
  inline def apply(): DestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationConfig]
  }
  
  extension [Self <: DestinationConfig](x: Self) {
    
    inline def setOnFailure(value: OnFailure): Self = StObject.set(x, "OnFailure", value.asInstanceOf[js.Any])
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "OnFailure", js.undefined)
    
    inline def setOnSuccess(value: OnSuccess): Self = StObject.set(x, "OnSuccess", value.asInstanceOf[js.Any])
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
  }
}
