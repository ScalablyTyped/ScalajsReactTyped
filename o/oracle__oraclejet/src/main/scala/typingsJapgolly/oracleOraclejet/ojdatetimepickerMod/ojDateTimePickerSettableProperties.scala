package typingsJapgolly.oracleOraclejet.ojdatetimepickerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.AnonCancel
import typingsJapgolly.oracleOraclejet.AnonChangeMonth
import typingsJapgolly.oracleOraclejet.AnonClass
import typingsJapgolly.oracleOraclejet.AnonConverterHint
import typingsJapgolly.oracleOraclejet.AnonDefinition
import typingsJapgolly.oracleOraclejet.AnonDisabled
import typingsJapgolly.oracleOraclejet.AnonFooterLayout
import typingsJapgolly.oracleOraclejet.AnonInstruction
import typingsJapgolly.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typingsJapgolly.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.jet
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDateTimePickerSettableProperties extends ojInputDateTimeSettableProperties {
  @JSName("keyboardEdit")
  var keyboardEdit_ojDateTimePickerSettableProperties: disabled
  @JSName("renderMode")
  var renderMode_ojDateTimePickerSettableProperties: jet
}

object ojDateTimePickerSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[String]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[String] | RegisteredConverter,
    datePicker: AnonChangeMonth,
    dayFormatter: DayFormatterInput => CallbackTo[Null | all | DayFormatterOutput],
    dayMetaData: StringDictionary[StringDictionary[StringDictionary[AnonDisabled]]],
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    keyboardEdit: disabled,
    labelHint: String,
    messagesCustom: js.Array[^],
    pickerAttributes: AnonClass,
    placeholder: String,
    rawValue: String,
    readonly: Boolean,
    renderMode: jet,
    required: Boolean,
    timePicker: AnonFooterLayout,
    translations: AnonCancel,
    valid: valid | pending | invalidHidden | invalidShown,
    value: String,
    describedBy: String = null,
    max: String = null,
    min: String = null,
    validators: js.Array[Validator[String] | RegisteredValidator] = null
  ): ojDateTimePickerSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], datePicker = datePicker.asInstanceOf[js.Any], dayMetaData = dayMetaData.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], keyboardEdit = keyboardEdit.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], timePicker = timePicker.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("dayFormatter")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput) => dayFormatter(t0).runNow()))
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDateTimePickerSettableProperties]
  }
}

