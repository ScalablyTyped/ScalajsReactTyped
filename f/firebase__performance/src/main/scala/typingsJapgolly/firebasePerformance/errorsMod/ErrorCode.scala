package typingsJapgolly.firebasePerformance.errorsMod

import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`FB not default`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`RC response not ok`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid attribute name`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid attribute value`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid cc log`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalide custom metric name`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no api key`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no app id`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no project id`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no window`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`trace started`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`trace stopped`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`trace started`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`trace stopped`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no window`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no app id`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no project id`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no api key`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid cc log`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`FB not default`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`RC response not ok`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid attribute name`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid attribute value`
  - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalide custom metric name`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def FB_NOT_DEFAULT: `FB not default` = this.cast("FB not default")
  @scala.inline
  def INVALID_ATTRIBUTE_NAME: `invalid attribute name` = this.cast("invalid attribute name")
  @scala.inline
  def INVALID_ATTRIBUTE_VALUE: `invalid attribute value` = this.cast("invalid attribute value")
  @scala.inline
  def INVALID_CC_LOG: `invalid cc log` = this.cast("invalid cc log")
  @scala.inline
  def INVALID_CUSTOM_METRIC_NAME: `invalide custom metric name` = this.cast("invalide custom metric name")
  @scala.inline
  def NO_API_KEY: `no api key` = this.cast("no api key")
  @scala.inline
  def NO_APP_ID: `no app id` = this.cast("no app id")
  @scala.inline
  def NO_PROJECT_ID: `no project id` = this.cast("no project id")
  @scala.inline
  def NO_WINDOW: `no window` = this.cast("no window")
  @scala.inline
  def RC_NOT_OK: `RC response not ok` = this.cast("RC response not ok")
  @scala.inline
  def TRACE_STARTED_BEFORE: `trace started` = this.cast("trace started")
  @scala.inline
  def TRACE_STOPPED_BEFORE: `trace stopped` = this.cast("trace stopped")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

