package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.listMod.ArtworkSizesT
import typingsJapgolly.baseui.listMod.OverridesT
import typingsJapgolly.baseui.listMod.PropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  def apply(
    artwork: VdomNode = null,
    artworkSize: ArtworkSizesT = null,
    endEnhancer: VdomNode = null,
    overrides: OverridesT = null,
    sublist: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[PropsT, MountedWithRawType[PropsT, js.Object, RawMounted[PropsT, js.Object]]] = {
    val __obj = js.Dynamic.literal()
  
      if (artwork != null) __obj.updateDynamic("artwork")(artwork.rawNode.asInstanceOf[js.Any])
    if (artworkSize != null) __obj.updateDynamic("artworkSize")(artworkSize.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.rawNode.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.listMod.PropsT, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.listMod.PropsT])(children: _*)
  }
  @JSImport("baseui/list", "ListItem")
  @js.native
  object componentImport extends js.Object
  
}

