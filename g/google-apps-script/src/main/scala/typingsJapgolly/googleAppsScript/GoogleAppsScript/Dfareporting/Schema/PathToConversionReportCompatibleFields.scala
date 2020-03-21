package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathToConversionReportCompatibleFields extends js.Object {
  var conversionDimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  var customFloodlightVariables: js.UndefOr[js.Array[Dimension]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  var perInteractionDimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
}

object PathToConversionReportCompatibleFields {
  @scala.inline
  def apply(
    conversionDimensions: js.Array[Dimension] = null,
    customFloodlightVariables: js.Array[Dimension] = null,
    kind: String = null,
    metrics: js.Array[Metric] = null,
    perInteractionDimensions: js.Array[Dimension] = null
  ): PathToConversionReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (conversionDimensions != null) __obj.updateDynamic("conversionDimensions")(conversionDimensions.asInstanceOf[js.Any])
    if (customFloodlightVariables != null) __obj.updateDynamic("customFloodlightVariables")(customFloodlightVariables.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (perInteractionDimensions != null) __obj.updateDynamic("perInteractionDimensions")(perInteractionDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathToConversionReportCompatibleFields]
  }
}

