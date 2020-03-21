package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.progressBarMod.ProgressBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressBar {
  def apply(
    className: String = null,
    displayValueTemplate: /* value */ js.Any => CallbackTo[Element] = null,
    id: String = null,
    mode: String = null,
    showValue: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    unit: String = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProgressBarProps, 
    typingsJapgolly.primereact.primereactProgressbarMod.ProgressBar, 
    Unit, 
    ProgressBarProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (displayValueTemplate != null) __obj.updateDynamic("displayValueTemplate")(js.Any.fromFunction1((t0: /* value */ js.Any) => displayValueTemplate(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.progressBarMod.ProgressBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactProgressbarMod.ProgressBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.progressBarMod.ProgressBarProps])(children: _*)
  }
  @JSImport("primereact/progressbar", "ProgressBar")
  @js.native
  object componentImport extends js.Object
  
}

