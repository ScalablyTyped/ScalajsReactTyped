package typingsJapgolly.oracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.anon.ChangeMonth
import typingsJapgolly.oracleOraclejet.anon.Class
import typingsJapgolly.oracleOraclejet.anon.ConverterHint
import typingsJapgolly.oracleOraclejet.anon.CurrentText
import typingsJapgolly.oracleOraclejet.anon.Definition
import typingsJapgolly.oracleOraclejet.anon.Disabled
import typingsJapgolly.oracleOraclejet.anon.Instruction
import typingsJapgolly.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typingsJapgolly.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.jet
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojDatePickerSettableProperties
  extends StObject
     with ojInputDateSettableProperties {
  
  @JSName("keyboardEdit")
  var keyboardEdit_ojDatePickerSettableProperties: disabled
  
  @JSName("renderMode")
  var renderMode_ojDatePickerSettableProperties: jet
}
object ojDatePickerSettableProperties {
  
  inline def apply(
    asyncValidators: js.Array[AsyncValidator[String]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[String] | RegisteredConverter,
    datePicker: ChangeMonth,
    dayFormatter: DayFormatterInput => Null | all | DayFormatterOutput,
    dayMetaData: StringDictionary[StringDictionary[StringDictionary[Disabled]]],
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    pickerAttributes: Class,
    placeholder: String,
    rawValue: String,
    readonly: Boolean,
    required: Boolean,
    translations: CurrentText,
    valid: valid | pending | invalidHidden | invalidShown,
    value: String
  ): ojDatePickerSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], datePicker = datePicker.asInstanceOf[js.Any], dayFormatter = js.Any.fromFunction1(dayFormatter), dayMetaData = dayMetaData.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], keyboardEdit = "disabled", labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], renderMode = "jet", required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], describedBy = null, max = null, min = null, validators = null)
    __obj.asInstanceOf[ojDatePickerSettableProperties]
  }
  
  extension [Self <: ojDatePickerSettableProperties](x: Self) {
    
    inline def setKeyboardEdit(value: disabled): Self = StObject.set(x, "keyboardEdit", value.asInstanceOf[js.Any])
    
    inline def setRenderMode(value: jet): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
  }
}
