package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.Table.TableBodyProps
import typingsJapgolly.materialDashUi.tableTableBodyMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBody {
  def apply(
    allRowsSelected: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    deselectOnClickaway: js.UndefOr[Boolean] = js.undefined,
    displayRowCheckbox: js.UndefOr[Boolean] = js.undefined,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* row */ Double, /* column */ Double) => Callback = null,
    onCellHover: (/* row */ Double, /* column */ Double) => Callback = null,
    onCellHoverExit: (/* row */ Double, /* column */ Double) => Callback = null,
    onRowHover: /* row */ Double => Callback = null,
    onRowHoverExit: /* row */ Double => Callback = null,
    onRowSelection: /* selectedRows */ js.Array[Double] | String => Callback = null,
    preScanRows: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showRowHover: js.UndefOr[Boolean] = js.undefined,
    stripedRows: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableBodyProps, default, Unit, TableBodyProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(deselectOnClickaway)) __obj.updateDynamic("deselectOnClickaway")(deselectOnClickaway.asInstanceOf[js.Any])
    if (!js.isUndefined(displayRowCheckbox)) __obj.updateDynamic("displayRowCheckbox")(displayRowCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellClick(t0, t1).runNow()))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellHover(t0, t1).runNow()))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellHoverExit(t0, t1).runNow()))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction1((t0: /* row */ scala.Double) => onRowHover(t0).runNow()))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction1((t0: /* row */ scala.Double) => onRowHoverExit(t0).runNow()))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1((t0: /* selectedRows */ js.Array[scala.Double] | java.lang.String) => onRowSelection(t0).runNow()))
    if (!js.isUndefined(preScanRows)) __obj.updateDynamic("preScanRows")(preScanRows.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowHover)) __obj.updateDynamic("showRowHover")(showRowHover.asInstanceOf[js.Any])
    if (!js.isUndefined(stripedRows)) __obj.updateDynamic("stripedRows")(stripedRows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.Table.TableBodyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.tableTableBodyMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.Table.TableBodyProps])(children: _*)
  }
  @JSImport("material-ui/Table/TableBody", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

