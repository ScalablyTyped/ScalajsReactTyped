package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.baseui.AnonListItem
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.menuMod.OptionListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OptionList {
  def apply(
    item: js.Any,
    getItemLabel: js.Any => CallbackTo[Node],
    $isFocused: js.UndefOr[Boolean] = js.undefined,
    $isHighlighted: js.UndefOr[Boolean] = js.undefined,
    getChildMenu: /* item */ js.Any => CallbackTo[Node] = null,
    onMouseEnter: /* event */ MouseEvent => CallbackTo[js.Any] = null,
    overrides: AnonListItem = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    resetMenu: js.UndefOr[Callback] = js.undefined,
    size: default_ | compact = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    OptionListProps, 
    MountedWithRawType[OptionListProps, js.Object, RawMounted[OptionListProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getItemLabel")(js.Any.fromFunction1((t0: js.Any) => getItemLabel(t0).runNow()))
    if (!js.isUndefined($isFocused)) __obj.updateDynamic("$isFocused")($isFocused.asInstanceOf[js.Any])
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted.asInstanceOf[js.Any])
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1((t0: /* item */ js.Any) => getChildMenu(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onMouseEnter(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    resetMenu.foreach(p => __obj.updateDynamic("resetMenu")(p.toJsFn))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.menuMod.OptionListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.menuMod.OptionListProps])(children: _*)
  }
  @JSImport("baseui/menu", "OptionList")
  @js.native
  object componentImport extends js.Object
  
}

