package typingsJapgolly.angularPlatformBrowser.mod

import typingsJapgolly.angularCore.mod.GetTestability
import typingsJapgolly.angularCore.mod.Testability
import typingsJapgolly.angularCore.mod.TestabilityRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "\u0275BrowserGetTestability")
@js.native
class ɵBrowserGetTestability () extends GetTestability {
  /* CompleteClass */
  override def addToWindow(registry: TestabilityRegistry): Unit = js.native
  /* CompleteClass */
  override def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: Boolean): Testability | Null = js.native
}

/* static members */
@JSImport("@angular/platform-browser", "\u0275BrowserGetTestability")
@js.native
object ɵBrowserGetTestability extends js.Object {
  def init(): Unit = js.native
}

