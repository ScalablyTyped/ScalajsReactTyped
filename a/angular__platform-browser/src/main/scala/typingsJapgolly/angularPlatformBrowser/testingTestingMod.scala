package typingsJapgolly.angularPlatformBrowser

import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.PlatformRef
import typingsJapgolly.angularCore.mod.StaticProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  @js.native
  class BrowserTestingModule () extends js.Object
  
  def platformBrowserTesting(): PlatformRef = js.native
  def platformBrowserTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  @JSName("\u0275angular_packages_platform_browser_testing_testing_a")
  def ɵangularPackagesPlatformBrowserTestingTestingA(): NgZone = js.native
}

