package typingsJapgolly.moment.mod.unitOfTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.moment.momentStrings.quarter
  - typingsJapgolly.moment.momentStrings.quarters
  - typingsJapgolly.moment.momentStrings.Q
*/
trait quarter extends _StartOf

object quarter {
  @scala.inline
  def Q: typingsJapgolly.moment.momentStrings.Q = this.cast("Q")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def quarter: typingsJapgolly.moment.momentStrings.quarter = this.cast("quarter")
  @scala.inline
  def quarters: typingsJapgolly.moment.momentStrings.quarters = this.cast("quarters")
}

