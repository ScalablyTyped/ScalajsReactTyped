package typingsJapgolly.socketclusterServer

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.socketclusterServer.serverMod.AGServerOptions
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketcluster-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socketcluster-server", "AGServer")
  @js.native
  open class AGServer ()
    extends typingsJapgolly.socketclusterServer.serverMod.^ {
    def this(options: AGServerOptions) = this()
  }
  
  @JSImport("socketcluster-server", "AGServerSocket")
  @js.native
  open class AGServerSocket protected ()
    extends typingsJapgolly.socketclusterServer.serversocketMod.^ {
    def this(
      id: String,
      server: typingsJapgolly.socketclusterServer.serverMod.^,
      socket: WebSocket,
      protocolVersion: Double
    ) = this()
  }
  
  inline def attach(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): AGServer = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(server.asInstanceOf[js.Any]).asInstanceOf[AGServer]
  inline def attach(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    options: AGServerOptions
  ): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  
  inline def listen(): AGServer = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")().asInstanceOf[AGServer]
  inline def listen(port: Double): AGServer = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any]).asInstanceOf[AGServer]
  inline def listen(port: Double, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Double, options: Unit, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Double, options: AGServerOptions): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Double, options: AGServerOptions, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Unit, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Unit, options: Unit, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Unit, options: AGServerOptions): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Unit, options: AGServerOptions, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
}
