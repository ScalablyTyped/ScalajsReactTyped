package typingsJapgolly.reactRedux

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRedux.anon.Call
import typingsJapgolly.reactRedux.anon.CallDependsOnOwnProps
import typingsJapgolly.reactRedux.anon.DependsOnOwnProps
import typingsJapgolly.reactRedux.anon.DisplayName
import typingsJapgolly.reactRedux.esTypesMod.FixTypeLater
import typingsJapgolly.redux.mod.ActionCreator
import typingsJapgolly.redux.mod.ActionCreatorsMapObject
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConnectWrapMapToPropsMod {
  
  @JSImport("react-redux/es/connect/wrapMapToProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependsOnOwnProps(mapToProps: MapToProps[AnyProps]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependsOnOwnProps")(mapToProps.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def wrapMapToPropsConstant(
    getConstant: js.Function1[
      /* dispatch */ Dispatch[AnyAction], 
      DependsOnOwnProps | ActionCreatorsMapObject[Any] | ActionCreator[Any]
    ]
  ): js.Function1[/* dispatch */ Dispatch[AnyAction], Call] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapMapToPropsConstant")(getConstant.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* dispatch */ Dispatch[AnyAction], Call]]
  
  inline def wrapMapToPropsFunc[P /* <: AnyProps */](mapToProps: MapToProps[AnyProps], methodName: String): js.Function2[
    /* dispatch */ Dispatch[AnyAction], 
    /* hasDisplayName */ DisplayName, 
    CallDependsOnOwnProps[P]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapMapToPropsFunc")(mapToProps.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* dispatch */ Dispatch[AnyAction], 
    /* hasDisplayName */ DisplayName, 
    CallDependsOnOwnProps[P]
  ]]
  
  type AnyProps = StringDictionary[Any]
  
  type AnyState = StringDictionary[Any]
  
  @js.native
  trait MapToProps[P /* <: AnyProps */] extends StObject {
    
    def apply(stateOrDispatch: StateOrDispatch[AnyState]): FixTypeLater = js.native
    def apply(stateOrDispatch: StateOrDispatch[AnyState], ownProps: P): FixTypeLater = js.native
    
    var dependsOnOwnProps: js.UndefOr[Boolean] = js.native
  }
  
  type StateOrDispatch[S /* <: AnyState */] = S | Dispatch[AnyAction]
}
