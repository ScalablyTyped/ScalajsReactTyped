package typingsJapgolly.saslExternal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var authzid: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(authzid: String = null): Credentials = {
    val __obj = js.Dynamic.literal()
    if (authzid != null) __obj.updateDynamic("authzid")(authzid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

