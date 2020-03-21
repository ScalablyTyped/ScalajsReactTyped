package typingsJapgolly.openpgp.mod

import typingsJapgolly.openpgp.AnonData
import typingsJapgolly.openpgp.AnonMessage
import typingsJapgolly.openpgp.AnonSignature
import typingsJapgolly.openpgp.AnonSignatureSignature
import typingsJapgolly.openpgp.SignOptionsarmorfalsedeta
import typingsJapgolly.openpgp.SignOptionsarmorfalsedetaArmor
import typingsJapgolly.openpgp.SignOptionsarmortruedetac
import typingsJapgolly.openpgp.SignOptionsarmortruedetacArmor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "sign")
@js.native
object sign extends js.Object {
  def apply(options: SignOptionsarmorfalsedeta): js.Promise[AnonMessage] = js.native
  def apply(options: SignOptionsarmorfalsedetaArmor): js.Promise[AnonSignatureSignature] = js.native
  def apply(options: SignOptionsarmortruedetac): js.Promise[AnonData] = js.native
  def apply(options: SignOptionsarmortruedetacArmor): js.Promise[AnonSignature] = js.native
  def apply(options: SignOptions): js.Promise[SignResult] = js.native
}

