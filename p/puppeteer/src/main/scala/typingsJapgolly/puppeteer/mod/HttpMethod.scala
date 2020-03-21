package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.GET
  - typingsJapgolly.puppeteer.puppeteerStrings.POST
  - typingsJapgolly.puppeteer.puppeteerStrings.PATCH
  - typingsJapgolly.puppeteer.puppeteerStrings.PUT
  - typingsJapgolly.puppeteer.puppeteerStrings.DELETE
  - typingsJapgolly.puppeteer.puppeteerStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsJapgolly.puppeteer.puppeteerStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsJapgolly.puppeteer.puppeteerStrings.GET = this.cast("GET")
  @scala.inline
  def OPTIONS: typingsJapgolly.puppeteer.puppeteerStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsJapgolly.puppeteer.puppeteerStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsJapgolly.puppeteer.puppeteerStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsJapgolly.puppeteer.puppeteerStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

