package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent

import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.IPart
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TrainingPhrase. */
trait ITrainingPhrase extends js.Object {
  /** TrainingPhrase name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** TrainingPhrase parts */
  var parts: js.UndefOr[js.Array[IPart] | Null] = js.undefined
  /** TrainingPhrase timesAddedCount */
  var timesAddedCount: js.UndefOr[Double | Null] = js.undefined
  /** TrainingPhrase type */
  var `type`: js.UndefOr[Type | Null] = js.undefined
}

object ITrainingPhrase {
  @scala.inline
  def apply(
    name: String = null,
    parts: js.Array[IPart] = null,
    timesAddedCount: Int | Double = null,
    `type`: Type = null
  ): ITrainingPhrase = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (timesAddedCount != null) __obj.updateDynamic("timesAddedCount")(timesAddedCount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrainingPhrase]
  }
}

