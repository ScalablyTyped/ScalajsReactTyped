package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAction extends StObject {
  
  var action: typingsJapgolly.antdMobile.esComponentsModalModalActionButtonMod.Action
  
  def onAction(): Unit | js.Promise[Unit]
}
object OnAction {
  
  inline def apply(
    action: typingsJapgolly.antdMobile.esComponentsModalModalActionButtonMod.Action,
    onAction: CallbackTo[Unit | js.Promise[Unit]]
  ): OnAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], onAction = onAction.toJsFn)
    __obj.asInstanceOf[OnAction]
  }
  
  extension [Self <: OnAction](x: Self) {
    
    inline def setAction(value: typingsJapgolly.antdMobile.esComponentsModalModalActionButtonMod.Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOnAction(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onAction", value.toJsFn)
  }
}
