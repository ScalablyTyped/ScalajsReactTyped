package typingsJapgolly.oracleOraclejet.ojinputtextMod

import typingsJapgolly.oracleOraclejet.anon.ConverterHint
import typingsJapgolly.oracleOraclejet.anon.Definition
import typingsJapgolly.oracleOraclejet.anon.Instruction
import typingsJapgolly.oracleOraclejet.anon.Regexp
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait inputBaseSettableProperties[V, SV, RV]
  extends StObject
     with editableValueSettableProperties[V, SV, RV] {
  
  var asyncValidators: js.Array[AsyncValidator[V]]
  
  var autocomplete: on | off | String
  
  var autofocus: Boolean
  
  var placeholder: String
  
  val rawValue: RV
  
  var readonly: Boolean
  
  var required: Boolean
  
  @JSName("translations")
  var translations_inputBaseSettableProperties: Regexp
  
  var validators: (js.Array[Validator[V] | RegisteredValidator]) | Null
}
object inputBaseSettableProperties {
  
  inline def apply[V, SV, RV](
    asyncValidators: js.Array[AsyncValidator[V]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    rawValue: RV,
    readonly: Boolean,
    required: Boolean,
    translations: Regexp,
    valid: valid | pending | invalidHidden | invalidShown,
    value: SV
  ): inputBaseSettableProperties[V, SV, RV] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], describedBy = null, validators = null)
    __obj.asInstanceOf[inputBaseSettableProperties[V, SV, RV]]
  }
  
  extension [Self <: inputBaseSettableProperties[?, ?, ?], V, SV, RV](x: Self & (inputBaseSettableProperties[V, SV, RV])) {
    
    inline def setAsyncValidators(value: js.Array[AsyncValidator[V]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidatorsVarargs(value: AsyncValidator[V]*): Self = StObject.set(x, "asyncValidators", js.Array(value*))
    
    inline def setAutocomplete(value: on | off | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRawValue(value: RV): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setTranslations(value: Regexp): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setValidators(value: js.Array[Validator[V] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    inline def setValidatorsVarargs(value: (Validator[V] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value*))
  }
}
