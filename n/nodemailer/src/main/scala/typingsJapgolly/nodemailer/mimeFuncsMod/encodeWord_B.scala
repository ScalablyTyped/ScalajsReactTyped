package typingsJapgolly.nodemailer.mimeFuncsMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.nodemailer.nodemailerStrings.B
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/mime-funcs", "encodeWord")
@js.native
object encodeWord_B extends js.Object {
  def apply(data: String, mimeWordEncoding: B): String = js.native
  def apply(data: String, mimeWordEncoding: B, maxLength: Double): String = js.native
  def apply(data: Buffer, mimeWordEncoding: B): String = js.native
  def apply(data: Buffer, mimeWordEncoding: B, maxLength: Double): String = js.native
}

