package typingsJapgolly.node.http2Mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.TypedArray
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.node.tlsMod.KeyObject
import typingsJapgolly.node.tlsMod.PxfObject
import typingsJapgolly.node.tlsMod.SecureContext
import typingsJapgolly.node.tlsMod.SecureVersion
import typingsJapgolly.node.tlsMod.TLSSocket
import typingsJapgolly.node.tlsMod.TlsOptions
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureServerOptions
  extends TlsOptions
     with ServerSessionOptions {
  var allowHTTP1: js.UndefOr[Boolean] = js.undefined
  var origins: js.UndefOr[js.Array[String]] = js.undefined
}

object SecureServerOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[String | scala.scalajs.js.typedarray.Uint8Array]) | scala.scalajs.js.typedarray.Uint8Array = null,
    Http1IncomingMessage: Instantiable1[/* socket */ Socket, IncomingMessage] = null,
    Http1ServerResponse: Instantiable1[/* req */ IncomingMessage, ServerResponse] = null,
    Http2ServerRequest: Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[String], 
      Http2ServerRequest
    ] = null,
    Http2ServerResponse: Instantiable1[/* stream */ ServerHttp2Stream, Http2ServerResponse] = null,
    SNICallback: (/* servername */ String, /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ SecureContext, Unit]) => Callback = null,
    allowHTTP1: js.UndefOr[Boolean] = js.undefined,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    createConnection: (/* authority */ URL_, SecureServerOptions) => CallbackTo[Duplex] = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    handshakeTimeout: Int | Double = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    maxDeflateDynamicTableSize: Int | Double = null,
    maxHeaderListPairs: Int | Double = null,
    maxOutstandingPings: Int | Double = null,
    maxSendHeaderBlockLength: Int | Double = null,
    maxSessionMemory: Int | Double = null,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    origins: js.Array[String] = null,
    paddingStrategy: Int | Double = null,
    passphrase: String = null,
    peerMaxConcurrentStreams: Int | Double = null,
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
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => CallbackTo[Double] = null,
    sessionIdContext: String = null,
    sessionTimeout: Int | Double = null,
    settings: Settings = null,
    sigalgs: String = null,
    ticketKeys: Buffer = null
  ): SecureServerOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (Http1IncomingMessage != null) __obj.updateDynamic("Http1IncomingMessage")(Http1IncomingMessage.asInstanceOf[js.Any])
    if (Http1ServerResponse != null) __obj.updateDynamic("Http1ServerResponse")(Http1ServerResponse.asInstanceOf[js.Any])
    if (Http2ServerRequest != null) __obj.updateDynamic("Http2ServerRequest")(Http2ServerRequest.asInstanceOf[js.Any])
    if (Http2ServerResponse != null) __obj.updateDynamic("Http2ServerResponse")(Http2ServerResponse.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2((t0: /* servername */ java.lang.String, t1: /* cb */ js.Function2[
  /* err */ js.Error | scala.Null, 
  /* ctx */ typingsJapgolly.node.tlsMod.SecureContext, 
  scala.Unit]) => SNICallback(t0, t1).runNow()))
    if (!js.isUndefined(allowHTTP1)) __obj.updateDynamic("allowHTTP1")(allowHTTP1.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2((t0: /* authority */ typingsJapgolly.node.urlMod.URL_, t1: typingsJapgolly.node.http2Mod.SecureServerOptions) => createConnection(t0, t1).runNow()))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace.asInstanceOf[js.Any])
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxHeaderListPairs != null) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.asInstanceOf[js.Any])
    if (maxOutstandingPings != null) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (maxSessionMemory != null) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (paddingStrategy != null) __obj.updateDynamic("paddingStrategy")(paddingStrategy.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (peerMaxConcurrentStreams != null) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.asInstanceOf[js.Any])
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
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2((t0: /* frameLen */ scala.Double, t1: /* maxFrameLen */ scala.Double) => selectPadding(t0, t1).runNow()))
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureServerOptions]
  }
}

