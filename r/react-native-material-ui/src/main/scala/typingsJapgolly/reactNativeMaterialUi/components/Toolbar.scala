package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.mod.RightElementPressEvent
import typingsJapgolly.reactNativeMaterialUi.mod.Searchable
import typingsJapgolly.reactNativeMaterialUi.mod.ToolBarRightElement
import typingsJapgolly.reactNativeMaterialUi.mod.ToolbarProps
import typingsJapgolly.reactNativeMaterialUi.mod.ToolbarStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toolbar {
  def apply(
    centerElement: Element | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isSearchActive: js.UndefOr[Boolean] = js.undefined,
    leftElement: Element | String = null,
    onLeftElementPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    onRightElementPress: /* e */ RightElementPressEvent => Callback = null,
    rightElement: Element | String | js.Array[String] | ToolBarRightElement = null,
    searchable: Searchable = null,
    size: Int | Double = null,
    style: ToolbarStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ToolbarProps, typingsJapgolly.reactNativeMaterialUi.mod.Toolbar, Unit, ToolbarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (centerElement != null) __obj.updateDynamic("centerElement")(centerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchActive)) __obj.updateDynamic("isSearchActive")(isSearchActive.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    onLeftElementPress.foreach(p => __obj.updateDynamic("onLeftElementPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (onRightElementPress != null) __obj.updateDynamic("onRightElementPress")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactNativeMaterialUi.mod.RightElementPressEvent) => onRightElementPress(t0).runNow()))
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (searchable != null) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.ToolbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.Toolbar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.ToolbarProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "Toolbar")
  @js.native
  object componentImport extends js.Object
  
}

