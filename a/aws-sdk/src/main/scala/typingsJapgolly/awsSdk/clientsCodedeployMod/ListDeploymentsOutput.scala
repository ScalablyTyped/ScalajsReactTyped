package typingsJapgolly.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentsOutput extends StObject {
  
  /**
    * A list of deployment IDs.
    */
  var deployments: js.UndefOr[DeploymentsList] = js.undefined
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployments call to return the next set of deployments in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDeploymentsOutput {
  
  inline def apply(): ListDeploymentsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsOutput]
  }
  
  extension [Self <: ListDeploymentsOutput](x: Self) {
    
    inline def setDeployments(value: DeploymentsList): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: DeploymentId*): Self = StObject.set(x, "deployments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
