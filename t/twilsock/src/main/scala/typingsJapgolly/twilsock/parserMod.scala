package typingsJapgolly.twilsock

import typingsJapgolly.std.ArrayBufferLike
import typingsJapgolly.twilsock.protocolMod.Protocol.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  @js.native
  class Parser () extends js.Object
  
  /* static members */
  @js.native
  object Parser extends js.Object {
    def createPacket(header: Header): scala.scalajs.js.typedarray.ArrayBuffer = js.native
    def createPacket(header: Header, payloadString: String): scala.scalajs.js.typedarray.ArrayBuffer = js.native
    def parse(message: ArrayBufferLike): js.Any = js.native
  }
  
}

