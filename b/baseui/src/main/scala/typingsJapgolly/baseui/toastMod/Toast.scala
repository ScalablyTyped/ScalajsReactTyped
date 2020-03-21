package typingsJapgolly.baseui.toastMod

import typingsJapgolly.baseui.ReadonlySharedStylePropsA
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/toast", "Toast")
@js.native
class Toast ()
  extends Component[ToastProps, ToastPrivateState, js.Any] {
  def animateIn(): Unit = js.native
  def animateOut(): Unit = js.native
  def clearTimeout(): Unit = js.native
  def dismiss(): Unit = js.native
  def getSharedProps(): ReadonlySharedStylePropsA = js.native
  def onBlur(e: Event_): Unit = js.native
  def onFocus(e: Event_): Unit = js.native
  def onMouseEnter(e: Event_): Unit = js.native
  def onMouseLeave(e: Event_): Unit = js.native
  def startTimeout(): Unit = js.native
}

