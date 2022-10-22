package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEdgeDeploymentPlanResponse extends StObject {
  
  /**
    * The ARN of the edge deployment plan.
    */
  var EdgeDeploymentPlanArn: typingsJapgolly.awsSdk.clientsSagemakerMod.EdgeDeploymentPlanArn
}
object CreateEdgeDeploymentPlanResponse {
  
  inline def apply(EdgeDeploymentPlanArn: EdgeDeploymentPlanArn): CreateEdgeDeploymentPlanResponse = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanArn = EdgeDeploymentPlanArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEdgeDeploymentPlanResponse]
  }
  
  extension [Self <: CreateEdgeDeploymentPlanResponse](x: Self) {
    
    inline def setEdgeDeploymentPlanArn(value: EdgeDeploymentPlanArn): Self = StObject.set(x, "EdgeDeploymentPlanArn", value.asInstanceOf[js.Any])
  }
}
