package typingsJapgolly.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentOutput extends StObject {
  
  /**
    * Information about the deployment.
    */
  var deploymentInfo: js.UndefOr[DeploymentInfo] = js.undefined
}
object GetDeploymentOutput {
  
  inline def apply(): GetDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentOutput]
  }
  
  extension [Self <: GetDeploymentOutput](x: Self) {
    
    inline def setDeploymentInfo(value: DeploymentInfo): Self = StObject.set(x, "deploymentInfo", value.asInstanceOf[js.Any])
    
    inline def setDeploymentInfoUndefined: Self = StObject.set(x, "deploymentInfo", js.undefined)
  }
}
