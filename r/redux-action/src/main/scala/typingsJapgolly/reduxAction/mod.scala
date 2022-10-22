package typingsJapgolly.reduxAction

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Reducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAction[Payload](): ActionFunction1[Any, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")().asInstanceOf[ActionFunction1[Any, ThunkAction[Payload]]]
  inline def createAction[Payload](payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any]).asInstanceOf[ActionFunctionAny[ThunkAction[Payload]]]
  inline def createAction[Payload](`type`: String): ActionFunction1[Any, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(`type`.asInstanceOf[js.Any]).asInstanceOf[ActionFunction1[Any, ThunkAction[Payload]]]
  inline def createAction[Payload](`type`: String, payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(`type`.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ThunkAction[Payload]]]
  inline def createAction[Payload, Arg](payloadCreator: ActionFunction1[Arg, js.Promise[Payload] | Payload]): ActionFunction1[Arg, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any]).asInstanceOf[ActionFunction1[Arg, ThunkAction[Payload]]]
  inline def createAction[Payload, Meta](
    payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ThunkMetaAction[Payload, Meta]]]
  inline def createAction[Payload, Meta](
    `type`: String,
    payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(`type`.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ThunkMetaAction[Payload, Meta]]]
  inline def createAction[Payload, Arg1, Arg2](payloadCreator: ActionFunction2[Arg1, Arg2, js.Promise[Payload] | Payload]): ActionFunction2[Arg1, Arg2, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any]).asInstanceOf[ActionFunction2[Arg1, Arg2, ThunkAction[Payload]]]
  inline def createAction[Payload, Arg1, Arg2, Arg3](payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, js.Promise[Payload] | Payload]): ActionFunction3[Arg1, Arg2, Arg3, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any]).asInstanceOf[ActionFunction3[Arg1, Arg2, Arg3, ThunkAction[Payload]]]
  
  inline def createAction_PayloadArg[Payload, Arg](): ActionFunction1[Arg, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")().asInstanceOf[ActionFunction1[Arg, ThunkAction[Payload]]]
  inline def createAction_PayloadArg[Payload, Arg](`type`: String): ActionFunction1[Arg, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(`type`.asInstanceOf[js.Any]).asInstanceOf[ActionFunction1[Arg, ThunkAction[Payload]]]
  
  inline def createReducer[State](defaultState: State, handlers: ReducerHandlers[State]): Reducer[State, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReducer")(defaultState.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Reducer[State, AnyAction]]
  
  inline def createSyncAction[Payload](`type`: String): ActionFunctionAny[Action[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyncAction")(`type`.asInstanceOf[js.Any]).asInstanceOf[ActionFunctionAny[Action[Payload]]]
  inline def createSyncAction[Payload](`type`: String, payloadCreator: ActionFunctionAny[Payload]): ActionFunctionAny[Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSyncAction")(`type`.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[Action[Payload]]]
  inline def createSyncAction[Payload, Meta](`type`: String, payloadCreator: ActionFunctionAny[Payload], metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[MetaAction[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSyncAction")(`type`.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[MetaAction[Payload, Meta]]]
  
  trait Action[Payload]
    extends StObject
       with BaseAction {
    
    var payload: Payload
  }
  object Action {
    
    inline def apply[Payload](payload: Payload, `type`: String): Action[Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[Payload]]
    }
    
    extension [Self <: Action[?], Payload](x: Self & Action[Payload]) {
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionFunction0[R] = js.Function0[R]
  
  type ActionFunction1[T1, R] = js.Function1[/* t1 */ T1, R]
  
  type ActionFunction2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  
  type ActionFunction3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  
  @js.native
  trait ActionFunctionAny[R] extends StObject {
    
    def apply(args: Any*): R = js.native
  }
  
  trait BaseAction extends StObject {
    
    var `type`: String
  }
  object BaseAction {
    
    inline def apply(`type`: String): BaseAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseAction]
    }
    
    extension [Self <: BaseAction](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetaAction[Payload, Meta]
    extends StObject
       with Action[Payload] {
    
    var meta: Meta
  }
  object MetaAction {
    
    inline def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: String): MetaAction[Payload, Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaAction[Payload, Meta]]
    }
    
    extension [Self <: MetaAction[?, ?], Payload, Meta](x: Self & (MetaAction[Payload, Meta])) {
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type ReducerHandler[State] = js.Function3[
    /* payload */ Any, 
    /* state */ js.UndefOr[State], 
    /* action */ js.UndefOr[BaseAction], 
    State
  ]
  
  type ReducerHandlers[State] = StringDictionary[ReducerHandler[State]]
  
  type ThunkAction[Payload] = js.Function2[
    /* dispatch */ Dispatch[Any], 
    /* getState */ js.Function0[Any], 
    js.Promise[Action[Payload]]
  ]
  
  type ThunkMetaAction[Payload, Meta] = js.Function2[
    /* dispatch */ Dispatch[Any], 
    /* getState */ js.Function0[Any], 
    js.Promise[MetaAction[Payload, Meta]]
  ]
}
