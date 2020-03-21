package typingsJapgolly.popmotion.reactionsTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotSubscription extends js.Object {
  def unsubscribe(): Unit
}

object HotSubscription {
  @scala.inline
  def apply(unsubscribe: Callback): HotSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[HotSubscription]
  }
}

