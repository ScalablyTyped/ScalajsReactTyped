package typingsJapgolly.pgPromise.pgSubsetMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.tlsMod.PeerCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SSL configuration;
// For property types and documentation see:
// http://nodejs.org/api/tls.html#tls_tls_connect_options_callback
trait ISSLConfig extends js.Object {
  var NPNProtocols: js.UndefOr[
    (js.Array[Buffer | String | scala.scalajs.js.typedarray.Uint8Array]) | Buffer | scala.scalajs.js.typedarray.Uint8Array
  ] = js.undefined
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  var checkServerIdentity: js.UndefOr[
    js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]]
  ] = js.undefined
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | js.Object])] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  var secureOptions: js.UndefOr[Double] = js.undefined
}

object ISSLConfig {
  @scala.inline
  def apply(
    NPNProtocols: (js.Array[Buffer | String | scala.scalajs.js.typedarray.Uint8Array]) | Buffer | scala.scalajs.js.typedarray.Uint8Array = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    checkServerIdentity: (/* host */ String, /* cert */ PeerCertificate) => CallbackTo[js.UndefOr[js.Error]] = null,
    key: String | Buffer | (js.Array[Buffer | js.Object]) = null,
    passphrase: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | js.Object]) = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureOptions: Int | Double = null
  ): ISSLConfig = {
    val __obj = js.Dynamic.literal()
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2((t0: /* host */ java.lang.String, t1: /* cert */ typingsJapgolly.node.tlsMod.PeerCertificate) => checkServerIdentity(t0, t1).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISSLConfig]
  }
}

