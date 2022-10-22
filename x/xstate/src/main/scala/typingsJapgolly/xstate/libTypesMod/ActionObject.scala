package typingsJapgolly.xstate.libTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionObject[TContext, TEvent /* <: EventObject */]
  extends StObject
     with BaseActionObject {
  
  /**
    * The implementation for executing the action.
    */
  var exec: js.UndefOr[ActionFunction[TContext, TEvent, BaseActionObject]] = js.undefined
}
object ActionObject {
  
  inline def apply[TContext, TEvent /* <: EventObject */](`type`: String): ActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionObject[TContext, TEvent]]
  }
  
  extension [Self <: ActionObject[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (ActionObject[TContext, TEvent])) {
    
    inline def setExec(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => Callback): Self = StObject.set(x, "exec", js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
  }
}
