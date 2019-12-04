package typingsJapgolly.atAngularPlatformDashBrowserDashDynamic

import typingsJapgolly.atAngularCore.atAngularCoreMod.CompilerFactory
import typingsJapgolly.atAngularCore.atAngularCoreMod.Injector
import typingsJapgolly.atAngularCore.atAngularCoreMod.PlatformRef
import typingsJapgolly.atAngularCore.atAngularCoreMod.StaticProvider
import typingsJapgolly.atAngularCore.testingTestingMod.TestComponentRenderer
import typingsJapgolly.atAngularCore.testingTestingMod.ɵTestingCompilerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  @js.native
  class BrowserDynamicTestingModule () extends js.Object
  
  @js.native
  class ɵDOMTestComponentRenderer protected () extends TestComponentRenderer {
    def this(_doc: js.Any) = this()
    var _doc: js.Any = js.native
  }
  
  @js.native
  class ɵangular_packages_platform_browser_dynamic_testing_testing_b protected () extends ɵTestingCompilerFactory {
    def this(_injector: Injector, _compilerFactory: CompilerFactory) = this()
    var _compilerFactory: js.Any = js.native
    var _injector: js.Any = js.native
  }
  
  val ɵangular_packages_platform_browser_dynamic_testing_testing_a: js.Array[StaticProvider] = js.native
  def platformBrowserDynamicTesting(): PlatformRef = js.native
  def platformBrowserDynamicTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def ɵplatformCoreDynamicTesting(): PlatformRef = js.native
  def ɵplatformCoreDynamicTesting(extraProviders: js.Array[_]): PlatformRef = js.native
}

