package typingsJapgolly.xstate.libTypesMod

import typingsJapgolly.xstate.anon.Id
import typingsJapgolly.xstate.libTypesMod.ActionTypes.Assign
import typingsJapgolly.xstate.libTypesMod.ActionTypes.Choose
import typingsJapgolly.xstate.libTypesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BaseAction[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] extends StObject
object _BaseAction {
  
  inline def AssignAction[TContext, TEvent /* <: EventObject */](assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]), `type`: Assign): typingsJapgolly.xstate.libTypesMod.AssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xstate.libTypesMod.AssignAction[TContext, TEvent]]
  }
  
  inline def CancelAction(sendId: String | Double, `type`: String): typingsJapgolly.xstate.libTypesMod.CancelAction = {
    val __obj = js.Dynamic.literal(sendId = sendId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xstate.libTypesMod.CancelAction]
  }
  
  inline def ChooseAction[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseCondition[TContext, TEvent]], `type`: Choose): typingsJapgolly.xstate.libTypesMod.ChooseAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(conds = conds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xstate.libTypesMod.ChooseAction[TContext, TEvent]]
  }
  
  inline def LogAction[TContext, TEvent /* <: EventObject */](expr: String | (LogExpr[TContext, TEvent]), `type`: String): typingsJapgolly.xstate.libTypesMod.LogAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xstate.libTypesMod.LogAction[TContext, TEvent]]
  }
  
  inline def StopAction[TContext, TEvent /* <: EventObject */](activity: String | Id | (Expr[TContext, TEvent, String | Id]), `type`: Stop): typingsJapgolly.xstate.libTypesMod.StopAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.xstate.libTypesMod.StopAction[TContext, TEvent]]
  }
}
