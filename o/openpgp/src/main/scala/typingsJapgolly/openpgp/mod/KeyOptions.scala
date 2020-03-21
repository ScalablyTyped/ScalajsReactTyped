package typingsJapgolly.openpgp.mod

import typingsJapgolly.openpgp.AnonPassphrase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyOptions extends js.Object {
  /**
    * (optional) elliptic curve for ECC keys: elliptic curve for ECC keys:
    *                                         curve25519, p256, p384, p521, secp256k1,
    *                                         brainpoolP256r1, brainpoolP384r1, or brainpoolP512r1.
    */
  var curve: js.UndefOr[String] = js.undefined
  /**
    * (optional) override the creation date of the key and the key signatures
    */
  var date: js.UndefOr[js.Date] = js.undefined
  /**
    * (optional) The number of seconds after the key creation time that the key expires
    */
  var keyExpirationTime: js.UndefOr[Double] = js.undefined
  /**
    * (optional) number of bits for RSA keys: 2048 or 4096.
    */
  var numBits: js.UndefOr[Double] = js.undefined
  /**
    * (optional) The passphrase used to encrypt the resulting private key
    */
  var passphrase: js.UndefOr[String] = js.undefined
  /**
    * (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
    *            sign parameter defaults to false, and indicates whether the subkey should sign rather than encrypt
    */
  var subkeys: js.UndefOr[js.Array[AnonPassphrase]] = js.undefined
  /**
    * array of user IDs e.g. [ { name:'Phil Zimmermann', email:'phil@openpgp.org' }]
    */
  var userIds: js.Array[UserID]
}

object KeyOptions {
  @scala.inline
  def apply(
    userIds: js.Array[UserID],
    curve: String = null,
    date: js.Date = null,
    keyExpirationTime: Int | Double = null,
    numBits: Int | Double = null,
    passphrase: String = null,
    subkeys: js.Array[AnonPassphrase] = null
  ): KeyOptions = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (keyExpirationTime != null) __obj.updateDynamic("keyExpirationTime")(keyExpirationTime.asInstanceOf[js.Any])
    if (numBits != null) __obj.updateDynamic("numBits")(numBits.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (subkeys != null) __obj.updateDynamic("subkeys")(subkeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOptions]
  }
}

