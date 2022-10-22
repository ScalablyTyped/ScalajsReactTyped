package typingsJapgolly.ngPackagr

import typingsJapgolly.ngPackagr.libGraphBuildGraphMod.BuildGraph
import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.UnaryFunction
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphTransformMod {
  
  @JSImport("ng-packagr/lib/graph/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformFromPromise(transformFn: PromiseBasedTransform): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFromPromise")(transformFn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  type PromiseBasedTransform = js.Function1[/* graph */ BuildGraph, (js.Promise[BuildGraph | Unit]) | BuildGraph | Unit]
  
  @js.native
  trait Transform extends UnaryFunction[Observable[BuildGraph], Observable[BuildGraph]] {
    
    def apply(source$: Observable_[BuildGraph]): Observable_[BuildGraph] = js.native
  }
}
