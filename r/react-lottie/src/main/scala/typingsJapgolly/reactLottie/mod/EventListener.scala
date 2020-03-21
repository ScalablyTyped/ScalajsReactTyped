package typingsJapgolly.reactLottie.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactLottie.reactLottieStrings.DOMLoaded
import typingsJapgolly.reactLottie.reactLottieStrings.complete
import typingsJapgolly.reactLottie.reactLottieStrings.config_ready
import typingsJapgolly.reactLottie.reactLottieStrings.data_ready
import typingsJapgolly.reactLottie.reactLottieStrings.destroy
import typingsJapgolly.reactLottie.reactLottieStrings.enterFrame
import typingsJapgolly.reactLottie.reactLottieStrings.loaded_images
import typingsJapgolly.reactLottie.reactLottieStrings.loopComplete
import typingsJapgolly.reactLottie.reactLottieStrings.segmentStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListener extends js.Object {
  /**
    * The event sent by Lottie
    */
  var eventName: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy
  /**
    * A callback that will be executed when the given eventName is received
    */
  def callback(): Unit
}

object EventListener {
  @scala.inline
  def apply(
    callback: Callback,
    eventName: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy
  ): EventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[EventListener]
  }
}

