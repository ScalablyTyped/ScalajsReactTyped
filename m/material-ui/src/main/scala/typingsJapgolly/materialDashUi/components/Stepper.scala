package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.Stepper.StepperProps
import typingsJapgolly.materialDashUi.materialDashUiStrings.horizontal
import typingsJapgolly.materialDashUi.materialDashUiStrings.vertical
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stepper {
  def apply(
    activeStep: Int | Double = null,
    linear: js.UndefOr[Boolean] = js.undefined,
    orientation: horizontal | vertical = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StepperProps, typingsJapgolly.materialDashUi.stepperMod.Stepper, Unit, StepperProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeStep != null) __obj.updateDynamic("activeStep")(activeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(linear)) __obj.updateDynamic("linear")(linear.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.Stepper.StepperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.stepperMod.Stepper](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.Stepper.StepperProps])(children: _*)
  }
  @JSImport("material-ui/Stepper", "Stepper")
  @js.native
  object componentImport extends js.Object
  
}

