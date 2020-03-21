package typingsJapgolly.oracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.oracleOraclejet.AnonChangeMonth
import typingsJapgolly.oracleOraclejet.AnonClass
import typingsJapgolly.oracleOraclejet.AnonCurrentText
import typingsJapgolly.oracleOraclejet.AnonDisabled
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typingsJapgolly.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typingsJapgolly.oracleOraclejet.ojinputtextMod.inputBase
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.datePicker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.datePickerChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dayFormatterChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dayMetaData
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dayMetaDataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.jet
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.keyboardEdit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.keyboardEditChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.max
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.min
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.native
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pickerAttributes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pickerAttributesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.renderMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.renderModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputDate_[SP /* <: ojInputDateSettableProperties */] extends inputBase[String, SP, String, String] {
  var converter: Converter[String] | RegisteredConverter = js.native
  var datePicker: AnonChangeMonth = js.native
  var dayMetaData: StringDictionary[StringDictionary[StringDictionary[AnonDisabled]]] = js.native
  var keyboardEdit: enabled | disabled = js.native
  var max: String | Null = js.native
  var min: String | Null = js.native
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDatePickerChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDayFormatterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDayMetaDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onKeyboardEditChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputDate_ : (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputDate_ : (js.Function1[CustomEvent, _]) | Null = js.native
  var onPickerAttributesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRenderModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var pickerAttributes: AnonClass = js.native
  var renderMode: jet | native = js.native
  @JSName("translations")
  var translations_ojInputDate_ : AnonCurrentText = js.native
  def addEventListener(
    `type`: dayFormatterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: dayFormatterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: keyboardEditChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _]
  ): Unit = js.native
  def addEventListener(
    `type`: keyboardEditChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[enabled | disabled], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: renderModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[jet | native], _]
  ): Unit = js.native
  def addEventListener(
    `type`: renderModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[jet | native], _],
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
  def addEventListener_datePickerChanged(
    `type`: datePickerChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datePickerChanged(
    `type`: datePickerChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(
    `type`: dayMetaDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(
    `type`: dayMetaDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
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
  def dayFormatter(param: DayFormatterInput): Null | all | DayFormatterOutput = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[String] | RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_datePicker(property: datePicker): AnonChangeMonth = js.native
  @JSName("getProperty")
  def getProperty_dayMetaData(property: dayMetaData): StringDictionary[StringDictionary[StringDictionary[AnonDisabled]]] = js.native
  @JSName("getProperty")
  def getProperty_keyboardEdit(property: keyboardEdit): enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): String | Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): String | Null = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): AnonClass = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: renderMode): jet | native = js.native
  def hide(): Unit = js.native
  def setProperties(properties: ojInputDateSettablePropertiesLenient): Unit = js.native
  def setProperty(property: keyboardEdit, value: disabled): Unit = js.native
  def setProperty(property: keyboardEdit, value: enabled): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
  def setProperty(property: renderMode, value: native): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_datePicker(property: datePicker, value: AnonChangeMonth): Unit = js.native
  @JSName("setProperty")
  def setProperty_dayMetaData(property: dayMetaData, value: StringDictionary[StringDictionary[StringDictionary[AnonDisabled]]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: AnonClass): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonCurrentText): Unit = js.native
  def show(): Unit = js.native
}

