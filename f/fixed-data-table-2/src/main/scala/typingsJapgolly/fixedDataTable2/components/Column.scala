package typingsJapgolly.fixedDataTable2.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.center
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.left
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.right
import typingsJapgolly.fixedDataTable2.mod.ColumnCellProps
import typingsJapgolly.fixedDataTable2.mod.ColumnHeaderProps
import typingsJapgolly.fixedDataTable2.mod.ColumnProps
import typingsJapgolly.fixedDataTable2.mod.ElementOrFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  def apply(
    width: Double,
    align: left | center | right = null,
    allowCellsRecycling: js.UndefOr[Boolean] = js.undefined,
    cell: ElementOrFunc[ColumnCellProps] = null,
    columnKey: String | Double = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    fixedRight: js.UndefOr[Boolean] = js.undefined,
    flexGrow: Int | Double = null,
    footer: ElementOrFunc[ColumnHeaderProps] = null,
    header: ElementOrFunc[ColumnHeaderProps] = null,
    isReorderable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    pureRendering: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ColumnProps, typingsJapgolly.fixedDataTable2.mod.Column, Unit, ColumnProps] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCellsRecycling)) __obj.updateDynamic("allowCellsRecycling")(allowCellsRecycling.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedRight)) __obj.updateDynamic("fixedRight")(fixedRight.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(isReorderable)) __obj.updateDynamic("isReorderable")(isReorderable.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(pureRendering)) __obj.updateDynamic("pureRendering")(pureRendering.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fixedDataTable2.mod.ColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fixedDataTable2.mod.Column](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fixedDataTable2.mod.ColumnProps])(children: _*)
  }
  @JSImport("fixed-data-table-2", "Column")
  @js.native
  object componentImport extends js.Object
  
}

