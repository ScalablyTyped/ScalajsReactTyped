package typingsJapgolly.reactRouterNavigationCore.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactRouterNavigationCore.AnonTestID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsRendererProps extends js.Object {
  var loadedTabs: js.Array[String]
  var navigationState: NavigationState[AnonTestID]
  var tabs: js.Array[Tab]
  def onIndexChange(index: Double): Unit
}

object TabsRendererProps {
  @scala.inline
  def apply(
    loadedTabs: js.Array[String],
    navigationState: NavigationState[AnonTestID],
    onIndexChange: Double => Callback,
    tabs: js.Array[Tab]
  ): TabsRendererProps = {
    val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1((t0: scala.Double) => onIndexChange(t0).runNow()))
    __obj.asInstanceOf[TabsRendererProps]
  }
}

