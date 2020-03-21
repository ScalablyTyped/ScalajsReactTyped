package typingsJapgolly.reactAnimateOnScroll.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAnimateOnScroll.mod.ScrollAnimationProps
import typingsJapgolly.reactAnimateOnScroll.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAnimateOnScroll {
  def apply(
    animateIn: String = null,
    animateOnce: js.UndefOr[Boolean] = js.undefined,
    animateOut: String = null,
    className: String = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    initiallyVisible: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    scrollableParentSelector: String = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollAnimationProps, default, Unit, ScrollAnimationProps] = {
    val __obj = js.Dynamic.literal()
  
      if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOnce)) __obj.updateDynamic("animateOnce")(animateOnce.asInstanceOf[js.Any])
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyVisible)) __obj.updateDynamic("initiallyVisible")(initiallyVisible.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scrollableParentSelector != null) __obj.updateDynamic("scrollableParentSelector")(scrollableParentSelector.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAnimateOnScroll.mod.ScrollAnimationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAnimateOnScroll.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAnimateOnScroll.mod.ScrollAnimationProps])(children: _*)
  }
  @JSImport("react-animate-on-scroll", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

