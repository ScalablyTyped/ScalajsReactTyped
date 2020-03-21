package typingsJapgolly.reactWow.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactWow.mod.ReactWOWProps
import typingsJapgolly.reactWow.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactWow {
  def apply(
    animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any,
    animateClass: String = null,
    callback: js.UndefOr[Callback] = js.undefined,
    delay: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    iteration: String = null,
    offset: Double | js.Array[Double] = null,
    overflow: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactWOWProps, default, Unit, ReactWOWProps] = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
  
      if (animateClass != null) __obj.updateDynamic("animateClass")(animateClass.asInstanceOf[js.Any])
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (iteration != null) __obj.updateDynamic("iteration")(iteration.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactWow.mod.ReactWOWProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactWow.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactWow.mod.ReactWOWProps])(children: _*)
  }
  @JSImport("react-wow", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

