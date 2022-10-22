package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.distTypesInternalTypesMod.TruthyTypesOf
import typingsJapgolly.rxjs.rxjsStrings.index
import typingsJapgolly.rxjs.rxjsStrings.value
import typingsJapgolly.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsFindMod {
  
  @JSImport("rxjs/internal/operators/find", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFind[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: Any,
    emit: value | index
  ): js.Function2[/* source */ Observable[T], /* subscriber */ Subscriber[Any], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFind")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], emit.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* source */ Observable[T], /* subscriber */ Subscriber[Any], Unit]]
  
  inline def find[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
  inline def find[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  inline def find[T, A](
    predicate: js.ThisFunction3[/* this */ A, /* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: A
  ): OperatorFunction[T, js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
  
  inline def find_TS[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, js.UndefOr[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[S]]]
  
  inline def find_TSA[T, S /* <: T */, A](
    predicate: js.ThisFunction3[
      /* this */ A, 
      /* value */ T, 
      /* index */ Double, 
      /* source */ Observable[T], 
      /* is S */ Boolean
    ],
    thisArg: A
  ): OperatorFunction[T, js.UndefOr[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.UndefOr[S]]]
}
