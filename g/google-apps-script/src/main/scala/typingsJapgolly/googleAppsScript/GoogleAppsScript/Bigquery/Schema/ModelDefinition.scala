package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelDefinition extends js.Object {
  var modelOptions: js.UndefOr[ModelDefinitionModelOptions] = js.undefined
  var trainingRuns: js.UndefOr[js.Array[BqmlTrainingRun]] = js.undefined
}

object ModelDefinition {
  @scala.inline
  def apply(modelOptions: ModelDefinitionModelOptions = null, trainingRuns: js.Array[BqmlTrainingRun] = null): ModelDefinition = {
    val __obj = js.Dynamic.literal()
    if (modelOptions != null) __obj.updateDynamic("modelOptions")(modelOptions.asInstanceOf[js.Any])
    if (trainingRuns != null) __obj.updateDynamic("trainingRuns")(trainingRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelDefinition]
  }
}

