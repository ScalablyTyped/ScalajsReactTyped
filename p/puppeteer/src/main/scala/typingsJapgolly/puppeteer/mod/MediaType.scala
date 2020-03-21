package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.screen
  - typingsJapgolly.puppeteer.puppeteerStrings.print
*/
trait MediaType extends js.Object

object MediaType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def print: typingsJapgolly.puppeteer.puppeteerStrings.print = this.cast("print")
  @scala.inline
  def screen: typingsJapgolly.puppeteer.puppeteerStrings.screen = this.cast("screen")
}

