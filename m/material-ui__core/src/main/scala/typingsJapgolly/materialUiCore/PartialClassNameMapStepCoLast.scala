package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepContent/StepContent.StepContentClasskey>> */
@js.native
trait PartialClassNameMapStepCoLast extends js.Object {
  var last: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var transition: js.UndefOr[String] = js.native
}

object PartialClassNameMapStepCoLast {
  @scala.inline
  def apply(last: String = null, root: String = null, transition: String = null): PartialClassNameMapStepCoLast = {
    val __obj = js.Dynamic.literal()
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapStepCoLast]
  }
}

