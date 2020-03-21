package typingsJapgolly.xhr2Cookies.xmlHttpRequestEventTargetMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.xhr2Cookies.progressEventMod.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEventListenerObject extends js.Object {
  def handleEvent(event: ProgressEvent): Unit
}

object ProgressEventListenerObject {
  @scala.inline
  def apply(handleEvent: ProgressEvent => Callback): ProgressEventListenerObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: typingsJapgolly.xhr2Cookies.progressEventMod.ProgressEvent) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[ProgressEventListenerObject]
  }
}

