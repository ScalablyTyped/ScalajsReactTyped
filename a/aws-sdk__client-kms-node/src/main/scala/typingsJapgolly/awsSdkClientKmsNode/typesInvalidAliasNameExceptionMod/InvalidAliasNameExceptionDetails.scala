package typingsJapgolly.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAliasNameExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object InvalidAliasNameExceptionDetails {
  @scala.inline
  def apply(message: String = null): InvalidAliasNameExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAliasNameExceptionDetails]
  }
}

