package typingsJapgolly.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when a request finishes successfully or erroneously.
  */
trait CloudACLsResponse extends js.Object {
  /**
  	 * Set of ACL objects, if any exist.
  	 */
  var acls: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Error code, if any returned.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Indicates whether the request failed.
  	 */
  var error: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var message: js.UndefOr[String] = js.undefined
  /**
  	 * Meta data, if any returned.
  	 */
  var meta: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Indicates whether the request succeeded.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object CloudACLsResponse {
  @scala.inline
  def apply(
    acls: js.Array[_] = null,
    code: Int | Double = null,
    error: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    meta: js.Any = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): CloudACLsResponse = {
    val __obj = js.Dynamic.literal()
    if (acls != null) __obj.updateDynamic("acls")(acls.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudACLsResponse]
  }
}

