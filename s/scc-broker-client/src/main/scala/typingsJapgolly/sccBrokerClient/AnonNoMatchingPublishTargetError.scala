package typingsJapgolly.sccBrokerClient

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoMatchingPublishTargetError extends js.Object {
  def NoMatchingPublishTargetError(channelName: String): js.Error
  def NoMatchingSubscribeTargetError(channelName: String): js.Error
  def NoMatchingUnsubscribeTargetError(channelName: String): js.Error
}

object AnonNoMatchingPublishTargetError {
  @scala.inline
  def apply(
    NoMatchingPublishTargetError: String => CallbackTo[js.Error],
    NoMatchingSubscribeTargetError: String => CallbackTo[js.Error],
    NoMatchingUnsubscribeTargetError: String => CallbackTo[js.Error]
  ): AnonNoMatchingPublishTargetError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NoMatchingPublishTargetError")(js.Any.fromFunction1((t0: java.lang.String) => NoMatchingPublishTargetError(t0).runNow()))
    __obj.updateDynamic("NoMatchingSubscribeTargetError")(js.Any.fromFunction1((t0: java.lang.String) => NoMatchingSubscribeTargetError(t0).runNow()))
    __obj.updateDynamic("NoMatchingUnsubscribeTargetError")(js.Any.fromFunction1((t0: java.lang.String) => NoMatchingUnsubscribeTargetError(t0).runNow()))
    __obj.asInstanceOf[AnonNoMatchingPublishTargetError]
  }
}

