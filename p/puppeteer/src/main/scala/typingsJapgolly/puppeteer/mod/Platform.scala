package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.mac
  - typingsJapgolly.puppeteer.puppeteerStrings.win32
  - typingsJapgolly.puppeteer.puppeteerStrings.win64
  - typingsJapgolly.puppeteer.puppeteerStrings.linux
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linux: typingsJapgolly.puppeteer.puppeteerStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typingsJapgolly.puppeteer.puppeteerStrings.mac = this.cast("mac")
  @scala.inline
  def win32: typingsJapgolly.puppeteer.puppeteerStrings.win32 = this.cast("win32")
  @scala.inline
  def win64: typingsJapgolly.puppeteer.puppeteerStrings.win64 = this.cast("win64")
}

