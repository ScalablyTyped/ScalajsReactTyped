package typingsJapgolly.simplecrawler.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.simplecrawler.simplecrawlerStrings.queued
  - typingsJapgolly.simplecrawler.simplecrawlerStrings.spooled
  - typingsJapgolly.simplecrawler.simplecrawlerStrings.headers
  - typingsJapgolly.simplecrawler.simplecrawlerStrings.downloaded
  - typingsJapgolly.simplecrawler.simplecrawlerStrings.redirected
  - typingsJapgolly.simplecrawler.simplecrawlerStrings.notfound
  - typingsJapgolly.simplecrawler.simplecrawlerStrings.failed
*/
trait QueueItemStatus extends js.Object

object QueueItemStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def downloaded: typingsJapgolly.simplecrawler.simplecrawlerStrings.downloaded = this.cast("downloaded")
  @scala.inline
  def failed: typingsJapgolly.simplecrawler.simplecrawlerStrings.failed = this.cast("failed")
  @scala.inline
  def headers: typingsJapgolly.simplecrawler.simplecrawlerStrings.headers = this.cast("headers")
  @scala.inline
  def notfound: typingsJapgolly.simplecrawler.simplecrawlerStrings.notfound = this.cast("notfound")
  @scala.inline
  def queued: typingsJapgolly.simplecrawler.simplecrawlerStrings.queued = this.cast("queued")
  @scala.inline
  def redirected: typingsJapgolly.simplecrawler.simplecrawlerStrings.redirected = this.cast("redirected")
  @scala.inline
  def spooled: typingsJapgolly.simplecrawler.simplecrawlerStrings.spooled = this.cast("spooled")
}

