package typingsJapgolly.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginDetails extends js.Object {
  var address: String
  var publicKey: String
  var signature: String
}

object LoginDetails {
  @scala.inline
  def apply(address: String, publicKey: String, signature: String): LoginDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginDetails]
  }
}

