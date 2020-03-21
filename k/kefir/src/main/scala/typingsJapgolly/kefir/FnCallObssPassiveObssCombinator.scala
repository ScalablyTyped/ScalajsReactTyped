package typingsJapgolly.kefir

import typingsJapgolly.kefir.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallObssPassiveObssCombinator extends js.Object {
  def apply[T, S, U](obss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  def apply[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.Array[Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Observable[U, S] = js.native
}

