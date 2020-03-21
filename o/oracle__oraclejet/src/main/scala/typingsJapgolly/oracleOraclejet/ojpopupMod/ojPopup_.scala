package typingsJapgolly.oracleOraclejet.ojpopupMod

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.oracleOraclejet.AnonAriaCloseSkipLink
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.ojpopupMod.ojPopup.Position
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autoDismiss
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autoDismissChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.chrome
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.chromeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.default
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.firstFocusable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialFocus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialFocusChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modality
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modalityChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modeless
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeClose
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojClose
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojFocus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.popup
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.position
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.positionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.simple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tail
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tailChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.std.Element
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojPopup_ extends baseComponent[ojPopupSettableProperties] {
  var autoDismiss: none | focusLoss = js.native
  var chrome: default | none = js.native
  var initialFocus: auto | none | firstFocusable | popup = js.native
  var modality: modeless | modal = js.native
  var onAutoDismissChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onChromeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onInitialFocusChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onModalityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeClose: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjClose: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjFocus: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTailChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var position: Position = js.native
  var tail: none | simple = js.native
  @JSName("translations")
  var translations_ojPopup_ : AnonAriaCloseSkipLink = js.native
  def addEventListener(
    `type`: autoDismissChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | focusLoss], _]
  ): Unit = js.native
  def addEventListener(
    `type`: autoDismissChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | focusLoss], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: chromeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[default | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: chromeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[default | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialFocusChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | none | firstFocusable | popup], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: initialFocusChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | none | firstFocusable | popup], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modeless | modal], _]
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modeless | modal], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: tailChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | simple], _]
  ): Unit = js.native
  def addEventListener(
    `type`: tailChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | simple], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: ojBeforeClose,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeClose(
    `type`: ojBeforeClose,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: ojFocus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojFocus(
    `type`: ojFocus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: positionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_positionChanged(
    `type`: positionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  @JSName("getProperty")
  def getProperty_autoDismiss(property: autoDismiss): none | focusLoss = js.native
  @JSName("getProperty")
  def getProperty_chrome(property: chrome): default | none = js.native
  @JSName("getProperty")
  def getProperty_initialFocus(property: initialFocus): auto | none | firstFocusable | popup = js.native
  @JSName("getProperty")
  def getProperty_modality(property: modality): modeless | modal = js.native
  @JSName("getProperty")
  def getProperty_position(property: position): Position = js.native
  @JSName("getProperty")
  def getProperty_tail(property: tail): none | simple = js.native
  def isOpen(): Boolean = js.native
  def open(launcher: String): Unit = js.native
  def open(launcher: String, position: Position): Unit = js.native
  def open(launcher: Element): Unit = js.native
  def open(launcher: Element, position: Position): Unit = js.native
  def setProperties(properties: ojPopupSettablePropertiesLenient): Unit = js.native
  def setProperty(property: autoDismiss, value: focusLoss): Unit = js.native
  def setProperty(property: autoDismiss, value: none): Unit = js.native
  def setProperty(property: chrome, value: default): Unit = js.native
  def setProperty(property: chrome, value: none): Unit = js.native
  def setProperty(property: initialFocus, value: auto): Unit = js.native
  def setProperty(property: initialFocus, value: firstFocusable): Unit = js.native
  def setProperty(property: initialFocus, value: none): Unit = js.native
  def setProperty(property: initialFocus, value: popup): Unit = js.native
  def setProperty(property: modality, value: modal): Unit = js.native
  def setProperty(property: modality, value: modeless): Unit = js.native
  def setProperty(property: tail, value: none): Unit = js.native
  def setProperty(property: tail, value: simple): Unit = js.native
  @JSName("setProperty")
  def setProperty_position(property: position, value: Position): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAriaCloseSkipLink): Unit = js.native
}

