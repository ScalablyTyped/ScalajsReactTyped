package typingsJapgolly.node.netMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.node.netMod.TcpNetConnectOpts
  - typingsJapgolly.node.netMod.IpcNetConnectOpts
*/
trait NetConnectOpts extends js.Object

object NetConnectOpts {
  @scala.inline
  def TcpNetConnectOpts(
    port: Double,
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    family: Int | Double = null,
    fd: Int | Double = null,
    hints: Int | Double = null,
    host: String = null,
    localAddress: String = null,
    localPort: Int | Double = null,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Callback = null,
    onread: OnReadOpts = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): NetConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
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
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetConnectOpts]
  }
  @scala.inline
  def IpcNetConnectOpts(
    path: String,
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    fd: Int | Double = null,
    onread: OnReadOpts = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): NetConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetConnectOpts]
  }
}

