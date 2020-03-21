package typingsJapgolly.recompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentEnhancer[TInner, TOutter] = js.Function1[
    /* component */ typingsJapgolly.react.mod.ComponentType[TInner], 
    japgolly.scalajs.react.raw.React.ComponentClassP[TOutter with js.Object]
  ]
  type DefaultingInferableComponentEnhancer[TInjectedProps] = typingsJapgolly.recompose.mod.InferableComponentEnhancerWithProps[TInjectedProps, typingsJapgolly.std.Partial[TInjectedProps]]
  // withHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
  type EventHandler = js.Function
  type HandleCreators[TOutter, THandlers] = typingsJapgolly.recompose.mod.HandleCreatorsStructure[TOutter] with (typingsJapgolly.recompose.mod.HandleCreatorsHandlers[TOutter, THandlers])
  type HandleCreatorsFactory[TOutter, THandlers] = js.Function1[
    /* initialProps */ TOutter, 
    typingsJapgolly.recompose.mod.HandleCreators[TOutter, THandlers]
  ]
  // This type is required to infer THandlers
  type HandleCreatorsHandlers[TOutter, THandlers] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof THandlers ]: (props : TOutter): THandlers[P]}
    */ typingsJapgolly.recompose.recomposeStrings.HandleCreatorsHandlers with THandlers
  // This type is required to infer TOutter
  type HandleCreatorsStructure[TOutter] = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.recompose.mod.mapper[TOutter, typingsJapgolly.recompose.mod.EventHandler]
  ]
  type InferableComponentEnhancer[TInjectedProps] = typingsJapgolly.recompose.mod.InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ typingsJapgolly.react.mod.ComponentType[TInjectedProps], 
    japgolly.scalajs.react.raw.React.ComponentClassP[
      (typingsJapgolly.recompose.mod.Omit[TInjectedProps, java.lang.String]) with TNeedsProps with js.Object
    ]
  ]
  // renameProps: https://github.com/acdlite/recompose/blob/master/docs/API.md#renameProps
  type NameMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  // Diff / Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance] = (typingsJapgolly.recompose.mod._ReactLifeCycleFunctionsThisArguments[TProps, TState]) with TInstance
  // withStateHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
  type StateHandler[TState] = js.Function1[/* repeated */ js.Any, js.UndefOr[typingsJapgolly.std.Partial[TState]]]
  type StateHandlerMap[TState] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.recompose.mod.StateHandler[TState]]
  type StateUpdaters[TOutter, TState, TUpdaters] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ updaterName in keyof TUpdaters ]: (state : TState, props : TOutter): TUpdaters[updaterName]}
    */ typingsJapgolly.recompose.recomposeStrings.StateUpdaters with TUpdaters
  // createEagerFactory: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEagerFactory
  type componentFactory = js.Function2[
    /* props */ js.UndefOr[js.Object], 
    /* children */ js.UndefOr[japgolly.scalajs.react.raw.React.Node], 
    japgolly.scalajs.react.raw.React.Element
  ]
  type mapper[TInner, TOutter] = js.Function1[/* input */ TInner, TOutter]
  type predicate[T] = typingsJapgolly.recompose.mod.mapper[T, scala.Boolean]
  type predicateDiff[T] = js.Function2[/* current */ T, /* next */ T, scala.Boolean]
  // withReducer: https://github.com/acdlite/recompose/blob/master/docs/API.md#withReducer
  type reducer[TState, TAction] = js.Function2[/* s */ TState, /* a */ TAction, TState]
}
