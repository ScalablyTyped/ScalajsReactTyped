package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveTab extends js.Object {
  var activeTab: Double
  var animated: Boolean
  var dynamicTabUnderlineWidth: Boolean
  var page: Double
  var tabBarActiveTextColor: String
  var tabBarBackgroundColor: String
  var tabBarInactiveTextColor: String
  var tabs: js.Array[scala.Nothing]
  def goToTab(): Unit
}

object AnonActiveTab {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    dynamicTabUnderlineWidth: Boolean,
    goToTab: Callback,
    page: Double,
    tabBarActiveTextColor: String,
    tabBarBackgroundColor: String,
    tabBarInactiveTextColor: String,
    tabs: js.Array[scala.Nothing]
  ): AnonActiveTab = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], dynamicTabUnderlineWidth = dynamicTabUnderlineWidth.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], tabBarActiveTextColor = tabBarActiveTextColor.asInstanceOf[js.Any], tabBarBackgroundColor = tabBarBackgroundColor.asInstanceOf[js.Any], tabBarInactiveTextColor = tabBarInactiveTextColor.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.updateDynamic("goToTab")(goToTab.toJsFn)
    __obj.asInstanceOf[AnonActiveTab]
  }
}

