package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepIcon/StepIcon.StepIconClasskey>> */
@js.native
trait PartialClassNameMapStepIc extends js.Object {
  var active: js.UndefOr[String] = js.native
  var completed: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object PartialClassNameMapStepIc {
  @scala.inline
  def apply(
    active: String = null,
    completed: String = null,
    error: String = null,
    root: String = null,
    text: String = null
  ): PartialClassNameMapStepIc = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapStepIc]
  }
}

