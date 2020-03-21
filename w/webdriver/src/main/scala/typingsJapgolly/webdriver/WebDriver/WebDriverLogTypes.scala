package typingsJapgolly.webdriver.WebDriver

import typingsJapgolly.webdriver.webdriverStrings.info_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webdriver.webdriverStrings.trace
  - typingsJapgolly.webdriver.webdriverStrings.debug
  - typingsJapgolly.webdriver.webdriverStrings.info_
  - typingsJapgolly.webdriver.webdriverStrings.warn
  - typingsJapgolly.webdriver.webdriverStrings.error
  - typingsJapgolly.webdriver.webdriverStrings.silent
*/
trait WebDriverLogTypes extends js.Object

object WebDriverLogTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.webdriver.webdriverStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.webdriver.webdriverStrings.error = this.cast("error")
  @scala.inline
  def info: info_ = this.cast("info")
  @scala.inline
  def silent: typingsJapgolly.webdriver.webdriverStrings.silent = this.cast("silent")
  @scala.inline
  def trace: typingsJapgolly.webdriver.webdriverStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsJapgolly.webdriver.webdriverStrings.warn = this.cast("warn")
}

