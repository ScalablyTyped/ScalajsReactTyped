package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreatableAilment extends IAilment {
  val treatable: Boolean
}

object TreatableAilment {
  @scala.inline
  def apply(
    detected: CallbackTo[js.Promise[Boolean]],
    getMessage: CallbackTo[js.Promise[String]],
    getTreatmentSteps: CallbackTo[js.Promise[js.Array[PatientTreatmentStep]]],
    id: String,
    `implicit`: Boolean,
    treatable: Boolean,
    projects: js.Array[ProjectType] = null
  ): TreatableAilment = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], treatable = treatable.asInstanceOf[js.Any])
    __obj.updateDynamic("detected")(detected.toJsFn)
    __obj.updateDynamic("getMessage")(getMessage.toJsFn)
    __obj.updateDynamic("getTreatmentSteps")(getTreatmentSteps.toJsFn)
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreatableAilment]
  }
}

