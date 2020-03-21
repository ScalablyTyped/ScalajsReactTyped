package typingsJapgolly.uinput.mod

import typingsJapgolly.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uinput", "send_event")
@js.native
object sendEvent extends js.Object {
  def apply(
    stream: WriteStream,
    typeParam: Double,
    code: Double,
    value: Double,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
}

