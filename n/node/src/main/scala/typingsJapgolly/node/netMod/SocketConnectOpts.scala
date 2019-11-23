package typingsJapgolly.node.netMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.netMod.TcpSocketConnectOpts
  - typings.node.netMod.IpcSocketConnectOpts
*/
trait SocketConnectOpts extends js.Object

object SocketConnectOpts {
  @scala.inline
  def TcpSocketConnectOpts(
    port: Double,
    family: Int | Double = null,
    hints: Int | Double = null,
    host: java.lang.String = null,
    localAddress: java.lang.String = null,
    localPort: Int | Double = null,
    lookup: (/* hostname */ java.lang.String, /* options */ LookupOneOptions, /* callback */ js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]) => Callback = null,
    onread: OnReadOpts = null
  ): SocketConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3((t0: /* hostname */ java.lang.String, t1: /* options */ typingsJapgolly.node.dnsMod.LookupOneOptions, t2: /* callback */ js.Function3[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* address */ java.lang.String, 
  /* family */ scala.Double, 
  scala.Unit]) => lookup(t0, t1, t2).runNow()))
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOpts]
  }
  @scala.inline
  def IpcSocketConnectOpts(path: java.lang.String, onread: OnReadOpts = null): SocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOpts]
  }
}

