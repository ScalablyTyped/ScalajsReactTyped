package typingsJapgolly.kefir

import typingsJapgolly.kefir.mod.Emitter
import typingsJapgolly.kefir.mod.Stream_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallSubscribe extends js.Object {
  def apply[T, S](subscribe: js.Function1[/* emitter */ Emitter[T, S], js.Function | Unit]): Stream_[T, S] = js.native
}

