package typingsJapgolly.stellarBase

import typingsJapgolly.stellarBase.mod.xdr.Signature
import typingsJapgolly.stellarBase.mod.xdr.SignatureHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHint extends js.Object {
  var hint: SignatureHint
  var signature: Signature
}

object AnonHint {
  @scala.inline
  def apply(hint: SignatureHint, signature: Signature): AnonHint = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHint]
  }
}

