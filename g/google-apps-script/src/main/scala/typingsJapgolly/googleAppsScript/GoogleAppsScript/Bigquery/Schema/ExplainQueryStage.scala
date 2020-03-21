package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainQueryStage extends js.Object {
  var completedParallelInputs: js.UndefOr[String] = js.undefined
  var computeMsAvg: js.UndefOr[String] = js.undefined
  var computeMsMax: js.UndefOr[String] = js.undefined
  var computeRatioAvg: js.UndefOr[Double] = js.undefined
  var computeRatioMax: js.UndefOr[Double] = js.undefined
  var endMs: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputStages: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parallelInputs: js.UndefOr[String] = js.undefined
  var readMsAvg: js.UndefOr[String] = js.undefined
  var readMsMax: js.UndefOr[String] = js.undefined
  var readRatioAvg: js.UndefOr[Double] = js.undefined
  var readRatioMax: js.UndefOr[Double] = js.undefined
  var recordsRead: js.UndefOr[String] = js.undefined
  var recordsWritten: js.UndefOr[String] = js.undefined
  var shuffleOutputBytes: js.UndefOr[String] = js.undefined
  var shuffleOutputBytesSpilled: js.UndefOr[String] = js.undefined
  var startMs: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var steps: js.UndefOr[js.Array[ExplainQueryStep]] = js.undefined
  var waitMsAvg: js.UndefOr[String] = js.undefined
  var waitMsMax: js.UndefOr[String] = js.undefined
  var waitRatioAvg: js.UndefOr[Double] = js.undefined
  var waitRatioMax: js.UndefOr[Double] = js.undefined
  var writeMsAvg: js.UndefOr[String] = js.undefined
  var writeMsMax: js.UndefOr[String] = js.undefined
  var writeRatioAvg: js.UndefOr[Double] = js.undefined
  var writeRatioMax: js.UndefOr[Double] = js.undefined
}

object ExplainQueryStage {
  @scala.inline
  def apply(
    completedParallelInputs: String = null,
    computeMsAvg: String = null,
    computeMsMax: String = null,
    computeRatioAvg: Int | Double = null,
    computeRatioMax: Int | Double = null,
    endMs: String = null,
    id: String = null,
    inputStages: js.Array[String] = null,
    name: String = null,
    parallelInputs: String = null,
    readMsAvg: String = null,
    readMsMax: String = null,
    readRatioAvg: Int | Double = null,
    readRatioMax: Int | Double = null,
    recordsRead: String = null,
    recordsWritten: String = null,
    shuffleOutputBytes: String = null,
    shuffleOutputBytesSpilled: String = null,
    startMs: String = null,
    status: String = null,
    steps: js.Array[ExplainQueryStep] = null,
    waitMsAvg: String = null,
    waitMsMax: String = null,
    waitRatioAvg: Int | Double = null,
    waitRatioMax: Int | Double = null,
    writeMsAvg: String = null,
    writeMsMax: String = null,
    writeRatioAvg: Int | Double = null,
    writeRatioMax: Int | Double = null
  ): ExplainQueryStage = {
    val __obj = js.Dynamic.literal()
    if (completedParallelInputs != null) __obj.updateDynamic("completedParallelInputs")(completedParallelInputs.asInstanceOf[js.Any])
    if (computeMsAvg != null) __obj.updateDynamic("computeMsAvg")(computeMsAvg.asInstanceOf[js.Any])
    if (computeMsMax != null) __obj.updateDynamic("computeMsMax")(computeMsMax.asInstanceOf[js.Any])
    if (computeRatioAvg != null) __obj.updateDynamic("computeRatioAvg")(computeRatioAvg.asInstanceOf[js.Any])
    if (computeRatioMax != null) __obj.updateDynamic("computeRatioMax")(computeRatioMax.asInstanceOf[js.Any])
    if (endMs != null) __obj.updateDynamic("endMs")(endMs.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputStages != null) __obj.updateDynamic("inputStages")(inputStages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parallelInputs != null) __obj.updateDynamic("parallelInputs")(parallelInputs.asInstanceOf[js.Any])
    if (readMsAvg != null) __obj.updateDynamic("readMsAvg")(readMsAvg.asInstanceOf[js.Any])
    if (readMsMax != null) __obj.updateDynamic("readMsMax")(readMsMax.asInstanceOf[js.Any])
    if (readRatioAvg != null) __obj.updateDynamic("readRatioAvg")(readRatioAvg.asInstanceOf[js.Any])
    if (readRatioMax != null) __obj.updateDynamic("readRatioMax")(readRatioMax.asInstanceOf[js.Any])
    if (recordsRead != null) __obj.updateDynamic("recordsRead")(recordsRead.asInstanceOf[js.Any])
    if (recordsWritten != null) __obj.updateDynamic("recordsWritten")(recordsWritten.asInstanceOf[js.Any])
    if (shuffleOutputBytes != null) __obj.updateDynamic("shuffleOutputBytes")(shuffleOutputBytes.asInstanceOf[js.Any])
    if (shuffleOutputBytesSpilled != null) __obj.updateDynamic("shuffleOutputBytesSpilled")(shuffleOutputBytesSpilled.asInstanceOf[js.Any])
    if (startMs != null) __obj.updateDynamic("startMs")(startMs.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (waitMsAvg != null) __obj.updateDynamic("waitMsAvg")(waitMsAvg.asInstanceOf[js.Any])
    if (waitMsMax != null) __obj.updateDynamic("waitMsMax")(waitMsMax.asInstanceOf[js.Any])
    if (waitRatioAvg != null) __obj.updateDynamic("waitRatioAvg")(waitRatioAvg.asInstanceOf[js.Any])
    if (waitRatioMax != null) __obj.updateDynamic("waitRatioMax")(waitRatioMax.asInstanceOf[js.Any])
    if (writeMsAvg != null) __obj.updateDynamic("writeMsAvg")(writeMsAvg.asInstanceOf[js.Any])
    if (writeMsMax != null) __obj.updateDynamic("writeMsMax")(writeMsMax.asInstanceOf[js.Any])
    if (writeRatioAvg != null) __obj.updateDynamic("writeRatioAvg")(writeRatioAvg.asInstanceOf[js.Any])
    if (writeRatioMax != null) __obj.updateDynamic("writeRatioMax")(writeRatioMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainQueryStage]
  }
}

