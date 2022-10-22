package typingsJapgolly.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLifecycleEventHookExecutionStatusInput extends StObject {
  
  /**
    *  The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the hooks section of the AppSpec file. 
    */
  var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined
  
  /**
    * The result of a Lambda function that validates a deployment lifecycle event. The values listed in Valid Values are valid for lifecycle statuses in general; however, only Succeeded and Failed can be passed successfully in your API call.
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.undefined
}
object PutLifecycleEventHookExecutionStatusInput {
  
  inline def apply(): PutLifecycleEventHookExecutionStatusInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusInput]
  }
  
  extension [Self <: PutLifecycleEventHookExecutionStatusInput](x: Self) {
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setLifecycleEventHookExecutionId(value: LifecycleEventHookExecutionId): Self = StObject.set(x, "lifecycleEventHookExecutionId", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventHookExecutionIdUndefined: Self = StObject.set(x, "lifecycleEventHookExecutionId", js.undefined)
    
    inline def setStatus(value: LifecycleEventStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
