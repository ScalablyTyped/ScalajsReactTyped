package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.reactOverlays.autoAffixMod.AutoAffixProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoAffix {
  def apply(
    affixClassName: String = null,
    affixStyle: CSSProperties = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    bottomClassName: String = null,
    bottomStyle: CSSProperties = null,
    container: ReactInstance | js.Function0[ReactInstance] = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onAffix: js.UndefOr[Callback] = js.undefined,
    onAffixBottom: js.UndefOr[Callback] = js.undefined,
    onAffixTop: js.UndefOr[Callback] = js.undefined,
    onAffixed: js.UndefOr[Callback] = js.undefined,
    onAffixedBottom: js.UndefOr[Callback] = js.undefined,
    onAffixedTop: js.UndefOr[Callback] = js.undefined,
    topClassName: String = null,
    topStyle: CSSProperties = null,
    viewportOffsetTop: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AutoAffixProps, typingsJapgolly.reactOverlays.mod.AutoAffix, Unit, AutoAffixProps] = {
    val __obj = js.Dynamic.literal()
  
      if (affixClassName != null) __obj.updateDynamic("affixClassName")(affixClassName.asInstanceOf[js.Any])
    if (affixStyle != null) __obj.updateDynamic("affixStyle")(affixStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (bottomClassName != null) __obj.updateDynamic("bottomClassName")(bottomClassName.asInstanceOf[js.Any])
    if (bottomStyle != null) __obj.updateDynamic("bottomStyle")(bottomStyle.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    onAffix.foreach(p => __obj.updateDynamic("onAffix")(p.toJsFn))
    onAffixBottom.foreach(p => __obj.updateDynamic("onAffixBottom")(p.toJsFn))
    onAffixTop.foreach(p => __obj.updateDynamic("onAffixTop")(p.toJsFn))
    onAffixed.foreach(p => __obj.updateDynamic("onAffixed")(p.toJsFn))
    onAffixedBottom.foreach(p => __obj.updateDynamic("onAffixedBottom")(p.toJsFn))
    onAffixedTop.foreach(p => __obj.updateDynamic("onAffixedTop")(p.toJsFn))
    if (topClassName != null) __obj.updateDynamic("topClassName")(topClassName.asInstanceOf[js.Any])
    if (topStyle != null) __obj.updateDynamic("topStyle")(topStyle.asInstanceOf[js.Any])
    if (viewportOffsetTop != null) __obj.updateDynamic("viewportOffsetTop")(viewportOffsetTop.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOverlays.autoAffixMod.AutoAffixProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOverlays.mod.AutoAffix](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOverlays.autoAffixMod.AutoAffixProps])(children: _*)
  }
  @JSImport("react-overlays", "AutoAffix")
  @js.native
  object componentImport extends js.Object
  
}

