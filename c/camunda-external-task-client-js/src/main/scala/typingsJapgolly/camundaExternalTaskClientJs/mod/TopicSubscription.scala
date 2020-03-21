package typingsJapgolly.camundaExternalTaskClientJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicSubscription extends js.Object {
  def unsubscribe(): Unit
}

object TopicSubscription {
  @scala.inline
  def apply(unsubscribe: Callback): TopicSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[TopicSubscription]
  }
}

