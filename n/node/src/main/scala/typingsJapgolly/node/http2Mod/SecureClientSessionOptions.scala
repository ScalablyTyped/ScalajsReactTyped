package typingsJapgolly.node.http2Mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.dnsMod.LookupOneOptions
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.nodeStrings.httpColon
import typingsJapgolly.node.nodeStrings.httpsColon
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.tlsMod.ConnectionOptions
import typingsJapgolly.node.tlsMod.KeyObject
import typingsJapgolly.node.tlsMod.PSKCallbackNegotation
import typingsJapgolly.node.tlsMod.PeerCertificate
import typingsJapgolly.node.tlsMod.PxfObject
import typingsJapgolly.node.tlsMod.SecureContext
import typingsJapgolly.node.tlsMod.SecureVersion
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureClientSessionOptions
  extends ConnectionOptions
     with ClientSessionOptions

object SecureClientSessionOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[String | scala.scalajs.js.typedarray.Uint8Array]) | scala.scalajs.js.typedarray.Uint8Array = null,
    SNICallback: (/* servername */ String, /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ SecureContext, Unit]) => Callback = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    checkServerIdentity: (/* host */ String, /* cert */ PeerCertificate) => CallbackTo[js.UndefOr[js.Error]] = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    createConnection: (/* authority */ URL_, /* option */ SessionOptions) => CallbackTo[Duplex] = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Callback = null,
    maxDeflateDynamicTableSize: Int | Double = null,
    maxHeaderListPairs: Int | Double = null,
    maxOutstandingPings: Int | Double = null,
    maxReservedRemoteStreams: Int | Double = null,
    maxSendHeaderBlockLength: Int | Double = null,
    maxSessionMemory: Int | Double = null,
    maxVersion: SecureVersion = null,
    minDHSize: Int | Double = null,
    minVersion: SecureVersion = null,
    paddingStrategy: Int | Double = null,
    passphrase: String = null,
    path: String = null,
    peerMaxConcurrentStreams: Int | Double = null,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    port: Int | Double = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    protocol: httpColon | httpsColon = null,
    pskCallback: /* hint */ String | Null => CallbackTo[PSKCallbackNegotation | Null] = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => CallbackTo[Double] = null,
    servername: String = null,
    session: Buffer = null,
    sessionIdContext: String = null,
    settings: Settings = null,
    sigalgs: String = null,
    socket: Socket = null,
    timeout: Int | Double = null
  ): SecureClientSessionOptions = {
    val __obj = js.Dynamic.literal()
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
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2((t0: /* authority */ typingsJapgolly.node.urlMod.URL_, t1: /* option */ typingsJapgolly.node.http2Mod.SessionOptions) => createConnection(t0, t1).runNow()))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3((t0: /* hostname */ java.lang.String, t1: /* options */ typingsJapgolly.node.dnsMod.LookupOneOptions, t2: /* callback */ js.Function3[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* address */ java.lang.String, 
  /* family */ scala.Double, 
  scala.Unit]) => lookup(t0, t1, t2).runNow()))
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxHeaderListPairs != null) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.asInstanceOf[js.Any])
    if (maxOutstandingPings != null) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.asInstanceOf[js.Any])
    if (maxReservedRemoteStreams != null) __obj.updateDynamic("maxReservedRemoteStreams")(maxReservedRemoteStreams.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (maxSessionMemory != null) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minDHSize != null) __obj.updateDynamic("minDHSize")(minDHSize.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (paddingStrategy != null) __obj.updateDynamic("paddingStrategy")(paddingStrategy.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (peerMaxConcurrentStreams != null) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (pskCallback != null) __obj.updateDynamic("pskCallback")(js.Any.fromFunction1((t0: /* hint */ java.lang.String | scala.Null) => pskCallback(t0).runNow()))
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert.asInstanceOf[js.Any])
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2((t0: /* frameLen */ scala.Double, t1: /* maxFrameLen */ scala.Double) => selectPadding(t0, t1).runNow()))
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureClientSessionOptions]
  }
}

