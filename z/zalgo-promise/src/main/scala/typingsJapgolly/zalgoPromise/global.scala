package typingsJapgolly.zalgoPromise

import typingsJapgolly.std.Partial
import typingsJapgolly.zalgoPromise.anon.Cancel
import typingsJapgolly.zalgoPromise.promiseMod.FlattenPromises
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ZalgoPromise {
    
    @JSGlobal("ZalgoPromise.ZalgoPromise")
    @js.native
    open class ZalgoPromise[R] ()
      extends typingsJapgolly.zalgoPromise.mod.ZalgoPromise[R] {
      def this(handler: js.Function2[
                /* resolve */ js.Function1[/* result */ R, Unit], 
                /* reject */ js.Function1[/* error */ Any, Unit], 
                Unit
              ]) = this()
    }
    /* static members */
    object ZalgoPromise {
      
      @JSGlobal("ZalgoPromise.ZalgoPromise")
      @js.native
      val ^ : js.Any = js.native
      
      inline def all[X /* <: js.Array[Any] */](promises: X): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[FlattenPromises[X]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[FlattenPromises[X]]]
      
      inline def asyncReject(error: Any): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncReject")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Any]]
      
      inline def delay(delay: Double): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Unit]]
      
      inline def flush(): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Unit]]
      
      inline def hash[O /* <: js.Object */](promises: O): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[FlattenPromises[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(promises.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[FlattenPromises[O]]]
      
      inline def isPromise(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def map[T, X](
        items: js.Array[T],
        method: js.Function1[/* item */ T, typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[X] | X]
      ): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.Array[X]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(items.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.Array[X]]]
      
      inline def onPossiblyUnhandledException(handler: js.Function1[/* err */ Any, Unit]): Cancel = ^.asInstanceOf[js.Dynamic].applyDynamic("onPossiblyUnhandledException")(handler.asInstanceOf[js.Any]).asInstanceOf[Cancel]
      
      inline def reject(error: Any): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Any]]
      
      inline def resolve(): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Unit]]
      inline def resolve[Y](value: Y): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y]]
      inline def resolve[X](value: typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[X]): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[X]]
      
      // to support conditional promising returning method
      inline def `try`[X, A /* <: js.Array[Any] */](
        method: js.Function1[/* args */ A, js.UndefOr[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[X]]]
      ): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.UndefOr[X]] = ^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.UndefOr[X]]]
      inline def `try`[X, A /* <: js.Array[Any] */](
        method: js.Function1[/* args */ A, js.UndefOr[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[X]]],
        context: Any
      ): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.UndefOr[X]] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.UndefOr[X]]]
      inline def `try`[X, A /* <: js.Array[Any] */](
        method: js.Function1[/* args */ A, js.UndefOr[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[X]]],
        context: Any,
        args: Partial[A]
      ): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.UndefOr[X]] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.UndefOr[X]]]
      inline def `try`[X, A /* <: js.Array[Any] */](
        method: js.Function1[/* args */ A, js.UndefOr[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[X]]],
        context: Unit,
        args: Partial[A]
      ): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.UndefOr[X]] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[js.UndefOr[X]]]
      
      inline def try_YA[Y, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, Y]): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y] = ^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y]]
      inline def try_YA[Y, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, Y], context: Any): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y]]
      inline def try_YA[Y, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, Y], context: Any, args: Partial[A]): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y]]
      inline def try_YA[Y, A /* <: js.Array[Any] */](method: js.Function1[/* args */ A, Y], context: Unit, args: Partial[A]): typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y] = (^.asInstanceOf[js.Dynamic].applyDynamic("try")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.zalgoPromise.promiseMod.ZalgoPromise[Y]]
    }
  }
}
