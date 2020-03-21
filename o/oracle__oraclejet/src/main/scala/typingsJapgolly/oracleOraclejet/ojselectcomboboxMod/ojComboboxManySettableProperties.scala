package typingsJapgolly.oracleOraclejet.ojselectcomboboxMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.AnonChildren
import typingsJapgolly.oracleOraclejet.AnonClass
import typingsJapgolly.oracleOraclejet.AnonConverterHint
import typingsJapgolly.oracleOraclejet.AnonDefinition
import typingsJapgolly.oracleOraclejet.AnonFilterFurther
import typingsJapgolly.oracleOraclejet.AnonInstruction
import typingsJapgolly.oracleOraclejet.AnonLabelValue
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxManySettableProperties[K, D]
  extends editableValueSettableProperties[js.Array[js.Any] | Null, js.Array[js.Any] | Null, String] {
  var asyncValidators: js.Array[AsyncValidator[js.Array[_]]]
  var converter: Converter[_] | RegisteredConverter | Null
  var minLength: Double
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.undefined
  var options: (js.Array[
    typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null
  var optionsKeys: AnonChildren
  var pickerAttributes: AnonClass
  var placeholder: String | Null
  val rawValue: String | Null
  var readOnly: Boolean
  var required: Boolean
  @JSName("translations")
  var translations_ojComboboxManySettableProperties: AnonFilterFurther
  var validators: (js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null
  var valueOptions: js.Array[AnonLabelValue] | Null
  @JSName("value")
  var value_ojComboboxManySettableProperties: js.Array[_] | Null
}

object ojComboboxManySettableProperties {
  @scala.inline
  def apply[K, D](
    asyncValidators: js.Array[AsyncValidator[js.Array[_]]],
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minLength: Double,
    optionsKeys: AnonChildren,
    pickerAttributes: AnonClass,
    readOnly: Boolean,
    required: Boolean,
    translations: AnonFilterFurther,
    valid: valid | pending | invalidHidden | invalidShown,
    converter: Converter[_] | RegisteredConverter = null,
    describedBy: String = null,
    optionRenderer: /* param0 */ OptionContext => CallbackTo[Element] = null,
    options: (js.Array[
      typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]) | (DataProvider[K, D]) = null,
    placeholder: String = null,
    rawValue: String = null,
    validators: js.Array[Validator[js.Array[_]] | RegisteredValidator] = null,
    value: js.Array[_] = null,
    valueOptions: js.Array[AnonLabelValue] = null
  ): ojComboboxManySettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], optionsKeys = optionsKeys.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext) => optionRenderer(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueOptions != null) __obj.updateDynamic("valueOptions")(valueOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojComboboxManySettableProperties[K, D]]
  }
}

