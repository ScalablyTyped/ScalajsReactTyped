package typingsJapgolly.nivoRecompose

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  type DefaultingInferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, Partial[TInjectedProps]]
  
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ ComponentType[TInjectedProps], 
    ComponentClassP[
      (Omit[TInjectedProps, /* keyof TInjectedProps */ String]) & TNeedsProps & js.Object
    ]
  ]
  
  type Mapper[TInner, TOuter] = js.Function1[/* input */ TInner, TOuter]
  
  type PredicateDiff[T] = js.Function2[/* current */ T, /* next */ T, Boolean]
}
