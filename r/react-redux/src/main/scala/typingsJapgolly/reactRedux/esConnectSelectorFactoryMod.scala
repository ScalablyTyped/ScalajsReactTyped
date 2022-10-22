package typingsJapgolly.reactRedux

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRedux.esTypesMod.EqualityFn
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConnectSelectorFactoryMod {
  
  @JSImport("react-redux/es/connect/selectorFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TStateProps, TOwnProps, TDispatchProps, TMergedProps, State](
    dispatch: Dispatch[Action[Any]],
    hasInitMapStateToPropsInitMapDispatchToPropsInitMergePropsOptions: SelectorFactoryOptions[TStateProps, TOwnProps, TDispatchProps, TMergedProps, State]
  ): js.Function2[/* nextState */ State, /* nextOwnProps */ TOwnProps, TMergedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dispatch.asInstanceOf[js.Any], hasInitMapStateToPropsInitMapDispatchToPropsInitMergePropsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* nextState */ State, /* nextOwnProps */ TOwnProps, TMergedProps]]
  
  inline def pureFinalPropsSelectorFactory[TStateProps, TOwnProps, TDispatchProps, TMergedProps, State](
    mapStateToProps: WrappedMapStateToProps[TStateProps, TOwnProps, State],
    mapDispatchToProps: WrappedMapDispatchToProps[TDispatchProps, TOwnProps],
    mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps],
    dispatch: Dispatch[Action[Any]],
    hasAreStatesEqualAreOwnPropsEqualAreStatePropsEqual: PureSelectorFactoryComparisonOptions[TStateProps, TOwnProps, State]
  ): js.Function2[/* nextState */ State, /* nextOwnProps */ TOwnProps, TMergedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("pureFinalPropsSelectorFactory")(mapStateToProps.asInstanceOf[js.Any], mapDispatchToProps.asInstanceOf[js.Any], mergeProps.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], hasAreStatesEqualAreOwnPropsEqualAreStatePropsEqual.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* nextState */ State, /* nextOwnProps */ TOwnProps, TMergedProps]]
  
  trait InitOptions[TStateProps, TOwnProps, TMergedProps, State]
    extends StObject
       with PureSelectorFactoryComparisonOptions[TStateProps, TOwnProps, State] {
    
    val WrappedComponent: ComponentType[TOwnProps]
    
    val areMergedPropsEqual: EqualityFn[TMergedProps]
    
    val displayName: String
    
    val shouldHandleStateChanges: Boolean
    
    val wrappedComponentName: String
  }
  object InitOptions {
    
    inline def apply[TStateProps, TOwnProps, TMergedProps, State](
      WrappedComponent: ComponentType[TOwnProps],
      areMergedPropsEqual: (TMergedProps, TMergedProps) => Boolean,
      areOwnPropsEqual: (TOwnProps, TOwnProps) => Boolean,
      areStatePropsEqual: (TStateProps, TStateProps) => Boolean,
      areStatesEqual: (State, State) => Boolean,
      displayName: String,
      shouldHandleStateChanges: Boolean,
      wrappedComponentName: String
    ): InitOptions[TStateProps, TOwnProps, TMergedProps, State] = {
      val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any], areMergedPropsEqual = js.Any.fromFunction2(areMergedPropsEqual), areOwnPropsEqual = js.Any.fromFunction2(areOwnPropsEqual), areStatePropsEqual = js.Any.fromFunction2(areStatePropsEqual), areStatesEqual = js.Any.fromFunction2(areStatesEqual), displayName = displayName.asInstanceOf[js.Any], shouldHandleStateChanges = shouldHandleStateChanges.asInstanceOf[js.Any], wrappedComponentName = wrappedComponentName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitOptions[TStateProps, TOwnProps, TMergedProps, State]]
    }
    
    extension [Self <: InitOptions[?, ?, ?, ?], TStateProps, TOwnProps, TMergedProps, State](x: Self & (InitOptions[TStateProps, TOwnProps, TMergedProps, State])) {
      
      inline def setAreMergedPropsEqual(value: (TMergedProps, TMergedProps) => Boolean): Self = StObject.set(x, "areMergedPropsEqual", js.Any.fromFunction2(value))
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setShouldHandleStateChanges(value: Boolean): Self = StObject.set(x, "shouldHandleStateChanges", value.asInstanceOf[js.Any])
      
      inline def setWrappedComponent(value: ComponentType[TOwnProps]): Self = StObject.set(x, "WrappedComponent", value.asInstanceOf[js.Any])
      
      inline def setWrappedComponentName(value: String): Self = StObject.set(x, "wrappedComponentName", value.asInstanceOf[js.Any])
    }
  }
  
  type MapDispatchToProps[TDispatchProps, TOwnProps] = (MapDispatchToPropsFunction[TDispatchProps, TOwnProps]) | TDispatchProps
  
  type MapDispatchToPropsFactory[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    /* ownProps */ TOwnProps, 
    MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
  ]
  
  type MapDispatchToPropsFunction[TDispatchProps, TOwnProps] = js.Function2[/* dispatch */ Dispatch[Action[Any]], /* ownProps */ TOwnProps, TDispatchProps]
  
  type MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToPropsFunction[TDispatchProps, TOwnProps])
  
  type MapDispatchToPropsParam[TDispatchProps, TOwnProps] = (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToProps[TDispatchProps, TOwnProps])
  
  type MapStateToProps[TStateProps, TOwnProps, State] = js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]
  
  type MapStateToPropsFactory[TStateProps, TOwnProps, State] = js.Function2[
    /* initialState */ State, 
    /* ownProps */ TOwnProps, 
    MapStateToProps[TStateProps, TOwnProps, State]
  ]
  
  type MapStateToPropsParam[TStateProps, TOwnProps, State] = js.UndefOr[
    (MapStateToPropsFactory[TStateProps, TOwnProps, State]) | (MapStateToProps[TStateProps, TOwnProps, State]) | Null
  ]
  
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  
  trait PureSelectorFactoryComparisonOptions[TStateProps, TOwnProps, State] extends StObject {
    
    val areOwnPropsEqual: EqualityFn[TOwnProps]
    
    val areStatePropsEqual: EqualityFn[TStateProps]
    
    val areStatesEqual: EqualityFn[State]
  }
  object PureSelectorFactoryComparisonOptions {
    
    inline def apply[TStateProps, TOwnProps, State](
      areOwnPropsEqual: (TOwnProps, TOwnProps) => Boolean,
      areStatePropsEqual: (TStateProps, TStateProps) => Boolean,
      areStatesEqual: (State, State) => Boolean
    ): PureSelectorFactoryComparisonOptions[TStateProps, TOwnProps, State] = {
      val __obj = js.Dynamic.literal(areOwnPropsEqual = js.Any.fromFunction2(areOwnPropsEqual), areStatePropsEqual = js.Any.fromFunction2(areStatePropsEqual), areStatesEqual = js.Any.fromFunction2(areStatesEqual))
      __obj.asInstanceOf[PureSelectorFactoryComparisonOptions[TStateProps, TOwnProps, State]]
    }
    
    extension [Self <: PureSelectorFactoryComparisonOptions[?, ?, ?], TStateProps, TOwnProps, State](x: Self & (PureSelectorFactoryComparisonOptions[TStateProps, TOwnProps, State])) {
      
      inline def setAreOwnPropsEqual(value: (TOwnProps, TOwnProps) => Boolean): Self = StObject.set(x, "areOwnPropsEqual", js.Any.fromFunction2(value))
      
      inline def setAreStatePropsEqual(value: (TStateProps, TStateProps) => Boolean): Self = StObject.set(x, "areStatePropsEqual", js.Any.fromFunction2(value))
      
      inline def setAreStatesEqual(value: (State, State) => Boolean): Self = StObject.set(x, "areStatesEqual", js.Any.fromFunction2(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TOwnProps extends null | undefined ? (state : S): TProps : (state : S, ownProps : TOwnProps): TProps
    }}}
    */
  @js.native
  trait Selector[S, TProps, TOwnProps] extends StObject
  
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    /* factoryOptions */ TFactoryOptions, 
    Selector[S, TProps, TOwnProps]
  ]
  
  trait SelectorFactoryOptions[TStateProps, TOwnProps, TDispatchProps, TMergedProps, State]
    extends StObject
       with InitOptions[TStateProps, TOwnProps, TMergedProps, State] {
    
    def initMapDispatchToProps(dispatch: Dispatch[Action[Any]], options: InitOptions[TStateProps, TOwnProps, TMergedProps, State]): WrappedMapDispatchToProps[TDispatchProps, TOwnProps]
    
    def initMapStateToProps(dispatch: Dispatch[Action[Any]], options: InitOptions[TStateProps, TOwnProps, TMergedProps, State]): WrappedMapStateToProps[TStateProps, TOwnProps, State]
    
    def initMergeProps(dispatch: Dispatch[Action[Any]], options: InitOptions[TStateProps, TOwnProps, TMergedProps, State]): MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]
  }
  object SelectorFactoryOptions {
    
    inline def apply[TStateProps, TOwnProps, TDispatchProps, TMergedProps, State](
      WrappedComponent: ComponentType[TOwnProps],
      areMergedPropsEqual: (TMergedProps, TMergedProps) => Boolean,
      areOwnPropsEqual: (TOwnProps, TOwnProps) => Boolean,
      areStatePropsEqual: (TStateProps, TStateProps) => Boolean,
      areStatesEqual: (State, State) => Boolean,
      displayName: String,
      initMapDispatchToProps: (Dispatch[Action[Any]], InitOptions[TStateProps, TOwnProps, TMergedProps, State]) => WrappedMapDispatchToProps[TDispatchProps, TOwnProps],
      initMapStateToProps: (Dispatch[Action[Any]], InitOptions[TStateProps, TOwnProps, TMergedProps, State]) => WrappedMapStateToProps[TStateProps, TOwnProps, State],
      initMergeProps: (Dispatch[Action[Any]], InitOptions[TStateProps, TOwnProps, TMergedProps, State]) => MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps],
      shouldHandleStateChanges: Boolean,
      wrappedComponentName: String
    ): SelectorFactoryOptions[TStateProps, TOwnProps, TDispatchProps, TMergedProps, State] = {
      val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any], areMergedPropsEqual = js.Any.fromFunction2(areMergedPropsEqual), areOwnPropsEqual = js.Any.fromFunction2(areOwnPropsEqual), areStatePropsEqual = js.Any.fromFunction2(areStatePropsEqual), areStatesEqual = js.Any.fromFunction2(areStatesEqual), displayName = displayName.asInstanceOf[js.Any], initMapDispatchToProps = js.Any.fromFunction2(initMapDispatchToProps), initMapStateToProps = js.Any.fromFunction2(initMapStateToProps), initMergeProps = js.Any.fromFunction2(initMergeProps), shouldHandleStateChanges = shouldHandleStateChanges.asInstanceOf[js.Any], wrappedComponentName = wrappedComponentName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorFactoryOptions[TStateProps, TOwnProps, TDispatchProps, TMergedProps, State]]
    }
    
    extension [Self <: SelectorFactoryOptions[?, ?, ?, ?, ?], TStateProps, TOwnProps, TDispatchProps, TMergedProps, State](x: Self & (SelectorFactoryOptions[TStateProps, TOwnProps, TDispatchProps, TMergedProps, State])) {
      
      inline def setInitMapDispatchToProps(
        value: (Dispatch[Action[Any]], InitOptions[TStateProps, TOwnProps, TMergedProps, State]) => WrappedMapDispatchToProps[TDispatchProps, TOwnProps]
      ): Self = StObject.set(x, "initMapDispatchToProps", js.Any.fromFunction2(value))
      
      inline def setInitMapStateToProps(
        value: (Dispatch[Action[Any]], InitOptions[TStateProps, TOwnProps, TMergedProps, State]) => WrappedMapStateToProps[TStateProps, TOwnProps, State]
      ): Self = StObject.set(x, "initMapStateToProps", js.Any.fromFunction2(value))
      
      inline def setInitMergeProps(
        value: (Dispatch[Action[Any]], InitOptions[TStateProps, TOwnProps, TMergedProps, State]) => MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]
      ): Self = StObject.set(x, "initMergeProps", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait WrappedMapDispatchToProps[TDispatchProps, TOwnProps] extends StObject {
    
    def apply(dispatch: Dispatch[Action[Any]], ownProps: TOwnProps): TDispatchProps = js.native
    
    val dependsOnOwnProps: Boolean = js.native
  }
  
  @js.native
  trait WrappedMapStateToProps[TStateProps, TOwnProps, State] extends StObject {
    
    def apply(state: State, ownProps: TOwnProps): TStateProps = js.native
    
    val dependsOnOwnProps: Boolean = js.native
  }
}
