package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.page
  - typingsJapgolly.puppeteer.puppeteerStrings.background_page
  - typingsJapgolly.puppeteer.puppeteerStrings.shared_worker
  - typingsJapgolly.puppeteer.puppeteerStrings.service_worker
  - typingsJapgolly.puppeteer.puppeteerStrings.browser
  - typingsJapgolly.puppeteer.puppeteerStrings.other
*/
trait TargetType extends js.Object

object TargetType {
  @scala.inline
  def background_page: typingsJapgolly.puppeteer.puppeteerStrings.background_page = this.cast("background_page")
  @scala.inline
  def browser: typingsJapgolly.puppeteer.puppeteerStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def other: typingsJapgolly.puppeteer.puppeteerStrings.other = this.cast("other")
  @scala.inline
  def page: typingsJapgolly.puppeteer.puppeteerStrings.page = this.cast("page")
  @scala.inline
  def service_worker: typingsJapgolly.puppeteer.puppeteerStrings.service_worker = this.cast("service_worker")
  @scala.inline
  def shared_worker: typingsJapgolly.puppeteer.puppeteerStrings.shared_worker = this.cast("shared_worker")
}

