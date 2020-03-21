package typingsJapgolly.reactNativeTabNavigator.mod

import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabNavigatorProps extends js.Object {
  /**
    * Disable onPress opacity for Tab
    *
    * @default false
    */
  var hidesTabTouch: js.UndefOr[Boolean] = js.undefined
  /**
    * Define for rendered scene
    */
  var sceneStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Define shadow style for tabBar
    */
  var tabBarShadowStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Define style for TabBar
    */
  var tabBarStyle: js.UndefOr[ViewStyle] = js.undefined
}

object TabNavigatorProps {
  @scala.inline
  def apply(
    hidesTabTouch: js.UndefOr[Boolean] = js.undefined,
    sceneStyle: ViewStyle = null,
    tabBarShadowStyle: ViewStyle = null,
    tabBarStyle: ViewStyle = null
  ): TabNavigatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidesTabTouch)) __obj.updateDynamic("hidesTabTouch")(hidesTabTouch.asInstanceOf[js.Any])
    if (sceneStyle != null) __obj.updateDynamic("sceneStyle")(sceneStyle.asInstanceOf[js.Any])
    if (tabBarShadowStyle != null) __obj.updateDynamic("tabBarShadowStyle")(tabBarShadowStyle.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabNavigatorProps]
  }
}

