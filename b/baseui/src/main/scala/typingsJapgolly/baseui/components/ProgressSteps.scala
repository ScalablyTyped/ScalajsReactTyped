package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.progressStepsMod.ProgressStepsOverrides
import typingsJapgolly.baseui.progressStepsMod.ProgressStepsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressSteps {
  def apply(
    current: Int | Double = null,
    overrides: ProgressStepsOverrides = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ProgressStepsProps, 
    MountedWithRawType[ProgressStepsProps, js.Object, RawMounted[ProgressStepsProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.progressStepsMod.ProgressStepsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.progressStepsMod.ProgressStepsProps])(children: _*)
  }
  @JSImport("baseui/progress-steps", "ProgressSteps")
  @js.native
  object componentImport extends js.Object
  
}

