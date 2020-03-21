package typingsJapgolly.protractor

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.seleniumWebdriver.chromeMod.Options
import typingsJapgolly.seleniumWebdriver.mod.Capabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofOptions extends Instantiable0[Options] {
  /**
    * Extracts the ChromeDriver specific options from the given capabilities
    * object.
    * @param {!webdriver.Capabilities} capabilities The capabilities object.
    * @return {!Options} The ChromeDriver options.
    */
  def fromCapabilities(capabilities: Capabilities): Options = js.native
}

