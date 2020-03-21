package typingsJapgolly.maxmind.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind", "open")
@js.native
object open extends js.Object {
  def apply[T](filepath: String): js.Promise[typingsJapgolly.maxmind.readerMod.default[T]] = js.native
  def apply[T](filepath: String, opts: js.UndefOr[scala.Nothing], cb: Callback): js.Promise[typingsJapgolly.maxmind.readerMod.default[T]] = js.native
  def apply[T](filepath: String, opts: OpenOpts): js.Promise[typingsJapgolly.maxmind.readerMod.default[T]] = js.native
  def apply[T](filepath: String, opts: OpenOpts, cb: Callback): js.Promise[typingsJapgolly.maxmind.readerMod.default[T]] = js.native
}

