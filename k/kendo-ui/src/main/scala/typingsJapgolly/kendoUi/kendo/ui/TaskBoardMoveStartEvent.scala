package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardMoveStartEvent
  extends StObject
     with TaskBoardEvent {
  
  var card: js.UndefOr[Model] = js.undefined
  
  var cardElement: js.UndefOr[JQuery] = js.undefined
  
  var column: js.UndefOr[Model] = js.undefined
  
  var columnElement: js.UndefOr[JQuery] = js.undefined
  
  var draggableEvent: js.UndefOr[Any] = js.undefined
  
  var item: js.UndefOr[JQuery] = js.undefined
}
object TaskBoardMoveStartEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: TaskBoard_): TaskBoardMoveStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskBoardMoveStartEvent]
  }
  
  extension [Self <: TaskBoardMoveStartEvent](x: Self) {
    
    inline def setCard(value: Model): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardElement(value: JQuery): Self = StObject.set(x, "cardElement", value.asInstanceOf[js.Any])
    
    inline def setCardElementUndefined: Self = StObject.set(x, "cardElement", js.undefined)
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setColumn(value: Model): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnElement(value: JQuery): Self = StObject.set(x, "columnElement", value.asInstanceOf[js.Any])
    
    inline def setColumnElementUndefined: Self = StObject.set(x, "columnElement", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDraggableEvent(value: Any): Self = StObject.set(x, "draggableEvent", value.asInstanceOf[js.Any])
    
    inline def setDraggableEventUndefined: Self = StObject.set(x, "draggableEvent", js.undefined)
    
    inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
