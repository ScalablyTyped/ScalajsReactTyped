package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.plotlyJs.plotlyJsStrings.`-_`
  - typingsJapgolly.plotlyJs.plotlyJsStrings.linear
  - typingsJapgolly.plotlyJs.plotlyJsStrings.log
  - typingsJapgolly.plotlyJs.plotlyJsStrings.date
  - typingsJapgolly.plotlyJs.plotlyJsStrings.category
*/
trait AxisType extends js.Object

object AxisType {
  @scala.inline
  def _dash: `-_` = this.cast("-")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typingsJapgolly.plotlyJs.plotlyJsStrings.category = this.cast("category")
  @scala.inline
  def date: typingsJapgolly.plotlyJs.plotlyJsStrings.date = this.cast("date")
  @scala.inline
  def linear: typingsJapgolly.plotlyJs.plotlyJsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typingsJapgolly.plotlyJs.plotlyJsStrings.log = this.cast("log")
}

