package typingsJapgolly.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentGroupOutput extends StObject {
  
  /**
    * A unique deployment group ID.
    */
  var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined
}
object CreateDeploymentGroupOutput {
  
  inline def apply(): CreateDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentGroupOutput]
  }
  
  extension [Self <: CreateDeploymentGroupOutput](x: Self) {
    
    inline def setDeploymentGroupId(value: DeploymentGroupId): Self = StObject.set(x, "deploymentGroupId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupIdUndefined: Self = StObject.set(x, "deploymentGroupId", js.undefined)
  }
}
