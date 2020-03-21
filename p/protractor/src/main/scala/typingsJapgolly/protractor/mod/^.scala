package typingsJapgolly.protractor.mod

import typingsJapgolly.protractor.browserMod.ElementHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$$")
  var $: js.Function1[/* search */ String, typingsJapgolly.protractor.elementMod.ElementArrayFinder] = js.native
  @JSName("By")
  var By_ : typingsJapgolly.protractor.locatorsMod.ProtractorBy = js.native
  var Command: js.Any = js.native
  var CommandName: js.Any = js.native
  var ExpectedConditions: typingsJapgolly.protractor.expectedConditionsMod.ProtractorExpectedConditions = js.native
  @JSName("$")
  var _empty: js.Function1[/* search */ String, typingsJapgolly.protractor.elementMod.ElementFinder] = js.native
  var browser: typingsJapgolly.protractor.browserMod.ProtractorBrowser = js.native
  var by: typingsJapgolly.protractor.locatorsMod.ProtractorBy = js.native
  var element: ElementHelper = js.native
}

