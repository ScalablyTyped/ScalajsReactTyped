package typingsJapgolly.openpgp.mod

import typingsJapgolly.openpgp.EncryptOptionsarmorfalsed
import typingsJapgolly.openpgp.EncryptOptionsarmorfalsedArmor
import typingsJapgolly.openpgp.EncryptOptionsarmortruede
import typingsJapgolly.openpgp.EncryptOptionsarmortruedeArmor
import typingsJapgolly.openpgp.EncryptResultdatastring
import typingsJapgolly.openpgp.EncryptResultdatastringRe
import typingsJapgolly.openpgp.EncryptResultdatastringsi
import typingsJapgolly.openpgp.EncryptResultmessageMessa
import typingsJapgolly.openpgp.EncryptResultmessageMessaMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(options: EncryptOptionsarmorfalsed): js.Promise[EncryptResultmessageMessa] = js.native
  def apply(options: EncryptOptionsarmorfalsedArmor): js.Promise[EncryptResultmessageMessaMessage] = js.native
  def apply(options: EncryptOptionsarmortruede): js.Promise[EncryptResultdatastring] = js.native
  def apply(options: EncryptOptionsarmortruedeArmor): js.Promise[EncryptResultdatastringsi] = js.native
  def apply(options: EncryptOptions): js.Promise[EncryptResultdatastringRe] = js.native
}

