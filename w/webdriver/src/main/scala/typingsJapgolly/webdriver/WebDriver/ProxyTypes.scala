package typingsJapgolly.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webdriver.webdriverStrings.pac
  - typingsJapgolly.webdriver.webdriverStrings.noproxy
  - typingsJapgolly.webdriver.webdriverStrings.autodetect
  - typingsJapgolly.webdriver.webdriverStrings.system
  - typingsJapgolly.webdriver.webdriverStrings.manual
*/
trait ProxyTypes extends js.Object

object ProxyTypes {
  @scala.inline
  def autodetect: typingsJapgolly.webdriver.webdriverStrings.autodetect = this.cast("autodetect")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typingsJapgolly.webdriver.webdriverStrings.manual = this.cast("manual")
  @scala.inline
  def noproxy: typingsJapgolly.webdriver.webdriverStrings.noproxy = this.cast("noproxy")
  @scala.inline
  def pac: typingsJapgolly.webdriver.webdriverStrings.pac = this.cast("pac")
  @scala.inline
  def system: typingsJapgolly.webdriver.webdriverStrings.system = this.cast("system")
}

