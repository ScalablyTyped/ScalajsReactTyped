package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.daily
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.weekly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.absoluteMonthly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.relativeMonthly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.absoluteYearly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.relativeYearly
*/
trait RecurrencePatternType extends js.Object

object RecurrencePatternType {
  @scala.inline
  def absoluteMonthly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.absoluteMonthly = this.cast("absoluteMonthly")
  @scala.inline
  def absoluteYearly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.absoluteYearly = this.cast("absoluteYearly")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def daily: typingsJapgolly.microsoftGraph.microsoftGraphStrings.daily = this.cast("daily")
  @scala.inline
  def relativeMonthly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.relativeMonthly = this.cast("relativeMonthly")
  @scala.inline
  def relativeYearly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.relativeYearly = this.cast("relativeYearly")
  @scala.inline
  def weekly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.weekly = this.cast("weekly")
}

