package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.formControlMod.FormControlOverrides
import typingsJapgolly.baseui.formControlMod.FormControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormControl {
  def apply(
    caption: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: Boolean | Node = null,
    label: VdomNode = null,
    overrides: FormControlOverrides = null,
    positive: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FormControlProps, 
    typingsJapgolly.baseui.formControlMod.FormControl, 
    Unit, 
    FormControlProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (caption != null) __obj.updateDynamic("caption")(caption.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (positive != null) __obj.updateDynamic("positive")(positive.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.formControlMod.FormControlProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.formControlMod.FormControl](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.formControlMod.FormControlProps])(children: _*)
  }
  @JSImport("baseui/form-control", "FormControl")
  @js.native
  object componentImport extends js.Object
  
}

