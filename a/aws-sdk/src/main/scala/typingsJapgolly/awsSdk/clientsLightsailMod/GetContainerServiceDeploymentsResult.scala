package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerServiceDeploymentsResult extends StObject {
  
  /**
    * An array of objects that describe deployments for a container service.
    */
  var deployments: js.UndefOr[ContainerServiceDeploymentList] = js.undefined
}
object GetContainerServiceDeploymentsResult {
  
  inline def apply(): GetContainerServiceDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerServiceDeploymentsResult]
  }
  
  extension [Self <: GetContainerServiceDeploymentsResult](x: Self) {
    
    inline def setDeployments(value: ContainerServiceDeploymentList): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: ContainerServiceDeployment*): Self = StObject.set(x, "deployments", js.Array(value*))
  }
}
