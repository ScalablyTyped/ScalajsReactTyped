package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.load
  - typingsJapgolly.puppeteer.puppeteerStrings.domcontentloaded
  - typingsJapgolly.puppeteer.puppeteerStrings.networkidle0
  - typingsJapgolly.puppeteer.puppeteerStrings.networkidle2
*/
trait LoadEvent extends js.Object

object LoadEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def domcontentloaded: typingsJapgolly.puppeteer.puppeteerStrings.domcontentloaded = this.cast("domcontentloaded")
  @scala.inline
  def load: typingsJapgolly.puppeteer.puppeteerStrings.load = this.cast("load")
  @scala.inline
  def networkidle0: typingsJapgolly.puppeteer.puppeteerStrings.networkidle0 = this.cast("networkidle0")
  @scala.inline
  def networkidle2: typingsJapgolly.puppeteer.puppeteerStrings.networkidle2 = this.cast("networkidle2")
}

