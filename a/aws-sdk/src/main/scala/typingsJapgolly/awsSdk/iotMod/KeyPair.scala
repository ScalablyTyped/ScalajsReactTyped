package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPair extends js.Object {
  /**
    * The private key.
    */
  var PrivateKey: js.UndefOr[typingsJapgolly.awsSdk.iotMod.PrivateKey] = js.native
  /**
    * The public key.
    */
  var PublicKey: js.UndefOr[typingsJapgolly.awsSdk.iotMod.PublicKey] = js.native
}

object KeyPair {
  @scala.inline
  def apply(PrivateKey: PrivateKey = null, PublicKey: PublicKey = null): KeyPair = {
    val __obj = js.Dynamic.literal()
    if (PrivateKey != null) __obj.updateDynamic("PrivateKey")(PrivateKey.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
}

