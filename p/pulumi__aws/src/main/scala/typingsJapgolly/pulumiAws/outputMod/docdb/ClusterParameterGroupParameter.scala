package typingsJapgolly.pulumiAws.outputMod.docdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupParameter extends js.Object {
  /**
    * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[String] = js.native
  /**
    * The name of the documentDB parameter.
    */
  var name: String = js.native
  /**
    * The value of the documentDB parameter.
    */
  var value: String = js.native
}

object ClusterParameterGroupParameter {
  @scala.inline
  def apply(name: String, value: String, applyMethod: String = null): ClusterParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupParameter]
  }
}

