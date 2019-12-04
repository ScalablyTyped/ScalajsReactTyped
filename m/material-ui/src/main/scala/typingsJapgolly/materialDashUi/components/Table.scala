package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.Table.TableProps
import typingsJapgolly.materialDashUi.materialDashUiStrings.all
import typingsJapgolly.materialDashUi.tableMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  def apply(
    allRowsSelected: js.UndefOr[Boolean] = js.undefined,
    bodyStyle: CSSProperties = null,
    className: String = null,
    fixedFooter: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    footerStyle: CSSProperties = null,
    headerStyle: CSSProperties = null,
    height: String = null,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* row */ Double, /* column */ Double) => Callback = null,
    onCellHover: (/* row */ Double, /* column */ Double) => Callback = null,
    onCellHoverExit: (/* row */ Double, /* column */ Double) => Callback = null,
    onRowHover: /* row */ Double => Callback = null,
    onRowHoverExit: /* row */ Double => Callback = null,
    onRowSelection: /* selectedRows */ js.Array[Double] | all => Callback = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    wrapperStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableProps, default, Unit, TableProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedFooter)) __obj.updateDynamic("fixedFooter")(fixedFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellClick(t0, t1).runNow()))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellHover(t0, t1).runNow()))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellHoverExit(t0, t1).runNow()))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction1((t0: /* row */ scala.Double) => onRowHover(t0).runNow()))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction1((t0: /* row */ scala.Double) => onRowHoverExit(t0).runNow()))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1((t0: /* selectedRows */ js.Array[scala.Double] | typingsJapgolly.materialDashUi.materialDashUiStrings.all) => onRowSelection(t0).runNow()))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.Table.TableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.tableMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.Table.TableProps])(children: _*)
  }
  @JSImport("material-ui/Table", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

