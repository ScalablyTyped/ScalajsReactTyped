package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramOptions extends StObject {
  
  var add: js.UndefOr[js.Function1[/* e */ DiagramAddEvent, Unit]] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var cancel: js.UndefOr[js.Function1[/* e */ DiagramCancelEvent, Unit]] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ DiagramChangeEvent, Unit]] = js.undefined
  
  var click: js.UndefOr[js.Function1[/* e */ DiagramClickEvent, Unit]] = js.undefined
  
  var connectionDefaults: js.UndefOr[DiagramConnectionDefaults] = js.undefined
  
  var connections: js.UndefOr[js.Array[DiagramConnection]] = js.undefined
  
  var connectionsDataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ DiagramDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ DiagramDragEvent, Unit]] = js.undefined
  
  var dragEnd: js.UndefOr[js.Function1[/* e */ DiagramDragEndEvent, Unit]] = js.undefined
  
  var dragStart: js.UndefOr[js.Function1[/* e */ DiagramDragStartEvent, Unit]] = js.undefined
  
  var edit: js.UndefOr[js.Function1[/* e */ DiagramEditEvent, Unit]] = js.undefined
  
  var editable: js.UndefOr[Boolean | DiagramEditable] = js.undefined
  
  var itemBoundsChange: js.UndefOr[js.Function1[/* e */ DiagramItemBoundsChangeEvent, Unit]] = js.undefined
  
  var itemRotate: js.UndefOr[js.Function1[/* e */ DiagramItemRotateEvent, Unit]] = js.undefined
  
  var layout: js.UndefOr[DiagramLayout] = js.undefined
  
  var mouseEnter: js.UndefOr[js.Function1[/* e */ DiagramMouseEnterEvent, Unit]] = js.undefined
  
  var mouseLeave: js.UndefOr[js.Function1[/* e */ DiagramMouseLeaveEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pan: js.UndefOr[js.Function1[/* e */ DiagramPanEvent, Unit]] = js.undefined
  
  var pannable: js.UndefOr[Boolean | DiagramPannable] = js.undefined
  
  var pdf: js.UndefOr[DiagramPdf] = js.undefined
  
  var remove: js.UndefOr[js.Function1[/* e */ DiagramRemoveEvent, Unit]] = js.undefined
  
  var save: js.UndefOr[js.Function1[/* e */ DiagramSaveEvent, Unit]] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ DiagramSelectEvent, Unit]] = js.undefined
  
  var selectable: js.UndefOr[Boolean | DiagramSelectable] = js.undefined
  
  var shapeDefaults: js.UndefOr[DiagramShapeDefaults] = js.undefined
  
  var shapes: js.UndefOr[js.Array[DiagramShape]] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var toolBarClick: js.UndefOr[js.Function1[/* e */ DiagramToolBarClickEvent, Unit]] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
  
  var zoomEnd: js.UndefOr[js.Function1[/* e */ DiagramZoomEndEvent, Unit]] = js.undefined
  
  var zoomMax: js.UndefOr[Double] = js.undefined
  
  var zoomMin: js.UndefOr[Double] = js.undefined
  
  var zoomRate: js.UndefOr[Double] = js.undefined
  
  var zoomStart: js.UndefOr[js.Function1[/* e */ DiagramZoomStartEvent, Unit]] = js.undefined
}
object DiagramOptions {
  
