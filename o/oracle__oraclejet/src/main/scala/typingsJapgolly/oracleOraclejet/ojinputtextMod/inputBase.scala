package typingsJapgolly.oracleOraclejet.ojinputtextMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.AnonRegexp
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asyncValidators
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asyncValidatorsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autocomplete
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autocompleteChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autofocus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autofocusChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.placeholder
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.placeholderChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonly_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.required
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.validators
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.validatorsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait inputBase[V, SP /* <: inputBaseSettableProperties[V, SV, V] */, SV, RV] extends editableValue[V, SP, SV, RV] {
  var asyncValidators: js.Array[AsyncValidator[V]] = js.native
  var autocomplete: on | off | String = js.native
  var onAsyncValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAutocompleteChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAutofocusChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_inputBase: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_inputBase: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPlaceholderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRawValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReadonlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var placeholder: String = js.native
  val rawValue: RV = js.native
  var readonly: Boolean = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_inputBase: AnonRegexp = js.native
  var validators: (js.Array[Validator[V] | RegisteredValidator]) | Null = js.native
  def addEventListener(`type`: autocompleteChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: autocompleteChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(`type`: asyncValidatorsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(`type`: autofocusChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_autofocusChanged(
    `type`: autofocusChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(`type`: placeholderChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(`type`: rawValueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(`type`: readonlyChanged_, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(`type`: requiredChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(`type`: validatorsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[V]] = js.native
  @JSName("getProperty")
  def getProperty_autocomplete(property: autocomplete): on | off | String = js.native
  @JSName("getProperty")
  def getProperty_autofocus(property: autofocus): Boolean = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue): RV = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_validators(property: validators): (js.Array[Validator[V] | RegisteredValidator]) | Null = js.native
  def setProperties(properties: inputBaseSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  def setProperty(property: autocomplete, value: off): Unit = js.native
  def setProperty(property: autocomplete, value: on): Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[V]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_autocomplete(property: autocomplete, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_autofocus(property: autofocus, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue, value: RV): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonRegexp): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators, value: js.Array[Validator[V] | RegisteredValidator]): Unit = js.native
  def validate(): js.Promise[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid | invalid] = js.native
}

@JSImport("@oracle/oraclejet/ojinputtext", "inputBase")
@js.native
object inputBase extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

