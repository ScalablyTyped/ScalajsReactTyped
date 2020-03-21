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
import typingsJapgolly.baseui.AnonBody
import typingsJapgolly.baseui.AnonListItemProfile
import typingsJapgolly.baseui.menuMod.OptionProfileProps
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OptionProfile {
  def apply(
    item: js.Any,
    getProfileItemImg: js.Any => CallbackTo[String | ComponentType[js.Any]],
    getProfileItemImgText: js.Any => CallbackTo[String],
    getProfileItemLabels: js.Any => CallbackTo[AnonBody],
    $isHighlighted: js.UndefOr[Boolean] = js.undefined,
    getChildMenu: /* item */ js.Any => CallbackTo[Node] = null,
    overrides: AnonListItemProfile = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    resetMenu: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    OptionProfileProps, 
    MountedWithRawType[OptionProfileProps, js.Object, RawMounted[OptionProfileProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getProfileItemImg")(js.Any.fromFunction1((t0: js.Any) => getProfileItemImg(t0).runNow()))
    __obj.updateDynamic("getProfileItemImgText")(js.Any.fromFunction1((t0: js.Any) => getProfileItemImgText(t0).runNow()))
    __obj.updateDynamic("getProfileItemLabels")(js.Any.fromFunction1((t0: js.Any) => getProfileItemLabels(t0).runNow()))
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted.asInstanceOf[js.Any])
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1((t0: /* item */ js.Any) => getChildMenu(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    resetMenu.foreach(p => __obj.updateDynamic("resetMenu")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.menuMod.OptionProfileProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.menuMod.OptionProfileProps])(children: _*)
  }
  @JSImport("baseui/menu", "OptionProfile")
  @js.native
  object componentImport extends js.Object
  
}

