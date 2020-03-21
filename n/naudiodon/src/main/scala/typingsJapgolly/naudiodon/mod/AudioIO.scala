package typingsJapgolly.naudiodon.mod

import typingsJapgolly.naudiodon.AnonInOptions
import typingsJapgolly.naudiodon.AnonInOptionsOutOptions
import typingsJapgolly.naudiodon.AnonOutOptions
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("naudiodon", "AudioIO")
@js.native
object AudioIO extends js.Object {
  def apply(options: AnonInOptions): Readable with AudioStream = js.native
  def apply(options: AnonInOptionsOutOptions): Duplex with AudioStream = js.native
  def apply(options: AnonOutOptions): Writable with AudioStream = js.native
}

