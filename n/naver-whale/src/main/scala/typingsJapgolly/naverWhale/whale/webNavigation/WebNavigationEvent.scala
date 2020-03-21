package typingsJapgolly.naverWhale.whale.webNavigation

import typingsJapgolly.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationEvent[T /* <: typingsJapgolly.chrome.chrome.webNavigation.WebNavigationCallbackDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filters: typingsJapgolly.chrome.chrome.webNavigation.WebNavigationEventFilter
  ): Unit = js.native
}

