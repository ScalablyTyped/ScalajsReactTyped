package typingsJapgolly.reactRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[
    /* component */ typingsJapgolly.react.mod.ComponentType[TProps], 
    typingsJapgolly.react.mod.NamedExoticComponent[TOwnProps]
  ]
  type AnyIfEmpty[T /* <: js.Object */] = T
  type ConnectedComponent[C /* <: typingsJapgolly.react.mod.ComponentType[_] */, P] = (typingsJapgolly.react.mod.NamedExoticComponent[typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes[C, P]]) with (typingsJapgolly.hoistNonReactStatics.mod.NonReactStatics[C, js.Object]) with typingsJapgolly.reactRedux.AnonWrappedComponent[C]
  type ConnectedProps[TConnector] = js.Any
  type GetProps[C] = js.Any
  type HandleThunkActionCreator[TActionCreator] = TActionCreator | typingsJapgolly.reactRedux.mod.InferThunkActionCreatorType[TActionCreator]
  type InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ js.Any, _] */] = TActionCreator | (js.Function1[/* args */ js.Any, js.Any])
  type InferableComponentEnhancer[TInjectedProps] = typingsJapgolly.reactRedux.mod.InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ js.Any, 
    typingsJapgolly.reactRedux.mod.ConnectedComponent[
      js.Any, 
      (typingsJapgolly.reactRedux.mod.Omit[typingsJapgolly.reactRedux.mod.GetProps[_], java.lang.String]) with TNeedsProps
    ]
  ]
  type MapDispatchToProps[TDispatchProps, TOwnProps] = (typingsJapgolly.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps]) | TDispatchProps
  type MapDispatchToPropsFactory[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ typingsJapgolly.redux.mod.Dispatch[typingsJapgolly.redux.mod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    typingsJapgolly.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
  ]
  type MapDispatchToPropsFunction[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ typingsJapgolly.redux.mod.Dispatch[typingsJapgolly.redux.mod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    TDispatchProps
  ]
  type MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] = (typingsJapgolly.reactRedux.mod.MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (typingsJapgolly.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps])
  type MapDispatchToPropsParam[TDispatchProps, TOwnProps] = (typingsJapgolly.reactRedux.mod.MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (typingsJapgolly.reactRedux.mod.MapDispatchToProps[TDispatchProps, TOwnProps])
  type MapStateToProps[TStateProps, TOwnProps, State] = js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]
  type MapStateToPropsFactory[TStateProps, TOwnProps, State] = js.Function2[
    /* initialState */ State, 
    /* ownProps */ TOwnProps, 
    typingsJapgolly.reactRedux.mod.MapStateToProps[TStateProps, TOwnProps, State]
  ]
  type MapStateToPropsParam[TStateProps, TOwnProps, State] = js.UndefOr[
    (typingsJapgolly.reactRedux.mod.MapStateToPropsFactory[TStateProps, TOwnProps, State]) | (typingsJapgolly.reactRedux.mod.MapStateToProps[TStateProps, TOwnProps, State]) | scala.Null
  ]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsJapgolly.reactRedux.reactReduxStrings.Matching with js.Any
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type ResolveArrayThunks[TDispatchProps /* <: js.Array[_] */] = js.Array[typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any]] | (js.Tuple2[
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple3[
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple4[
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple5[
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple6[
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple7[
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple8[
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ]) | (js.Tuple9[
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any], 
    typingsJapgolly.reactRedux.mod.HandleThunkActionCreator[js.Any]
  ])
  type ResolveThunks[TDispatchProps] = TDispatchProps | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ C in keyof TDispatchProps ]: react-redux.react-redux.HandleThunkActionCreator<TDispatchProps[C]>}
    */ typingsJapgolly.reactRedux.reactReduxStrings.ResolveThunks with TDispatchProps)
  type RootStateOrAny = typingsJapgolly.reactRedux.mod.AnyIfEmpty[typingsJapgolly.reactRedux.mod.DefaultRootState]
  type Selector[S, TProps, TOwnProps] = (js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]) | (js.Function1[/* state */ S, TProps])
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ typingsJapgolly.redux.mod.Dispatch[typingsJapgolly.redux.mod.Action[js.Any]], 
    /* factoryOptions */ TFactoryOptions, 
    typingsJapgolly.reactRedux.mod.Selector[S, TProps, TOwnProps]
  ]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typingsJapgolly.reactRedux.reactReduxStrings.Shared with js.Any
  type TypedUseSelectorHook[TState] = js.Function2[
    /* selector */ js.Function1[/* state */ TState, js.Any], 
    /* equalityFn */ js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, scala.Boolean]], 
    js.Any
  ]
}
