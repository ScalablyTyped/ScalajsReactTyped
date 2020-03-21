package typingsJapgolly.officeUiFabricReact.panelTypesMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanel extends js.Object {
  /**
    * Forces the panel to dismiss.
    */
  def dismiss(): Unit = js.native
  def dismiss(ev: ReactKeyboardEventFrom[HTMLElement]): Unit = js.native
  /**
    * Forces the panel to open.
    */
  def open(): Unit = js.native
}

