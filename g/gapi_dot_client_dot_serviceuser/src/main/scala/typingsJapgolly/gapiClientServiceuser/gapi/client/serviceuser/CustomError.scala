package typingsJapgolly.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomError extends js.Object {
  /**
    * The list of custom error rules that apply to individual API messages.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[CustomErrorRule]] = js.undefined
  /** The list of custom error detail types, e.g. 'google.foo.v1.CustomError'. */
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object CustomError {
  @scala.inline
  def apply(rules: js.Array[CustomErrorRule] = null, types: js.Array[String] = null): CustomError = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomError]
  }
}

