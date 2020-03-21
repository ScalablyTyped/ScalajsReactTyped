package typingsJapgolly.reactRouterNavigation.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationComponentProps extends NavigationProps {
  var children: js.UndefOr[js.Array[Element]] = js.undefined
}

object NavigationComponentProps {
  @scala.inline
  def apply(
    backButtonTintColor: String = null,
    backButtonTitle: String = null,
    cardStyle: StyleProp[ViewStyle] = null,
    children: js.Array[Element] = null,
    configureTransition: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, /* prevTransitionProps */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
    ]) => CallbackTo[js.Any] = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideNavBar: js.UndefOr[Boolean] = js.undefined,
    navBarStyle: StyleProp[ViewStyle] = null,
    onTransitionEnd: /* repeated */ js.Any => Callback = null,
    onTransitionStart: /* repeated */ js.Any => Callback = null,
    renderLeftButton: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    renderNavBar: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    renderRightButton: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    renderTitle: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null
  ): NavigationComponentProps = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor.asInstanceOf[js.Any])
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle.asInstanceOf[js.Any])
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, t1: /* prevTransitionProps */ js.UndefOr[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any]) => configureTransition(t0, t1).runNow()))
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar.asInstanceOf[js.Any])
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTransitionEnd(t0).runNow()))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onTransitionStart(t0).runNow()))
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderLeftButton(t0).runNow()))
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderNavBar(t0).runNow()))
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderRightButton(t0).runNow()))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderTitle(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationComponentProps]
  }
}

