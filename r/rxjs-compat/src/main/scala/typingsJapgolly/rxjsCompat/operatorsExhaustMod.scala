package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsExhaustMod {
  
  @JSImport("rxjs-compat/operators/exhaust", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exhaust[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
}
