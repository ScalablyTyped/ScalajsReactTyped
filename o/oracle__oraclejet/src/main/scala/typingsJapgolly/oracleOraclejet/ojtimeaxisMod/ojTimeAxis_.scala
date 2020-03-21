package typingsJapgolly.oracleOraclejet.ojtimeaxisMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsJapgolly.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.days
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.endChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hours
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.months
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scale
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scaleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.startChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTimeAxis_ extends dvtBaseComponent[ojTimeAxisSettableProperties] {
  var converter: Converters | Converter[String] = js.native
  var end: String = js.native
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScaleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStartChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  var start: String = js.native
  @JSName("translations")
  var translations_ojTimeAxis_ : AnonLabelAndValue = js.native
  def addEventListener(`type`: scaleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: scaleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(`type`: converterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(`type`: endChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: endChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(`type`: startChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: startChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converters | Converter[String] = js.native
  @JSName("getProperty")
  def getProperty_end(property: end): String = js.native
  @JSName("getProperty")
  def getProperty_scale(property: scale): seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  @JSName("getProperty")
  def getProperty_start(property: start): String = js.native
  def setProperties(properties: ojTimeAxisSettablePropertiesLenient): Unit = js.native
  def setProperty(property: scale, value: days): Unit = js.native
  def setProperty(property: scale, value: hours): Unit = js.native
  def setProperty(property: scale, value: minutes): Unit = js.native
  def setProperty(property: scale, value: months): Unit = js.native
  def setProperty(property: scale, value: quarters): Unit = js.native
  def setProperty(property: scale, value: seconds): Unit = js.native
  def setProperty(property: scale, value: weeks): Unit = js.native
  def setProperty(property: scale, value: years): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converters): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_end(property: end, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_start(property: start, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelAndValue): Unit = js.native
}

