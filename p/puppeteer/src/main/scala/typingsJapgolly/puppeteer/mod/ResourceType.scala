package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.document
  - typingsJapgolly.puppeteer.puppeteerStrings.stylesheet
  - typingsJapgolly.puppeteer.puppeteerStrings.image
  - typingsJapgolly.puppeteer.puppeteerStrings.media
  - typingsJapgolly.puppeteer.puppeteerStrings.font
  - typingsJapgolly.puppeteer.puppeteerStrings.script
  - typingsJapgolly.puppeteer.puppeteerStrings.texttrack
  - typingsJapgolly.puppeteer.puppeteerStrings.xhr
  - typingsJapgolly.puppeteer.puppeteerStrings.fetch
  - typingsJapgolly.puppeteer.puppeteerStrings.eventsource
  - typingsJapgolly.puppeteer.puppeteerStrings.websocket
  - typingsJapgolly.puppeteer.puppeteerStrings.manifest
  - typingsJapgolly.puppeteer.puppeteerStrings.other
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typingsJapgolly.puppeteer.puppeteerStrings.document = this.cast("document")
  @scala.inline
  def eventsource: typingsJapgolly.puppeteer.puppeteerStrings.eventsource = this.cast("eventsource")
  @scala.inline
  def fetch: typingsJapgolly.puppeteer.puppeteerStrings.fetch = this.cast("fetch")
  @scala.inline
  def font: typingsJapgolly.puppeteer.puppeteerStrings.font = this.cast("font")
  @scala.inline
  def image: typingsJapgolly.puppeteer.puppeteerStrings.image = this.cast("image")
  @scala.inline
  def manifest: typingsJapgolly.puppeteer.puppeteerStrings.manifest = this.cast("manifest")
  @scala.inline
  def media: typingsJapgolly.puppeteer.puppeteerStrings.media = this.cast("media")
  @scala.inline
  def other: typingsJapgolly.puppeteer.puppeteerStrings.other = this.cast("other")
  @scala.inline
  def script: typingsJapgolly.puppeteer.puppeteerStrings.script = this.cast("script")
  @scala.inline
  def stylesheet: typingsJapgolly.puppeteer.puppeteerStrings.stylesheet = this.cast("stylesheet")
  @scala.inline
  def texttrack: typingsJapgolly.puppeteer.puppeteerStrings.texttrack = this.cast("texttrack")
  @scala.inline
  def websocket: typingsJapgolly.puppeteer.puppeteerStrings.websocket = this.cast("websocket")
  @scala.inline
  def xhr: typingsJapgolly.puppeteer.puppeteerStrings.xhr = this.cast("xhr")
}

