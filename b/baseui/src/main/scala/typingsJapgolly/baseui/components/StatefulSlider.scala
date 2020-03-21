package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.sliderMod.SliderOverrides
import typingsJapgolly.baseui.sliderMod.State
import typingsJapgolly.baseui.sliderMod.StatefulSliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulSlider {
  def apply(
    initialState: State = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* e */ State => CallbackTo[js.Any] = null,
    onFinalChange: /* e */ State => CallbackTo[js.Any] = null,
    overrides: SliderOverrides = null,
    step: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    StatefulSliderProps, 
    MountedWithRawType[StatefulSliderProps, js.Object, RawMounted[StatefulSliderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.baseui.sliderMod.State) => onChange(t0).runNow()))
    if (onFinalChange != null) __obj.updateDynamic("onFinalChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.baseui.sliderMod.State) => onFinalChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.sliderMod.StatefulSliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.sliderMod.StatefulSliderProps])(children: _*)
  }
  @JSImport("baseui/slider", "StatefulSlider")
  @js.native
  object componentImport extends js.Object
  
}

