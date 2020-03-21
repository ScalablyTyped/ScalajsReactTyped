package typingsJapgolly.oracleOraclejet.ojdialogMod

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.oracleOraclejet.AnonLabelCloseIcon
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.ojdialogMod.ojDialog.Position
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`title-bar`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cancelBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cancelBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dialogTitle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dialogTitleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragAffordance
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragAffordanceChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.escape
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hide
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.icon
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialVisibility
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialVisibilityChanged
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
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResizeStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResizeStop
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.position
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.positionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.resizable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.resizeBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.resizeBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.role
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.roleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.show
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDialog_ extends baseComponent[ojDialogSettableProperties] {
  var cancelBehavior: icon | escape | none = js.native
  var dialogTitle: String | Null = js.native
  var dragAffordance: `title-bar` | none = js.native
  var initialVisibility: hide | show = js.native
  var modality: modal | modeless = js.native
  var onCancelBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDialogTitleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDragAffordanceChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onInitialVisibilityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onModalityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeClose: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjClose: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjFocus: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjResize: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjResizeStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjResizeStop: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onResizeBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRoleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var position: Position = js.native
  var resizeBehavior: resizable | none = js.native
  var role: String = js.native
  @JSName("translations")
  var translations_ojDialog_ : AnonLabelCloseIcon = js.native
  def addEventListener(
    `type`: cancelBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: cancelBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: dragAffordanceChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: dragAffordanceChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialVisibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], _]
  ): Unit = js.native
  def addEventListener(
    `type`: initialVisibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], _]
  ): Unit = js.native
  def addEventListener(
    `type`: modalityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: resizeBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: resizeBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialogTitleChanged(
    `type`: dialogTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialogTitleChanged(
    `type`: dialogTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
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
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: ojResizeStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStart(
    `type`: ojResizeStart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: ojResizeStop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResizeStop(
    `type`: ojResizeStop,
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
  @JSName("addEventListener")
  def addEventListener_roleChanged(
    `type`: roleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_roleChanged(
    `type`: roleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  @JSName("getProperty")
  def getProperty_cancelBehavior(property: cancelBehavior): icon | escape | none = js.native
  @JSName("getProperty")
  def getProperty_dialogTitle(property: dialogTitle): String | Null = js.native
  @JSName("getProperty")
  def getProperty_dragAffordance(property: dragAffordance): `title-bar` | none = js.native
  @JSName("getProperty")
  def getProperty_initialVisibility(property: initialVisibility): hide | show = js.native
  @JSName("getProperty")
  def getProperty_modality(property: modality): modal | modeless = js.native
  @JSName("getProperty")
  def getProperty_position(property: position): Position = js.native
  @JSName("getProperty")
  def getProperty_resizeBehavior(property: resizeBehavior): resizable | none = js.native
  @JSName("getProperty")
  def getProperty_role(property: role): String = js.native
  def isOpen(): Boolean = js.native
  def open(): Unit = js.native
  def setProperties(properties: ojDialogSettablePropertiesLenient): Unit = js.native
  def setProperty(property: cancelBehavior, value: escape): Unit = js.native
  def setProperty(property: cancelBehavior, value: icon): Unit = js.native
  def setProperty(property: cancelBehavior, value: none): Unit = js.native
  def setProperty(property: dragAffordance, value: `title-bar`): Unit = js.native
  def setProperty(property: dragAffordance, value: none): Unit = js.native
  def setProperty(property: initialVisibility, value: hide): Unit = js.native
  def setProperty(property: initialVisibility, value: show): Unit = js.native
  def setProperty(property: modality, value: modal): Unit = js.native
  def setProperty(property: modality, value: modeless): Unit = js.native
  def setProperty(property: resizeBehavior, value: none): Unit = js.native
  def setProperty(property: resizeBehavior, value: resizable): Unit = js.native
  @JSName("setProperty")
  def setProperty_dialogTitle(property: dialogTitle): Unit = js.native
  @JSName("setProperty")
  def setProperty_dialogTitle(property: dialogTitle, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_position(property: position, value: Position): Unit = js.native
  @JSName("setProperty")
  def setProperty_role(property: role, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelCloseIcon): Unit = js.native
}

