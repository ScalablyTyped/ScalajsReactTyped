package typingsJapgolly.restIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofauthorizedResource extends js.Object {
  val ROLES: AnonADMIN
  var default: Typeofdefault
}

object TypeofauthorizedResource {
  @scala.inline
  def apply(ROLES: AnonADMIN, default: Typeofdefault): TypeofauthorizedResource = {
    val __obj = js.Dynamic.literal(ROLES = ROLES.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofauthorizedResource]
  }
}

