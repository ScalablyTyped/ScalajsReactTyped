package typingsJapgolly.angularCommon

import typingsJapgolly.angularCommon.angularCommonTestingMod.MockPlatformLocationConfig
import typingsJapgolly.angularCore.mod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/testing", JSImport.Namespace)
@js.native
object angularCommonMod extends js.Object {
  @js.native
  class MockLocationStrategy ()
    extends typingsJapgolly.angularCommon.angularCommonTestingMod.MockLocationStrategy
  
  @js.native
  class MockPlatformLocation ()
    extends typingsJapgolly.angularCommon.angularCommonTestingMod.MockPlatformLocation {
    def this(config: MockPlatformLocationConfig) = this()
  }
  
  @js.native
  class SpyLocation ()
    extends typingsJapgolly.angularCommon.angularCommonTestingMod.SpyLocation
  
  val MOCK_PLATFORM_LOCATION_CONFIG: InjectionToken[MockPlatformLocationConfig] = js.native
}

