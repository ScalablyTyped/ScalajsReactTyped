package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactToolbox.libDropdownDropdownMod.DropdownProps
import typingsJapgolly.reactToolbox.libDropdownDropdownMod.DropdownTheme
import typingsJapgolly.reactToolbox.libDropdownMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown {
  def apply(
    source: js.Array[_],
    allowBlank: js.UndefOr[Boolean] = js.undefined,
    auto: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    label: String = null,
    labelKey: String = null,
    name: String = null,
    onBlur: js.Function = null,
    onChange: js.Function = null,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onFocus: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    required: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    template: js.Function = null,
    theme: DropdownTheme = null,
    value: String | Double = null,
    valueKey: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DropdownProps, default, Unit, DropdownProps] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
      if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank.asInstanceOf[js.Any])
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToolbox.libDropdownDropdownMod.DropdownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToolbox.libDropdownMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToolbox.libDropdownDropdownMod.DropdownProps])(children: _*)
  }
  @JSImport("react-toolbox/lib/dropdown", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

