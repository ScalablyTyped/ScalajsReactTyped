package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeTriggerFactory extends js.Object {
  def create(freshnessTime: Double, oneShot: Boolean): TimeTrigger
}

object ITimeTriggerFactory {
  @scala.inline
  def apply(create: (Double, Boolean) => CallbackTo[TimeTrigger]): ITimeTriggerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => create(t0, t1).runNow()))
    __obj.asInstanceOf[ITimeTriggerFactory]
  }
}

