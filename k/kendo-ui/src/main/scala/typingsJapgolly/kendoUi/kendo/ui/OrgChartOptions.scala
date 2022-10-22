package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.OrgChartDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgChartOptions extends StObject {
  
  var cancel: js.UndefOr[js.Function1[/* e */ OrgChartCancelEvent, Unit]] = js.undefined
  
  var cardsColors: js.UndefOr[Any] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ OrgChartChangeEvent, Unit]] = js.undefined
  
  var collapse: js.UndefOr[js.Function1[/* e */ OrgChartCollapseEvent, Unit]] = js.undefined
  
  var create: js.UndefOr[js.Function1[/* e */ OrgChartCreateEvent, Unit]] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ OrgChartDataBindingEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ OrgChartDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[Any | OrgChartDataSource] = js.undefined
  
  var delete: js.UndefOr[js.Function1[/* e */ OrgChartDeleteEvent, Unit]] = js.undefined
  
  var edit: js.UndefOr[js.Function1[/* e */ OrgChartEditEvent, Unit]] = js.undefined
  
  var editable: js.UndefOr[Boolean | OrgChartEditable] = js.undefined
  
  var expand: js.UndefOr[js.Function1[/* e */ OrgChartExpandEvent, Unit]] = js.undefined
  
  var groupField: js.UndefOr[String] = js.undefined
  
  var groupHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var messages: js.UndefOr[OrgChartMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var save: js.UndefOr[js.Function1[/* e */ OrgChartSaveEvent, Unit]] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ OrgChartSelectEvent, Unit]] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object OrgChartOptions {
  
  inline def apply(): OrgChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgChartOptions]
  }
  
  extension [Self <: OrgChartOptions](x: Self) {
    
    inline def setCancel(value: /* e */ OrgChartCancelEvent => Callback): Self = StObject.set(x, "cancel", js.Any.fromFunction1((t0: /* e */ OrgChartCancelEvent) => value(t0).runNow()))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setCardsColors(value: Any): Self = StObject.set(x, "cardsColors", value.asInstanceOf[js.Any])
    
    inline def setCardsColorsUndefined: Self = StObject.set(x, "cardsColors", js.undefined)
    
    inline def setChange(value: /* e */ OrgChartChangeEvent => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* e */ OrgChartChangeEvent) => value(t0).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setCollapse(value: /* e */ OrgChartCollapseEvent => Callback): Self = StObject.set(x, "collapse", js.Any.fromFunction1((t0: /* e */ OrgChartCollapseEvent) => value(t0).runNow()))
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setCreate(value: /* e */ OrgChartCreateEvent => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: /* e */ OrgChartCreateEvent) => value(t0).runNow()))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDataBinding(value: /* e */ OrgChartDataBindingEvent => Callback): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1((t0: /* e */ OrgChartDataBindingEvent) => value(t0).runNow()))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ OrgChartDataBoundEvent => Callback): Self = StObject.set(x, "dataBound", js.Any.fromFunction1((t0: /* e */ OrgChartDataBoundEvent) => value(t0).runNow()))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any | OrgChartDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDelete(value: /* e */ OrgChartDeleteEvent => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: /* e */ OrgChartDeleteEvent) => value(t0).runNow()))
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setEdit(value: /* e */ OrgChartEditEvent => Callback): Self = StObject.set(x, "edit", js.Any.fromFunction1((t0: /* e */ OrgChartEditEvent) => value(t0).runNow()))
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setEditable(value: Boolean | OrgChartEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setExpand(value: /* e */ OrgChartExpandEvent => Callback): Self = StObject.set(x, "expand", js.Any.fromFunction1((t0: /* e */ OrgChartExpandEvent) => value(t0).runNow()))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
    
    inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
    
    inline def setGroupHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "groupHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderTemplateUndefined: Self = StObject.set(x, "groupHeaderTemplate", js.undefined)
    
    inline def setMessages(value: OrgChartMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSave(value: /* e */ OrgChartSaveEvent => Callback): Self = StObject.set(x, "save", js.Any.fromFunction1((t0: /* e */ OrgChartSaveEvent) => value(t0).runNow()))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setSelect(value: /* e */ OrgChartSelectEvent => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* e */ OrgChartSelectEvent) => value(t0).runNow()))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
