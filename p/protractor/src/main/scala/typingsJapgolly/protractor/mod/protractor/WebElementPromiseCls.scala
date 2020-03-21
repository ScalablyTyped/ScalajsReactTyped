package typingsJapgolly.protractor.mod.protractor

import typingsJapgolly.seleniumWebdriver.mod.WebDriver
import typingsJapgolly.seleniumWebdriver.mod.WebElement
import typingsJapgolly.seleniumWebdriver.mod.WebElementPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "protractor.WebElementPromise")
@js.native
class WebElementPromiseCls protected () extends WebElementPromise {
  /**
    * @param {!WebDriver} driver The parent WebDriver instance for this
    *     element.
    * @param {!Promise<!WebElement>} el A promise
    *     that will resolve to the promised element.
    */
  def this(driver: WebDriver, el: js.Promise[WebElement]) = this()
}

