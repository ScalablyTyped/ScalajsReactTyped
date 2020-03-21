package typingsJapgolly.jwtClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTObject extends js.Object {
  var claim: js.Any
  var header: JWTHeader
  var signature: String
}

object JWTObject {
  @scala.inline
  def apply(claim: js.Any, header: JWTHeader, signature: String): JWTObject = {
    val __obj = js.Dynamic.literal(claim = claim.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JWTObject]
  }
}

