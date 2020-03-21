package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.userAgentCoreConfigurationMod.UserAgentCoreConfiguration
import typingsJapgolly.sipJs.userAgentCoreDelegateMod.UserAgentCoreDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agent-core", JSImport.Namespace)
@js.native
object userAgentCoreMod extends js.Object {
  @js.native
  class UserAgentCore protected ()
    extends typingsJapgolly.sipJs.userAgentCoreUserAgentCoreMod.UserAgentCore {
    /**
      * Constructor.
      * @param configuration - Configuration.
      * @param delegate - Delegate.
      */
    def this(configuration: UserAgentCoreConfiguration) = this()
    def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
  }
  
}

