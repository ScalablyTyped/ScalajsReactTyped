package typingsJapgolly.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentTargetInput extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  The unique ID of a deployment target. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
}
object GetDeploymentTargetInput {
  
  inline def apply(): GetDeploymentTargetInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentTargetInput]
  }
  
  extension [Self <: GetDeploymentTargetInput](x: Self) {
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
