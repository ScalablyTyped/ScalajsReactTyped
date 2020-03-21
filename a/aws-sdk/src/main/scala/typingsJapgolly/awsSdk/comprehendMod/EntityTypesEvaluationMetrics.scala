package typingsJapgolly.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityTypesEvaluationMetrics extends js.Object {
  /**
    * A measure of how accurate the recognizer results are for for a specific entity type in the test data. It is derived from the Precision and Recall values. The F1Score is the harmonic average of the two scores. The highest score is 1, and the worst score is 0. 
    */
  var F1Score: js.UndefOr[Double] = js.native
  /**
    * A measure of the usefulness of the recognizer results for a specific entity type in the test data. High precision means that the recognizer returned substantially more relevant results than irrelevant ones. 
    */
  var Precision: js.UndefOr[Double] = js.native
  /**
    * A measure of how complete the recognizer results are for a specific entity type in the test data. High recall means that the recognizer returned most of the relevant results.
    */
  var Recall: js.UndefOr[Double] = js.native
}

object EntityTypesEvaluationMetrics {
  @scala.inline
  def apply(
    F1Score: Int | scala.Double = null,
    Precision: Int | scala.Double = null,
    Recall: Int | scala.Double = null
  ): EntityTypesEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    if (F1Score != null) __obj.updateDynamic("F1Score")(F1Score.asInstanceOf[js.Any])
    if (Precision != null) __obj.updateDynamic("Precision")(Precision.asInstanceOf[js.Any])
    if (Recall != null) __obj.updateDynamic("Recall")(Recall.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypesEvaluationMetrics]
  }
}

