package typingsJapgolly.samlp.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdPOptions extends js.Object {
  var RelayState: js.UndefOr[String] = js.undefined
  var audience: js.UndefOr[String] = js.undefined
  var authnContextClassRef: js.UndefOr[String] = js.undefined
  var cert: String | Buffer
  var destination: js.UndefOr[String] = js.undefined
  var digestAlgorithm: js.UndefOr[DigestAlgorithmType] = js.undefined
  var encryptionAlgorithm: js.UndefOr[String] = js.undefined
  var encryptionCert: js.UndefOr[String | Buffer] = js.undefined
  var encryptionPublicKey: js.UndefOr[String | Buffer] = js.undefined
  var getUserFromRequest: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], _]] = js.undefined
  var inResponseTo: js.UndefOr[String] = js.undefined
  var issuer: String
  var key: String | Buffer
  var keyEncryptionAlgorighm: js.UndefOr[String] = js.undefined
  var lifetimeInSeconds: js.UndefOr[Double] = js.undefined
  var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.undefined
  var recipient: js.UndefOr[String] = js.undefined
  var signResponse: js.UndefOr[Boolean] = js.undefined
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithmType] = js.undefined
  def getPostURL(
    audience: String,
    authnRequestDom: js.Any,
    req: Request_[ParamsDictionary],
    callback: js.Function2[/* err */ js.Any, /* url */ String, Unit]
  ): Unit
}

object IdPOptions {
  @scala.inline
  def apply(
    cert: String | Buffer,
    getPostURL: (String, js.Any, Request_[ParamsDictionary], js.Function2[/* err */ js.Any, /* url */ String, Unit]) => Callback,
    issuer: String,
    key: String | Buffer,
    RelayState: String = null,
    audience: String = null,
    authnContextClassRef: String = null,
    destination: String = null,
    digestAlgorithm: DigestAlgorithmType = null,
    encryptionAlgorithm: String = null,
    encryptionCert: String | Buffer = null,
    encryptionPublicKey: String | Buffer = null,
    getUserFromRequest: /* req */ Request_[ParamsDictionary] => CallbackTo[js.Any] = null,
    inResponseTo: String = null,
    keyEncryptionAlgorighm: String = null,
    lifetimeInSeconds: Int | Double = null,
    profileMapper: ProfileMapperConstructor = null,
    recipient: String = null,
    signResponse: js.UndefOr[Boolean] = js.undefined,
    signatureAlgorithm: SignatureAlgorithmType = null
  ): IdPOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("getPostURL")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Any, t2: typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t3: js.Function2[/* err */ js.Any, /* url */ java.lang.String, scala.Unit]) => getPostURL(t0, t1, t2, t3).runNow()))
    if (RelayState != null) __obj.updateDynamic("RelayState")(RelayState.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (authnContextClassRef != null) __obj.updateDynamic("authnContextClassRef")(authnContextClassRef.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm.asInstanceOf[js.Any])
    if (encryptionAlgorithm != null) __obj.updateDynamic("encryptionAlgorithm")(encryptionAlgorithm.asInstanceOf[js.Any])
    if (encryptionCert != null) __obj.updateDynamic("encryptionCert")(encryptionCert.asInstanceOf[js.Any])
    if (encryptionPublicKey != null) __obj.updateDynamic("encryptionPublicKey")(encryptionPublicKey.asInstanceOf[js.Any])
    if (getUserFromRequest != null) __obj.updateDynamic("getUserFromRequest")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => getUserFromRequest(t0).runNow()))
    if (inResponseTo != null) __obj.updateDynamic("inResponseTo")(inResponseTo.asInstanceOf[js.Any])
    if (keyEncryptionAlgorighm != null) __obj.updateDynamic("keyEncryptionAlgorighm")(keyEncryptionAlgorighm.asInstanceOf[js.Any])
    if (lifetimeInSeconds != null) __obj.updateDynamic("lifetimeInSeconds")(lifetimeInSeconds.asInstanceOf[js.Any])
    if (profileMapper != null) __obj.updateDynamic("profileMapper")(profileMapper.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (!js.isUndefined(signResponse)) __obj.updateDynamic("signResponse")(signResponse.asInstanceOf[js.Any])
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdPOptions]
  }
}

