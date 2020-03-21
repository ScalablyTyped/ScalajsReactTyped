package typingsJapgolly.openpgp.mod

import typingsJapgolly.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "reformatKey")
@js.native
object reformatKey extends js.Object {
  def apply(privateKey: Key, userIds: js.Array[_]): js.Promise[js.Object] = js.native
  def apply(privateKey: Key, userIds: js.Array[_], passphrase: String): js.Promise[js.Object] = js.native
  def apply(privateKey: Key, userIds: js.Array[_], passphrase: String, keyExpirationTime: Double): js.Promise[js.Object] = js.native
  def apply(
    privateKey: Key,
    userIds: js.Array[_],
    passphrase: String,
    keyExpirationTime: Double,
    revocationCertificate: Boolean
  ): js.Promise[js.Object] = js.native
}

