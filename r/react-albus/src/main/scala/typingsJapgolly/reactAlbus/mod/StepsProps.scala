package typingsJapgolly.reactAlbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps extends js.Object {
  var step: js.UndefOr[StepObject] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(step: StepObject = null): StepsProps = {
    val __obj = js.Dynamic.literal()
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsProps]
  }
}

