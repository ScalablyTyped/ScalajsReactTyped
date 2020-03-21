package typingsJapgolly.oracleOraclejet.ojsliderMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.AnonConverterHint
import typingsJapgolly.oracleOraclejet.AnonDefinition
import typingsJapgolly.oracleOraclejet.AnonInstruction
import typingsJapgolly.oracleOraclejet.AnonInvalidStep
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fromMax
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fromMin
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojslider.ojSliderSettableProperties> */
trait ojSliderSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var describedBy: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayOptions: js.UndefOr[AnonConverterHint] = js.undefined
  var help: js.UndefOr[AnonInstruction] = js.undefined
  var helpHints: js.UndefOr[AnonDefinition] = js.undefined
  var labelHint: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var transientValue: js.UndefOr[Double] = js.undefined
  var translations: js.UndefOr[AnonInvalidStep] = js.undefined
  var `type`: js.UndefOr[fromMin | fromMax | single] = js.undefined
  var valid: js.UndefOr[
    typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ojSliderSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    describedBy: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayOptions: AnonConverterHint = null,
    help: AnonInstruction = null,
    helpHints: AnonDefinition = null,
    labelHint: String = null,
    max: Int | Double = null,
    messagesCustom: js.Array[^] = null,
    min: Int | Double = null,
    orientation: horizontal | vertical = null,
    step: Int | Double = null,
    transientValue: Int | Double = null,
    translations: AnonInvalidStep = null,
    `type`: fromMin | fromMax | single = null,
    valid: valid | pending | invalidHidden | invalidShown = null,
    value: Int | Double = null
  ): ojSliderSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (helpHints != null) __obj.updateDynamic("helpHints")(helpHints.asInstanceOf[js.Any])
    if (labelHint != null) __obj.updateDynamic("labelHint")(labelHint.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messagesCustom != null) __obj.updateDynamic("messagesCustom")(messagesCustom.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSliderSettablePropertiesLenient]
  }
}

