package typingsJapgolly.sjcl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclECCBasic extends js.Object {
  var publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey]
  var secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey]
  def generateKeys(cn: String): SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey]
}

object SjclECCBasic {
  @scala.inline
  def apply(
    generateKeys: String => CallbackTo[SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey]],
    publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey],
    secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey]
  ): SjclECCBasic = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("generateKeys")(js.Any.fromFunction1((t0: java.lang.String) => generateKeys(t0).runNow()))
    __obj.asInstanceOf[SjclECCBasic]
  }
}

