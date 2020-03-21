package typingsJapgolly.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String indicating what type of abort occurred.
  * This string is *not* guaranteed to remain backwards compatible between releases.
  * You must not parse and act based upon its content. It is also possible that,
  * in some cases, an error not listed here could be reported.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.ERR_ABORTED
  - typingsJapgolly.chromeApps.chromeAppsStrings.ERR_INVALID_URL
  - typingsJapgolly.chromeApps.chromeAppsStrings.ERR_DISALLOWED_URL_SCHEME
  - typingsJapgolly.chromeApps.chromeAppsStrings.ERR_BLOCKED_BY_CLIENT
  - typingsJapgolly.chromeApps.chromeAppsStrings.ERR_ADDRESS_UNREACHABLE
  - typingsJapgolly.chromeApps.chromeAppsStrings.ERR_EMPTY_RESPONSE
  - typingsJapgolly.chromeApps.chromeAppsStrings.ERR_FILE_NOT_FOUND
  - typingsJapgolly.chromeApps.chromeAppsStrings.ERR_UNKNOWN_URL_SCHEME
*/
trait LoadAbortReason extends js.Object

object LoadAbortReason {
  @scala.inline
  def ERR_ABORTED: typingsJapgolly.chromeApps.chromeAppsStrings.ERR_ABORTED = this.cast("ERR_ABORTED")
  @scala.inline
  def ERR_ADDRESS_UNREACHABLE: typingsJapgolly.chromeApps.chromeAppsStrings.ERR_ADDRESS_UNREACHABLE = this.cast("ERR_ADDRESS_UNREACHABLE")
  @scala.inline
  def ERR_BLOCKED_BY_CLIENT: typingsJapgolly.chromeApps.chromeAppsStrings.ERR_BLOCKED_BY_CLIENT = this.cast("ERR_BLOCKED_BY_CLIENT")
  @scala.inline
  def ERR_DISALLOWED_URL_SCHEME: typingsJapgolly.chromeApps.chromeAppsStrings.ERR_DISALLOWED_URL_SCHEME = this.cast("ERR_DISALLOWED_URL_SCHEME")
  @scala.inline
  def ERR_EMPTY_RESPONSE: typingsJapgolly.chromeApps.chromeAppsStrings.ERR_EMPTY_RESPONSE = this.cast("ERR_EMPTY_RESPONSE")
  @scala.inline
  def ERR_FILE_NOT_FOUND: typingsJapgolly.chromeApps.chromeAppsStrings.ERR_FILE_NOT_FOUND = this.cast("ERR_FILE_NOT_FOUND")
  @scala.inline
  def ERR_INVALID_URL: typingsJapgolly.chromeApps.chromeAppsStrings.ERR_INVALID_URL = this.cast("ERR_INVALID_URL")
  @scala.inline
  def ERR_UNKNOWN_URL_SCHEME: typingsJapgolly.chromeApps.chromeAppsStrings.ERR_UNKNOWN_URL_SCHEME = this.cast("ERR_UNKNOWN_URL_SCHEME")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

