package typingsJapgolly.chrome.chrome.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chrome.chromeStrings.main_frame
  - typingsJapgolly.chrome.chromeStrings.sub_frame
  - typingsJapgolly.chrome.chromeStrings.stylesheet
  - typingsJapgolly.chrome.chromeStrings.script
  - typingsJapgolly.chrome.chromeStrings.image
  - typingsJapgolly.chrome.chromeStrings.font
  - typingsJapgolly.chrome.chromeStrings.`object`
  - typingsJapgolly.chrome.chromeStrings.xmlhttprequest
  - typingsJapgolly.chrome.chromeStrings.ping
  - typingsJapgolly.chrome.chromeStrings.csp_report
  - typingsJapgolly.chrome.chromeStrings.media
  - typingsJapgolly.chrome.chromeStrings.websocket
  - typingsJapgolly.chrome.chromeStrings.other
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def csp_report: typingsJapgolly.chrome.chromeStrings.csp_report = this.cast("csp_report")
  @scala.inline
  def font: typingsJapgolly.chrome.chromeStrings.font = this.cast("font")
  @scala.inline
  def image: typingsJapgolly.chrome.chromeStrings.image = this.cast("image")
  @scala.inline
  def main_frame: typingsJapgolly.chrome.chromeStrings.main_frame = this.cast("main_frame")
  @scala.inline
  def media: typingsJapgolly.chrome.chromeStrings.media = this.cast("media")
  @scala.inline
  def `object`: typingsJapgolly.chrome.chromeStrings.`object` = this.cast("object")
  @scala.inline
  def other: typingsJapgolly.chrome.chromeStrings.other = this.cast("other")
  @scala.inline
  def ping: typingsJapgolly.chrome.chromeStrings.ping = this.cast("ping")
  @scala.inline
  def script: typingsJapgolly.chrome.chromeStrings.script = this.cast("script")
  @scala.inline
  def stylesheet: typingsJapgolly.chrome.chromeStrings.stylesheet = this.cast("stylesheet")
  @scala.inline
  def sub_frame: typingsJapgolly.chrome.chromeStrings.sub_frame = this.cast("sub_frame")
  @scala.inline
  def websocket: typingsJapgolly.chrome.chromeStrings.websocket = this.cast("websocket")
  @scala.inline
  def xmlhttprequest: typingsJapgolly.chrome.chromeStrings.xmlhttprequest = this.cast("xmlhttprequest")
}

