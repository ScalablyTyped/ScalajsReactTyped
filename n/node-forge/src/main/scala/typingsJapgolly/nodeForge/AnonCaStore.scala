package typingsJapgolly.nodeForge

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodeForge.mod.Bytes
import typingsJapgolly.nodeForge.mod.pki.CAStore
import typingsJapgolly.nodeForge.mod.pki.Certificate
import typingsJapgolly.nodeForge.mod.pki.PEM
import typingsJapgolly.nodeForge.mod.tls.CertificateRequest
import typingsJapgolly.nodeForge.mod.tls.CipherSuite
import typingsJapgolly.nodeForge.mod.tls.Connection
import typingsJapgolly.nodeForge.mod.tls.Session
import typingsJapgolly.nodeForge.mod.tls.SessionCache
import typingsJapgolly.nodeForge.mod.tls.TLSError
import typingsJapgolly.nodeForge.mod.tls.Verified
import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaStore extends js.Object {
  var caStore: js.UndefOr[CAStore | js.Array[Certificate]] = js.undefined
  var cipherSuites: js.UndefOr[js.Array[CipherSuite]] = js.undefined
  var deflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.undefined
  var getCertificate: js.UndefOr[
    js.Function2[
      /* conn */ Connection, 
      /* hint */ CertificateRequest | js.Array[String], 
      PEM | js.Array[PEM]
    ]
  ] = js.undefined
  var getPrivateKey: js.UndefOr[js.Function2[/* conn */ Connection, /* certificate */ Certificate, PEM]] = js.undefined
  var getSignature: js.UndefOr[
    js.Function3[
      /* conn */ Connection, 
      /* bytes */ Bytes, 
      /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit], 
      Unit
    ]
  ] = js.undefined
  var heartbeatReceived: js.UndefOr[js.Function2[/* conn */ Connection, /* payload */ ByteBuffer, Unit]] = js.undefined
  var inflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.undefined
  var server: js.UndefOr[Boolean] = js.undefined
  var sessionCache: js.UndefOr[SessionCache | StringDictionary[Session]] = js.undefined
  var sessionId: js.UndefOr[Bytes | Null] = js.undefined
  var verify: js.UndefOr[
    js.Function4[
      /* conn */ Connection, 
      /* verified */ Verified, 
      /* depth */ Double, 
      /* certs */ js.Array[Certificate], 
      Verified
    ]
  ] = js.undefined
  var verifyClient: js.UndefOr[Boolean] = js.undefined
  var virtualHost: js.UndefOr[String] = js.undefined
  def closed(conn: Connection): Unit
  def connected(conn: Connection): Unit
  def dataReady(conn: Connection): Unit
  def error(conn: Connection, error: TLSError): Unit
  def tlsDataReady(conn: Connection): Unit
}

