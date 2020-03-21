package typingsJapgolly.awsSdkClientLambdaNode.typesEnvironmentErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentError extends js.Object {
  /**
    * <p>The error code.</p>
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * <p>The error message.</p>
    */
  var Message: js.UndefOr[String] = js.undefined
}

object EnvironmentError {
  @scala.inline
  def apply(ErrorCode: String = null, Message: String = null): EnvironmentError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentError]
  }
}

