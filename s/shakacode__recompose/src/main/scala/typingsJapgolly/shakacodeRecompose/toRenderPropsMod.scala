package typingsJapgolly.shakacodeRecompose

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.shakacodeRecompose.anon.Children
import typingsJapgolly.shakacodeRecompose.mod.InferableComponentEnhancerWithProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#torenderprops
object toRenderPropsMod {
  
  @JSImport("@shakacode/recompose/toRenderProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner & TOutter, TOutter]): FunctionComponent[TOutter & Children[TInner]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hoc.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[TOutter & Children[TInner]]]
}
