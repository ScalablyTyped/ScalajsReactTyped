package typingsJapgolly.ionic

import typingsJapgolly.ionic.ionicStrings.Exception
import typingsJapgolly.ionicCliFramework.mod.BaseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class BaseException () extends BaseError {
    @JSName("name")
    val name_BaseException: Exception = js.native
  }
  
  @js.native
  class BuildCLIProgramNotFoundException () extends BaseException
  
  @js.native
  class FatalException () extends BaseException {
    def this(message: String) = this()
    def this(message: String, exitCode: Double) = this()
    @JSName("exitCode")
    var exitCode_FatalException: Double = js.native
    var fatal: Boolean = js.native
  }
  
  @js.native
  class HookException () extends BaseException
  
  @js.native
  class IntegrationException () extends BaseException
  
  @js.native
  class IntegrationNotFoundException () extends BaseException
  
  @js.native
  class RunnerException () extends BaseException
  
  @js.native
  class RunnerNotFoundException () extends BaseException
  
  @js.native
  class ServeCLIProgramNotFoundException () extends BaseException
  
  @js.native
  class SessionException () extends BaseException
  
}

