package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.sharepoint.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditControlCellContext
  extends StObject
     with IEditActorCellContext {
  
  def Hide(element: HTMLElement): Unit
  
  def NotifyEditComplete(): Unit
  
  def NotifyExpandControl(): Unit
  
  def Show(element: HTMLElement): Unit
  
  var cellHeight: Double
  
  // TODO: Determine correct type
  var cellRect: Any
  
  var cellStyle: Any
  
  var cellWidth: Double
}
object IEditControlCellContext {
  
  inline def apply(
    Hide: HTMLElement => Callback,
    NotifyEditComplete: Callback,
    NotifyExpandControl: Callback,
    SetCurrentValue: Any => Callback,
    Show: HTMLElement => Callback,
    cellExpandSpace: Bottom,
    cellHeight: Double,
    cellRect: Any,
    cellStyle: Any,
    cellWidth: Double,
    column: ColumnInfo,
    field: GridField,
    fieldKey: String,
    originalValue: IValue,
    propType: IPropertyType,
    record: IRecord
  ): IEditControlCellContext = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction1((t0: HTMLElement) => Hide(t0).runNow()), NotifyEditComplete = NotifyEditComplete.toJsFn, NotifyExpandControl = NotifyExpandControl.toJsFn, SetCurrentValue = js.Any.fromFunction1((t0: Any) => SetCurrentValue(t0).runNow()), Show = js.Any.fromFunction1((t0: HTMLElement) => Show(t0).runNow()), cellExpandSpace = cellExpandSpace.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], cellRect = cellRect.asInstanceOf[js.Any], cellStyle = cellStyle.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditControlCellContext]
  }
  
  extension [Self <: IEditControlCellContext](x: Self) {
    
    inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellRect(value: Any): Self = StObject.set(x, "cellRect", value.asInstanceOf[js.Any])
    
    inline def setCellStyle(value: Any): Self = StObject.set(x, "cellStyle", value.asInstanceOf[js.Any])
    
    inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
    
    inline def setHide(value: HTMLElement => Callback): Self = StObject.set(x, "Hide", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    
    inline def setNotifyEditComplete(value: Callback): Self = StObject.set(x, "NotifyEditComplete", value.toJsFn)
    
    inline def setNotifyExpandControl(value: Callback): Self = StObject.set(x, "NotifyExpandControl", value.toJsFn)
    
    inline def setShow(value: HTMLElement => Callback): Self = StObject.set(x, "Show", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
  }
}
