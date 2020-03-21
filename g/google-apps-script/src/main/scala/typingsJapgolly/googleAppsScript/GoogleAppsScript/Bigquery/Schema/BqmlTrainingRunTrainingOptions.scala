package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BqmlTrainingRunTrainingOptions extends js.Object {
  var earlyStop: js.UndefOr[Boolean] = js.undefined
  var l1Reg: js.UndefOr[Double] = js.undefined
  var l2Reg: js.UndefOr[Double] = js.undefined
  var learnRate: js.UndefOr[Double] = js.undefined
  var learnRateStrategy: js.UndefOr[String] = js.undefined
  var lineSearchInitLearnRate: js.UndefOr[Double] = js.undefined
  var maxIteration: js.UndefOr[String] = js.undefined
  var minRelProgress: js.UndefOr[Double] = js.undefined
  var warmStart: js.UndefOr[Boolean] = js.undefined
}

object BqmlTrainingRunTrainingOptions {
  @scala.inline
  def apply(
    earlyStop: js.UndefOr[Boolean] = js.undefined,
    l1Reg: Int | Double = null,
    l2Reg: Int | Double = null,
    learnRate: Int | Double = null,
    learnRateStrategy: String = null,
    lineSearchInitLearnRate: Int | Double = null,
    maxIteration: String = null,
    minRelProgress: Int | Double = null,
    warmStart: js.UndefOr[Boolean] = js.undefined
  ): BqmlTrainingRunTrainingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(earlyStop)) __obj.updateDynamic("earlyStop")(earlyStop.asInstanceOf[js.Any])
    if (l1Reg != null) __obj.updateDynamic("l1Reg")(l1Reg.asInstanceOf[js.Any])
    if (l2Reg != null) __obj.updateDynamic("l2Reg")(l2Reg.asInstanceOf[js.Any])
    if (learnRate != null) __obj.updateDynamic("learnRate")(learnRate.asInstanceOf[js.Any])
    if (learnRateStrategy != null) __obj.updateDynamic("learnRateStrategy")(learnRateStrategy.asInstanceOf[js.Any])
    if (lineSearchInitLearnRate != null) __obj.updateDynamic("lineSearchInitLearnRate")(lineSearchInitLearnRate.asInstanceOf[js.Any])
    if (maxIteration != null) __obj.updateDynamic("maxIteration")(maxIteration.asInstanceOf[js.Any])
    if (minRelProgress != null) __obj.updateDynamic("minRelProgress")(minRelProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(warmStart)) __obj.updateDynamic("warmStart")(warmStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[BqmlTrainingRunTrainingOptions]
  }
}

