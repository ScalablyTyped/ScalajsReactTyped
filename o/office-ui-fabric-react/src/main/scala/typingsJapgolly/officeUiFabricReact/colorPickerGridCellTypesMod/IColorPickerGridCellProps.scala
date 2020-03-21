package typingsJapgolly.officeUiFabricReact.colorPickerGridCellTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerGridCellProps extends js.Object {
  /**
    * Width of the border that indicates a selected/hovered cell, in pixels.
    * @defaultvalue 2 if `cellWidth` is less than 24; otherwise 4
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * True if this cell should be rendered as a circle, false if it should be a square.
    * @default `true` (render as circle)
    */
  var circle: js.UndefOr[Boolean] = js.undefined
  /**
    * The CSS-compatible string to describe the color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Whether this cell should be disabled
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Height of the cell, in pixels
    * @defaultvalue 20
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Used as a PREFIX for the cell's ID (the cell will not have this literal string as its ID).
    * @deprecated Deprecated due to misleading name. Use `idPrefix` instead.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Prefix for this cell's ID. Will be required in a future version once `id` is removed.
    */
  var idPrefix: js.UndefOr[String] = js.undefined
  /**
    * Index for this option
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Item to render
    */
  var item: IColorCellProps
  /**
    * Tooltip and aria label for this item
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Handler for when a color cell is clicked.
    */
  var onClick: js.UndefOr[js.Function1[/* item */ IColorCellProps, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* item */ IColorCellProps, Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[IColorCellProps], Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ ReactKeyboardEventFrom[HTMLButtonElement], Unit]] = js.undefined
  /**
    * Mouse enter handler. Returns true if the event should be processed, false otherwise.
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Boolean]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  /**
    * Mouse move handler. Returns true if the event should be processed, false otherwise.
    */
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Boolean]] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  /**
    * Whether this cell is currently selected
    */
  var selected: Boolean
  /**
    * Custom styles for the component.
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.undefined
  /**
    * The theme object to use for styling.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Width of the cell, in pixels
    * @defaultvalue 20
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IColorPickerGridCellProps {
  @scala.inline
  def apply(
    item: IColorCellProps,
    selected: Boolean,
    borderWidth: Int | Double = null,
    circle: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    id: String = null,
    idPrefix: String = null,
    index: Int | Double = null,
    label: String = null,
    onClick: /* item */ IColorCellProps => Callback = null,
    onFocus: /* item */ IColorCellProps => Callback = null,
    onHover: /* item */ js.UndefOr[IColorCellProps] => Callback = null,
    onKeyDown: /* ev */ ReactKeyboardEventFrom[HTMLButtonElement] => Callback = null,
    onMouseEnter: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => CallbackTo[Boolean] = null,
    onMouseLeave: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    onMouseMove: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => CallbackTo[Boolean] = null,
    onWheel: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    styles: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles] = null,
    theme: ITheme = null,
    width: Int | Double = null
  ): IColorPickerGridCellProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps) => onClick(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps) => onFocus(t0).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[typingsJapgolly.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps]) => onHover(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onKeyDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onMouseMove(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onWheel(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerGridCellProps]
  }
}

