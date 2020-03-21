package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.infoMod.Info
import typingsJapgolly.sipJs.methodsInfoMod.IncomingInfoRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/dtmf", JSImport.Namespace)
@js.native
object dtmfMod extends js.Object {
  @js.native
  class DTMF protected () extends Info {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest, tone: String, duration: Double) = this()
    var _duration: js.Any = js.native
    var _tone: js.Any = js.native
    val duration: Double = js.native
    val tone: String = js.native
  }
  
}

