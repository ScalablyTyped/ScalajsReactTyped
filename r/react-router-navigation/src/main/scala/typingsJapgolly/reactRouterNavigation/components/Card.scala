package typingsJapgolly.reactRouterNavigation.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactRouter.mod.RouterProps
import typingsJapgolly.reactRouterNavigation.mod.CardProps
import typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  def apply(
    backButtonTintColor: String = null,
    backButtonTitle: String = null,
    component: ComponentClassP[RouterProps with js.Object] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideNavBar: js.UndefOr[Boolean] = js.undefined,
    navBarStyle: StyleProp[ViewStyle] = null,
    path: String = null,
    render: /* props */ RouterProps => CallbackTo[Node] = null,
    renderLeftButton: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    renderNavBar: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    renderRightButton: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    renderTitle: /* props */ CardSubViewProps => CallbackTo[Node] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[/* props */ RouterProps, Node]) | Node = null
  ): UnmountedSimple[
    CardProps, 
    MountedWithRawType[CardProps, js.Object, RawMounted[CardProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor.asInstanceOf[js.Any])
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar.asInstanceOf[js.Any])
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouter.mod.RouterProps) => render(t0).runNow()))
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderLeftButton(t0).runNow()))
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderNavBar(t0).runNow()))
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderRightButton(t0).runNow()))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps) => renderTitle(t0).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactRouterNavigation.mod.CardProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterNavigation.mod.CardProps])
  }
  @JSImport("react-router-navigation", "Card")
  @js.native
  object componentImport extends js.Object
  
}

