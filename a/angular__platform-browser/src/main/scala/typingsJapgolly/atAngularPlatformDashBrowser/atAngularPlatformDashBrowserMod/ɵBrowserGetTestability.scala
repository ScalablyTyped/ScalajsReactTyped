package typingsJapgolly.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod

import typingsJapgolly.atAngularCore.atAngularCoreMod.GetTestability
import typingsJapgolly.atAngularCore.atAngularCoreMod.Testability
import typingsJapgolly.atAngularCore.atAngularCoreMod.TestabilityRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "ɵBrowserGetTestability")
@js.native
class ɵBrowserGetTestability () extends GetTestability {
  /* CompleteClass */
  override def addToWindow(registry: TestabilityRegistry): Unit = js.native
  /* CompleteClass */
  override def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: Boolean): Testability | Null = js.native
}

/* static members */
@JSImport("@angular/platform-browser", "ɵBrowserGetTestability")
@js.native
object ɵBrowserGetTestability extends js.Object {
  def init(): Unit = js.native
}

