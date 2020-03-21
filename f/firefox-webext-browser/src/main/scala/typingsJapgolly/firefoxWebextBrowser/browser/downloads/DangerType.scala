package typingsJapgolly.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * *file*:
  *   The download's filename is suspicious.
  * *url*:
  *   The download's URL is known to be malicious.
  * *content*:
  *   The downloaded file is known to be malicious.
  * *uncommon*:
  *   The download's URL is not commonly downloaded and could be dangerous.
  * *safe*:
  *   The download presents no known danger to the user's computer.
  *
  * These string constants will never change, however the set of DangerTypes may change.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.file
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.content
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.host
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted
*/
trait DangerType extends js.Object

object DangerType {
  @scala.inline
  def accepted: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def content: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.content = this.cast("content")
  @scala.inline
  def file: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.file = this.cast("file")
  @scala.inline
  def host: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.host = this.cast("host")
  @scala.inline
  def safe: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe = this.cast("safe")
  @scala.inline
  def uncommon: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon = this.cast("uncommon")
  @scala.inline
  def unwanted: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted = this.cast("unwanted")
  @scala.inline
  def url: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = this.cast("url")
}

