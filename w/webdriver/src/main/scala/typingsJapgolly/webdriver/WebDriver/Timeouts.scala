package typingsJapgolly.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webdriver.webdriverStrings.script
  - typingsJapgolly.webdriver.webdriverStrings.pageLoad
  - typingsJapgolly.webdriver.webdriverStrings.`implicit`
*/
trait Timeouts extends js.Object

object Timeouts {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `implicit`: typingsJapgolly.webdriver.webdriverStrings.`implicit` = this.cast("implicit")
  @scala.inline
  def pageLoad: typingsJapgolly.webdriver.webdriverStrings.pageLoad = this.cast("pageLoad")
  @scala.inline
  def script: typingsJapgolly.webdriver.webdriverStrings.script = this.cast("script")
}

