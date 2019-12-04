package typingsJapgolly.atAngularCommon

import typingsJapgolly.atAngularCommon.testingTestingMod.MockPlatformLocationConfig
import typingsJapgolly.atAngularCore.atAngularCoreMod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class MockLocationStrategy ()
    extends typingsJapgolly.atAngularCommon.testingTestingMod.MockLocationStrategy
  
  @js.native
  class MockPlatformLocation ()
    extends typingsJapgolly.atAngularCommon.testingTestingMod.MockPlatformLocation {
    def this(config: MockPlatformLocationConfig) = this()
  }
  
  @js.native
  class SpyLocation ()
    extends typingsJapgolly.atAngularCommon.testingTestingMod.SpyLocation
  
  val MOCK_PLATFORM_LOCATION_CONFIG: InjectionToken[MockPlatformLocationConfig] = js.native
}

