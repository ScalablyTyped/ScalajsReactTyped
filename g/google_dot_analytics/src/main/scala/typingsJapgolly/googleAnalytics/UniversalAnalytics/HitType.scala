package typingsJapgolly.googleAnalytics.UniversalAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developers.google.com/analytics/devguides/collection/analyticsjs/method-reference
// https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#hitType
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleAnalytics.googleAnalyticsStrings.pageview
  - typingsJapgolly.googleAnalytics.googleAnalyticsStrings.screenview
  - typingsJapgolly.googleAnalytics.googleAnalyticsStrings.event
  - typingsJapgolly.googleAnalytics.googleAnalyticsStrings.transaction
  - typingsJapgolly.googleAnalytics.googleAnalyticsStrings.item
  - typingsJapgolly.googleAnalytics.googleAnalyticsStrings.social
  - typingsJapgolly.googleAnalytics.googleAnalyticsStrings.exception
  - typingsJapgolly.googleAnalytics.googleAnalyticsStrings.timing
*/
trait HitType extends js.Object

object HitType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def event: typingsJapgolly.googleAnalytics.googleAnalyticsStrings.event = this.cast("event")
  @scala.inline
  def exception: typingsJapgolly.googleAnalytics.googleAnalyticsStrings.exception = this.cast("exception")
  @scala.inline
  def item: typingsJapgolly.googleAnalytics.googleAnalyticsStrings.item = this.cast("item")
  @scala.inline
  def pageview: typingsJapgolly.googleAnalytics.googleAnalyticsStrings.pageview = this.cast("pageview")
  @scala.inline
  def screenview: typingsJapgolly.googleAnalytics.googleAnalyticsStrings.screenview = this.cast("screenview")
  @scala.inline
  def social: typingsJapgolly.googleAnalytics.googleAnalyticsStrings.social = this.cast("social")
  @scala.inline
  def timing: typingsJapgolly.googleAnalytics.googleAnalyticsStrings.timing = this.cast("timing")
  @scala.inline
  def transaction: typingsJapgolly.googleAnalytics.googleAnalyticsStrings.transaction = this.cast("transaction")
}

