package typingsJapgolly.phonon

import typingsJapgolly.phonon.Phonon_.PhononCustomWindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  def off(event: String, callback: js.Function1[/* event */ PhononCustomWindowEvent, Unit]): Unit = js.native
  def off(
    event: String,
    callback: js.Function1[/* event */ PhononCustomWindowEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def on(event: String, callback: js.Function1[/* event */ PhononCustomWindowEvent, Unit]): Unit = js.native
  def on(
    event: String,
    callback: js.Function1[/* event */ PhononCustomWindowEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}

