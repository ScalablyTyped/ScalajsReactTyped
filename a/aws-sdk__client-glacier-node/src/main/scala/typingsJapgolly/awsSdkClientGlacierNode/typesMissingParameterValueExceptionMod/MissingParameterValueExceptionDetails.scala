package typingsJapgolly.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingParameterValueExceptionDetails extends js.Object {
  /**
    * <p>400 Bad Request</p>
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * <p>Returned if no authentication data is found for the request.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * <p>Client.</p>
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MissingParameterValueExceptionDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, `type`: String = null): MissingParameterValueExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingParameterValueExceptionDetails]
  }
}

