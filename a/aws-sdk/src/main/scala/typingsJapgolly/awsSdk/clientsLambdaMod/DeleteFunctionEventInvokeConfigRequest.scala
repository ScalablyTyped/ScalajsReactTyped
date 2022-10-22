package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFunctionEventInvokeConfigRequest extends StObject {
  
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typingsJapgolly.awsSdk.clientsLambdaMod.FunctionName
  
  /**
    * A version number or alias name.
    */
  var Qualifier: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.Qualifier] = js.undefined
}
object DeleteFunctionEventInvokeConfigRequest {
  
  inline def apply(FunctionName: FunctionName): DeleteFunctionEventInvokeConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFunctionEventInvokeConfigRequest]
  }
  
  extension [Self <: DeleteFunctionEventInvokeConfigRequest](x: Self) {
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
  }
}
