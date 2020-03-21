package typingsJapgolly.moment.mod.unitOfTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.moment.momentStrings.date
  - typingsJapgolly.moment.momentStrings.dates
  - typingsJapgolly.moment.momentStrings.D
*/
trait date extends _StartOf

object date {
  @scala.inline
  def D: typingsJapgolly.moment.momentStrings.D = this.cast("D")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.moment.momentStrings.date = this.cast("date")
  @scala.inline
  def dates: typingsJapgolly.moment.momentStrings.dates = this.cast("dates")
}

