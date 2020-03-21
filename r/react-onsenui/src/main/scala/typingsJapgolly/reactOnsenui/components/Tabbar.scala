package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameIgnoreEdgeWidth
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.mod.TabbarRenderTab
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.auto
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.bottom
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.slide
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabbar {
  def apply(
    index: Double,
    renderTabs: CallbackTo[js.Array[TabbarRenderTab]],
    animation: none | slide = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    id: String = null,
    ignoreEdgeWidth: Int | Double = null,
    onPostChange: js.UndefOr[Callback] = js.undefined,
    onPreChange: js.UndefOr[Callback] = js.undefined,
    onReactive: js.UndefOr[Callback] = js.undefined,
    onSwipe: (/* index */ Double, /* animationOptions */ AnimationOptions) => Callback = null,
    position: bottom | top | auto = null,
    style: CSSProperties = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBorder: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameIgnoreEdgeWidth, 
    typingsJapgolly.reactOnsenui.mod.Tabbar, 
    Unit, 
    HTMLAttributesidclassNameIgnoreEdgeWidth
  ] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
  
      __obj.updateDynamic("renderTabs")(renderTabs.toJsFn)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoreEdgeWidth != null) __obj.updateDynamic("ignoreEdgeWidth")(ignoreEdgeWidth.asInstanceOf[js.Any])
    onPostChange.foreach(p => __obj.updateDynamic("onPostChange")(p.toJsFn))
    onPreChange.foreach(p => __obj.updateDynamic("onPreChange")(p.toJsFn))
    onReactive.foreach(p => __obj.updateDynamic("onReactive")(p.toJsFn))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* animationOptions */ typingsJapgolly.reactOnsenui.mod.AnimationOptions) => onSwipe(t0, t1).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBorder)) __obj.updateDynamic("tabBorder")(tabBorder.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameIgnoreEdgeWidth, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.Tabbar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameIgnoreEdgeWidth])(children: _*)
  }
  @JSImport("react-onsenui", "Tabbar")
  @js.native
  object componentImport extends js.Object
  
}

