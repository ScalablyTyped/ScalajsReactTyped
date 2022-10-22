package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalOperatorsTapMod.TapObserver
import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsTapMod {
  
  @JSImport("rxjs-compat/operators/tap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tap[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: js.Function1[/* value */ T, Unit]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ Any, Unit],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Null, error: js.Function1[/* error */ Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Null, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Null, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Null, error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Unit, error: js.Function1[/* error */ Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Unit, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Unit, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](next: Unit, error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def tap[T](observer: Partial[TapObserver[T]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(observer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
