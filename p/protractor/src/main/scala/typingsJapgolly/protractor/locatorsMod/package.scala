package typingsJapgolly.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object locatorsMod {
  type Locator = typingsJapgolly.protractor.locatorsMod.ProtractorLocator | typingsJapgolly.protractor.locatorsMod.WebDriverLocator
  type WebDriverLocator = typingsJapgolly.seleniumWebdriver.mod.By | typingsJapgolly.seleniumWebdriver.byMod.ByHash | js.Function
}
