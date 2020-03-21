package typingsJapgolly.openpgp.mod

import typingsJapgolly.openpgp.DecryptOptionsformatbinar
import typingsJapgolly.openpgp.DecryptOptionsformatutf8
import typingsJapgolly.openpgp.DecryptResultdataUint8Arr
import typingsJapgolly.openpgp.DecryptResultdatastringRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "decrypt")
@js.native
object decrypt extends js.Object {
  def apply(options: DecryptOptionsformatbinar): js.Promise[DecryptResultdataUint8Arr] = js.native
  def apply(options: DecryptOptionsformatutf8): js.Promise[DecryptResultdatastringRe] = js.native
  def apply(options: DecryptOptions): js.Promise[DecryptResult] = js.native
}

