package typingsJapgolly.openpgp.mod.key

import typingsJapgolly.openpgp.mod.packet.SecretKey
import typingsJapgolly.openpgp.mod.packet.SecretSubkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.getPreferredHashAlgo")
@js.native
object getPreferredHashAlgo extends js.Object {
  /**
    * Returns the preferred signature hash algorithm of a key
    * @param key (optional) the key to get preferences from
    * @param keyPacket key packet used for signing
    * @param date (optional) use the given date for verification instead of the current time
    * @param userId (optional) user ID
    * @returns
    */
  def apply(key: Key, keyPacket: SecretKey, date: js.Date, userId: js.Object): js.Promise[String] = js.native
  def apply(key: Key, keyPacket: SecretSubkey, date: js.Date, userId: js.Object): js.Promise[String] = js.native
}

