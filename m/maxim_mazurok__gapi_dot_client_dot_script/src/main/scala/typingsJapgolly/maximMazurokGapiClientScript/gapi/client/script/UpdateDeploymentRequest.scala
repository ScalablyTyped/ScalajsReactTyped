package typingsJapgolly.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeploymentRequest extends StObject {
  
  /** The deployment configuration. */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
}
object UpdateDeploymentRequest {
  
  inline def apply(): UpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeploymentRequest]
  }
  
  extension [Self <: UpdateDeploymentRequest](x: Self) {
    
    inline def setDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
  }
}
