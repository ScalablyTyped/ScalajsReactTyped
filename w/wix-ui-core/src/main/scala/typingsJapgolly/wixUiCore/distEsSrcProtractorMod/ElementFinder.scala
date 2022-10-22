package typingsJapgolly.wixUiCore.distEsSrcProtractorMod

import typingsJapgolly.protractor.builtLocatorsMod.Locator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/es/src/protractor", "ElementFinder")
@js.native
open class ElementFinder protected ()
  extends typingsJapgolly.protractor.builtElementMod.ElementFinder {
  def this(
    browser_ : typingsJapgolly.protractor.builtBrowserMod.ProtractorBrowser,
    elementArrayFinder: typingsJapgolly.protractor.builtElementMod.ElementArrayFinder
  ) = this()
}
/* static members */
object ElementFinder {
  
  @JSImport("wix-ui-core/dist/es/src/protractor", "ElementFinder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromWebElement_(
    browser: typingsJapgolly.protractor.builtBrowserMod.ProtractorBrowser,
    webElem: typingsJapgolly.seleniumWebdriver.mod.WebElement
  ): typingsJapgolly.protractor.builtElementMod.ElementFinder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebElement_")(browser.asInstanceOf[js.Any], webElem.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.protractor.builtElementMod.ElementFinder]
  inline def fromWebElement_(
    browser: typingsJapgolly.protractor.builtBrowserMod.ProtractorBrowser,
    webElem: typingsJapgolly.seleniumWebdriver.mod.WebElement,
    locator: Locator
  ): typingsJapgolly.protractor.builtElementMod.ElementFinder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebElement_")(browser.asInstanceOf[js.Any], webElem.asInstanceOf[js.Any], locator.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.protractor.builtElementMod.ElementFinder]
}
