package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.SpinnerProps
import typingsJapgolly.reactElemental.mod.SpinnerSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Spinner {
  def apply(
    accentColor: String = null,
    duration: Int | Double = null,
    ringColor: String = null,
    size: SpinnerSize = null,
    style: CSSProperties = null,
    thickness: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SpinnerProps, typingsJapgolly.reactElemental.mod.Spinner, Unit, SpinnerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ringColor != null) __obj.updateDynamic("ringColor")(ringColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactElemental.mod.SpinnerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactElemental.mod.Spinner](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactElemental.mod.SpinnerProps])(children: _*)
  }
  @JSImport("react-elemental", "Spinner")
  @js.native
  object componentImport extends js.Object
  
}

