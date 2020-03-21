package typingsJapgolly.pulumiAws.inputMod.rds

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupParameter extends js.Object {
  /**
    * "immediate" (default), or "pending-reboot". Some
    * engines can't apply some parameters without a reboot, and you will need to
    * specify "pending-reboot" here.
    */
  var applyMethod: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the DB parameter.
    */
  var name: Input[String] = js.native
  /**
    * The value of the DB parameter.
    */
  var value: Input[String] = js.native
}

object ClusterParameterGroupParameter {
  @scala.inline
  def apply(name: Input[String], value: Input[String], applyMethod: Input[String] = null): ClusterParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupParameter]
  }
}

