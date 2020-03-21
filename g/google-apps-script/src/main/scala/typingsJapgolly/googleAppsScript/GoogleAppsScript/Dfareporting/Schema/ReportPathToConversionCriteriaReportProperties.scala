package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportPathToConversionCriteriaReportProperties extends js.Object {
  var clicksLookbackWindow: js.UndefOr[Double] = js.undefined
  var impressionsLookbackWindow: js.UndefOr[Double] = js.undefined
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined
  var maximumClickInteractions: js.UndefOr[Double] = js.undefined
  var maximumImpressionInteractions: js.UndefOr[Double] = js.undefined
  var maximumInteractionGap: js.UndefOr[Double] = js.undefined
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.undefined
}

object ReportPathToConversionCriteriaReportProperties {
  @scala.inline
  def apply(
    clicksLookbackWindow: Int | Double = null,
    impressionsLookbackWindow: Int | Double = null,
    includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined,
    maximumClickInteractions: Int | Double = null,
    maximumImpressionInteractions: Int | Double = null,
    maximumInteractionGap: Int | Double = null,
    pivotOnInteractionPath: js.UndefOr[Boolean] = js.undefined
  ): ReportPathToConversionCriteriaReportProperties = {
    val __obj = js.Dynamic.literal()
    if (clicksLookbackWindow != null) __obj.updateDynamic("clicksLookbackWindow")(clicksLookbackWindow.asInstanceOf[js.Any])
    if (impressionsLookbackWindow != null) __obj.updateDynamic("impressionsLookbackWindow")(impressionsLookbackWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAttributedIPConversions)) __obj.updateDynamic("includeAttributedIPConversions")(includeAttributedIPConversions.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedCookieConversions)) __obj.updateDynamic("includeUnattributedCookieConversions")(includeUnattributedCookieConversions.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedIPConversions)) __obj.updateDynamic("includeUnattributedIPConversions")(includeUnattributedIPConversions.asInstanceOf[js.Any])
    if (maximumClickInteractions != null) __obj.updateDynamic("maximumClickInteractions")(maximumClickInteractions.asInstanceOf[js.Any])
    if (maximumImpressionInteractions != null) __obj.updateDynamic("maximumImpressionInteractions")(maximumImpressionInteractions.asInstanceOf[js.Any])
    if (maximumInteractionGap != null) __obj.updateDynamic("maximumInteractionGap")(maximumInteractionGap.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotOnInteractionPath)) __obj.updateDynamic("pivotOnInteractionPath")(pivotOnInteractionPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportPathToConversionCriteriaReportProperties]
  }
}

