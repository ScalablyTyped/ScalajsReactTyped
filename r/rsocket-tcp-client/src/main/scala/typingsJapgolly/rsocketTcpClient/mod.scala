package typingsJapgolly.rsocketTcpClient

import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.netMod.TcpSocketConnectOpts
import typingsJapgolly.rsocketCore.rsocketencodingMod.Encoders
import typingsJapgolly.rsocketTcpClient.rsockettcpclientMod.RSocketTcpClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RSocketTcpConnection ()
    extends typingsJapgolly.rsocketTcpClient.rsockettcpclientMod.RSocketTcpConnection {
    def this(socket: Socket) = this()
    def this(socket: Socket, encoders: Encoders[_]) = this()
  }
  
  @js.native
  class default protected () extends RSocketTcpClient {
    def this(options: TcpSocketConnectOpts) = this()
    def this(options: TcpSocketConnectOpts, encoders: Encoders[_]) = this()
  }
  
}

