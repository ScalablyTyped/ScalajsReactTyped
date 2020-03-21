package typingsJapgolly.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.promClient.promClientStrings.omit
  - typingsJapgolly.promClient.promClientStrings.sum
  - typingsJapgolly.promClient.promClientStrings.first
  - typingsJapgolly.promClient.promClientStrings.min
  - typingsJapgolly.promClient.promClientStrings.max
  - typingsJapgolly.promClient.promClientStrings.average
*/
trait Aggregator extends js.Object

object Aggregator {
  @scala.inline
  def average: typingsJapgolly.promClient.promClientStrings.average = this.cast("average")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def first: typingsJapgolly.promClient.promClientStrings.first = this.cast("first")
  @scala.inline
  def max: typingsJapgolly.promClient.promClientStrings.max = this.cast("max")
  @scala.inline
  def min: typingsJapgolly.promClient.promClientStrings.min = this.cast("min")
  @scala.inline
  def omit: typingsJapgolly.promClient.promClientStrings.omit = this.cast("omit")
  @scala.inline
  def sum: typingsJapgolly.promClient.promClientStrings.sum = this.cast("sum")
}

