package typingsJapgolly.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tracking flags that match our internal tracking classification */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting_content
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining_content
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_ad
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_analytics
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_social
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_content
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_basic_tracking
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_strict_tracking
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_social_tracking
*/
trait UrlClassificationFlags extends js.Object

object UrlClassificationFlags {
  @scala.inline
  def any_basic_tracking: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_basic_tracking = this.cast("any_basic_tracking")
  @scala.inline
  def any_social_tracking: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_social_tracking = this.cast("any_social_tracking")
  @scala.inline
  def any_strict_tracking: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_strict_tracking = this.cast("any_strict_tracking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cryptomining: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining = this.cast("cryptomining")
  @scala.inline
  def cryptomining_content: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining_content = this.cast("cryptomining_content")
  @scala.inline
  def fingerprinting: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting = this.cast("fingerprinting")
  @scala.inline
  def fingerprinting_content: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting_content = this.cast("fingerprinting_content")
  @scala.inline
  def tracking: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking = this.cast("tracking")
  @scala.inline
  def tracking_ad: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_ad = this.cast("tracking_ad")
  @scala.inline
  def tracking_analytics: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_analytics = this.cast("tracking_analytics")
  @scala.inline
  def tracking_content: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_content = this.cast("tracking_content")
  @scala.inline
  def tracking_social: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_social = this.cast("tracking_social")
}

