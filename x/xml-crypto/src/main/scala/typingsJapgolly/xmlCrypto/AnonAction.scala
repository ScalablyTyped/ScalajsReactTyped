package typingsJapgolly.xmlCrypto

import typingsJapgolly.xmlCrypto.xmlCryptoStrings.after
import typingsJapgolly.xmlCrypto.xmlCryptoStrings.append
import typingsJapgolly.xmlCrypto.xmlCryptoStrings.before
import typingsJapgolly.xmlCrypto.xmlCryptoStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: append | prepend | before | after
  var reference: String
}

object AnonAction {
  @scala.inline
  def apply(action: append | prepend | before | after, reference: String): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction]
  }
}

