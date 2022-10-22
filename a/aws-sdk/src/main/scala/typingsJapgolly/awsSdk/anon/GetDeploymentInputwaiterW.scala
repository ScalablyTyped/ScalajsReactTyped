package typingsJapgolly.awsSdk.anon

import typingsJapgolly.awsSdk.clientsCodedeployMod.DeploymentId
import typingsJapgolly.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/codedeploy.GetDeploymentInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetDeploymentInputwaiterW extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    *  The unique ID of a deployment associated with the IAM user or Amazon Web Services account. 
    */
  var deploymentId: DeploymentId
}
object GetDeploymentInputwaiterW {
  
  inline def apply(deploymentId: DeploymentId): GetDeploymentInputwaiterW = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentInputwaiterW]
  }
  
  extension [Self <: GetDeploymentInputwaiterW](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
  }
}
