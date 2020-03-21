package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaintenanceTriggerFactory extends js.Object {
  def create(freshnessTime: Double, oneShot: Boolean): MaintenanceTrigger
}

object IMaintenanceTriggerFactory {
  @scala.inline
  def apply(create: (Double, Boolean) => CallbackTo[MaintenanceTrigger]): IMaintenanceTriggerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => create(t0, t1).runNow()))
    __obj.asInstanceOf[IMaintenanceTriggerFactory]
  }
}

