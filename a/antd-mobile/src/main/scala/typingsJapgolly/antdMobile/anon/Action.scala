package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: typingsJapgolly.antdMobile.esComponentsDialogDialogActionButtonMod.Action
  
  def onAction(): Unit | js.Promise[Unit]
}
object Action {
  
  inline def apply(
    action: typingsJapgolly.antdMobile.esComponentsDialogDialogActionButtonMod.Action,
    onAction: CallbackTo[Unit | js.Promise[Unit]]
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], onAction = onAction.toJsFn)
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: typingsJapgolly.antdMobile.esComponentsDialogDialogActionButtonMod.Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOnAction(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onAction", value.toJsFn)
  }
}
