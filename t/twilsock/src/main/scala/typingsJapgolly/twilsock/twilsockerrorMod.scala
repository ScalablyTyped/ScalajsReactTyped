package typingsJapgolly.twilsock

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/error/twilsockerror", JSImport.Namespace)
@js.native
object twilsockerrorMod extends js.Object {
  @js.native
  class TwilsockError protected () extends Error {
    def this(description: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

