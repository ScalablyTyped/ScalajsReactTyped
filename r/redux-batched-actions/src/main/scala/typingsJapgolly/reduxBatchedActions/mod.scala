package typingsJapgolly.reduxBatchedActions

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.reduxBatchedActions.anon.Batch
import typingsJapgolly.reduxBatchedActions.reduxBatchedActionsStrings.BATCHING_REDUCERDotBATCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-batched-actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-batched-actions", "BATCH")
  @js.native
  val BATCH: BatchActionType = js.native
  
  inline def batchActions(actions: js.Array[AnyAction]): BatchAction = ^.asInstanceOf[js.Dynamic].applyDynamic("batchActions")(actions.asInstanceOf[js.Any]).asInstanceOf[BatchAction]
  inline def batchActions(actions: js.Array[AnyAction], `type`: String): BatchAction = (^.asInstanceOf[js.Dynamic].applyDynamic("batchActions")(actions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[BatchAction]
  
  @JSImport("redux-batched-actions", "batchDispatchMiddleware")
  @js.native
  val batchDispatchMiddleware: Middleware[js.Object, Any, Dispatch[AnyAction]] = js.native
  
  inline def enableBatching[S](reduce: Reducer[S, AnyAction]): Reducer[S, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBatching")(reduce.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, AnyAction]]
  
  trait BatchAction extends StObject {
    
    var meta: Batch
    
    var payload: js.Array[Action[Any]]
    
    var `type`: BatchActionType
  }
  object BatchAction {
    
    inline def apply(meta: Batch, payload: js.Array[Action[Any]], `type`: BatchActionType): BatchAction = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchAction]
    }
    
    extension [Self <: BatchAction](x: Self) {
      
      inline def setMeta(value: Batch): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: js.Array[Action[Any]]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadVarargs(value: Action[Any]*): Self = StObject.set(x, "payload", js.Array(value*))
      
      inline def setType(value: BatchActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type BatchActionType = BATCHING_REDUCERDotBATCH
}
