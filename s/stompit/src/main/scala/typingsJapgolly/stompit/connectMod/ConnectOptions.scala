package typingsJapgolly.stompit.connectMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.dnsMod.LookupOneOptions
import typingsJapgolly.node.netMod.OnReadOpts
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.tlsMod.KeyObject
import typingsJapgolly.node.tlsMod.PSKCallbackNegotation
import typingsJapgolly.node.tlsMod.PeerCertificate
import typingsJapgolly.node.tlsMod.PxfObject
import typingsJapgolly.node.tlsMod.SecureContext
import typingsJapgolly.node.tlsMod.SecureVersion
import typingsJapgolly.stompit.socketMod.CommandHandlers
import typingsJapgolly.stompit.socketMod.Heartbeat
import typingsJapgolly.stompit.stompitBooleans.`false`
import typingsJapgolly.stompit.stompitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stompit.connectMod.NetTcpConnectOptions
  - typingsJapgolly.stompit.connectMod.NetIpcConnectOptions
  - typingsJapgolly.stompit.connectMod.SslConnectOptions
*/
trait ConnectOptions extends js.Object

object ConnectOptions {
  @scala.inline
  def NetTcpConnectOptions(
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
  ): ConnectOptions = {
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
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  def NetIpcConnectOptions(
    path: String,
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    commandHandlers: CommandHandlers = null,
    connect: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[Unit]]) => CallbackTo[Socket] = null,
    connectHeaders: ConnectHeaders = null,
    fd: Int | Double = null,
    heartbeat: Heartbeat = null,
    heartbeatDelayMargin: Int | Double = null,
    heartbeatOutputMargin: Int | Double = null,
    onread: OnReadOpts = null,
    outgoingFrameStream: typingsJapgolly.stompit.outgoingFrameStreamMod.^ = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    resetDisconnect: js.UndefOr[Boolean] = js.undefined,
    ssl: `false` = null,
    timeout: Int | Double = null,
    unknownCommand: js.UndefOr[Callback] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.stompit.connectMod.ConnectOptions, t1: /* connectionListener */ js.UndefOr[js.Function0[scala.Unit]]) => connect(t0, t1).runNow()))
    if (connectHeaders != null) __obj.updateDynamic("connectHeaders")(connectHeaders.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (heartbeatDelayMargin != null) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.asInstanceOf[js.Any])
    if (heartbeatOutputMargin != null) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.asInstanceOf[js.Any])
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    unknownCommand.foreach(p => __obj.updateDynamic("unknownCommand")(p.toJsFn))
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  def SslConnectOptions(
    ssl: `true`,
    ALPNProtocols: (js.Array[String | scala.scalajs.js.typedarray.Uint8Array]) | scala.scalajs.js.typedarray.Uint8Array = null,
    SNICallback: (/* servername */ String, /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ SecureContext, Unit]) => Callback = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    checkServerIdentity: (/* host */ String, /* cert */ PeerCertificate) => CallbackTo[js.UndefOr[js.Error]] = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    commandHandlers: CommandHandlers = null,
    connect: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[Unit]]) => CallbackTo[Socket] = null,
    connectHeaders: ConnectHeaders = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    heartbeat: Heartbeat = null,
    heartbeatDelayMargin: Int | Double = null,
    heartbeatOutputMargin: Int | Double = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Callback = null,
    maxVersion: SecureVersion = null,
    minDHSize: Int | Double = null,
    minVersion: SecureVersion = null,
    outgoingFrameStream: typingsJapgolly.stompit.outgoingFrameStreamMod.^ = null,
    passphrase: String = null,
    path: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    port: Int | Double = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    pskCallback: /* hint */ String | Null => CallbackTo[PSKCallbackNegotation | Null] = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    resetDisconnect: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    servername: String = null,
    session: Buffer = null,
    sessionIdContext: String = null,
    sigalgs: String = null,
    socket: Socket = null,
    timeout: Int | Double = null,
    unknownCommand: js.UndefOr[Callback] = js.undefined
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2((t0: /* servername */ java.lang.String, t1: /* cb */ js.Function2[
  /* err */ js.Error | scala.Null, 
  /* ctx */ typingsJapgolly.node.tlsMod.SecureContext, 
  scala.Unit]) => SNICallback(t0, t1).runNow()))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2((t0: /* host */ java.lang.String, t1: /* cert */ typingsJapgolly.node.tlsMod.PeerCertificate) => checkServerIdentity(t0, t1).runNow()))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.stompit.connectMod.ConnectOptions, t1: /* connectionListener */ js.UndefOr[js.Function0[scala.Unit]]) => connect(t0, t1).runNow()))
    if (connectHeaders != null) __obj.updateDynamic("connectHeaders")(connectHeaders.asInstanceOf[js.Any])
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (heartbeatDelayMargin != null) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.asInstanceOf[js.Any])
    if (heartbeatOutputMargin != null) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3((t0: /* hostname */ java.lang.String, t1: /* options */ typingsJapgolly.node.dnsMod.LookupOneOptions, t2: /* callback */ js.Function3[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* address */ java.lang.String, 
  /* family */ scala.Double, 
  scala.Unit]) => lookup(t0, t1, t2).runNow()))
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minDHSize != null) __obj.updateDynamic("minDHSize")(minDHSize.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (pskCallback != null) __obj.updateDynamic("pskCallback")(js.Any.fromFunction1((t0: /* hint */ java.lang.String | scala.Null) => pskCallback(t0).runNow()))
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert.asInstanceOf[js.Any])
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect.asInstanceOf[js.Any])
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    unknownCommand.foreach(p => __obj.updateDynamic("unknownCommand")(p.toJsFn))
    __obj.asInstanceOf[ConnectOptions]
  }
}

