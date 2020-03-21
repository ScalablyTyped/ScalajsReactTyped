package typingsJapgolly.nodemailer.mimeFuncsMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/mime-funcs", "buildHeaderParam")
@js.native
object buildHeaderParam extends js.Object {
  def apply(key: String, data: String): js.Array[ParsedHeaderParam] = js.native
  def apply(key: String, data: String, maxLength: Double): js.Array[ParsedHeaderParam] = js.native
  def apply(key: String, data: Buffer): js.Array[ParsedHeaderParam] = js.native
  def apply(key: String, data: Buffer, maxLength: Double): js.Array[ParsedHeaderParam] = js.native
}

