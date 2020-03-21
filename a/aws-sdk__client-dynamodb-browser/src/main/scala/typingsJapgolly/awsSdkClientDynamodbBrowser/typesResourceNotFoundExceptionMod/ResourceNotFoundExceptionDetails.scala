package typingsJapgolly.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceNotFoundExceptionDetails extends js.Object {
  /**
    * <p>The resource which is being requested does not exist.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object ResourceNotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): ResourceNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceNotFoundExceptionDetails]
  }
}

