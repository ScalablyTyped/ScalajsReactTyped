package typingsJapgolly.openpgp.mod.key

import typingsJapgolly.openpgp.mod.packet.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.getLatestValidSignature")
@js.native
object getLatestValidSignature extends js.Object {
  /**
    * Returns the valid and non-expired signature that has the latest creation date, while ignoring signatures created in the future.
    * @param signatures List of signatures
    * @param date Use the given date instead of the current time
    * @returns The latest valid signature
    */
  def apply(signatures: js.Array[_], date: js.Date): js.Promise[Signature] = js.native
}

