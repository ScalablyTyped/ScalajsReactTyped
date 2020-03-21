package typingsJapgolly.pulumiAws.inputMod.codedeploy

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupEcsService extends js.Object {
  /**
    * The name of the ECS cluster.
    */
  var clusterName: Input[String] = js.native
  /**
    * The name of the ECS service.
    */
  var serviceName: Input[String] = js.native
}

object DeploymentGroupEcsService {
  @scala.inline
  def apply(clusterName: Input[String], serviceName: Input[String]): DeploymentGroupEcsService = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentGroupEcsService]
  }
}

