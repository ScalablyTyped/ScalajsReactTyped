package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAilment extends js.Object {
  val id: String
  var `implicit`: Boolean
  var projects: js.UndefOr[js.Array[ProjectType]] = js.undefined
  def detected(): js.Promise[Boolean]
  def getMessage(): js.Promise[String]
  def getTreatmentSteps(): js.Promise[js.Array[PatientTreatmentStep]]
}

object IAilment {
  @scala.inline
  def apply(
    detected: CallbackTo[js.Promise[Boolean]],
    getMessage: CallbackTo[js.Promise[String]],
    getTreatmentSteps: CallbackTo[js.Promise[js.Array[PatientTreatmentStep]]],
    id: String,
    `implicit`: Boolean,
    projects: js.Array[ProjectType] = null
  ): IAilment = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("detected")(detected.toJsFn)
    __obj.updateDynamic("getMessage")(getMessage.toJsFn)
    __obj.updateDynamic("getTreatmentSteps")(getTreatmentSteps.toJsFn)
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAilment]
  }
}

