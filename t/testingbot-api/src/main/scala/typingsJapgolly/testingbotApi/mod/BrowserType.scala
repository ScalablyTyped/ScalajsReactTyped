package typingsJapgolly.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.testingbotApi.testingbotApiStrings.webdriver
  - typingsJapgolly.testingbotApi.testingbotApiStrings.rc
*/
trait BrowserType extends js.Object

object BrowserType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rc: typingsJapgolly.testingbotApi.testingbotApiStrings.rc = this.cast("rc")
  @scala.inline
  def webdriver: typingsJapgolly.testingbotApi.testingbotApiStrings.webdriver = this.cast("webdriver")
}

