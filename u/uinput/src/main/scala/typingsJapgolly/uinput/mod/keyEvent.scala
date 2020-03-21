package typingsJapgolly.uinput.mod

import typingsJapgolly.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uinput", "key_event")
@js.native
object keyEvent extends js.Object {
  def apply(stream: WriteStream, code: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

