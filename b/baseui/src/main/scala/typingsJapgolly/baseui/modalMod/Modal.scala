package typingsJapgolly.baseui.modalMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.baseui.SharedStylePropsArgchildrAnimate
import typingsJapgolly.baseui.baseuiStrings.backdrop
import typingsJapgolly.baseui.baseuiStrings.closeButton
import typingsJapgolly.baseui.baseuiStrings.escape_
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/modal", "Modal")
@js.native
class Modal ()
  extends Component[ModalProps, ModalState, js.Any] {
  def addDomEvents(): Unit = js.native
  def animateOutComplete(): Unit = js.native
  def autoFocus(): Unit = js.native
  def captureLastFocus(): Unit = js.native
  def clearTimers(): Unit = js.native
  def didClose(): Unit = js.native
  def didOpen(): Unit = js.native
  def disableMountNodeScroll(): Unit = js.native
  def getChildren(): Node = js.native
  def getMountNode(): HTMLElement = js.native
  def getRef(component: String): Ref = js.native
  def getSharedProps(): SharedStylePropsArgchildrAnimate = js.native
  def onBackdropClick(): Unit = js.native
  def onCloseClick(): Unit = js.native
  def onDocumentKeyPress(event: KeyboardEvent): Unit = js.native
  def removeDomEvents(): Unit = js.native
  def renderModal(): Node = js.native
  def resentMountNodeScroll(): Unit = js.native
  def restoreLastFocus(): Unit = js.native
  @JSName("triggerClose")
  def triggerClose_backdrop(source: backdrop): Unit = js.native
  @JSName("triggerClose")
  def triggerClose_closeButton(source: closeButton): Unit = js.native
  @JSName("triggerClose")
  def triggerClose_escape(source: escape_): Unit = js.native
}

