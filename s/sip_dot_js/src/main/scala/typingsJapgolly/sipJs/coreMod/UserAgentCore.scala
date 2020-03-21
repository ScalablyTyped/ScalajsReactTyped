package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.userAgentCoreConfigurationMod.UserAgentCoreConfiguration
import typingsJapgolly.sipJs.userAgentCoreDelegateMod.UserAgentCoreDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "UserAgentCore")
@js.native
class UserAgentCore protected ()
  extends typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore {
  /**
    * Constructor.
    * @param configuration - Configuration.
    * @param delegate - Delegate.
    */
  def this(configuration: UserAgentCoreConfiguration) = this()
  def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
}

