package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuccess extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(topicList: js.Array[KiiTopic], nextPaginationKey: String): js.Any
}

object AnonSuccess {
  @scala.inline
  def apply(failure: String => CallbackTo[js.Any], success: (js.Array[KiiTopic], String) => CallbackTo[js.Any]): AnonSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: java.lang.String) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic], t1: java.lang.String) => success(t0, t1).runNow()))
    __obj.asInstanceOf[AnonSuccess]
  }
}

