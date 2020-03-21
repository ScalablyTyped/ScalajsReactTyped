package typingsJapgolly.blueprintjsTable.columnHeaderCellMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import typingsJapgolly.blueprintjsTable.headerCellMod.IHeaderCellProps
import typingsJapgolly.blueprintjsTable.resizeHandleMod.ResizeHandle
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.blueprintjsTable.columnHeaderCellMod.IColumnNameProps because var conflicts: name. Inlined nameRenderer */ trait IColumnHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the column is reorderable.
    */
  var enableColumnReordering: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies if the full column is part of a selection.
    */
  var isColumnSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * The icon name or element for the header's menu button.
    * @default "chevron-down"
    */
  var menuIcon: js.UndefOr[IconName | Element] = js.undefined
  /**
    * A callback to override the default name rendering behavior. The default
    * behavior is to simply use the `ColumnHeaderCell`s name prop.
    *
    * This render callback can be used, for example, to provide a
    * `EditableName` component for editing column names.
    *
    * If you define this callback, we recommend you also set
    * `<Table enableColumnInteractionBar={true}>` to avoid issues with menus or selection.
    *
    * The callback will also receive the column index if an `index` was originally
    * provided via props.
    */
  var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], Element]] = js.undefined
}

object IColumnHeaderCellProps {
  @scala.inline
  def apply(
    className: String = null,
    enableColumnReordering: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isColumnSelected: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuIcon: IconName | Element = null,
    menuRenderer: /* index */ js.UndefOr[Double] => CallbackTo[Element] = null,
    name: String = null,
    nameRenderer: (/* name */ String, /* index */ js.UndefOr[Double]) => CallbackTo[Element] = null,
    reorderHandle: VdomElement = null,
    resizeHandle: ResizeHandle = null,
    style: CSSProperties = null
  ): IColumnHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnReordering)) __obj.updateDynamic("enableColumnReordering")(enableColumnReordering.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnSelected)) __obj.updateDynamic("isColumnSelected")(isColumnSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (menuIcon != null) __obj.updateDynamic("menuIcon")(menuIcon.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => menuRenderer(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* index */ js.UndefOr[scala.Double]) => nameRenderer(t0, t1).runNow()))
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.rawElement.asInstanceOf[js.Any])
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnHeaderCellProps]
  }
}

