package typingsJapgolly.oracleOraclejet.ojmenuMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.AnonAriaFocusSkipLink
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAction
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojClose
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.openOptions
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.openOptionsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMenu_ extends baseComponent[ojMenuSettableProperties] {
  var disabled: Boolean = js.native
  var onDisabledChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAction: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjClose: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOpenOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var openOptions: OpenOptions = js.native
  @JSName("translations")
  var translations_ojMenu_ : AnonAriaFocusSkipLink = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(`type`: disabledChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(`type`: ojAction, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: ojAction,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(`type`: ojAnimateEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(`type`: ojAnimateStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(`type`: ojBeforeOpen, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(`type`: ojClose, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(`type`: ojOpen, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openOptionsChanged(`type`: openOptionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openOptionsChanged(
    `type`: openOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_openOptions(property: openOptions): OpenOptions = js.native
  def open(): Unit = js.native
  def open(event: js.Object): Unit = js.native
  def open(event: js.Object, openOptions: OpenOptions): Unit = js.native
  def setProperties(properties: ojMenuSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_openOptions(property: openOptions, value: OpenOptions): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAriaFocusSkipLink): Unit = js.native
}

