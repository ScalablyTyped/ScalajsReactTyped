package typingsJapgolly.jose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWERecipient extends js.Object {
  var encrypted_key: String
  var header: js.UndefOr[js.Object] = js.undefined
}

object JWERecipient {
  @scala.inline
  def apply(encrypted_key: String, header: js.Object = null): JWERecipient = {
    val __obj = js.Dynamic.literal(encrypted_key = encrypted_key.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWERecipient]
  }
}

