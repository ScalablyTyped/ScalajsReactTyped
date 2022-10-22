package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFunctionCodeSigningConfigRequest extends StObject {
  
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typingsJapgolly.awsSdk.clientsLambdaMod.FunctionName
}
object DeleteFunctionCodeSigningConfigRequest {
  
  inline def apply(FunctionName: FunctionName): DeleteFunctionCodeSigningConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFunctionCodeSigningConfigRequest]
  }
  
  extension [Self <: DeleteFunctionCodeSigningConfigRequest](x: Self) {
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
  }
}
