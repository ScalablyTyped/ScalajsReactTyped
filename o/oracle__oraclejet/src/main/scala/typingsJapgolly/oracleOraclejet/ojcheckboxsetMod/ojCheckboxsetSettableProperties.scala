package typingsJapgolly.oracleOraclejet.ojcheckboxsetMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.AnonConverterHint
import typingsJapgolly.oracleOraclejet.AnonDefinition
import typingsJapgolly.oracleOraclejet.AnonInstruction
import typingsJapgolly.oracleOraclejet.AnonRequired
import typingsJapgolly.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionContext
import typingsJapgolly.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionsKeys
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojCheckboxsetSettableProperties[K, D]
  extends editableValueSettableProperties[js.Array[js.Any], js.Array[js.Any], js.Array[js.Any]] {
  var labelledBy: String | Null
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.undefined
  var options: (DataProvider[K, D]) | Null
  var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
  var required: Boolean
  @JSName("translations")
  var translations_ojCheckboxsetSettableProperties: AnonRequired
  @JSName("value")
  var value_ojCheckboxsetSettableProperties: js.Array[_]
}

object ojCheckboxsetSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelHint: String,
    messagesCustom: js.Array[^],
    required: Boolean,
    translations: AnonRequired,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Array[_],
    describedBy: String = null,
    labelledBy: String = null,
    optionRenderer: /* param0 */ OptionContext[D] => CallbackTo[Element] = null,
    options: DataProvider[K, D] = null,
    optionsKeys: OptionsKeys = null
  ): ojCheckboxsetSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionContext[D]) => optionRenderer(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojCheckboxsetSettableProperties[K, D]]
  }
}

