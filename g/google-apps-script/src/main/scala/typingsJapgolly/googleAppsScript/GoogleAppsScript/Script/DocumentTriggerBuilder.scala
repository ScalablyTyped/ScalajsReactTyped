package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for document triggers.
  */
trait DocumentTriggerBuilder extends StObject {
  
  def create(): Trigger
  
  def onOpen(): DocumentTriggerBuilder
}
object DocumentTriggerBuilder {
  
  inline def apply(create: CallbackTo[Trigger], onOpen: CallbackTo[DocumentTriggerBuilder]): DocumentTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = create.toJsFn, onOpen = onOpen.toJsFn)
    __obj.asInstanceOf[DocumentTriggerBuilder]
  }
  
  extension [Self <: DocumentTriggerBuilder](x: Self) {
    
    inline def setCreate(value: CallbackTo[Trigger]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setOnOpen(value: CallbackTo[DocumentTriggerBuilder]): Self = StObject.set(x, "onOpen", value.toJsFn)
  }
}
