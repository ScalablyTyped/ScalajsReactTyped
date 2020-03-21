package typingsJapgolly.typesafeActions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeHelpersMod {
  type ActionBuilderConstructor[TType /* <: typingsJapgolly.typesafeActions.typeHelpersMod.TypeConstant */, TPayload /* <: js.Any */, TMeta /* <: js.Any */] = (typingsJapgolly.typesafeActions.typeHelpersMod.PayloadMetaAC[TType, TPayload, TMeta]) | (typingsJapgolly.typesafeActions.typeHelpersMod.PayloadAC[TType, TPayload]) | typingsJapgolly.typesafeActions.typeHelpersMod.EmptyAC[TType]
  type ActionBuilderMap[TType /* <: typingsJapgolly.typesafeActions.typeHelpersMod.TypeConstant */, TActionProps /* <: js.Any */, TPayloadArg /* <: js.Any */, TMetaArg /* <: js.Any */] = (js.Function2[
    /* payload */ TPayloadArg, 
    /* meta */ TMetaArg, 
    typingsJapgolly.typesafeActions.AnonTypeTType[TType] with TActionProps
  ]) | (js.Function1[
    /* payload */ TPayloadArg, 
    typingsJapgolly.typesafeActions.AnonTypeTType[TType] with TActionProps
  ]) | (js.Function0[typingsJapgolly.typesafeActions.AnonTypeTType[TType] with TActionProps])
  type ActionCreator[TType /* <: typingsJapgolly.typesafeActions.typeHelpersMod.TypeConstant */] = js.Function1[
    /* repeated */ js.Any, 
    typingsJapgolly.typesafeActions.typeHelpersMod.Action[TType]
  ]
  type ActionType[TActionCreatorOrMap /* <: js.Any */] = js.Any | typingsJapgolly.std.ReturnType[TActionCreatorOrMap]
  type EmptyAC[TType /* <: typingsJapgolly.typesafeActions.typeHelpersMod.TypeConstant */] = js.Function0[typingsJapgolly.typesafeActions.typeHelpersMod.EmptyAction[TType]]
  type PayloadAC[TType /* <: typingsJapgolly.typesafeActions.typeHelpersMod.TypeConstant */, TPayload] = js.Function1[
    /* payload */ TPayload, 
    typingsJapgolly.typesafeActions.typeHelpersMod.PayloadAction[TType, TPayload]
  ]
  type PayloadMetaAC[TType /* <: typingsJapgolly.typesafeActions.typeHelpersMod.TypeConstant */, TPayload, TMeta] = js.Function2[
    /* payload */ TPayload, 
    /* meta */ TMeta, 
    typingsJapgolly.typesafeActions.typeHelpersMod.PayloadMetaAction[TType, TPayload, TMeta]
  ]
  type Reducer[TState, TAction /* <: typingsJapgolly.typesafeActions.typeHelpersMod.Action[typingsJapgolly.typesafeActions.typeHelpersMod.TypeConstant] */] = js.Function2[/* state */ js.UndefOr[TState], /* action */ TAction, TState]
  type StateType[TReducerOrMap /* <: js.Any */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TReducerOrMap ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/type-helpers.StateType<TReducerOrMap[K]> * / object}
    */ typingsJapgolly.typesafeActions.typesafeActionsStrings.StateType with js.Any) | typingsJapgolly.std.ReturnType[TReducerOrMap]
  type TypeConstant = java.lang.String
}
