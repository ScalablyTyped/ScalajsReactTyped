package typingsJapgolly.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.AnonChildren
import typingsJapgolly.oracleOraclejet.AnonClass
import typingsJapgolly.oracleOraclejet.AnonFilterFurther
import typingsJapgolly.oracleOraclejet.AnonLabelValue
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asyncValidators
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asyncValidatorsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.filterOnOpen
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.filterOnOpenChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minLength
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minLengthChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojValueUpdated
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionRendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.options
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionsKeys
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionsKeysChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pickerAttributes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pickerAttributesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.placeholder
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.placeholderChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readOnlyChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.required
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.validators
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.validatorsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueOption
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueOptionChanged
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojComboboxOne[K, D]
  extends ojCombobox[js.Any, ojComboboxOneSettableProperties[K, D], js.Any, String] {
  var asyncValidators: js.Array[AsyncValidator[_]] = js.native
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  var filterOnOpen: none | typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue = js.native
  var minLength: Double = js.native
  var onAsyncValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onFilterOnOpenChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMinLengthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojComboboxOne: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojComboboxOne: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjValueUpdated: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionsKeysChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPickerAttributesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPlaceholderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRawValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReadOnlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValidatorsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueOptionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  var options: (js.Array[
    typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  var optionsKeys: AnonChildren = js.native
  var pickerAttributes: AnonClass = js.native
  var placeholder: String | Null = js.native
  val rawValue: String | Null = js.native
  var readOnly: Boolean = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_ojComboboxOne: AnonFilterFurther = js.native
  var validators: (js.Array[Validator[_] | RegisteredValidator]) | Null = js.native
  var valueOption: AnonLabelValue = js.native
  def addEventListener(
    `type`: filterOnOpenChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: filterOnOpenChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojComboboxOne<K, D>['value'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojComboboxOne<K, D>['value'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asyncValidatorsChanged(
    `type`: asyncValidatorsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minLengthChanged(
    `type`: minLengthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minLengthChanged(
    `type`: minLengthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojValueUpdated(
    `type`: ojValueUpdated,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojValueUpdated(
    `type`: ojValueUpdated,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rawValueChanged(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: readOnlyChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: readOnlyChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_validatorsChanged(
    `type`: validatorsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionChanged(
    `type`: valueOptionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionChanged(
    `type`: valueOptionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[_]] = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[_] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_filterOnOpen(property: filterOnOpen): none | typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue = js.native
  @JSName("getProperty")
  def getProperty_minLength(property: minLength): Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (js.Array[
    typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): AnonChildren = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): AnonClass = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_rawValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue): String | Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: readOnly): Boolean = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_validators(property: validators): (js.Array[Validator[_] | RegisteredValidator]) | Null = js.native
  @JSName("getProperty")
  def getProperty_valueOption(property: valueOption): AnonLabelValue = js.native
  def setProperties(properties: ojComboboxOneSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: filterOnOpen, value: none): Unit = js.native
  def setProperty(property: filterOnOpen, value: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[_]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_minLength(property: minLength, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer, value: js.Function1[/* param0 */ OptionContext, Element]): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(
    property: options,
    value: js.Array[
      typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: AnonChildren): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: AnonClass): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonFilterFurther): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators): Unit = js.native
  @JSName("setProperty")
  def setProperty_validators(property: validators, value: js.Array[Validator[_] | RegisteredValidator]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOption(property: valueOption, value: AnonLabelValue): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojselectcombobox", "ojComboboxOne")
@js.native
object ojComboboxOne extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
  type ojValueUpdated = CustomEvent
}

