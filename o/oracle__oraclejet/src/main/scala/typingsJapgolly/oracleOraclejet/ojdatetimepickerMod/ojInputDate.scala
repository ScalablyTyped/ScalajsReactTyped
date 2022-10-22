package typingsJapgolly.oracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.oracleOraclejet.anon.ChangeMonth
import typingsJapgolly.oracleOraclejet.anon.Class
import typingsJapgolly.oracleOraclejet.anon.CurrentText
import typingsJapgolly.oracleOraclejet.anon.Disabled
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputDate[SP /* <: ojInputDateSettableProperties */]
  extends StObject
     with inputBase[String, SP, String, String] {
  
  def addEventListener(`type`: dayFormatterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: dayFormatterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: keyboardEditChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: keyboardEditChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: renderModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: renderModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(`type`: converterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datePickerChanged(`type`: datePickerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datePickerChanged(
    `type`: datePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(`type`: dayMetaDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dayMetaDataChanged(
    `type`: dayMetaDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(`type`: maxChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(`type`: minChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
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
  
  var converter: Converter[String] | RegisteredConverter = js.native
  
  var datePicker: ChangeMonth = js.native
  
  def dayFormatter(param: DayFormatterInput): Null | all | DayFormatterOutput = js.native
  
  var dayMetaData: StringDictionary[StringDictionary[StringDictionary[Disabled]]] = js.native
  
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[String] | RegisteredConverter = js.native
  @JSName("getProperty")
  def getProperty_datePicker(property: datePicker): ChangeMonth = js.native
  @JSName("getProperty")
  def getProperty_dayMetaData(property: dayMetaData): StringDictionary[StringDictionary[StringDictionary[Disabled]]] = js.native
  @JSName("getProperty")
  def getProperty_keyboardEdit(property: keyboardEdit): enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): String | Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): String | Null = js.native
  @JSName("getProperty")
  def getProperty_pickerAttributes(property: pickerAttributes): Class = js.native
  @JSName("getProperty")
  def getProperty_renderMode(property: renderMode): jet | native = js.native
  
  def hide(): Unit = js.native
  
  var keyboardEdit: enabled | disabled = js.native
  
  var max: String | Null = js.native
  
  var min: String | Null = js.native
  
  var onConverterChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDatePickerChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDayFormatterChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDayMetaDataChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onKeyboardEditChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMaxChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMinChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onPickerAttributesChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onRenderModeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var pickerAttributes: Class = js.native
  
  var renderMode: jet | native = js.native
  
  def setProperties(properties: ojInputDateSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: keyboardEdit, value: enabled | disabled): Unit = js.native
  def setProperty(property: renderMode, value: jet | native): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_datePicker(property: datePicker, value: ChangeMonth): Unit = js.native
  @JSName("setProperty")
  def setProperty_dayMetaData(property: dayMetaData, value: StringDictionary[StringDictionary[StringDictionary[Disabled]]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_pickerAttributes(property: pickerAttributes, value: Class): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: CurrentText): Unit = js.native
  
  def show(): Unit = js.native
  
  @JSName("translations")
  var translations_ojInputDate: CurrentText = js.native
}
object ojInputDate {
  
  // tslint:disable-next-line interface-over-type-literal
  trait DayFormatterInput extends StObject {
    
    var date: Double
    
    var fullYear: Double
    
    var month: Double
  }
  object DayFormatterInput {
    
    inline def apply(date: Double, fullYear: Double, month: Double): DayFormatterInput = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], fullYear = fullYear.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayFormatterInput]
    }
    
    extension [Self <: DayFormatterInput](x: Self) {
      
      inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFullYear(value: Double): Self = StObject.set(x, "fullYear", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait DayFormatterOutput extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object DayFormatterOutput {
    
    inline def apply(): DayFormatterOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayFormatterOutput]
    }
    
    extension [Self <: DayFormatterOutput](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
