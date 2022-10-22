package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateLambdaFunctionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function being disassociated.
    */
  var FunctionArn: typingsJapgolly.awsSdk.clientsConnectMod.FunctionArn
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance..
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
}
object DisassociateLambdaFunctionRequest {
  
  inline def apply(FunctionArn: FunctionArn, InstanceId: InstanceId): DisassociateLambdaFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionArn = FunctionArn.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLambdaFunctionRequest]
  }
  
  extension [Self <: DisassociateLambdaFunctionRequest](x: Self) {
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
