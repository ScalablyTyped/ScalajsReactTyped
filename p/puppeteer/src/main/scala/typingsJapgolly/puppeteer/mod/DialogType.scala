package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.alert
  - typingsJapgolly.puppeteer.puppeteerStrings.beforeunload
  - typingsJapgolly.puppeteer.puppeteerStrings.confirm
  - typingsJapgolly.puppeteer.puppeteerStrings.prompt
*/
trait DialogType extends js.Object

object DialogType {
  @scala.inline
  def alert: typingsJapgolly.puppeteer.puppeteerStrings.alert = this.cast("alert")
  @scala.inline
  def beforeunload: typingsJapgolly.puppeteer.puppeteerStrings.beforeunload = this.cast("beforeunload")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typingsJapgolly.puppeteer.puppeteerStrings.confirm = this.cast("confirm")
  @scala.inline
  def prompt: typingsJapgolly.puppeteer.puppeteerStrings.prompt = this.cast("prompt")
}

