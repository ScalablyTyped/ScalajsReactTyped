package typingsJapgolly.iotaLibJs

import typingsJapgolly.iotaLibJs.mod.Security
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSecurity extends js.Object {
  var end: Double
  var security: js.UndefOr[Security] = js.undefined
  var start: Double
}

object AnonSecurity {
  @scala.inline
  def apply(end: Double, start: Double, security: Security = null): AnonSecurity = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSecurity]
  }
}

