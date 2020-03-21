package typingsJapgolly.cordovaPluginInappbrowser

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InAppBrowserEventListenerObject extends js.Object {
  def handleEvent(evt: InAppBrowserEvent): Unit
}

object InAppBrowserEventListenerObject {
  @scala.inline
  def apply(handleEvent: InAppBrowserEvent => Callback): InAppBrowserEventListenerObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginInappbrowser.InAppBrowserEvent) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[InAppBrowserEventListenerObject]
  }
}

