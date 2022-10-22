package typingsJapgolly.fridaGum.global

import typingsJapgolly.fridaGum.SocketConnectOptions
import typingsJapgolly.fridaGum.SocketEndpointAddress
import typingsJapgolly.fridaGum.SocketListenOptions
import typingsJapgolly.fridaGum.SocketListener
import typingsJapgolly.fridaGum.SocketType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TCP and UNIX sockets.
  */
object Socket {
  
  @JSGlobal("Socket")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Connects to a TCP or UNIX server.
    */
  inline def connect(options: SocketConnectOptions): js.Promise[typingsJapgolly.fridaGum.SocketConnection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.fridaGum.SocketConnection]]
  
  /**
    * Opens a TCP or UNIX listening socket.
    *
    * Defaults to listening on both IPv4 and IPv6, if supported, and binding on all interfaces on a randomly
    * selected port.
    */
  inline def listen(): js.Promise[SocketListener] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")().asInstanceOf[js.Promise[SocketListener]]
  inline def listen(options: SocketListenOptions): js.Promise[SocketListener] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SocketListener]]
  
  /**
    * Inspects the OS socket `handle` and returns its local address, or `null` if invalid or unknown.
    */
  inline def localAddress(handle: Double): SocketEndpointAddress | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("localAddress")(handle.asInstanceOf[js.Any]).asInstanceOf[SocketEndpointAddress | Null]
  
  /**
    * Inspects the OS socket `handle` and returns its peer address, or `null` if invalid or unknown.
    */
  inline def peerAddress(handle: Double): SocketEndpointAddress | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("peerAddress")(handle.asInstanceOf[js.Any]).asInstanceOf[SocketEndpointAddress | Null]
  
  /**
    * Inspects the OS socket `handle` and returns its type, or `null` if invalid or unknown.
    */
  inline def `type`(handle: Double): SocketType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(handle.asInstanceOf[js.Any]).asInstanceOf[SocketType | Null]
}
