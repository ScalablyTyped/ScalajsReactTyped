package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for spreadsheet triggers.
  */
trait SpreadsheetTriggerBuilder extends StObject {
  
  def create(): Trigger
  
  def onChange(): SpreadsheetTriggerBuilder
  
  def onEdit(): SpreadsheetTriggerBuilder
  
  def onFormSubmit(): SpreadsheetTriggerBuilder
  
  def onOpen(): SpreadsheetTriggerBuilder
}
object SpreadsheetTriggerBuilder {
  
  inline def apply(
    create: CallbackTo[Trigger],
    onChange: CallbackTo[SpreadsheetTriggerBuilder],
    onEdit: CallbackTo[SpreadsheetTriggerBuilder],
    onFormSubmit: CallbackTo[SpreadsheetTriggerBuilder],
    onOpen: CallbackTo[SpreadsheetTriggerBuilder]
  ): SpreadsheetTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = create.toJsFn, onChange = onChange.toJsFn, onEdit = onEdit.toJsFn, onFormSubmit = onFormSubmit.toJsFn, onOpen = onOpen.toJsFn)
    __obj.asInstanceOf[SpreadsheetTriggerBuilder]
  }
  
  extension [Self <: SpreadsheetTriggerBuilder](x: Self) {
    
    inline def setCreate(value: CallbackTo[Trigger]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setOnChange(value: CallbackTo[SpreadsheetTriggerBuilder]): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnEdit(value: CallbackTo[SpreadsheetTriggerBuilder]): Self = StObject.set(x, "onEdit", value.toJsFn)
    
    inline def setOnFormSubmit(value: CallbackTo[SpreadsheetTriggerBuilder]): Self = StObject.set(x, "onFormSubmit", value.toJsFn)
    
    inline def setOnOpen(value: CallbackTo[SpreadsheetTriggerBuilder]): Self = StObject.set(x, "onOpen", value.toJsFn)
  }
}
