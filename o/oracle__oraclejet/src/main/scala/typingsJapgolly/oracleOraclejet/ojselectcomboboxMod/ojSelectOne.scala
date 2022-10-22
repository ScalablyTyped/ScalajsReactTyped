package typingsJapgolly.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.oracleOraclejet.anon.ChildrenLabel
import typingsJapgolly.oracleOraclejet.anon.Class
import typingsJapgolly.oracleOraclejet.anon.LabelValue
import typingsJapgolly.oracleOraclejet.anon.MoreMatchesFound
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.OptionContext
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.jet
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minimumResultsForSearch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minimumResultsForSearchChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.native
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
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readOnly
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readOnlyChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.renderMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.renderModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.required
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueOption
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueOptionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSelectOne[K, D]
  extends StObject
     with ojSelect[Any, ojSelectOneSettableProperties[K, D], Any] {
  
  def addEventListener(`type`: renderModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: renderModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minimumResultsForSearchChanged(
    `type`: minimumResultsForSearchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minimumResultsForSearchChanged(
    `type`: minimumResultsForSearchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(`type`: optionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(`type`: optionsKeysChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pickerAttributesChanged(
    `type`: pickerAttributesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(`type`: placeholderChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_placeholderChanged(
    `type`: placeholderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(`type`: readOnlyChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readOnlyChanged(
    `type`: readOnlyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(`type`: requiredChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requiredChanged(
    `type`: requiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionChanged(`type`: valueOptionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueOptionChanged(
    `type`: valueOptionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  @JSName("getProperty")
  def getProperty_minimumResultsForSearch(property: minimumResultsForSearch): Double = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (js.Array[
    typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): ChildrenLabel = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): Class = js.native
  @JSName("getProperty")
  def getProperty_placeholder(property: placeholder): String | Null = js.native
  @JSName("getProperty")
  def getProperty_readOnly(property: readOnly): Boolean = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: renderMode): jet | native = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  @JSName("getProperty")
  def getProperty_valueOption(property: valueOption): LabelValue = js.native
  
  var minimumResultsForSearch: Double = js.native
  
  var onMinimumResultsForSearchChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOptionRendererChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOptionsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOptionsKeysChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onPickerAttributesChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onPlaceholderChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onReadOnlyChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onRenderModeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onRequiredChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onValueOptionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  
  var options: (js.Array[
    typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  
  var optionsKeys: ChildrenLabel = js.native
  
  var pickerAttributes: Class = js.native
  
  var placeholder: String | Null = js.native
  
  var readOnly: Boolean = js.native
  
  var renderMode: jet | native = js.native
  
  var required: Boolean = js.native
  
  def setProperties(properties: ojSelectOneSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: renderMode, value: jet | native): Unit = js.native
  @JSName("setProperty")
  def setProperty_minimumResultsForSearch(property: minimumResultsForSearch, value: Double): Unit = js.native
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
      typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: ChildrenLabel): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: Class): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder): Unit = js.native
  @JSName("setProperty")
  def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: MoreMatchesFound): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueOption(property: valueOption, value: LabelValue): Unit = js.native
  
  @JSName("translations")
  var translations_ojSelectOne: MoreMatchesFound = js.native
  
  var valueOption: LabelValue = js.native
}
object ojSelectOne {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
