package typingsJapgolly.reactRedux

import typingsJapgolly.reactRedux.anon.Call
import typingsJapgolly.reactRedux.anon.DisplayName
import typingsJapgolly.reactRedux.anon.MapToProps
import typingsJapgolly.reactRedux.anon.WrappedComponentName
import typingsJapgolly.reactRedux.esConnectSelectorFactoryMod.MapStateToPropsParam
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConnectMapStateToPropsMod {
  
  @JSImport("react-redux/es/connect/mapStateToProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapStateToPropsFactory[TStateProps, TOwnProps, State](mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State]): (js.Function1[/* dispatch */ Dispatch[AnyAction], Call]) | (js.Function2[
    /* dispatch */ Dispatch[Action[Any] | AnyAction], 
    (/* hasDisplayName */ DisplayName) | (/* options */ WrappedComponentName), 
    MapToProps | scala.Nothing
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("mapStateToPropsFactory")(mapStateToProps.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* dispatch */ Dispatch[AnyAction], Call]) | (js.Function2[
    /* dispatch */ Dispatch[Action[Any] | AnyAction], 
    (/* hasDisplayName */ DisplayName) | (/* options */ WrappedComponentName), 
    MapToProps | scala.Nothing
  ])]
}
