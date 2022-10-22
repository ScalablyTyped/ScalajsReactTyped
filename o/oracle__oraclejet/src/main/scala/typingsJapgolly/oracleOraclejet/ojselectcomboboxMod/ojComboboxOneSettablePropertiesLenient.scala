package typingsJapgolly.oracleOraclejet.ojselectcomboboxMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.oracleOraclejet.anon.Children
import typingsJapgolly.oracleOraclejet.anon.Class
import typingsJapgolly.oracleOraclejet.anon.ConverterHint
import typingsJapgolly.oracleOraclejet.anon.Definition
import typingsJapgolly.oracleOraclejet.anon.FilterFurther
import typingsJapgolly.oracleOraclejet.anon.Instruction
import typingsJapgolly.oracleOraclejet.anon.LabelValue
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojComboboxOneSettableProperties<K, D>> */
trait ojComboboxOneSettablePropertiesLenient[K, D]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[Any]]] = js.undefined
  
  var converter: js.UndefOr[Converter[Any] | RegisteredConverter | Null] = js.undefined
  
  var describedBy: js.UndefOr[String | Null] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var displayOptions: js.UndefOr[ConverterHint] = js.undefined
  
  var filterOnOpen: js.UndefOr[none | rawValue] = js.undefined
  
  var help: js.UndefOr[Instruction] = js.undefined
  
  var helpHints: js.UndefOr[Definition] = js.undefined
  
  var labelHint: js.UndefOr[String] = js.undefined
  
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.undefined
  
  var options: js.UndefOr[
    (js.Array[
      typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]) | (DataProvider[K, D]) | Null
  ] = js.undefined
  
  var optionsKeys: js.UndefOr[Children] = js.undefined
  
  var pickerAttributes: js.UndefOr[Class] = js.undefined
  
  var placeholder: js.UndefOr[String | Null] = js.undefined
  
  var rawValue: js.UndefOr[String | Null] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var translations: js.UndefOr[FilterFurther] = js.undefined
  
  var valid: js.UndefOr[
    typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  
  var validators: js.UndefOr[(js.Array[Validator[Any] | RegisteredValidator]) | Null] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
  
  var valueOption: js.UndefOr[LabelValue] = js.undefined
}
object ojComboboxOneSettablePropertiesLenient {
  
  inline def apply[K, D](): ojComboboxOneSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojComboboxOneSettablePropertiesLenient[K, D]]
  }
  
  extension [Self <: ojComboboxOneSettablePropertiesLenient[?, ?], K, D](x: Self & (ojComboboxOneSettablePropertiesLenient[K, D])) {
    
    inline def setAsyncValidators(value: js.Array[AsyncValidator[Any]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    inline def setAsyncValidatorsVarargs(value: AsyncValidator[Any]*): Self = StObject.set(x, "asyncValidators", js.Array(value*))
    
    inline def setConverter(value: Converter[Any] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    inline def setConverterNull: Self = StObject.set(x, "converter", null)
    
    inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    inline def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
    
    inline def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
    
    inline def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    inline def setFilterOnOpen(value: none | rawValue): Self = StObject.set(x, "filterOnOpen", value.asInstanceOf[js.Any])
    
    inline def setFilterOnOpenUndefined: Self = StObject.set(x, "filterOnOpen", js.undefined)
    
    inline def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
    
    inline def setHelpHintsUndefined: Self = StObject.set(x, "helpHints", js.undefined)
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
    
    inline def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
    
    inline def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
    
    inline def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
    
    inline def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value*))
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setOptionRenderer(value: /* param0 */ OptionContext => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
    
    inline def setOptionRendererNull: Self = StObject.set(x, "optionRenderer", null)
    
    inline def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
    
    inline def setOptions(
      value: (js.Array[
          typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
        ]) | (DataProvider[K, D])
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsKeys(value: Children): Self = StObject.set(x, "optionsKeys", value.asInstanceOf[js.Any])
    
    inline def setOptionsKeysUndefined: Self = StObject.set(x, "optionsKeys", js.undefined)
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(
      value: (typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup)*
    ): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPickerAttributes(value: Class): Self = StObject.set(x, "pickerAttributes", value.asInstanceOf[js.Any])
    
    inline def setPickerAttributesUndefined: Self = StObject.set(x, "pickerAttributes", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setRawValueNull: Self = StObject.set(x, "rawValue", null)
    
    inline def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTranslations(value: FilterFurther): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValidators(value: js.Array[Validator[Any] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: (Validator[Any] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueOption(value: LabelValue): Self = StObject.set(x, "valueOption", value.asInstanceOf[js.Any])
    
    inline def setValueOptionUndefined: Self = StObject.set(x, "valueOption", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
