package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailureSuccess extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thingContext: KiiThingContext): js.Any
}

object AnonFailureSuccess {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: KiiThingContext => CallbackTo[js.Any]): AnonFailureSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThingContext) => success(t0).runNow()))
    __obj.asInstanceOf[AnonFailureSuccess]
  }
}

