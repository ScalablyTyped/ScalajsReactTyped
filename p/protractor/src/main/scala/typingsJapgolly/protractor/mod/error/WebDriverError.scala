package typingsJapgolly.protractor.mod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base WebDriver error type. This error type is only used directly when a
  * more appropriate category is not defined for the offending error.
  */
@JSImport("protractor", "error.WebDriverError")
@js.native
class WebDriverError ()
  extends typingsJapgolly.seleniumWebdriver.mod.error.WebDriverError {
  def this(message: String) = this()
}

