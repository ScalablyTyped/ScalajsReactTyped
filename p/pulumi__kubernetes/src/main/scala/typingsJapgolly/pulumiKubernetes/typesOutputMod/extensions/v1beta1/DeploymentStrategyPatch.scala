package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DeploymentStrategy describes how to replace existing pods with new ones.
  */
trait DeploymentStrategyPatch extends StObject {
  
  /**
    * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
    */
  var rollingUpdate: RollingUpdateDeploymentPatch
  
  /**
    * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
    */
  var `type`: String
}
object DeploymentStrategyPatch {
  
  inline def apply(rollingUpdate: RollingUpdateDeploymentPatch, `type`: String): DeploymentStrategyPatch = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStrategyPatch]
  }
  
  extension [Self <: DeploymentStrategyPatch](x: Self) {
    
    inline def setRollingUpdate(value: RollingUpdateDeploymentPatch): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
