package typingsJapgolly.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactTable.reactTableStrings.sum
  - typingsJapgolly.reactTable.reactTableStrings.average
  - typingsJapgolly.reactTable.reactTableStrings.median
  - typingsJapgolly.reactTable.reactTableStrings.uniqueCount
  - typingsJapgolly.reactTable.reactTableStrings.count
*/
trait DefaultAggregators extends js.Object

object DefaultAggregators {
  @scala.inline
  def average: typingsJapgolly.reactTable.reactTableStrings.average = this.cast("average")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def count: typingsJapgolly.reactTable.reactTableStrings.count = this.cast("count")
  @scala.inline
  def median: typingsJapgolly.reactTable.reactTableStrings.median = this.cast("median")
  @scala.inline
  def sum: typingsJapgolly.reactTable.reactTableStrings.sum = this.cast("sum")
  @scala.inline
  def uniqueCount: typingsJapgolly.reactTable.reactTableStrings.uniqueCount = this.cast("uniqueCount")
}

