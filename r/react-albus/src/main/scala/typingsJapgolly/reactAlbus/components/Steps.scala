package typingsJapgolly.reactAlbus.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAlbus.mod.StepObject
import typingsJapgolly.reactAlbus.mod.StepsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps {
  def apply(
    step: StepObject = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StepsProps, typingsJapgolly.reactAlbus.mod.Steps, Unit, StepsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAlbus.mod.StepsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAlbus.mod.Steps](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAlbus.mod.StepsProps])(children: _*)
  }
  @JSImport("react-albus", "Steps")
  @js.native
  object componentImport extends js.Object
  
}

