package typingsJapgolly.firebaseAnalytics.errorsMod

import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.`already-exists`
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.`already-initialized`
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.`interop-component-reg-failed`
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.`no-ga-id`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.`no-ga-id`
  - typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.`already-exists`
  - typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.`already-initialized`
  - typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.`interop-component-reg-failed`
*/
trait AnalyticsError extends js.Object

object AnalyticsError {
  @scala.inline
  def ALREADY_EXISTS: `already-exists` = this.cast("already-exists")
  @scala.inline
  def ALREADY_INITIALIZED: `already-initialized` = this.cast("already-initialized")
  @scala.inline
  def INTEROP_COMPONENT_REG_FAILED: `interop-component-reg-failed` = this.cast("interop-component-reg-failed")
  @scala.inline
  def NO_GA_ID: `no-ga-id` = this.cast("no-ga-id")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

