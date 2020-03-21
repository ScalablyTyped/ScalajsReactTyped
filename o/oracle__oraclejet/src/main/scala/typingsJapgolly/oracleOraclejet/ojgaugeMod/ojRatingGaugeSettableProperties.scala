package typingsJapgolly.oracleOraclejet.ojgaugeMod

import typingsJapgolly.oracleOraclejet.Anon9
import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.AnonSource
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`0.5`
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`1`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.meet
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRatingGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var changed: Boolean
  var changedState: AnonSource
  var hoverState: AnonSource
  var max: Double
  var min: Double
  var orientation: vertical | horizontal
  var preserveAspectRatio: none | meet
  var readonly: Boolean
  var selectedState: AnonSource
  var step: `0.5` | `1`
  var thresholds: js.Array[Threshold]
  var tooltip: Anon9
  val transientValue: Double | Null
  var unselectedState: AnonSource
  var value: Double | Null
  var visualEffects: none | auto
}

object ojRatingGaugeSettableProperties {
  @scala.inline
  def apply(
    changed: Boolean,
    changedState: AnonSource,
    hoverState: AnonSource,
    max: Double,
    min: Double,
    orientation: vertical | horizontal,
    preserveAspectRatio: none | meet,
    readonly: Boolean,
    selectedState: AnonSource,
    step: `0.5` | `1`,
    thresholds: js.Array[Threshold],
    tooltip: Anon9,
    trackResize: on | off,
    translations: AnonLabelAndValue,
    unselectedState: AnonSource,
    visualEffects: none | auto,
    transientValue: Int | Double = null,
    value: Int | Double = null
  ): ojRatingGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], changedState = changedState.asInstanceOf[js.Any], hoverState = hoverState.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], selectedState = selectedState.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], unselectedState = unselectedState.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeSettableProperties]
  }
}

