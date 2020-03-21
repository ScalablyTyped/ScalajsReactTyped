package typingsJapgolly.oracleOraclejet.ojradiosetMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.AnonRequired
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsJapgolly.oracleOraclejet.ojradiosetMod.ojRadioset.OptionContext
import typingsJapgolly.oracleOraclejet.ojradiosetMod.ojRadioset.OptionsKeys
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionRendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.options
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionsKeys
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionsKeysChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.required
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojRadioset_[K, D]
  extends editableValue[js.Any, ojRadiosetSettableProperties[K, D], js.Any, js.Any] {
  var labelledBy: String | Null = js.native
  var onLabelledByChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojRadioset_ : (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojRadioset_ : (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOptionsKeysChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.native
  var options: (DataProvider[K, D]) | Null = js.native
  var optionsKeys: js.UndefOr[OptionsKeys] = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_ojRadioset_ : AnonRequired = js.native
  def addEventListener(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(`type`: labelledByChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelledByChanged(
    `type`: labelledByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(`type`: optionRendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionRendererChanged(
    `type`: optionRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(`type`: optionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsChanged(
    `type`: optionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(`type`: optionsKeysChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionsKeysChanged(
    `type`: optionsKeysChanged,
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
  @JSName("getProperty")
  def getProperty_labelledBy(property: labelledBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.native
  @JSName("getProperty")
  def getProperty_options(property: options): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_optionsKeys(property: optionsKeys): js.UndefOr[OptionsKeys] = js.native
  @JSName("getProperty")
  def getProperty_required(property: required): Boolean = js.native
  def setProperties(properties: ojRadiosetSettablePropertiesLenient[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionRenderer(property: optionRenderer, value: js.Function1[/* param0 */ OptionContext[D], Element]): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options): Unit = js.native
  @JSName("setProperty")
  def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_optionsKeys(property: optionsKeys, value: OptionsKeys): Unit = js.native
  @JSName("setProperty")
  def setProperty_required(property: required, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonRequired): Unit = js.native
  def validate(): js.Promise[String] = js.native
}

