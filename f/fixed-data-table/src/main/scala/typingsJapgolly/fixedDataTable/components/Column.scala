package typingsJapgolly.fixedDataTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fixedDataTable.mod.CellProps
import typingsJapgolly.fixedDataTable.mod.ColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  def apply(
    width: Double,
    align: String = null,
    allowCellsRecycling: js.UndefOr[Boolean] = js.undefined,
    cell: String | Element | (js.Function1[/* props */ CellProps, String | Element]) = null,
    columnKey: String | Double = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    flexGrow: Int | Double = null,
    footer: String | Element | (js.Function1[/* props */ CellProps, String | Element]) = null,
    header: String | Element | (js.Function1[/* props */ CellProps, String | Element]) = null,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ColumnProps, typingsJapgolly.fixedDataTable.mod.Column, Unit, ColumnProps] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCellsRecycling)) __obj.updateDynamic("allowCellsRecycling")(allowCellsRecycling.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fixedDataTable.mod.ColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fixedDataTable.mod.Column](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fixedDataTable.mod.ColumnProps])(children: _*)
  }
  @JSImport("fixed-data-table", "Column")
  @js.native
  object componentImport extends js.Object
  
}

