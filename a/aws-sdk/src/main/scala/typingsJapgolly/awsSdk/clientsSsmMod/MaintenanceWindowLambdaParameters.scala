package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowLambdaParameters extends StObject {
  
  /**
    * Pass client-specific information to the Lambda function that you are invoking. You can then process the client information in your Lambda function as you choose through the context variable.
    */
  var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext] = js.undefined
  
  /**
    * JSON to provide to your Lambda function as input.
    */
  var Payload: js.UndefOr[MaintenanceWindowLambdaPayload] = js.undefined
  
  /**
    * (Optional) Specify an Lambda function version or alias name. If you specify a function version, the operation uses the qualified function Amazon Resource Name (ARN) to invoke a specific Lambda function. If you specify an alias name, the operation uses the alias ARN to invoke the Lambda function version to which the alias points.
    */
  var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier] = js.undefined
}
object MaintenanceWindowLambdaParameters {
  
  inline def apply(): MaintenanceWindowLambdaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowLambdaParameters]
  }
  
  extension [Self <: MaintenanceWindowLambdaParameters](x: Self) {
    
    inline def setClientContext(value: MaintenanceWindowLambdaClientContext): Self = StObject.set(x, "ClientContext", value.asInstanceOf[js.Any])
    
    inline def setClientContextUndefined: Self = StObject.set(x, "ClientContext", js.undefined)
    
    inline def setPayload(value: MaintenanceWindowLambdaPayload): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    
    inline def setQualifier(value: MaintenanceWindowLambdaQualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
  }
}
