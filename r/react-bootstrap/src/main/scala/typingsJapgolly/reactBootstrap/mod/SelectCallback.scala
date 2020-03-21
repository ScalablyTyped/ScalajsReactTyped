package typingsJapgolly.reactBootstrap.mod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.EventHandler
import typingsJapgolly.react.mod.MouseEvent
import typingsJapgolly.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectCallback
  extends EventHandler[js.Any] {
  /**
    * @deprecated
    * This signature is a hack so can still derive from HTMLProps.
    * It does not reflect the underlying event and should not be used.
    */
  def apply(e: MouseEvent[js.Object, NativeMouseEvent]): Unit = js.native
  def apply(eventKey: js.Any, e: ReactEventFrom[js.Object with Element]): Unit = js.native
}

