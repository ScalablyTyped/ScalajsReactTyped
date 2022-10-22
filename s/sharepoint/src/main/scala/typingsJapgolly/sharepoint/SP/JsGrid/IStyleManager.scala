package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Cell
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.GridPane
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Header
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typingsJapgolly.sharepoint.SP.JsGrid.IStyleType.Widget
import typingsJapgolly.sharepoint.anon.AllSelected
import typingsJapgolly.sharepoint.anon.Dra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStyleManager extends StObject {
  
  def GetCellStyle(styleId: String): Cell
  
  def RegisterCellStyle(styleId: String, cellStyle: Cell): Unit
  
  def UpdateDefaultCellStyleFromCss(styleObject: Cell, cssClass: String): Unit
  
  def UpdateGridPaneStyleFromCss(styleObject: GridPane, gridStyleNameCollection: Any): Unit
  
  def UpdateGroupStylesFromCss(styleObject: Cell, prefix: String): Unit
  
  def UpdateHeaderStyleFromCss(styleObject: Header, headerStyleNameCol: Any): Unit
  
  def UpdateSplitterStyleFromCss(styleObject: Splitter, splitterStyleNameCollection: Any): Unit
  
  var columnHeaderStyleCollection: AllSelected
  
  var defaultCellStyle: Cell
  
  var gridPaneStyle: GridPane
  
  var groupingStyles: js.Array[Any]
  
  var readOnlyCellStyle: Cell
  
  var readOnlyFocusedCellStyle: Cell
  
  var rowHeaderStyleCollection: AllSelected
  
  var splitterStyleCollection: Dra
  
  var timescaleTierStyle: TimescaleTier
  
  var widgetDockHoverStyle: Widget
  
  var widgetDockPressedStyle: Widget
  
  var widgetDockStyle: Widget
}
object IStyleManager {
  
  inline def apply(
    GetCellStyle: String => Cell,
    RegisterCellStyle: (String, Cell) => Callback,
    UpdateDefaultCellStyleFromCss: (Cell, String) => Callback,
    UpdateGridPaneStyleFromCss: (GridPane, Any) => Callback,
    UpdateGroupStylesFromCss: (Cell, String) => Callback,
    UpdateHeaderStyleFromCss: (Header, Any) => Callback,
    UpdateSplitterStyleFromCss: (Splitter, Any) => Callback,
    columnHeaderStyleCollection: AllSelected,
    defaultCellStyle: Cell,
    gridPaneStyle: GridPane,
    groupingStyles: js.Array[Any],
    readOnlyCellStyle: Cell,
    readOnlyFocusedCellStyle: Cell,
    rowHeaderStyleCollection: AllSelected,
    splitterStyleCollection: Dra,
    timescaleTierStyle: TimescaleTier,
    widgetDockHoverStyle: Widget,
    widgetDockPressedStyle: Widget,
    widgetDockStyle: Widget
  ): IStyleManager = {
    val __obj = js.Dynamic.literal(GetCellStyle = js.Any.fromFunction1(GetCellStyle), RegisterCellStyle = js.Any.fromFunction2((t0: String, t1: Cell) => (RegisterCellStyle(t0, t1)).runNow()), UpdateDefaultCellStyleFromCss = js.Any.fromFunction2((t0: Cell, t1: String) => (UpdateDefaultCellStyleFromCss(t0, t1)).runNow()), UpdateGridPaneStyleFromCss = js.Any.fromFunction2((t0: GridPane, t1: Any) => (UpdateGridPaneStyleFromCss(t0, t1)).runNow()), UpdateGroupStylesFromCss = js.Any.fromFunction2((t0: Cell, t1: String) => (UpdateGroupStylesFromCss(t0, t1)).runNow()), UpdateHeaderStyleFromCss = js.Any.fromFunction2((t0: Header, t1: Any) => (UpdateHeaderStyleFromCss(t0, t1)).runNow()), UpdateSplitterStyleFromCss = js.Any.fromFunction2((t0: Splitter, t1: Any) => (UpdateSplitterStyleFromCss(t0, t1)).runNow()), columnHeaderStyleCollection = columnHeaderStyleCollection.asInstanceOf[js.Any], defaultCellStyle = defaultCellStyle.asInstanceOf[js.Any], gridPaneStyle = gridPaneStyle.asInstanceOf[js.Any], groupingStyles = groupingStyles.asInstanceOf[js.Any], readOnlyCellStyle = readOnlyCellStyle.asInstanceOf[js.Any], readOnlyFocusedCellStyle = readOnlyFocusedCellStyle.asInstanceOf[js.Any], rowHeaderStyleCollection = rowHeaderStyleCollection.asInstanceOf[js.Any], splitterStyleCollection = splitterStyleCollection.asInstanceOf[js.Any], timescaleTierStyle = timescaleTierStyle.asInstanceOf[js.Any], widgetDockHoverStyle = widgetDockHoverStyle.asInstanceOf[js.Any], widgetDockPressedStyle = widgetDockPressedStyle.asInstanceOf[js.Any], widgetDockStyle = widgetDockStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleManager]
  }
  
