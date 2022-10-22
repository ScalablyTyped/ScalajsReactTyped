package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.rxjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsScanInternalsMod {
  
  @JSImport("rxjs/internal/operators/scanInternals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scanInternals[V, A, S](
    accumulator: js.Function3[/* acc */ V | A | S, /* value */ V, /* index */ Double, A],
    seed: S,
    hasSeed: Boolean,
    emitOnNext: Boolean
  ): js.Function2[/* source */ Observable[V], /* subscriber */ Subscriber[Any], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanInternals")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], hasSeed.asInstanceOf[js.Any], emitOnNext.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* source */ Observable[V], /* subscriber */ Subscriber[Any], Unit]]
  
  inline def scanInternals_true[V, A, S](
    accumulator: js.Function3[/* acc */ V | A | S, /* value */ V, /* index */ Double, A],
    seed: S,
    hasSeed: Boolean,
    emitOnNext: Boolean,
    emitBeforeComplete: `true`
  ): js.Function2[/* source */ Observable[V], /* subscriber */ Subscriber[Any], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanInternals")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], hasSeed.asInstanceOf[js.Any], emitOnNext.asInstanceOf[js.Any], emitBeforeComplete.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* source */ Observable[V], /* subscriber */ Subscriber[Any], Unit]]
}
