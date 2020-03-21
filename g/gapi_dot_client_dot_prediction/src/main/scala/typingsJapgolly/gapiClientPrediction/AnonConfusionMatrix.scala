package typingsJapgolly.gapiClientPrediction

import typingsJapgolly.gapiClientPrediction.gapi.client.prediction.Insert2
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfusionMatrix extends js.Object {
  /**
    * An output confusion matrix. This shows an estimate for how this model will do in predictions. This is first indexed by the true class label. For each
    * true class label, this provides a pair {predicted_label, count}, where count is the estimated number of times the model will predict the predicted
    * label given the true label. Will not output if more then 100 classes (Categorical models only).
    */
  var confusionMatrix: js.UndefOr[Record[String, Record[String, String]]] = js.undefined
  /** A list of the confusion matrix row totals. */
  var confusionMatrixRowTotals: js.UndefOr[Record[String, String]] = js.undefined
  /** Basic information about the model. */
  var modelinfo: js.UndefOr[Insert2] = js.undefined
}

object AnonConfusionMatrix {
  @scala.inline
  def apply(
    confusionMatrix: Record[String, Record[String, String]] = null,
    confusionMatrixRowTotals: Record[String, String] = null,
    modelinfo: Insert2 = null
  ): AnonConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    if (confusionMatrix != null) __obj.updateDynamic("confusionMatrix")(confusionMatrix.asInstanceOf[js.Any])
    if (confusionMatrixRowTotals != null) __obj.updateDynamic("confusionMatrixRowTotals")(confusionMatrixRowTotals.asInstanceOf[js.Any])
    if (modelinfo != null) __obj.updateDynamic("modelinfo")(modelinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfusionMatrix]
  }
}

