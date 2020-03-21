package typingsJapgolly.protractor

import typingsJapgolly.seleniumWebdriver.byMod.ByHash
import typingsJapgolly.seleniumWebdriver.mod.Alert
import typingsJapgolly.seleniumWebdriver.mod.By
import typingsJapgolly.seleniumWebdriver.mod.Condition
import typingsJapgolly.seleniumWebdriver.mod.Locator
import typingsJapgolly.seleniumWebdriver.mod.WebDriver
import typingsJapgolly.seleniumWebdriver.mod.WebElement
import typingsJapgolly.seleniumWebdriver.mod.WebElementCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofuntil extends js.Object {
  def ableToSwitchToFrame(frame: js.Function1[/* webdriver */ WebDriver, WebElement]): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: By): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: WebElement): Condition[Boolean] = js.native
  def alertIsPresent(): Condition[Alert] = js.native
  def elementIsDisabled(element: WebElement): WebElementCondition = js.native
  def elementIsEnabled(element: WebElement): WebElementCondition = js.native
  def elementIsNotSelected(element: WebElement): WebElementCondition = js.native
  def elementIsNotVisible(element: WebElement): WebElementCondition = js.native
  def elementIsSelected(element: WebElement): WebElementCondition = js.native
  def elementIsVisible(element: WebElement): WebElementCondition = js.native
  def elementLocated(locator: Locator): WebElementCondition = js.native
  def elementTextContains(element: WebElement, substr: String): WebElementCondition = js.native
  def elementTextIs(element: WebElement, text: String): WebElementCondition = js.native
  def elementTextMatches(element: WebElement, regex: js.RegExp): WebElementCondition = js.native
  def elementsLocated(locator: Locator): Condition[js.Array[WebElement]] = js.native
  def stalenessOf(element: WebElement): Condition[Boolean] = js.native
  def titleContains(substr: String): Condition[Boolean] = js.native
  def titleIs(title: String): Condition[Boolean] = js.native
  def titleMatches(regex: js.RegExp): Condition[Boolean] = js.native
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  def urlIs(url: String): Condition[Boolean] = js.native
  def urlMatches(regex: js.RegExp): Condition[Boolean] = js.native
}

