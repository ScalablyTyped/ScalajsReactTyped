package typingsJapgolly.postmark.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/senders/Signature", "UpdateSignatureRequest")
@js.native
class UpdateSignatureRequest () extends js.Object {
  def this(Name: String) = this()
  def this(Name: String, ReplyToEmail: String) = this()
  def this(Name: String, ReplyToEmail: String, ReturnPathDomain: String) = this()
  var Name: js.UndefOr[String] = js.native
  var ReplyToEmail: js.UndefOr[String] = js.native
  var ReturnPathDomain: js.UndefOr[String] = js.native
}

