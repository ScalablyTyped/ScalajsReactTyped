package typingsJapgolly.tarStream.mod

import typingsJapgolly.node.streamMod.PassThrough
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.tarStream.tarStreamStrings.entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extract_ extends Writable {
  @JSName("on")
  def on_entry(
    event: entry,
    listener: js.Function3[/* headers */ Headers, /* stream */ PassThrough, /* next */ js.Function0[Unit], Unit]
  ): this.type = js.native
}

