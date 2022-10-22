package typingsJapgolly.figma.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationHandler extends StObject {
  
  def cancel(): Unit
}
object NotificationHandler {
  
  inline def apply(cancel: Callback): NotificationHandler = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
    __obj.asInstanceOf[NotificationHandler]
  }
  
  extension [Self <: NotificationHandler](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
  }
}
