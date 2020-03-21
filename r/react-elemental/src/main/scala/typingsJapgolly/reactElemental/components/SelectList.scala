package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.AnonLabel
import typingsJapgolly.reactElemental.mod.SelectListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectList {
  def apply(
    error: String = null,
    height: Int | Double = null,
    onChange: /* value */ String => Callback = null,
    options: js.Array[AnonLabel] = null,
    placeholder: String = null,
    style: CSSProperties = null,
    width: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SelectListProps, typingsJapgolly.reactElemental.mod.SelectList, Unit, SelectListProps] = {
    val __obj = js.Dynamic.literal()
  
      if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactElemental.mod.SelectListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactElemental.mod.SelectList](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactElemental.mod.SelectListProps])(children: _*)
  }
  @JSImport("react-elemental", "SelectList")
  @js.native
  object componentImport extends js.Object
  
}

