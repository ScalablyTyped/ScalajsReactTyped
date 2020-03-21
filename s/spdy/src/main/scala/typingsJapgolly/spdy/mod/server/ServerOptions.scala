package typingsJapgolly.spdy.mod.server

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.TypedArray
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.tlsMod.KeyObject
import typingsJapgolly.node.tlsMod.PxfObject
import typingsJapgolly.node.tlsMod.SecureContext
import typingsJapgolly.node.tlsMod.SecureVersion
import typingsJapgolly.node.tlsMod.TLSSocket
import typingsJapgolly.node.tlsMod.TlsOptions
import typingsJapgolly.spdy.AnonConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions
  extends TlsOptions
     with typingsJapgolly.node.httpMod.ServerOptions {
  var spdy: js.UndefOr[AnonConnection] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[String | scala.scalajs.js.typedarray.Uint8Array]) | scala.scalajs.js.typedarray.Uint8Array = null,
    IncomingMessage: Instantiable1[/* socket */ Socket, typingsJapgolly.node.httpMod.IncomingMessage] = null,
    SNICallback: (/* servername */ String, /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ SecureContext, Unit]) => Callback = null,
    ServerResponse: Instantiable1[
      /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
      typingsJapgolly.node.httpMod.ServerResponse
    ] = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    handshakeTimeout: Int | Double = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    maxHeaderSize: Int | Double = null,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    pskCallback: (/* socket */ TLSSocket, /* identity */ String) => CallbackTo[scala.scalajs.js.typedarray.DataView | TypedArray | Null] = null,
    pskIdentityHint: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    sessionIdContext: String = null,
    sessionTimeout: Int | Double = null,
    sigalgs: String = null,
    spdy: AnonConnection = null,
    ticketKeys: Buffer = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (IncomingMessage != null) __obj.updateDynamic("IncomingMessage")(IncomingMessage.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2((t0: /* servername */ java.lang.String, t1: /* cb */ js.Function2[
  /* err */ js.Error | scala.Null, 
  /* ctx */ typingsJapgolly.node.tlsMod.SecureContext, 
  scala.Unit]) => SNICallback(t0, t1).runNow()))
    if (ServerResponse != null) __obj.updateDynamic("ServerResponse")(ServerResponse.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace.asInstanceOf[js.Any])
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxHeaderSize != null) __obj.updateDynamic("maxHeaderSize")(maxHeaderSize.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (pskCallback != null) __obj.updateDynamic("pskCallback")(js.Any.fromFunction2((t0: /* socket */ typingsJapgolly.node.tlsMod.TLSSocket, t1: /* identity */ java.lang.String) => pskCallback(t0, t1).runNow()))
    if (pskIdentityHint != null) __obj.updateDynamic("pskIdentityHint")(pskIdentityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert.asInstanceOf[js.Any])
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (spdy != null) __obj.updateDynamic("spdy")(spdy.asInstanceOf[js.Any])
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

