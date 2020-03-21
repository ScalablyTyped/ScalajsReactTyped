package typingsJapgolly.oracleOraclejet.ojinputtextMod

import typingsJapgolly.oracleOraclejet.AnonConverterHint
import typingsJapgolly.oracleOraclejet.AnonDefinition
import typingsJapgolly.oracleOraclejet.AnonInstruction
import typingsJapgolly.oracleOraclejet.AnonRegexp
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait inputBaseSettableProperties[V, SV, RV] extends editableValueSettableProperties[V, SV, RV] {
  var asyncValidators: js.Array[AsyncValidator[V]]
  var autocomplete: on | off | String
  var autofocus: Boolean
  var placeholder: String
  val rawValue: RV
  var readonly: Boolean
  var required: Boolean
  @JSName("translations")
  var translations_inputBaseSettableProperties: AnonRegexp
  var validators: (js.Array[Validator[V] | RegisteredValidator]) | Null
}

object inputBaseSettableProperties {
  @scala.inline
  def apply[V, SV, RV](
    asyncValidators: js.Array[AsyncValidator[V]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelHint: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    rawValue: RV,
    readonly: Boolean,
    required: Boolean,
    translations: AnonRegexp,
    valid: valid | pending | invalidHidden | invalidShown,
    value: SV,
    describedBy: String = null,
    validators: js.Array[Validator[V] | RegisteredValidator] = null
  ): inputBaseSettableProperties[V, SV, RV] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[inputBaseSettableProperties[V, SV, RV]]
  }
}