  extension [Self <: IStyleManager](x: Self) {
    
    inline def setColumnHeaderStyleCollection(value: AllSelected): Self = StObject.set(x, "columnHeaderStyleCollection", value.asInstanceOf[js.Any])
    
    inline def setDefaultCellStyle(value: Cell): Self = StObject.set(x, "defaultCellStyle", value.asInstanceOf[js.Any])
    
    inline def setGetCellStyle(value: String => Cell): Self = StObject.set(x, "GetCellStyle", js.Any.fromFunction1(value))
    
    inline def setGridPaneStyle(value: GridPane): Self = StObject.set(x, "gridPaneStyle", value.asInstanceOf[js.Any])
    
    inline def setGroupingStyles(value: js.Array[Any]): Self = StObject.set(x, "groupingStyles", value.asInstanceOf[js.Any])
    
    inline def setGroupingStylesVarargs(value: Any*): Self = StObject.set(x, "groupingStyles", js.Array(value*))
    
    inline def setReadOnlyCellStyle(value: Cell): Self = StObject.set(x, "readOnlyCellStyle", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyFocusedCellStyle(value: Cell): Self = StObject.set(x, "readOnlyFocusedCellStyle", value.asInstanceOf[js.Any])
    
    inline def setRegisterCellStyle(value: (String, Cell) => Callback): Self = StObject.set(x, "RegisterCellStyle", js.Any.fromFunction2((t0: String, t1: Cell) => (value(t0, t1)).runNow()))
    
    inline def setRowHeaderStyleCollection(value: AllSelected): Self = StObject.set(x, "rowHeaderStyleCollection", value.asInstanceOf[js.Any])
    
    inline def setSplitterStyleCollection(value: Dra): Self = StObject.set(x, "splitterStyleCollection", value.asInstanceOf[js.Any])
    
    inline def setTimescaleTierStyle(value: TimescaleTier): Self = StObject.set(x, "timescaleTierStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateDefaultCellStyleFromCss(value: (Cell, String) => Callback): Self = StObject.set(x, "UpdateDefaultCellStyleFromCss", js.Any.fromFunction2((t0: Cell, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setUpdateGridPaneStyleFromCss(value: (GridPane, Any) => Callback): Self = StObject.set(x, "UpdateGridPaneStyleFromCss", js.Any.fromFunction2((t0: GridPane, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setUpdateGroupStylesFromCss(value: (Cell, String) => Callback): Self = StObject.set(x, "UpdateGroupStylesFromCss", js.Any.fromFunction2((t0: Cell, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setUpdateHeaderStyleFromCss(value: (Header, Any) => Callback): Self = StObject.set(x, "UpdateHeaderStyleFromCss", js.Any.fromFunction2((t0: Header, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setUpdateSplitterStyleFromCss(value: (Splitter, Any) => Callback): Self = StObject.set(x, "UpdateSplitterStyleFromCss", js.Any.fromFunction2((t0: Splitter, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setWidgetDockHoverStyle(value: Widget): Self = StObject.set(x, "widgetDockHoverStyle", value.asInstanceOf[js.Any])
    
    inline def setWidgetDockPressedStyle(value: Widget): Self = StObject.set(x, "widgetDockPressedStyle", value.asInstanceOf[js.Any])
    
    inline def setWidgetDockStyle(value: Widget): Self = StObject.set(x, "widgetDockStyle", value.asInstanceOf[js.Any])
  }
}
