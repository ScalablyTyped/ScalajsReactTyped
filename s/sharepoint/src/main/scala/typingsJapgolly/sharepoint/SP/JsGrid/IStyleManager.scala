package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.AnonAllSelected
import typingsJapgolly.sharepoint.AnonDra
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Cell
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.GridPane
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Header
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IStyleManager extends js.Object {
  var columnHeaderStyleCollection: AnonAllSelected
  var defaultCellStyle: Cell
  var gridPaneStyle: GridPane
  var groupingStyles: js.Array[_]
  var readOnlyCellStyle: Cell
  var readOnlyFocusedCellStyle: Cell
  var rowHeaderStyleCollection: AnonAllSelected
  var splitterStyleCollection: AnonDra
  var timescaleTierStyle: TimescaleTier
  var widgetDockHoverStyle: Widget
  var widgetDockPressedStyle: Widget
  var widgetDockStyle: Widget
  def GetCellStyle(styleId: String): Cell
  def RegisterCellStyle(styleId: String, cellStyle: Cell): Unit
  def UpdateDefaultCellStyleFromCss(styleObject: Cell, cssClass: String): Unit
  def UpdateGridPaneStyleFromCss(styleObject: GridPane, gridStyleNameCollection: js.Any): Unit
  def UpdateGroupStylesFromCss(styleObject: Cell, prefix: String): Unit
  def UpdateHeaderStyleFromCss(styleObject: Header, headerStyleNameCol: js.Any): Unit
  def UpdateSplitterStyleFromCss(styleObject: Splitter, splitterStyleNameCollection: js.Any): Unit
}

object IStyleManager {
  @scala.inline
  def apply(
    GetCellStyle: String => CallbackTo[Cell],
    RegisterCellStyle: (String, Cell) => Callback,
    UpdateDefaultCellStyleFromCss: (Cell, String) => Callback,
    UpdateGridPaneStyleFromCss: (GridPane, js.Any) => Callback,
    UpdateGroupStylesFromCss: (Cell, String) => Callback,
    UpdateHeaderStyleFromCss: (Header, js.Any) => Callback,
    UpdateSplitterStyleFromCss: (Splitter, js.Any) => Callback,
    columnHeaderStyleCollection: AnonAllSelected,
    defaultCellStyle: Cell,
    gridPaneStyle: GridPane,
    groupingStyles: js.Array[_],
    readOnlyCellStyle: Cell,
    readOnlyFocusedCellStyle: Cell,
    rowHeaderStyleCollection: AnonAllSelected,
    splitterStyleCollection: AnonDra,
    timescaleTierStyle: TimescaleTier,
    widgetDockHoverStyle: Widget,
    widgetDockPressedStyle: Widget,
    widgetDockStyle: Widget
  ): IStyleManager = {
    val __obj = js.Dynamic.literal(columnHeaderStyleCollection = columnHeaderStyleCollection.asInstanceOf[js.Any], defaultCellStyle = defaultCellStyle.asInstanceOf[js.Any], gridPaneStyle = gridPaneStyle.asInstanceOf[js.Any], groupingStyles = groupingStyles.asInstanceOf[js.Any], readOnlyCellStyle = readOnlyCellStyle.asInstanceOf[js.Any], readOnlyFocusedCellStyle = readOnlyFocusedCellStyle.asInstanceOf[js.Any], rowHeaderStyleCollection = rowHeaderStyleCollection.asInstanceOf[js.Any], splitterStyleCollection = splitterStyleCollection.asInstanceOf[js.Any], timescaleTierStyle = timescaleTierStyle.asInstanceOf[js.Any], widgetDockHoverStyle = widgetDockHoverStyle.asInstanceOf[js.Any], widgetDockPressedStyle = widgetDockPressedStyle.asInstanceOf[js.Any], widgetDockStyle = widgetDockStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("GetCellStyle")(js.Any.fromFunction1((t0: java.lang.String) => GetCellStyle(t0).runNow()))
    __obj.updateDynamic("RegisterCellStyle")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Cell) => RegisterCellStyle(t0, t1).runNow()))
    __obj.updateDynamic("UpdateDefaultCellStyleFromCss")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Cell, t1: java.lang.String) => UpdateDefaultCellStyleFromCss(t0, t1).runNow()))
    __obj.updateDynamic("UpdateGridPaneStyleFromCss")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.GridPane, t1: js.Any) => UpdateGridPaneStyleFromCss(t0, t1).runNow()))
    __obj.updateDynamic("UpdateGroupStylesFromCss")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Cell, t1: java.lang.String) => UpdateGroupStylesFromCss(t0, t1).runNow()))
    __obj.updateDynamic("UpdateHeaderStyleFromCss")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Header, t1: js.Any) => UpdateHeaderStyleFromCss(t0, t1).runNow()))
    __obj.updateDynamic("UpdateSplitterStyleFromCss")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Splitter, t1: js.Any) => UpdateSplitterStyleFromCss(t0, t1).runNow()))
    __obj.asInstanceOf[IStyleManager]
  }
}

