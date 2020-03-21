package typingsJapgolly.nodemailer

import typingsJapgolly.nodemailer.dkimMod.SingleKeyOptions
import typingsJapgolly.nodemailer.messageParserMod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/dkim/sign", JSImport.Namespace)
@js.native
object signMod extends js.Object {
  /** Returns DKIM signature header line */
  def apply(headers: js.Array[Header], hashAlgo: String, bodyHash: String): String = js.native
  def apply(headers: js.Array[Header], hashAlgo: String, bodyHash: String, options: SingleKeyOptions): String = js.native
  def relaxedHeaders(headers: js.Array[Header], hashAlgo: String, bodyHash: String): String = js.native
  def relaxedHeaders(headers: js.Array[Header], hashAlgo: String, bodyHash: String, options: SingleKeyOptions): String = js.native
}

