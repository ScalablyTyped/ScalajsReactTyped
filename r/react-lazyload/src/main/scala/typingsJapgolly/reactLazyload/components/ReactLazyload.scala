package typingsJapgolly.reactLazyload.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactLazyload.mod.LazyLoadProps
import typingsJapgolly.reactLazyload.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactLazyload {
  def apply(
    debounce: Double | Boolean = null,
    height: Double | String = null,
    offset: Double | js.Array[Double] = null,
    once: js.UndefOr[Boolean] = js.undefined,
    overflow: js.UndefOr[Boolean] = js.undefined,
    placeholder: VdomNode = null,
    preventLoading: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollContainer: String | Element = null,
    throttle: Double | Boolean = null,
    unmountIfInvisible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LazyLoadProps, default, Unit, LazyLoadProps] = {
    val __obj = js.Dynamic.literal()
  
      if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(preventLoading)) __obj.updateDynamic("preventLoading")(preventLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollContainer != null) __obj.updateDynamic("scrollContainer")(scrollContainer.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountIfInvisible)) __obj.updateDynamic("unmountIfInvisible")(unmountIfInvisible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLazyload.mod.LazyLoadProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLazyload.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLazyload.mod.LazyLoadProps])(children: _*)
  }
  @JSImport("react-lazyload", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

