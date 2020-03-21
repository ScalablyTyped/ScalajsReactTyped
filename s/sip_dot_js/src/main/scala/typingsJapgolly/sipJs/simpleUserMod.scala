package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.simpleUserOptionsMod.SimpleUserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/web/simple-user", JSImport.Namespace)
@js.native
object simpleUserMod extends js.Object {
  @js.native
  class SimpleUser protected ()
    extends typingsJapgolly.sipJs.simpleUserSimpleUserMod.SimpleUser {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SimpleUserOptions) = this()
  }
  
}

