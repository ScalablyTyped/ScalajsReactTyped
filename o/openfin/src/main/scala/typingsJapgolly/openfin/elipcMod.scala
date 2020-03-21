package typingsJapgolly.openfin

import typingsJapgolly.openfin.wireMod.Wire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/transport/elipc", JSImport.Namespace)
@js.native
object elipcMod extends js.Object {
  @js.native
  trait ElIPCTransport extends Wire {
    var wire: js.Any = js.native
    def onmessage(data: js.Any): Unit = js.native
    def send(data: js.Any, flags: js.Any): js.Promise[_] = js.native
  }
  
  @js.native
  class default protected () extends ElIPCTransport {
    def this(onmessage: js.Function1[/* data */ js.Any, Unit]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var READY_STATE: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof READY_STATE */ js.Any = js.native
  }
  
}

