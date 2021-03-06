package typingsJapgolly.oracleOraclejet.ojdvtBaseMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.AnonLabelCountWithTotal
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.trackResize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.trackResizeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dvtBaseComponent[SP /* <: dvtBaseComponentSettableProperties */] extends baseComponent[SP] {
  var onTrackResizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var trackResize: on | off = js.native
  @JSName("translations")
  var translations_dvtBaseComponent: AnonLabelCountWithTotal = js.native
  def addEventListener(`type`: trackResizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: trackResizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_trackResize(property: trackResize): on | off = js.native
  def setProperties(properties: dvtBaseComponentSettablePropertiesLenient): Unit = js.native
  def setProperty(property: trackResize, value: off): Unit = js.native
  def setProperty(property: trackResize, value: on): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelCountWithTotal): Unit = js.native
}

