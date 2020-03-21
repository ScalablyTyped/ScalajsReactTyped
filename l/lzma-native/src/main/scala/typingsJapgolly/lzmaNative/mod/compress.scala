package typingsJapgolly.lzmaNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lzma-native", "compress")
@js.native
object compress extends js.Object {
  def apply(buf: String): Unit = js.native
  def apply(buf: String, options: LzmaOptions): Unit = js.native
  def apply(buf: String, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def apply(buf: String, options: Preset): Unit = js.native
  def apply(buf: String, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def apply(buf: Buffer): Unit = js.native
  def apply(buf: Buffer, options: LzmaOptions): Unit = js.native
  def apply(buf: Buffer, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def apply(buf: Buffer, options: Preset): Unit = js.native
  def apply(buf: Buffer, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
}

