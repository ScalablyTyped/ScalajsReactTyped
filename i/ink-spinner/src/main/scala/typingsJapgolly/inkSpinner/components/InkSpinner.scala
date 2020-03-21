package typingsJapgolly.inkSpinner.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cliSpinners.mod.SpinnerName
import typingsJapgolly.inkSpinner.mod.SpinnerProps
import typingsJapgolly.inkSpinner.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InkSpinner {
  def apply(
    `type`: SpinnerName = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SpinnerProps, ^, Unit, SpinnerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.inkSpinner.mod.SpinnerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.inkSpinner.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.inkSpinner.mod.SpinnerProps])(children: _*)
  }
  @JSImport("ink-spinner", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

