package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreUserAgentCoreUserAgentCoreConfigurationMod.UserAgentCoreConfiguration
import typingsJapgolly.sipJs.libCoreUserAgentCoreUserAgentCoreDelegateMod.UserAgentCoreDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentCoreMod {
  
  @JSImport("sip.js/lib/core/user-agent-core", "UserAgentCore")
  @js.native
  open class UserAgentCore protected ()
    extends typingsJapgolly.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore {
    /**
      * Constructor.
      * @param configuration - Configuration.
      * @param delegate - Delegate.
      */
    def this(configuration: UserAgentCoreConfiguration) = this()
    def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
  }
}
