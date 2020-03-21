package typingsJapgolly.materialUiCore

import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/ButtonBase/focusVisible", JSImport.Namespace)
@js.native
object focusVisibleMod extends js.Object {
  def detectFocusVisible(instance: AnonFocusVisibleCheckTime, element: Element, cb: js.Function0[Unit], attempt: Double): Unit = js.native
  def focusKeyPressed(pressed: Boolean): Boolean = js.native
  def listenForFocusKeys(window: Window_): Unit = js.native
}

