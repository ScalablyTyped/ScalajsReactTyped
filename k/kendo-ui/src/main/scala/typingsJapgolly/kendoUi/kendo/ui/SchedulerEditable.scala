package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerEditable extends StObject {
  
  var confirmation: js.UndefOr[Boolean | String] = js.undefined
  
  var create: js.UndefOr[Boolean] = js.undefined
  
  var destroy: js.UndefOr[Boolean] = js.undefined
  
  var editRecurringMode: js.UndefOr[String] = js.undefined
  
  var move: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var update: js.UndefOr[Boolean] = js.undefined
  
  var window: js.UndefOr[Any] = js.undefined
}
object SchedulerEditable {
  
  inline def apply(): SchedulerEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerEditable]
  }
  
  extension [Self <: SchedulerEditable](x: Self) {
    
    inline def setConfirmation(value: Boolean | String): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
    
    inline def setConfirmationUndefined: Self = StObject.set(x, "confirmation", js.undefined)
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setEditRecurringMode(value: String): Self = StObject.set(x, "editRecurringMode", value.asInstanceOf[js.Any])
    
    inline def setEditRecurringModeUndefined: Self = StObject.set(x, "editRecurringMode", js.undefined)
    
    inline def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWindow(value: Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