  inline def apply(): DiagramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramOptions]
  }
  
  extension [Self <: DiagramOptions](x: Self) {
    
    inline def setAdd(value: /* e */ DiagramAddEvent => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: /* e */ DiagramAddEvent) => value(t0).runNow()))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setCancel(value: /* e */ DiagramCancelEvent => Callback): Self = StObject.set(x, "cancel", js.Any.fromFunction1((t0: /* e */ DiagramCancelEvent) => value(t0).runNow()))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setChange(value: /* e */ DiagramChangeEvent => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* e */ DiagramChangeEvent) => value(t0).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClick(value: /* e */ DiagramClickEvent => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: /* e */ DiagramClickEvent) => value(t0).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setConnectionDefaults(value: DiagramConnectionDefaults): Self = StObject.set(x, "connectionDefaults", value.asInstanceOf[js.Any])
    
    inline def setConnectionDefaultsUndefined: Self = StObject.set(x, "connectionDefaults", js.undefined)
    
    inline def setConnections(value: js.Array[DiagramConnection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsDataSource(value: Any | DataSource): Self = StObject.set(x, "connectionsDataSource", value.asInstanceOf[js.Any])
    
    inline def setConnectionsDataSourceUndefined: Self = StObject.set(x, "connectionsDataSource", js.undefined)
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: DiagramConnection*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setDataBound(value: /* e */ DiagramDataBoundEvent => Callback): Self = StObject.set(x, "dataBound", js.Any.fromFunction1((t0: /* e */ DiagramDataBoundEvent) => value(t0).runNow()))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDrag(value: /* e */ DiagramDragEvent => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction1((t0: /* e */ DiagramDragEvent) => value(t0).runNow()))
    
    inline def setDragEnd(value: /* e */ DiagramDragEndEvent => Callback): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1((t0: /* e */ DiagramDragEndEvent) => value(t0).runNow()))
    
    inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    inline def setDragStart(value: /* e */ DiagramDragStartEvent => Callback): Self = StObject.set(x, "dragStart", js.Any.fromFunction1((t0: /* e */ DiagramDragStartEvent) => value(t0).runNow()))
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setEdit(value: /* e */ DiagramEditEvent => Callback): Self = StObject.set(x, "edit", js.Any.fromFunction1((t0: /* e */ DiagramEditEvent) => value(t0).runNow()))
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setEditable(value: Boolean | DiagramEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setItemBoundsChange(value: /* e */ DiagramItemBoundsChangeEvent => Callback): Self = StObject.set(x, "itemBoundsChange", js.Any.fromFunction1((t0: /* e */ DiagramItemBoundsChangeEvent) => value(t0).runNow()))
    
    inline def setItemBoundsChangeUndefined: Self = StObject.set(x, "itemBoundsChange", js.undefined)
    
    inline def setItemRotate(value: /* e */ DiagramItemRotateEvent => Callback): Self = StObject.set(x, "itemRotate", js.Any.fromFunction1((t0: /* e */ DiagramItemRotateEvent) => value(t0).runNow()))
    
    inline def setItemRotateUndefined: Self = StObject.set(x, "itemRotate", js.undefined)
    
    inline def setLayout(value: DiagramLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMouseEnter(value: /* e */ DiagramMouseEnterEvent => Callback): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction1((t0: /* e */ DiagramMouseEnterEvent) => value(t0).runNow()))
    
    inline def setMouseEnterUndefined: Self = StObject.set(x, "mouseEnter", js.undefined)
    
    inline def setMouseLeave(value: /* e */ DiagramMouseLeaveEvent => Callback): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction1((t0: /* e */ DiagramMouseLeaveEvent) => value(t0).runNow()))
    
    inline def setMouseLeaveUndefined: Self = StObject.set(x, "mouseLeave", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPan(value: /* e */ DiagramPanEvent => Callback): Self = StObject.set(x, "pan", js.Any.fromFunction1((t0: /* e */ DiagramPanEvent) => value(t0).runNow()))
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setPannable(value: Boolean | DiagramPannable): Self = StObject.set(x, "pannable", value.asInstanceOf[js.Any])
    
    inline def setPannableUndefined: Self = StObject.set(x, "pannable", js.undefined)
    
    inline def setPdf(value: DiagramPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setRemove(value: /* e */ DiagramRemoveEvent => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: /* e */ DiagramRemoveEvent) => value(t0).runNow()))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSave(value: /* e */ DiagramSaveEvent => Callback): Self = StObject.set(x, "save", js.Any.fromFunction1((t0: /* e */ DiagramSaveEvent) => value(t0).runNow()))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setSelect(value: /* e */ DiagramSelectEvent => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* e */ DiagramSelectEvent) => value(t0).runNow()))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectable(value: Boolean | DiagramSelectable): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setShapeDefaults(value: DiagramShapeDefaults): Self = StObject.set(x, "shapeDefaults", value.asInstanceOf[js.Any])
    
    inline def setShapeDefaultsUndefined: Self = StObject.set(x, "shapeDefaults", js.undefined)
    
    inline def setShapes(value: js.Array[DiagramShape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setShapesVarargs(value: DiagramShape*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setToolBarClick(value: /* e */ DiagramToolBarClickEvent => Callback): Self = StObject.set(x, "toolBarClick", js.Any.fromFunction1((t0: /* e */ DiagramToolBarClickEvent) => value(t0).runNow()))
    
    inline def setToolBarClickUndefined: Self = StObject.set(x, "toolBarClick", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomEnd(value: /* e */ DiagramZoomEndEvent => Callback): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction1((t0: /* e */ DiagramZoomEndEvent) => value(t0).runNow()))
    
    inline def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
    
    inline def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
    
    inline def setZoomMaxUndefined: Self = StObject.set(x, "zoomMax", js.undefined)
    
    inline def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    
    inline def setZoomMinUndefined: Self = StObject.set(x, "zoomMin", js.undefined)
    
    inline def setZoomRate(value: Double): Self = StObject.set(x, "zoomRate", value.asInstanceOf[js.Any])
    
    inline def setZoomRateUndefined: Self = StObject.set(x, "zoomRate", js.undefined)
    
    inline def setZoomStart(value: /* e */ DiagramZoomStartEvent => Callback): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1((t0: /* e */ DiagramZoomStartEvent) => value(t0).runNow()))
    
    inline def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
