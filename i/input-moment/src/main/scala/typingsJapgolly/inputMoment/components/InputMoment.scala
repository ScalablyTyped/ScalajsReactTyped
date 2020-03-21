package typingsJapgolly.inputMoment.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.inputMoment.mod.InputMomentProps
import typingsJapgolly.inputMoment.mod.default
import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputMoment {
  def apply(
    moment: Moment,
    hourStep: Int | Double = null,
    minStep: Int | Double = null,
    nextMonthIcon: String = null,
    onChange: /* m */ Moment => Callback = null,
    onSave: js.UndefOr[Callback] = js.undefined,
    prevMonthIcon: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[InputMomentProps, default, Unit, InputMomentProps] = {
    val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
  
      if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (minStep != null) __obj.updateDynamic("minStep")(minStep.asInstanceOf[js.Any])
    if (nextMonthIcon != null) __obj.updateDynamic("nextMonthIcon")(nextMonthIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* m */ typingsJapgolly.moment.mod.Moment) => onChange(t0).runNow()))
    onSave.foreach(p => __obj.updateDynamic("onSave")(p.toJsFn))
    if (prevMonthIcon != null) __obj.updateDynamic("prevMonthIcon")(prevMonthIcon.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.inputMoment.mod.InputMomentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.inputMoment.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.inputMoment.mod.InputMomentProps])(children: _*)
  }
  @JSImport("input-moment", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

