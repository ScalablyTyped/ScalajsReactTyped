package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonActivePath
import typingsJapgolly.baseui.spinnerMod.SpinnerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Spinner {
  def apply(
    color: String = null,
    overrides: AnonActivePath = null,
    size: Double | String = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SpinnerProps, typingsJapgolly.baseui.spinnerMod.Spinner, Unit, SpinnerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.spinnerMod.SpinnerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.spinnerMod.Spinner](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.spinnerMod.SpinnerProps])(children: _*)
  }
  @JSImport("baseui/spinner", "Spinner")
  @js.native
  object componentImport extends js.Object
  
}

