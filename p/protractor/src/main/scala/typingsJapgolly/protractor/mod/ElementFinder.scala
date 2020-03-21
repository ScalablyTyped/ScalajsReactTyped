package typingsJapgolly.protractor.mod

import typingsJapgolly.protractor.locatorsMod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ElementFinder")
@js.native
class ElementFinder protected ()
  extends typingsJapgolly.protractor.elementMod.ElementFinder {
  def this(
    browser_ : typingsJapgolly.protractor.browserMod.ProtractorBrowser,
    elementArrayFinder: typingsJapgolly.protractor.elementMod.ElementArrayFinder
  ) = this()
}

/* static members */
@JSImport("protractor", "ElementFinder")
@js.native
object ElementFinder extends js.Object {
  def fromWebElement_(
    browser: typingsJapgolly.protractor.browserMod.ProtractorBrowser,
    webElem: typingsJapgolly.seleniumWebdriver.mod.WebElement
  ): typingsJapgolly.protractor.elementMod.ElementFinder = js.native
  def fromWebElement_(
    browser: typingsJapgolly.protractor.browserMod.ProtractorBrowser,
    webElem: typingsJapgolly.seleniumWebdriver.mod.WebElement,
    locator: Locator
  ): typingsJapgolly.protractor.elementMod.ElementFinder = js.native
}

