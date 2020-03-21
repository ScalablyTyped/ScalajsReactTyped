package typingsJapgolly.fullcalendar.parsableModelMixinMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsableModelInterface extends js.Object {
  def applyManualStandardProps(rawProps: js.Any): js.Any
  def applyMiscProps(rawProps: js.Any): js.Any
  def applyProps(rawProps: js.Any): js.Any
  def isStandardProp(propName: js.Any): js.Any
}

object ParsableModelInterface {
  @scala.inline
  def apply(
    applyManualStandardProps: js.Any => CallbackTo[js.Any],
    applyMiscProps: js.Any => CallbackTo[js.Any],
    applyProps: js.Any => CallbackTo[js.Any],
    isStandardProp: js.Any => CallbackTo[js.Any]
  ): ParsableModelInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyManualStandardProps")(js.Any.fromFunction1((t0: js.Any) => applyManualStandardProps(t0).runNow()))
    __obj.updateDynamic("applyMiscProps")(js.Any.fromFunction1((t0: js.Any) => applyMiscProps(t0).runNow()))
    __obj.updateDynamic("applyProps")(js.Any.fromFunction1((t0: js.Any) => applyProps(t0).runNow()))
    __obj.updateDynamic("isStandardProp")(js.Any.fromFunction1((t0: js.Any) => isStandardProp(t0).runNow()))
    __obj.asInstanceOf[ParsableModelInterface]
  }
}

