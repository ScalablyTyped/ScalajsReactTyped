package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsThrowIfEmptyMod {
  
  @JSImport("rxjs-compat/operators/throwIfEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throwIfEmpty[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfEmpty")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throwIfEmpty[T](errorFactory: js.Function0[Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfEmpty")(errorFactory.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
