package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for form triggers.
  */
trait FormTriggerBuilder extends StObject {
  
  def create(): Trigger
  
  def onFormSubmit(): FormTriggerBuilder
  
  def onOpen(): FormTriggerBuilder
}
object FormTriggerBuilder {
  
  inline def apply(
    create: CallbackTo[Trigger],
    onFormSubmit: CallbackTo[FormTriggerBuilder],
    onOpen: CallbackTo[FormTriggerBuilder]
  ): FormTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = create.toJsFn, onFormSubmit = onFormSubmit.toJsFn, onOpen = onOpen.toJsFn)
    __obj.asInstanceOf[FormTriggerBuilder]
  }
  
  extension [Self <: FormTriggerBuilder](x: Self) {
    
    inline def setCreate(value: CallbackTo[Trigger]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setOnFormSubmit(value: CallbackTo[FormTriggerBuilder]): Self = StObject.set(x, "onFormSubmit", value.toJsFn)
    
    inline def setOnOpen(value: CallbackTo[FormTriggerBuilder]): Self = StObject.set(x, "onOpen", value.toJsFn)
  }
}
