package typingsJapgolly.oracleOraclejet.ojinputtextMod

import typingsJapgolly.oracleOraclejet.anon.ConverterHint
import typingsJapgolly.oracleOraclejet.anon.Definition
import typingsJapgolly.oracleOraclejet.anon.Instruction
import typingsJapgolly.oracleOraclejet.anon.Regexp
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojTextAreaSettableProperties
  extends StObject
     with inputBaseSettableProperties[Any, Any, Any] {
  
  var converter: Converter[Any] | RegisteredConverter | Null
  
  var rows: Double
}
object ojTextAreaSettableProperties {
  
  inline def apply(
    asyncValidators: js.Array[AsyncValidator[Any]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    rawValue: Any,
    readonly: Boolean,
    required: Boolean,
    rows: Double,
    translations: Regexp,
    valid: valid | pending | invalidHidden | invalidShown,
    value: Any
  ): ojTextAreaSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], converter = null, describedBy = null, validators = null)
    __obj.asInstanceOf[ojTextAreaSettableProperties]
  }
  
  extension [Self <: ojTextAreaSettableProperties](x: Self) {
    
    inline def setConverter(value: Converter[Any] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    inline def setConverterNull: Self = StObject.set(x, "converter", null)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
