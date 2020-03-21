package typingsJapgolly.reactRouterNavigation.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavBarProps extends js.Object {
  var backButtonTintColor: js.UndefOr[String] = js.undefined
  var backButtonTitle: js.UndefOr[String] = js.undefined
  // Left button
  var hideBackButton: js.UndefOr[Boolean] = js.undefined
  // General
  var hideNavBar: js.UndefOr[Boolean] = js.undefined
  var navBarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var renderLeftButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, Node]] = js.undefined
  var renderNavBar: js.UndefOr[js.Function1[/* props */ CardSubViewProps, Node]] = js.undefined
  // Right button
  var renderRightButton: js.UndefOr[js.Function1[/* props */ CardSubViewProps, Node]] = js.undefined
  var renderTitle: js.UndefOr[js.Function1[/* props */ CardSubViewProps, Node]] = js.undefined
  // Title
  var title: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object NavBarProps {
  @scala.inline
  def apply(
    backButtonTintColor: String = null,
    backButtonTitle: String = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideNavBar: js.UndefOr[Boolean] = js.undefined,
    navBarStyle: StyleProp[ViewStyle] = null,
    renderLeftButton: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    renderNavBar: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    renderRightButton: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    renderTitle: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null
  ): NavBarProps = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor.asInstanceOf[js.Any])
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar.asInstanceOf[js.Any])
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderLeftButton(t0).runNow()))
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderNavBar(t0).runNow()))
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderRightButton(t0).runNow()))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderTitle(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavBarProps]
  }
}

