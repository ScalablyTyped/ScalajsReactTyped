package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameAutoRefresh
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.horizontal
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Carousel {
  def apply(
    animationOptions: AnimationOptions = null,
    autoRefresh: js.UndefOr[Boolean] = js.undefined,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    autoScrollRatio: Int | Double = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    direction: horizontal | vertical = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    index: Int | Double = null,
    itemHeight: Double | String = null,
    itemWidth: Double | String = null,
    onOverscroll: js.UndefOr[Callback] = js.undefined,
    onPostChange: js.UndefOr[Callback] = js.undefined,
    onRefresh: js.UndefOr[Callback] = js.undefined,
    overscrollable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameAutoRefresh, 
    typingsJapgolly.reactOnsenui.mod.Carousel, 
    Unit, 
    HTMLAttributesidclassNameAutoRefresh
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    if (autoScrollRatio != null) __obj.updateDynamic("autoScrollRatio")(autoScrollRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    onOverscroll.foreach(p => __obj.updateDynamic("onOverscroll")(p.toJsFn))
    onPostChange.foreach(p => __obj.updateDynamic("onPostChange")(p.toJsFn))
    onRefresh.foreach(p => __obj.updateDynamic("onRefresh")(p.toJsFn))
    if (!js.isUndefined(overscrollable)) __obj.updateDynamic("overscrollable")(overscrollable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameAutoRefresh, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.Carousel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameAutoRefresh])(children: _*)
  }
  @JSImport("react-onsenui", "Carousel")
  @js.native
  object componentImport extends js.Object
  
}

