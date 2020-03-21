package typingsJapgolly.reactNativeMauron85BackgroundGeolocation.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSubscription extends js.Object {
  def remove(): Unit
}

object EventSubscription {
  @scala.inline
  def apply(remove: Callback): EventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[EventSubscription]
  }
}

