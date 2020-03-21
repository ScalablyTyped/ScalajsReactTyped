package typingsJapgolly.emberComponent.targetActionSupportMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetActionSupport extends js.Object {
  def triggerAction(opts: TriggerActionOptions): Boolean
}

object TargetActionSupport {
  @scala.inline
  def apply(triggerAction: TriggerActionOptions => CallbackTo[Boolean]): TargetActionSupport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("triggerAction")(js.Any.fromFunction1((t0: typingsJapgolly.emberComponent.targetActionSupportMod.TriggerActionOptions) => triggerAction(t0).runNow()))
    __obj.asInstanceOf[TargetActionSupport]
  }
}

