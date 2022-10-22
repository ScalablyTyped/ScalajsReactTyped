package typingsJapgolly.rsocketTcpClient

import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.netMod.TcpSocketConnectOpts
import typingsJapgolly.rsocketCore.rsocketencodingMod.Encoders
import typingsJapgolly.rsocketTcpClient.rsockettcpclientMod.RSocketTcpClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-tcp-client", JSImport.Default)
  @js.native
  open class default protected () extends RSocketTcpClient {
    def this(options: TcpSocketConnectOpts) = this()
    def this(options: TcpSocketConnectOpts, encoders: Encoders[Any]) = this()
  }
  
  @JSImport("rsocket-tcp-client", "RSocketTcpConnection")
  @js.native
  open class RSocketTcpConnection ()
    extends typingsJapgolly.rsocketTcpClient.rsockettcpclientMod.RSocketTcpConnection {
    def this(socket: Socket) = this()
    def this(socket: Unit, encoders: Encoders[Any]) = this()
    def this(socket: Socket, encoders: Encoders[Any]) = this()
  }
}
