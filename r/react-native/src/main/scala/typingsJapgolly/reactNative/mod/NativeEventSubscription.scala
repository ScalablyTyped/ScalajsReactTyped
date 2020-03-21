package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeEventSubscription extends js.Object {
  /**
    * Call this method to un-subscribe from a native-event
    */
  def remove(): Unit
}

object NativeEventSubscription {
  @scala.inline
  def apply(remove: Callback): NativeEventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[NativeEventSubscription]
  }
}

