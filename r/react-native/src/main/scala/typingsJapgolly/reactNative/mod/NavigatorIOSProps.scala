package typingsJapgolly.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorIOSProps extends js.Object {
  /**
    * The default background color of the navigation bar.
    */
  var barTintColor: js.UndefOr[String] = js.undefined
  /**
    * NavigatorIOS uses "route" objects to identify child views, their props, and navigation bar configuration.
    * "push" and all the other navigation operations expect routes to be like this
    */
  var initialRoute: Route
  /**
    * Boolean value that indicates whether the interactive pop gesture is
    * enabled. This is useful for enabling/disabling the back swipe navigation
    * gesture.
    *
    * If this prop is not provided, the default behavior is for the back swipe
    * gesture to be enabled when the navigation bar is shown and disabled when
    * the navigation bar is hidden. Once you've provided the
    * `interactivePopGestureEnabled` prop, you can never restore the default
    * behavior.
    */
  var interactivePopGestureEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The default wrapper style for components in the navigator.
    * A common use case is to set the backgroundColor for every page
    */
  var itemWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * A Boolean value that indicates whether the navigation bar is hidden
    */
  var navigationBarHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that indicates whether to hide the 1px hairline shadow
    */
  var shadowHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * NOT IN THE DOC BUT IN THE EXAMPLES
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * The color used for buttons in the navigation bar
    */
  var tintColor: js.UndefOr[String] = js.undefined
  /**
    * The text color of the navigation bar title
    */
  var titleTextColor: js.UndefOr[String] = js.undefined
  /**
    * A Boolean value that indicates whether the navigation bar is translucent
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object NavigatorIOSProps {
  @scala.inline
  def apply(
    initialRoute: Route,
    barTintColor: String = null,
    interactivePopGestureEnabled: js.UndefOr[Boolean] = js.undefined,
    itemWrapperStyle: StyleProp[ViewStyle] = null,
    navigationBarHidden: js.UndefOr[Boolean] = js.undefined,
    shadowHidden: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    tintColor: String = null,
    titleTextColor: String = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): NavigatorIOSProps = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(interactivePopGestureEnabled)) __obj.updateDynamic("interactivePopGestureEnabled")(interactivePopGestureEnabled.asInstanceOf[js.Any])
    if (itemWrapperStyle != null) __obj.updateDynamic("itemWrapperStyle")(itemWrapperStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationBarHidden)) __obj.updateDynamic("navigationBarHidden")(navigationBarHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowHidden)) __obj.updateDynamic("shadowHidden")(shadowHidden.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (titleTextColor != null) __obj.updateDynamic("titleTextColor")(titleTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorIOSProps]
  }
}

