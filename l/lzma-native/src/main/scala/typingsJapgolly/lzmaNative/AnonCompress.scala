package typingsJapgolly.lzmaNative

import typingsJapgolly.lzmaNative.mod.Preset
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompress extends js.Object {
  def compress(buf: String, mode: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def compress(
    buf: String,
    mode: Preset,
    on_finish: js.Function1[/* result */ Buffer, Unit],
    on_progress: js.Function1[/* progress */ Double, Unit]
  ): Unit = js.native
  def compress(buf: Buffer, mode: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def compress(
    buf: Buffer,
    mode: Preset,
    on_finish: js.Function1[/* result */ Buffer, Unit],
    on_progress: js.Function1[/* progress */ Double, Unit]
  ): Unit = js.native
  def decompress(buf: String, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def decompress(
    buf: String,
    on_finish: js.Function1[/* result */ Buffer, Unit],
    on_progress: js.Function1[/* progress */ Double, Unit]
  ): Unit = js.native
  def decompress(buf: Buffer, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def decompress(
    buf: Buffer,
    on_finish: js.Function1[/* result */ Buffer, Unit],
    on_progress: js.Function1[/* progress */ Double, Unit]
  ): Unit = js.native
}

