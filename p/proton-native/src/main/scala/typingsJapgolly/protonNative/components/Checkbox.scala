package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protonNative.AnonH
import typingsJapgolly.protonNative.AnonX
import typingsJapgolly.protonNative.mod.CheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkbox {
  def apply(
    align: AnonH = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: AnonH = null,
    label: String = null,
    onToggle: /* checked */ Boolean => Callback = null,
    row: Int | Double = null,
    span: AnonX = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: String = null
  ): UnmountedWithRoot[CheckboxProps, typingsJapgolly.protonNative.mod.Checkbox, Unit, CheckboxProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => onToggle(t0).runNow()))
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.protonNative.mod.CheckboxProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.protonNative.mod.Checkbox](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.protonNative.mod.CheckboxProps])
  }
  @JSImport("proton-native", "Checkbox")
  @js.native
  object componentImport extends js.Object
  
}

