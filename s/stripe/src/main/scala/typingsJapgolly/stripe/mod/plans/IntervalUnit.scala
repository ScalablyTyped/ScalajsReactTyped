package typingsJapgolly.stripe.mod.plans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.day
  - typingsJapgolly.stripe.stripeStrings.week
  - typingsJapgolly.stripe.stripeStrings.month
  - typingsJapgolly.stripe.stripeStrings.year
*/
trait IntervalUnit extends js.Object

object IntervalUnit {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typingsJapgolly.stripe.stripeStrings.day = this.cast("day")
  @scala.inline
  def month: typingsJapgolly.stripe.stripeStrings.month = this.cast("month")
  @scala.inline
  def week: typingsJapgolly.stripe.stripeStrings.week = this.cast("week")
  @scala.inline
  def year: typingsJapgolly.stripe.stripeStrings.year = this.cast("year")
}

