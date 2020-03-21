package typingsJapgolly.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionCreator[A] = js.Function1[/* repeated */ js.Any, A]
  type ActionCreatorsMapObject[A] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.redux.mod.ActionCreator[A]]
  type ActionFromReducer[R] = js.Any
  type ActionFromReducersMapObject[M] = typingsJapgolly.redux.mod.ActionFromReducer[typingsJapgolly.redux.mod.ReducerFromReducersMapObject[M]]
  type CombinedState[S] = typingsJapgolly.redux.AnonCombinedState with S
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux.redux.DeepPartial<T[K]> * / object : T[K]}
    */ typingsJapgolly.redux.reduxStrings.DeepPartial with js.Any
  type Dispatch[A /* <: typingsJapgolly.redux.mod.Action[_] */] = js.Function1[/* action */ A, A]
  /* compose */
  type Func0[R] = js.Function0[R]
  type Func1[T1, R] = js.Function1[/* a1 */ T1, R]
  type Func2[T1, T2, R] = js.Function2[/* a1 */ T1, /* a2 */ T2, R]
  type Func3[T1, T2, T3, R] = js.Function4[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* repeated */ js.Any, R]
  type Middleware[DispatchExt, S, D /* <: typingsJapgolly.redux.mod.Dispatch[typingsJapgolly.redux.mod.AnyAction] */] = js.Function1[
    /* api */ typingsJapgolly.redux.mod.MiddlewareAPI[D, S], 
    js.Function1[
      /* next */ typingsJapgolly.redux.mod.Dispatch[typingsJapgolly.redux.mod.AnyAction], 
      js.Function1[/* action */ js.Any, js.Any]
    ]
  ]
  type PreloadedState[S] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: S[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux.redux.PreloadedState<S[K]> * / object : S[K]}
    */ typingsJapgolly.redux.reduxStrings.PreloadedState with js.Any
  type Reducer[S, A /* <: typingsJapgolly.redux.mod.Action[_] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  type ReducerFromReducersMapObject[M] = js.Any
  type ReducersMapObject[S, A /* <: typingsJapgolly.redux.mod.Action[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: redux.redux.Reducer<S[K], A>}
    */ typingsJapgolly.redux.reduxStrings.ReducersMapObject with S
  type StateFromReducersMapObject[M] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof M ]: M[P] extends redux.redux.Reducer<infer S, any>? any : never}
    */ typingsJapgolly.redux.reduxStrings.StateFromReducersMapObject with M
  type StoreEnhancer[Ext, StateExt] = js.Function1[
    /* next */ typingsJapgolly.redux.mod.StoreEnhancerStoreCreator[js.Object, js.Object], 
    typingsJapgolly.redux.mod.StoreEnhancerStoreCreator[Ext, StateExt]
  ]
  type StoreEnhancerStoreCreator[Ext, StateExt] = js.Function2[
    /* reducer */ typingsJapgolly.redux.mod.Reducer[js.Any, typingsJapgolly.redux.mod.AnyAction], 
    /* preloadedState */ js.UndefOr[typingsJapgolly.redux.mod.PreloadedState[js.Any]], 
    (typingsJapgolly.redux.mod.Store[js.Any with StateExt, typingsJapgolly.redux.mod.AnyAction]) with Ext
  ]
  type Unsubscribe = js.Function0[scala.Unit]
}
