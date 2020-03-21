package typingsJapgolly.blueprintjsTable.rowHeaderCellMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.blueprintjsTable.headerCellMod.IHeaderCellProps
import typingsJapgolly.blueprintjsTable.resizeHandleMod.ResizeHandle
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the row is reorderable.
    */
  var enableRowReordering: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the full row is part of a selection.
    */
  var isRowSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback to override the default name rendering behavior. The default
    * behavior is to simply use the `RowHeaderCell`s name prop.
    *
    * This render callback can be used, for example, to provide a
    * `EditableName` component for editing row names.
    *
    * The callback will also receive the row index if an `index` was originally
    * provided via props.
    */
  var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], Element]] = js.undefined
}

object IRowHeaderCellProps {
  @scala.inline
  def apply(
    className: String = null,
    enableRowReordering: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isRowSelected: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[Double] => CallbackTo[Element] = null,
    name: String = null,
    nameRenderer: (/* name */ String, /* index */ js.UndefOr[Double]) => CallbackTo[Element] = null,
    reorderHandle: VdomElement = null,
    resizeHandle: ResizeHandle = null,
    style: CSSProperties = null
  ): IRowHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowReordering)) __obj.updateDynamic("enableRowReordering")(enableRowReordering.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowSelected)) __obj.updateDynamic("isRowSelected")(isRowSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => menuRenderer(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* index */ js.UndefOr[scala.Double]) => nameRenderer(t0, t1).runNow()))
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.rawElement.asInstanceOf[js.Any])
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowHeaderCellProps]
  }
}

