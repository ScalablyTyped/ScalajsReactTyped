package typingsJapgolly.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.queued
  - typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.in_progress
  - typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.complete
*/
trait AuthorizeRequestStatus extends js.Object

object AuthorizeRequestStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.complete = this.cast("complete")
  @scala.inline
  def in_progress: typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.in_progress = this.cast("in_progress")
  @scala.inline
  def queued: typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.queued = this.cast("queued")
}

