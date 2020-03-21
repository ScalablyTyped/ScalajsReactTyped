package typingsJapgolly.stompit.connectMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.dnsMod.LookupOneOptions
import typingsJapgolly.node.netMod.OnReadOpts
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.netMod.TcpNetConnectOpts
import typingsJapgolly.stompit.socketMod.CommandHandlers
import typingsJapgolly.stompit.socketMod.Heartbeat
import typingsJapgolly.stompit.stompitBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetTcpConnectOptions
  extends TcpNetConnectOpts
     with BaseConnectOptions
     with ConnectOptions {
  @JSName("ssl")
  var ssl_NetTcpConnectOptions: js.UndefOr[`false`] = js.undefined
}

object NetTcpConnectOptions {
  @scala.inline
  def apply(
    port: Double,
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    commandHandlers: CommandHandlers = null,
    connect: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[Unit]]) => CallbackTo[Socket] = null,
    connectHeaders: ConnectHeaders = null,
    family: Int | Double = null,
    fd: Int | Double = null,
    heartbeat: Heartbeat = null,
    heartbeatDelayMargin: Int | Double = null,
    heartbeatOutputMargin: Int | Double = null,
    hints: Int | Double = null,
    host: String = null,
    localAddress: String = null,
    localPort: Int | Double = null,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Callback = null,
    onread: OnReadOpts = null,
    outgoingFrameStream: typingsJapgolly.stompit.outgoingFrameStreamMod.^ = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    resetDisconnect: js.UndefOr[Boolean] = js.undefined,
    ssl: `false` = null,
    timeout: Int | Double = null,
    unknownCommand: js.UndefOr[Callback] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): NetTcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.stompit.connectMod.ConnectOptions, t1: /* connectionListener */ js.UndefOr[js.Function0[scala.Unit]]) => connect(t0, t1).runNow()))
    if (connectHeaders != null) __obj.updateDynamic("connectHeaders")(connectHeaders.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (heartbeatDelayMargin != null) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.asInstanceOf[js.Any])
    if (heartbeatOutputMargin != null) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.asInstanceOf[js.Any])
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
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    unknownCommand.foreach(p => __obj.updateDynamic("unknownCommand")(p.toJsFn))
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetTcpConnectOptions]
  }
}

