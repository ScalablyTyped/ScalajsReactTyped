package typingsJapgolly.oracleOraclejet.ojcolorpaletteMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.AnonConverterHint
import typingsJapgolly.oracleOraclejet.AnonDefinition
import typingsJapgolly.oracleOraclejet.AnonInstruction
import typingsJapgolly.oracleOraclejet.AnonLabel
import typingsJapgolly.oracleOraclejet.AnonLabelNone
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.grid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lg
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.list
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.sm
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcolorpalette.ojColorPaletteSettableProperties> */
trait ojColorPaletteSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var describedBy: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayOptions: js.UndefOr[AnonConverterHint] = js.undefined
  var help: js.UndefOr[AnonInstruction] = js.undefined
  var helpHints: js.UndefOr[AnonDefinition] = js.undefined
  var labelDisplay: js.UndefOr[auto | off] = js.undefined
  var labelHint: js.UndefOr[String] = js.undefined
  var labelledBy: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[grid | list] = js.undefined
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  var palette: js.UndefOr[js.Array[AnonLabel]] = js.undefined
  var swatchSize: js.UndefOr[xs | sm | lg] = js.undefined
  var translations: js.UndefOr[AnonLabelNone] = js.undefined
  var valid: js.UndefOr[
    typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  var value: js.UndefOr[typingsJapgolly.oracleOraclejet.ojcolorMod.^] = js.undefined
}

object ojColorPaletteSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    describedBy: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayOptions: AnonConverterHint = null,
    help: AnonInstruction = null,
    helpHints: AnonDefinition = null,
    labelDisplay: auto | off = null,
    labelHint: String = null,
    labelledBy: String = null,
    layout: grid | list = null,
    messagesCustom: js.Array[^] = null,
    palette: js.Array[AnonLabel] = null,
    swatchSize: xs | sm | lg = null,
    translations: AnonLabelNone = null,
    valid: valid | pending | invalidHidden | invalidShown = null,
    value: typingsJapgolly.oracleOraclejet.ojcolorMod.^ = null
  ): ojColorPaletteSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (helpHints != null) __obj.updateDynamic("helpHints")(helpHints.asInstanceOf[js.Any])
    if (labelDisplay != null) __obj.updateDynamic("labelDisplay")(labelDisplay.asInstanceOf[js.Any])
    if (labelHint != null) __obj.updateDynamic("labelHint")(labelHint.asInstanceOf[js.Any])
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (messagesCustom != null) __obj.updateDynamic("messagesCustom")(messagesCustom.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (swatchSize != null) __obj.updateDynamic("swatchSize")(swatchSize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojColorPaletteSettablePropertiesLenient]
  }
}

