package typingsJapgolly.reactRedux

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.AnyProps
import typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.AnyState
import typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.StateOrDispatch
import typingsJapgolly.reactRedux.esTypesMod.EqualityFn
import typingsJapgolly.reactRedux.esUtilsSubscriptionMod.Listener
import typingsJapgolly.redux.mod.ActionCreator
import typingsJapgolly.redux.mod.ActionCreatorsMapObject
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AreMergedPropsEqual[TMergedProps] extends StObject {
    
    val areMergedPropsEqual: EqualityFn[TMergedProps]
    
    val displayName: String
  }
  object AreMergedPropsEqual {
    
    inline def apply[TMergedProps](areMergedPropsEqual: (TMergedProps, TMergedProps) => Boolean, displayName: String): AreMergedPropsEqual[TMergedProps] = {
      val __obj = js.Dynamic.literal(areMergedPropsEqual = js.Any.fromFunction2(areMergedPropsEqual), displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AreMergedPropsEqual[TMergedProps]]
    }
    
    extension [Self <: AreMergedPropsEqual[?], TMergedProps](x: Self & AreMergedPropsEqual[TMergedProps]) {
      
      inline def setAreMergedPropsEqual(value: (TMergedProps, TMergedProps) => Boolean): Self = StObject.set(x, "areMergedPropsEqual", js.Any.fromFunction2(value))
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(): ActionCreatorsMapObject[Any] | ActionCreator[Any] | DependsOnOwnProps = js.native
    
    var dependsOnOwnProps: Boolean = js.native
  }
  
  @js.native
  trait CallDependsOnOwnProps[P /* <: AnyProps */] extends StObject {
    
    def apply(stateOrDispatch: StateOrDispatch[AnyState]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[AnyProps] = js.native
    def apply(stateOrDispatch: StateOrDispatch[AnyState], ownProps: P): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[AnyProps] = js.native
    
    var dependsOnOwnProps: Boolean = js.native
    
    def mapToProps(stateOrDispatch: StateOrDispatch[AnyState]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[AnyProps] = js.native
    def mapToProps(stateOrDispatch: StateOrDispatch[AnyState], ownProps: P): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[AnyProps] = js.native
  }
  
  trait Clear extends StObject {
    
    def clear(): Unit
    
    def get(): js.Array[Listener]
    
    def subscribe(callback: js.Function0[Unit]): js.Function0[Unit]
  }
  object Clear {
    
    inline def apply(
      clear: Callback,
      get: CallbackTo[js.Array[Listener]],
      subscribe: js.Function0[Unit] => js.Function0[Unit]
    ): Clear = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, get = get.toJsFn, subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Clear]
    }
    
    extension [Self <: Clear](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setGet(value: CallbackTo[js.Array[Listener]]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setSubscribe(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait DependsOnOwnProps extends StObject {
    
    var dependsOnOwnProps: js.UndefOr[Boolean] = js.undefined
    
    var dispatch: js.UndefOr[Dispatch[AnyAction]] = js.undefined
  }
  object DependsOnOwnProps {
    
    inline def apply(): DependsOnOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependsOnOwnProps]
    }
    
    extension [Self <: DependsOnOwnProps](x: Self) {
      
      inline def setDependsOnOwnProps(value: Boolean): Self = StObject.set(x, "dependsOnOwnProps", value.asInstanceOf[js.Any])
      
      inline def setDependsOnOwnPropsUndefined: Self = StObject.set(x, "dependsOnOwnProps", js.undefined)
      
      inline def setDispatch(value: AnyAction => AnyAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
    }
  }
  
  trait DisplayName extends StObject {
    
    var displayName: String
  }
  object DisplayName {
    
    inline def apply(displayName: String): DisplayName = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayName]
    }
    
    extension [Self <: DisplayName](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapToProps extends StObject {
    
    def apply(stateOrDispatch: StringDictionary[Any]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[StringDictionary[Any]] = js.native
    def apply(stateOrDispatch: StringDictionary[Any], ownProps: StringDictionary[Any]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[StringDictionary[Any]] = js.native
    def apply(stateOrDispatch: Dispatch[AnyAction]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[StringDictionary[Any]] = js.native
    def apply(stateOrDispatch: Dispatch[AnyAction], ownProps: StringDictionary[Any]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[StringDictionary[Any]] = js.native
    
    var dependsOnOwnProps: Boolean = js.native
    
    def mapToProps(stateOrDispatch: StringDictionary[Any]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[StringDictionary[Any]] = js.native
    def mapToProps(stateOrDispatch: StringDictionary[Any], ownProps: StringDictionary[Any]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[StringDictionary[Any]] = js.native
    def mapToProps(stateOrDispatch: Dispatch[AnyAction]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[StringDictionary[Any]] = js.native
    def mapToProps(stateOrDispatch: Dispatch[AnyAction], ownProps: StringDictionary[Any]): typingsJapgolly.reactRedux.esConnectWrapMapToPropsMod.MapToProps[StringDictionary[Any]] = js.native
  }
  
  trait WrappedComponent[C /* <: ComponentType[Any] */] extends StObject {
    
    var WrappedComponent: C
  }
  object WrappedComponent {
    
    inline def apply[C /* <: ComponentType[Any] */](WrappedComponent: C): WrappedComponent[C] = {
      val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedComponent[C]]
    }
    
    extension [Self <: WrappedComponent[?], C /* <: ComponentType[Any] */](x: Self & WrappedComponent[C]) {
      
      inline def setWrappedComponent(value: C): Self = StObject.set(x, "WrappedComponent", value.asInstanceOf[js.Any])
    }
  }
  
  trait WrappedComponentName extends StObject {
    
    val wrappedComponentName: String
  }
  object WrappedComponentName {
    
    inline def apply(wrappedComponentName: String): WrappedComponentName = {
      val __obj = js.Dynamic.literal(wrappedComponentName = wrappedComponentName.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedComponentName]
    }
    
    extension [Self <: WrappedComponentName](x: Self) {
      
      inline def setWrappedComponentName(value: String): Self = StObject.set(x, "wrappedComponentName", value.asInstanceOf[js.Any])
    }
  }
}
