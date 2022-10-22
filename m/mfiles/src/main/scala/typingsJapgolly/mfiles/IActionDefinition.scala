package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionDefinition extends StObject {
  
  var ActionCreateSeparateAssignment: IActionCreateAssignment
  
  val ActionType: MFActionType
  
  def Clear(): Unit
  
  def Clone(): IActionDefinition
}
object IActionDefinition {
  
  inline def apply(
    ActionCreateSeparateAssignment: IActionCreateAssignment,
    ActionType: MFActionType,
    Clear: Callback,
    Clone: CallbackTo[IActionDefinition]
  ): IActionDefinition = {
    val __obj = js.Dynamic.literal(ActionCreateSeparateAssignment = ActionCreateSeparateAssignment.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any], Clear = Clear.toJsFn, Clone = Clone.toJsFn)
    __obj.asInstanceOf[IActionDefinition]
  }
  
  extension [Self <: IActionDefinition](x: Self) {
    
    inline def setActionCreateSeparateAssignment(value: IActionCreateAssignment): Self = StObject.set(x, "ActionCreateSeparateAssignment", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: MFActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setClone(value: CallbackTo[IActionDefinition]): Self = StObject.set(x, "Clone", value.toJsFn)
  }
}
