package typingsJapgolly.reactNativeScrollableTabView.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTabBarProps extends js.Object {
  var activeTextColor: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var inactiveTextColor: js.UndefOr[String] = js.undefined
  var renderTab: js.UndefOr[RenderTabProperties] = js.undefined
  var style: js.UndefOr[ViewStyle] = js.undefined
  var tabStyle: js.UndefOr[ViewStyle] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  var underlineStyle: js.UndefOr[ViewStyle] = js.undefined
}

object DefaultTabBarProps {
  @scala.inline
  def apply(
    activeTextColor: String = null,
    backgroundColor: String = null,
    inactiveTextColor: String = null,
    renderTab: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => CallbackTo[Element] = null,
    style: ViewStyle = null,
    tabStyle: ViewStyle = null,
    textStyle: TextStyle = null,
    underlineStyle: ViewStyle = null
  ): DefaultTabBarProps = {
    val __obj = js.Dynamic.literal()
    if (activeTextColor != null) __obj.updateDynamic("activeTextColor")(activeTextColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (inactiveTextColor != null) __obj.updateDynamic("inactiveTextColor")(inactiveTextColor.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction5((t0: /* name */ java.lang.String, t1: /* pageIndex */ scala.Double, t2: /* isTabActive */ scala.Boolean, t3: /* onPressHandler */ js.Function1[/* pageNumber */ scala.Double, scala.Unit], t4: /* onLayoutHandler */ js.UndefOr[
  js.Function1[/* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent, scala.Unit]]) => renderTab(t0, t1, t2, t3, t4).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTabBarProps]
  }
}

