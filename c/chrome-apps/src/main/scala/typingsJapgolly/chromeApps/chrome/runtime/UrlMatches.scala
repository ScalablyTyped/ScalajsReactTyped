package typingsJapgolly.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
  - typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign
  - typingsJapgolly.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash
*/
trait UrlMatches extends Permission

object UrlMatches {
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: typingsJapgolly.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign = this.cast("<all_urls>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chromeColonSlashSlashfaviconSlash: typingsJapgolly.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash = this.cast("chrome://favicon/")
  @scala.inline
  def fileColonSlashSlashSlashAsteriskSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk = this.cast("file:///*/*")
  @scala.inline
  def httpColonSlashSlashAsteriskSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk = this.cast("http://*/*")
  @scala.inline
  def httpsColonSlashSlashAsteriskSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk = this.cast("https://*/*")
  @scala.inline
  def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: typingsJapgolly.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = this.cast("https://www.google-analytics.com/*")
  @scala.inline
  def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = this.cast("https://www.googleapis.com/*")
}

