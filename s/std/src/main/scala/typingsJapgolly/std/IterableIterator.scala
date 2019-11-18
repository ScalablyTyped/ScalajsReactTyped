package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableIterator[T]
  extends Iterator[T, js.Any, js.UndefOr[scala.Nothing]] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
}

