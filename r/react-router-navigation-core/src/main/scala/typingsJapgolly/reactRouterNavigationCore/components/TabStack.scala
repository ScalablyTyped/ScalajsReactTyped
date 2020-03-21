package typingsJapgolly.reactRouterNavigationCore.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactRouterNavigationCore.mod.TabStackProps
import typingsJapgolly.reactRouterNavigationCore.mod.TabsRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabStack {
  def apply(
    render: TabsRendererProps => CallbackTo[Node],
    forceSync: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] = null
  ): UnmountedWithRoot[
    TabStackProps, 
    typingsJapgolly.reactRouterNavigationCore.mod.TabStack, 
    Unit, 
    TabStackProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactRouterNavigationCore.mod.TabsRendererProps) => render(t0).runNow()))
    if (!js.isUndefined(forceSync)) __obj.updateDynamic("forceSync")(forceSync.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterNavigationCore.mod.TabStackProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactRouterNavigationCore.mod.TabStack](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterNavigationCore.mod.TabStackProps])
  }
  @JSImport("react-router-navigation-core", "TabStack")
  @js.native
  object componentImport extends js.Object
  
}

