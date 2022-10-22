package typingsJapgolly.novaEditorNode.anon

import typingsJapgolly.novaEditorNode.novaEditorNodeStrings.onChange
import typingsJapgolly.novaEditorNode.novaEditorNodeStrings.onSave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: onChange | onSave
}
object Event {
  
  inline def apply(event: onChange | onSave): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: onChange | onSave): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
