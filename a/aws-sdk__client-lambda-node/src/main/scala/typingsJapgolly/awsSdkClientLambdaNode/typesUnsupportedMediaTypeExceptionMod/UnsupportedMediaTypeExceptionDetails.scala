package typingsJapgolly.awsSdkClientLambdaNode.typesUnsupportedMediaTypeExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedMediaTypeExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object UnsupportedMediaTypeExceptionDetails {
  @scala.inline
  def apply(Type: String = null, message: String = null): UnsupportedMediaTypeExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedMediaTypeExceptionDetails]
  }
}

