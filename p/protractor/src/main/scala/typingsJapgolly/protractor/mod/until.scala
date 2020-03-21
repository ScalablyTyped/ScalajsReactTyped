package typingsJapgolly.protractor.mod

import typingsJapgolly.seleniumWebdriver.byMod.ByHash
import typingsJapgolly.seleniumWebdriver.mod.Alert
import typingsJapgolly.seleniumWebdriver.mod.By
import typingsJapgolly.seleniumWebdriver.mod.Condition
import typingsJapgolly.seleniumWebdriver.mod.Locator
import typingsJapgolly.seleniumWebdriver.mod.WebElementCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "until")
@js.native
object until extends js.Object {
  def ableToSwitchToFrame(
    frame: js.Function1[
      /* webdriver */ typingsJapgolly.seleniumWebdriver.mod.WebDriver, 
      typingsJapgolly.seleniumWebdriver.mod.WebElement
    ]
  ): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: By): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: typingsJapgolly.seleniumWebdriver.mod.WebElement): Condition[Boolean] = js.native
  def alertIsPresent(): Condition[Alert] = js.native
  def elementIsDisabled(element: typingsJapgolly.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  def elementIsEnabled(element: typingsJapgolly.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  def elementIsNotSelected(element: typingsJapgolly.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  def elementIsNotVisible(element: typingsJapgolly.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  def elementIsSelected(element: typingsJapgolly.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  def elementIsVisible(element: typingsJapgolly.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  def elementLocated(locator: Locator): WebElementCondition = js.native
  def elementTextContains(element: typingsJapgolly.seleniumWebdriver.mod.WebElement, substr: String): WebElementCondition = js.native
  def elementTextIs(element: typingsJapgolly.seleniumWebdriver.mod.WebElement, text: String): WebElementCondition = js.native
  def elementTextMatches(element: typingsJapgolly.seleniumWebdriver.mod.WebElement, regex: js.RegExp): WebElementCondition = js.native
  def elementsLocated(locator: Locator): Condition[js.Array[typingsJapgolly.seleniumWebdriver.mod.WebElement]] = js.native
  def stalenessOf(element: typingsJapgolly.seleniumWebdriver.mod.WebElement): Condition[Boolean] = js.native
  def titleContains(substr: String): Condition[Boolean] = js.native
  def titleIs(title: String): Condition[Boolean] = js.native
  def titleMatches(regex: js.RegExp): Condition[Boolean] = js.native
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  def urlIs(url: String): Condition[Boolean] = js.native
  def urlMatches(regex: js.RegExp): Condition[Boolean] = js.native
}

