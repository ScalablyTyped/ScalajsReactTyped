package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoctorTreatmentStep extends PatientTreatmentStep {
  def treat(): js.Promise[Unit]
}

object DoctorTreatmentStep {
  @scala.inline
  def apply(message: String, treat: CallbackTo[js.Promise[Unit]]): DoctorTreatmentStep = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("treat")(treat.toJsFn)
    __obj.asInstanceOf[DoctorTreatmentStep]
  }
}

