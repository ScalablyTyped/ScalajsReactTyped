package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsWindowMod {
  
  @JSImport("rxjs-compat/operators/window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def window[T](windowBoundaries: Observable[Any]): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("window")(windowBoundaries.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
}
