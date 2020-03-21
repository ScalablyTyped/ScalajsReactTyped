package typingsJapgolly.reactNativeNavbar.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarProps extends js.Object {
  var leftButton: js.UndefOr[NavigationBarButton | Element | Null] = js.undefined
  var rightButton: js.UndefOr[NavigationBarButton | Element | Null] = js.undefined
  var statusBar: js.UndefOr[StatusBar] = js.undefined
  var style: js.UndefOr[ViewStyle] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[NavigationBarTitle | Element | Null] = js.undefined
}

object NavigationBarProps {
  @scala.inline
  def apply(
    leftButton: NavigationBarButton | Element = null,
    rightButton: NavigationBarButton | Element = null,
    statusBar: StatusBar = null,
    style: ViewStyle = null,
    tintColor: String = null,
    title: NavigationBarTitle | Element = null
  ): NavigationBarProps = {
    val __obj = js.Dynamic.literal()
    if (leftButton != null) __obj.updateDynamic("leftButton")(leftButton.asInstanceOf[js.Any])
    if (rightButton != null) __obj.updateDynamic("rightButton")(rightButton.asInstanceOf[js.Any])
    if (statusBar != null) __obj.updateDynamic("statusBar")(statusBar.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarProps]
  }
}

