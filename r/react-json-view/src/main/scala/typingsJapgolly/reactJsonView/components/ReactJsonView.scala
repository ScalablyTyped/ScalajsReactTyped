package typingsJapgolly.reactJsonView.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactJsonView.mod.CollapsedFieldProps
import typingsJapgolly.reactJsonView.mod.InteractionProps
import typingsJapgolly.reactJsonView.mod.OnCopyProps
import typingsJapgolly.reactJsonView.mod.OnSelectProps
import typingsJapgolly.reactJsonView.mod.ReactJsonViewProps
import typingsJapgolly.reactJsonView.mod.ThemeKeys
import typingsJapgolly.reactJsonView.mod.ThemeObject
import typingsJapgolly.reactJsonView.mod.TypeDefaultValue
import typingsJapgolly.reactJsonView.mod.default
import typingsJapgolly.reactJsonView.reactJsonViewBooleans.`false`
import typingsJapgolly.reactJsonView.reactJsonViewStrings.circle
import typingsJapgolly.reactJsonView.reactJsonViewStrings.square
import typingsJapgolly.reactJsonView.reactJsonViewStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJsonView {
  def apply(
    src: js.Object,
    collapseStringsAfterLength: Double | `false` = null,
    collapsed: Boolean | Double = null,
    defaultValue: TypeDefaultValue | js.Array[TypeDefaultValue] = null,
    displayDataTypes: js.UndefOr[Boolean] = js.undefined,
    displayObjectSize: js.UndefOr[Boolean] = js.undefined,
    enableClipboard: Boolean | (js.Function1[/* copy */ OnCopyProps, Unit]) = null,
    groupArraysAfterLength: Int | Double = null,
    iconStyle: circle | triangle | square = null,
    indentWidth: Int | Double = null,
    name: String | `false` = null,
    onAdd: (js.Function1[/* add */ InteractionProps, `false` | _]) | `false` = null,
    onDelete: (js.Function1[/* del */ InteractionProps, `false` | _]) | `false` = null,
    onEdit: (js.Function1[/* edit */ InteractionProps, `false` | _]) | `false` = null,
    onSelect: (js.Function1[/* select */ OnSelectProps, Unit]) | `false` = null,
    shouldCollapse: `false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean]) = null,
    sortKeys: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    theme: ThemeKeys | ThemeObject = null,
    validationMessage: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactJsonViewProps, default, Unit, ReactJsonViewProps] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      if (collapseStringsAfterLength != null) __obj.updateDynamic("collapseStringsAfterLength")(collapseStringsAfterLength.asInstanceOf[js.Any])
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDataTypes)) __obj.updateDynamic("displayDataTypes")(displayDataTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(displayObjectSize)) __obj.updateDynamic("displayObjectSize")(displayObjectSize.asInstanceOf[js.Any])
    if (enableClipboard != null) __obj.updateDynamic("enableClipboard")(enableClipboard.asInstanceOf[js.Any])
    if (groupArraysAfterLength != null) __obj.updateDynamic("groupArraysAfterLength")(groupArraysAfterLength.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onEdit != null) __obj.updateDynamic("onEdit")(onEdit.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (shouldCollapse != null) __obj.updateDynamic("shouldCollapse")(shouldCollapse.asInstanceOf[js.Any])
    if (!js.isUndefined(sortKeys)) __obj.updateDynamic("sortKeys")(sortKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactJsonView.mod.ReactJsonViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactJsonView.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactJsonView.mod.ReactJsonViewProps])(children: _*)
  }
  @JSImport("react-json-view", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

