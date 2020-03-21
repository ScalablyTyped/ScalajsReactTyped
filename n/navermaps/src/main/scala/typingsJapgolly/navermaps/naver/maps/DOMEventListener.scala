package typingsJapgolly.navermaps.naver.maps

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMEventListener extends js.Object {
  var eventName: String
  var target: HTMLElement
  def listener(): js.Any
}

object DOMEventListener {
  @scala.inline
  def apply(eventName: String, listener: CallbackTo[js.Any], target: HTMLElement): DOMEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("listener")(listener.toJsFn)
    __obj.asInstanceOf[DOMEventListener]
  }
}

