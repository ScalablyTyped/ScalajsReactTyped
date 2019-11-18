package typingsJapgolly.reactDashNavigation.reactDashNavigationMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationEventSubscription extends js.Object {
  def remove(): Unit
}

object NavigationEventSubscription {
  @scala.inline
  def apply(remove: Callback): NavigationEventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[NavigationEventSubscription]
  }
}

