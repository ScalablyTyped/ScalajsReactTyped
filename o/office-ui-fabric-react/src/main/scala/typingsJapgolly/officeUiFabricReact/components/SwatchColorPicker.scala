package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typingsJapgolly.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typingsJapgolly.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.circle
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.square
import typingsJapgolly.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import typingsJapgolly.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerStyleProps
import typingsJapgolly.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwatchColorPicker {
  def apply(
    colorCells: js.Array[IColorCellProps],
    columnCount: Double,
    ariaPosInSet: Int | Double = null,
    ariaSetSize: Int | Double = null,
    cellBorderWidth: Int | Double = null,
    cellHeight: Int | Double = null,
    cellMargin: Int | Double = null,
    cellShape: circle | square = null,
    cellWidth: Int | Double = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined,
    focusOnHover: js.UndefOr[Boolean] = js.undefined,
    getColorGridCellStyles: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles] = null,
    id: String = null,
    isControlled: js.UndefOr[Boolean] = js.undefined,
    mouseLeaveParentSelector: String = null,
    onCellFocused: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Callback = null,
    onCellHovered: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Callback = null,
    onColorChanged: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Callback = null,
    positionInSet: Int | Double = null,
    selectedId: String = null,
    setSize: Int | Double = null,
    shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ISwatchColorPickerProps, 
    MountedWithRawType[ISwatchColorPickerProps, js.Object, RawMounted[ISwatchColorPickerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(colorCells = colorCells.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any])
  
      if (ariaPosInSet != null) __obj.updateDynamic("ariaPosInSet")(ariaPosInSet.asInstanceOf[js.Any])
    if (ariaSetSize != null) __obj.updateDynamic("ariaSetSize")(ariaSetSize.asInstanceOf[js.Any])
    if (cellBorderWidth != null) __obj.updateDynamic("cellBorderWidth")(cellBorderWidth.asInstanceOf[js.Any])
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellMargin != null) __obj.updateDynamic("cellMargin")(cellMargin.asInstanceOf[js.Any])
    if (cellShape != null) __obj.updateDynamic("cellShape")(cellShape.asInstanceOf[js.Any])
    if (cellWidth != null) __obj.updateDynamic("cellWidth")(cellWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotContainWithinFocusZone)) __obj.updateDynamic("doNotContainWithinFocusZone")(doNotContainWithinFocusZone.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnHover)) __obj.updateDynamic("focusOnHover")(focusOnHover.asInstanceOf[js.Any])
    if (getColorGridCellStyles != null) __obj.updateDynamic("getColorGridCellStyles")(getColorGridCellStyles.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isControlled)) __obj.updateDynamic("isControlled")(isControlled.asInstanceOf[js.Any])
    if (mouseLeaveParentSelector != null) __obj.updateDynamic("mouseLeaveParentSelector")(mouseLeaveParentSelector.asInstanceOf[js.Any])
    if (onCellFocused != null) __obj.updateDynamic("onCellFocused")(js.Any.fromFunction2((t0: /* id */ js.UndefOr[java.lang.String], t1: /* color */ js.UndefOr[java.lang.String]) => onCellFocused(t0, t1).runNow()))
    if (onCellHovered != null) __obj.updateDynamic("onCellHovered")(js.Any.fromFunction2((t0: /* id */ js.UndefOr[java.lang.String], t1: /* color */ js.UndefOr[java.lang.String]) => onCellHovered(t0, t1).runNow()))
    if (onColorChanged != null) __obj.updateDynamic("onColorChanged")(js.Any.fromFunction2((t0: /* id */ js.UndefOr[java.lang.String], t1: /* color */ js.UndefOr[java.lang.String]) => onColorChanged(t0, t1).runNow()))
    if (positionInSet != null) __obj.updateDynamic("positionInSet")(positionInSet.asInstanceOf[js.Any])
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId.asInstanceOf[js.Any])
    if (setSize != null) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusCircularNavigate)) __obj.updateDynamic("shouldFocusCircularNavigate")(shouldFocusCircularNavigate.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "SwatchColorPicker")
  @js.native
  object componentImport extends js.Object
  
}