object AnonCaStore {
  @scala.inline
  def apply(
    closed: Connection => Callback,
    connected: Connection => Callback,
    dataReady: Connection => Callback,
    error: (Connection, TLSError) => Callback,
    tlsDataReady: Connection => Callback,
    caStore: CAStore | js.Array[Certificate] = null,
    cipherSuites: js.Array[CipherSuite] = null,
    deflate: /* inBytes */ Bytes => CallbackTo[Bytes] = null,
    getCertificate: (/* conn */ Connection, /* hint */ CertificateRequest | js.Array[String]) => CallbackTo[PEM | js.Array[PEM]] = null,
    getPrivateKey: (/* conn */ Connection, /* certificate */ Certificate) => CallbackTo[PEM] = null,
    getSignature: (/* conn */ Connection, /* bytes */ Bytes, /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit]) => Callback = null,
    heartbeatReceived: (/* conn */ Connection, /* payload */ ByteBuffer) => Callback = null,
    inflate: /* inBytes */ Bytes => CallbackTo[Bytes] = null,
    server: js.UndefOr[Boolean] = js.undefined,
    sessionCache: SessionCache | StringDictionary[Session] = null,
    sessionId: Bytes = null,
    verify: (/* conn */ Connection, /* verified */ Verified, /* depth */ Double, /* certs */ js.Array[Certificate]) => CallbackTo[Verified] = null,
    verifyClient: js.UndefOr[Boolean] = js.undefined,
    virtualHost: String = null
  ): AnonCaStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closed")(js.Any.fromFunction1((t0: typingsJapgolly.nodeForge.mod.tls.Connection) => closed(t0).runNow()))
    __obj.updateDynamic("connected")(js.Any.fromFunction1((t0: typingsJapgolly.nodeForge.mod.tls.Connection) => connected(t0).runNow()))
    __obj.updateDynamic("dataReady")(js.Any.fromFunction1((t0: typingsJapgolly.nodeForge.mod.tls.Connection) => dataReady(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction2((t0: typingsJapgolly.nodeForge.mod.tls.Connection, t1: typingsJapgolly.nodeForge.mod.tls.TLSError) => error(t0, t1).runNow()))
    __obj.updateDynamic("tlsDataReady")(js.Any.fromFunction1((t0: typingsJapgolly.nodeForge.mod.tls.Connection) => tlsDataReady(t0).runNow()))
    if (caStore != null) __obj.updateDynamic("caStore")(caStore.asInstanceOf[js.Any])
    if (cipherSuites != null) __obj.updateDynamic("cipherSuites")(cipherSuites.asInstanceOf[js.Any])
    if (deflate != null) __obj.updateDynamic("deflate")(js.Any.fromFunction1((t0: /* inBytes */ typingsJapgolly.nodeForge.mod.Bytes) => deflate(t0).runNow()))
    if (getCertificate != null) __obj.updateDynamic("getCertificate")(js.Any.fromFunction2((t0: /* conn */ typingsJapgolly.nodeForge.mod.tls.Connection, t1: /* hint */ typingsJapgolly.nodeForge.mod.tls.CertificateRequest | js.Array[java.lang.String]) => getCertificate(t0, t1).runNow()))
    if (getPrivateKey != null) __obj.updateDynamic("getPrivateKey")(js.Any.fromFunction2((t0: /* conn */ typingsJapgolly.nodeForge.mod.tls.Connection, t1: /* certificate */ typingsJapgolly.nodeForge.mod.pki.Certificate) => getPrivateKey(t0, t1).runNow()))
    if (getSignature != null) __obj.updateDynamic("getSignature")(js.Any.fromFunction3((t0: /* conn */ typingsJapgolly.nodeForge.mod.tls.Connection, t1: /* bytes */ typingsJapgolly.nodeForge.mod.Bytes, t2: /* callback */ js.Function2[
  /* conn */ typingsJapgolly.nodeForge.mod.tls.Connection, 
  /* bytes */ typingsJapgolly.nodeForge.mod.Bytes, 
  scala.Unit]) => getSignature(t0, t1, t2).runNow()))
    if (heartbeatReceived != null) __obj.updateDynamic("heartbeatReceived")(js.Any.fromFunction2((t0: /* conn */ typingsJapgolly.nodeForge.mod.tls.Connection, t1: /* payload */ typingsJapgolly.nodeForge.mod.util.ByteBuffer) => heartbeatReceived(t0, t1).runNow()))
    if (inflate != null) __obj.updateDynamic("inflate")(js.Any.fromFunction1((t0: /* inBytes */ typingsJapgolly.nodeForge.mod.Bytes) => inflate(t0).runNow()))
    if (!js.isUndefined(server)) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (sessionCache != null) __obj.updateDynamic("sessionCache")(sessionCache.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4((t0: /* conn */ typingsJapgolly.nodeForge.mod.tls.Connection, t1: /* verified */ typingsJapgolly.nodeForge.mod.tls.Verified, t2: /* depth */ scala.Double, t3: /* certs */ js.Array[typingsJapgolly.nodeForge.mod.pki.Certificate]) => verify(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(verifyClient)) __obj.updateDynamic("verifyClient")(verifyClient.asInstanceOf[js.Any])
    if (virtualHost != null) __obj.updateDynamic("virtualHost")(virtualHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaStore]
  }
}

