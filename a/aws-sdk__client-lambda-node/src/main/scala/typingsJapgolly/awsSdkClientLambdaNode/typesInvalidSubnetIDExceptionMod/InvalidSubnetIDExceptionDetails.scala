package typingsJapgolly.awsSdkClientLambdaNode.typesInvalidSubnetIDExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidSubnetIDExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
}

object InvalidSubnetIDExceptionDetails {
  @scala.inline
  def apply(Message: String = null, Type: String = null): InvalidSubnetIDExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSubnetIDExceptionDetails]
  }
}

