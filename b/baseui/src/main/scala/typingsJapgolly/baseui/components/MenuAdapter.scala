package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLLIElement
import typingsJapgolly.baseui.listMod.ArtworkSizesT
import typingsJapgolly.baseui.listMod.MenuAdapterPropsT
import typingsJapgolly.baseui.listMod.OverridesT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuAdapter {
  def apply(
    $disabled: Boolean,
    $isHighlighted: Boolean,
    $size: String,
    item: js.Any,
    onClick: ReactMouseEventFrom[HTMLLIElement] => CallbackTo[js.Any],
    onMouseEnter: ReactMouseEventFrom[HTMLLIElement] => CallbackTo[js.Any],
    artwork: VdomNode = null,
    artworkSize: ArtworkSizesT = null,
    endEnhancer: VdomNode = null,
    overrides: OverridesT = null,
    sublist: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MenuAdapterPropsT, 
    MountedWithRawType[MenuAdapterPropsT, js.Object, RawMounted[MenuAdapterPropsT, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLIElement]) => onClick(t0).runNow()))
    __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLLIElement]) => onMouseEnter(t0).runNow()))
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.rawNode.asInstanceOf[js.Any])
    if (artworkSize != null) __obj.updateDynamic("artworkSize")(artworkSize.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.rawNode.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.listMod.MenuAdapterPropsT, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.listMod.MenuAdapterPropsT])(children: _*)
  }
  @JSImport("baseui/list", "MenuAdapter")
  @js.native
  object componentImport extends js.Object
  
}

