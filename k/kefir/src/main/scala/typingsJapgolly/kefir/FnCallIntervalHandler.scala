package typingsJapgolly.kefir

import typingsJapgolly.kefir.mod.Emitter
import typingsJapgolly.kefir.mod.Stream_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallIntervalHandler extends js.Object {
  def apply[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream_[T, S] = js.native
}

