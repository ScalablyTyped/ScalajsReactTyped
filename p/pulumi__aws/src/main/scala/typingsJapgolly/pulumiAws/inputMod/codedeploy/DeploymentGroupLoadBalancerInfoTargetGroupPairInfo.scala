package typingsJapgolly.pulumiAws.inputMod.codedeploy

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfo extends js.Object {
  /**
    * Configuration block for the production traffic route (documented below).
    */
  var prodTrafficRoute: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute] = js.native
  /**
    * Configuration blocks for a target group within a target group pair (documented below).
    */
  var targetGroups: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]] = js.native
  /**
    * Configuration block for the test traffic route (documented below).
    */
  var testTrafficRoute: js.UndefOr[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]] = js.native
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfo {
  @scala.inline
  def apply(
    prodTrafficRoute: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute],
    targetGroups: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]],
    testTrafficRoute: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute] = null
  ): DeploymentGroupLoadBalancerInfoTargetGroupPairInfo = {
    val __obj = js.Dynamic.literal(prodTrafficRoute = prodTrafficRoute.asInstanceOf[js.Any], targetGroups = targetGroups.asInstanceOf[js.Any])
    if (testTrafficRoute != null) __obj.updateDynamic("testTrafficRoute")(testTrafficRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]
  }
}

