package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.left
  - typingsJapgolly.puppeteer.puppeteerStrings.right
  - typingsJapgolly.puppeteer.puppeteerStrings.middle
*/
trait MouseButtons extends js.Object

object MouseButtons {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typingsJapgolly.puppeteer.puppeteerStrings.left = this.cast("left")
  @scala.inline
  def middle: typingsJapgolly.puppeteer.puppeteerStrings.middle = this.cast("middle")
  @scala.inline
  def right: typingsJapgolly.puppeteer.puppeteerStrings.right = this.cast("right")
}

