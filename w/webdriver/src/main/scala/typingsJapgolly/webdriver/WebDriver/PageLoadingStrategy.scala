package typingsJapgolly.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webdriver.webdriverStrings.none
  - typingsJapgolly.webdriver.webdriverStrings.eager
  - typingsJapgolly.webdriver.webdriverStrings.normal
*/
trait PageLoadingStrategy extends js.Object

object PageLoadingStrategy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eager: typingsJapgolly.webdriver.webdriverStrings.eager = this.cast("eager")
  @scala.inline
  def none: typingsJapgolly.webdriver.webdriverStrings.none = this.cast("none")
  @scala.inline
  def normal: typingsJapgolly.webdriver.webdriverStrings.normal = this.cast("normal")
}

