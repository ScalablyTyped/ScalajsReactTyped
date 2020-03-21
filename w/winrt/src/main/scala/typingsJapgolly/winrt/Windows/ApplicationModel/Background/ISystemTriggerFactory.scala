package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISystemTriggerFactory extends js.Object {
  def create(triggerType: SystemTriggerType, oneShot: Boolean): SystemTrigger
}

object ISystemTriggerFactory {
  @scala.inline
  def apply(create: (SystemTriggerType, Boolean) => CallbackTo[SystemTrigger]): ISystemTriggerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemTriggerType, t1: scala.Boolean) => create(t0, t1).runNow()))
    __obj.asInstanceOf[ISystemTriggerFactory]
  }
}

