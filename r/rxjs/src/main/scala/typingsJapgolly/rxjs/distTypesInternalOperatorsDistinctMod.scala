package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsDistinctMod {
  
  @JSImport("rxjs/dist/types/internal/operators/distinct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distinct[T, K](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinct[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable[Any]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinct[T, K](keySelector: Unit, flushes: Observable[Any]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
