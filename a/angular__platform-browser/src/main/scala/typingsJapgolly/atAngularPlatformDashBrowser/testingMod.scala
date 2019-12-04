package typingsJapgolly.atAngularPlatformDashBrowser

import typingsJapgolly.atAngularCore.atAngularCoreMod.NgZone
import typingsJapgolly.atAngularCore.atAngularCoreMod.PlatformRef
import typingsJapgolly.atAngularCore.atAngularCoreMod.StaticProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class BrowserTestingModule ()
    extends typingsJapgolly.atAngularPlatformDashBrowser.testingTestingMod.BrowserTestingModule
  
  def platformBrowserTesting(): PlatformRef = js.native
  def platformBrowserTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def ɵangular_packages_platform_browser_testing_testing_a(): NgZone = js.native
}

