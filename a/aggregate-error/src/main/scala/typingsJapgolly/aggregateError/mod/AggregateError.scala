package typingsJapgolly.aggregateError.mod

import typingsJapgolly.std.Error
import typingsJapgolly.std.Iterable
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateError
  extends Error
     with Iterable[Error] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_AggregateError: js.Function0[IterableIterator[js.Error]] = js.native
  @JSName("name")
  val name_AggregateError: typingsJapgolly.aggregateError.aggregateErrorStrings.AggregateError = js.native
}

