package typingsJapgolly.blueprintjsTable.headerCellMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.blueprintjsTable.resizeHandleMod.ResizeHandle
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInternalHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the cell is selected.
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object IInternalHeaderCellProps {
  @scala.inline
  def apply(
    className: String = null,
    index: Int | Double = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[Double] => CallbackTo[Element] = null,
    name: String = null,
    reorderHandle: VdomElement = null,
    resizeHandle: ResizeHandle = null,
    style: CSSProperties = null
  ): IInternalHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => menuRenderer(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.rawElement.asInstanceOf[js.Any])
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInternalHeaderCellProps]
  }
}

