package typingsJapgolly.reactRedux

import typingsJapgolly.reactRedux.anon.AreMergedPropsEqual
import typingsJapgolly.reactRedux.anon.WrappedComponentName
import typingsJapgolly.reactRedux.esConnectSelectorFactoryMod.MergeProps
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConnectMergePropsMod {
  
  @JSImport("react-redux/es/connect/mergeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultMergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps](stateProps: TStateProps, dispatchProps: TDispatchProps, ownProps: TOwnProps): TMergedProps = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMergeProps")(stateProps.asInstanceOf[js.Any], dispatchProps.asInstanceOf[js.Any], ownProps.asInstanceOf[js.Any])).asInstanceOf[TMergedProps]
  
  inline def mergePropsFactory[TStateProps, TDispatchProps, TOwnProps, TMergedProps](): js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    (/* options */ AreMergedPropsEqual[TMergedProps]) | (/* options */ WrappedComponentName), 
    (MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]) | scala.Nothing
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergePropsFactory")().asInstanceOf[js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    (/* options */ AreMergedPropsEqual[TMergedProps]) | (/* options */ WrappedComponentName), 
    (MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]) | scala.Nothing
  ]]
  inline def mergePropsFactory[TStateProps, TDispatchProps, TOwnProps, TMergedProps](mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]): js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    (/* options */ AreMergedPropsEqual[TMergedProps]) | (/* options */ WrappedComponentName), 
    (MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]) | scala.Nothing
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergePropsFactory")(mergeProps.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    (/* options */ AreMergedPropsEqual[TMergedProps]) | (/* options */ WrappedComponentName), 
    (MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]) | scala.Nothing
  ]]
  
  inline def wrapMergePropsFunc[TStateProps, TDispatchProps, TOwnProps, TMergedProps](mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]): js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    /* options */ AreMergedPropsEqual[TMergedProps], 
    MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapMergePropsFunc")(mergeProps.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    /* options */ AreMergedPropsEqual[TMergedProps], 
    MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps]
  ]]
}
