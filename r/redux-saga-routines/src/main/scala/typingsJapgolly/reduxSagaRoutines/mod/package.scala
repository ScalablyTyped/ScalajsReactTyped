package typingsJapgolly.reduxSagaRoutines

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionCreatorFunction[Payload, Meta] = typingsJapgolly.reduxActions.mod.ActionFunctionAny[
    typingsJapgolly.reduxActions.mod.Action[Payload] | (typingsJapgolly.reduxActions.mod.ActionMeta[Payload, Meta])
  ]
  type BoundPromiseCreator[TPayload] = js.Function1[/* payload */ TPayload, js.Thenable[js.Any]]
  type PromiseCreator[TPayload] = js.Function2[
    /* payload */ TPayload, 
    /* dispatch */ typingsJapgolly.redux.mod.Dispatch[typingsJapgolly.redux.mod.AnyAction], 
    js.Thenable[js.Any]
  ]
  type ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = (typingsJapgolly.reduxActions.mod.ActionFunctionAny[typingsJapgolly.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typingsJapgolly.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typingsJapgolly.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction2[TArg1, TArg2, typingsJapgolly.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction1[TArg1, typingsJapgolly.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction0[typingsJapgolly.reduxActions.mod.ActionMeta[js.Any, TMeta]])
  type ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = typingsJapgolly.reduxActions.mod.ActionFunctionAny[typingsJapgolly.reduxActions.mod.Action[TPayload]] | (typingsJapgolly.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typingsJapgolly.reduxActions.mod.Action[TPayload]]) | (typingsJapgolly.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typingsJapgolly.reduxActions.mod.Action[TPayload]]) | (typingsJapgolly.reduxActions.mod.ActionFunction2[TArg1, TArg2, typingsJapgolly.reduxActions.mod.Action[TPayload]]) | (typingsJapgolly.reduxActions.mod.ActionFunction1[TArg1, typingsJapgolly.reduxActions.mod.Action[TPayload]]) | typingsJapgolly.reduxActions.mod.ActionFunction0[typingsJapgolly.reduxActions.mod.Action[TPayload]]
  type ResolveActionCreatorByPayloadMeta[TPayloadCreator, TMetaCreator, TPayload, TMeta, TArg1, TArg2, TArg3, TArg4] = (typingsJapgolly.reduxActions.mod.ActionFunctionAny[typingsJapgolly.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typingsJapgolly.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typingsJapgolly.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction2[TArg1, TArg2, typingsJapgolly.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction1[TArg1, typingsJapgolly.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsJapgolly.reduxActions.mod.ActionFunction0[typingsJapgolly.reduxActions.mod.ActionMeta[TPayload, TMeta]])
  type ResolveFunctionArg1Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg2Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg3Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg4Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionReturnType[TFunction] = js.UndefOr[scala.Nothing]
  type Routine[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] = TTriggerActionCreator with typingsJapgolly.reduxSagaRoutines.keyinRoutineStagesstring with (typingsJapgolly.reduxSagaRoutines.AnonFailure[
    TTriggerActionCreator, 
    TRequestActionCreator, 
    TSuccessActionCreator, 
    TFailureActionCreator, 
    TFulfillActionCreator
  ])
  type UnifiedRoutine[TActionCreator] = typingsJapgolly.reduxSagaRoutines.mod.Routine[TActionCreator, TActionCreator, TActionCreator, TActionCreator, TActionCreator]
}
