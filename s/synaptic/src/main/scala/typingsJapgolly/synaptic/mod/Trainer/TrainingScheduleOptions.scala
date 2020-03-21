package typingsJapgolly.synaptic.mod.Trainer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingScheduleOptions extends js.Object {
  var every: Double
  def `do`(data: TrainingScheduleDoData): Boolean | Unit
}

object TrainingScheduleOptions {
  @scala.inline
  def apply(`do`: TrainingScheduleDoData => CallbackTo[Boolean | Unit], every: Double): TrainingScheduleOptions = {
    val __obj = js.Dynamic.literal(every = every.asInstanceOf[js.Any])
    __obj.updateDynamic("do")(js.Any.fromFunction1((t0: typingsJapgolly.synaptic.mod.Trainer.TrainingScheduleDoData) => `do`(t0).runNow()))
    __obj.asInstanceOf[TrainingScheduleOptions]
  }
}

