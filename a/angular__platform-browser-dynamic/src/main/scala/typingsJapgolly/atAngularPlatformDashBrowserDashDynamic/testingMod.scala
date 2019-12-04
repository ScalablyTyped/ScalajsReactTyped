package typingsJapgolly.atAngularPlatformDashBrowserDashDynamic

import typingsJapgolly.atAngularCore.atAngularCoreMod.CompilerFactory
import typingsJapgolly.atAngularCore.atAngularCoreMod.Injector
import typingsJapgolly.atAngularCore.atAngularCoreMod.PlatformRef
import typingsJapgolly.atAngularCore.atAngularCoreMod.StaticProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class BrowserDynamicTestingModule ()
    extends typingsJapgolly.atAngularPlatformDashBrowserDashDynamic.testingTestingMod.BrowserDynamicTestingModule
  
  @js.native
  class ɵDOMTestComponentRenderer protected ()
    extends typingsJapgolly.atAngularPlatformDashBrowserDashDynamic.testingTestingMod.ɵDOMTestComponentRenderer {
    def this(_doc: js.Any) = this()
  }
  
  @js.native
  class ɵangular_packages_platform_browser_dynamic_testing_testing_b protected ()
    extends typingsJapgolly.atAngularPlatformDashBrowserDashDynamic.testingTestingMod.ɵangular_packages_platform_browser_dynamic_testing_testing_b {
    def this(_injector: Injector, _compilerFactory: CompilerFactory) = this()
  }
  
  val ɵangular_packages_platform_browser_dynamic_testing_testing_a: js.Array[StaticProvider] = js.native
  def platformBrowserDynamicTesting(): PlatformRef = js.native
  def platformBrowserDynamicTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def ɵplatformCoreDynamicTesting(): PlatformRef = js.native
  def ɵplatformCoreDynamicTesting(extraProviders: js.Array[_]): PlatformRef = js.native
}

