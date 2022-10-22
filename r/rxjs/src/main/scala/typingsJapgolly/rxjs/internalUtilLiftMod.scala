package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalUtilLiftMod {
  
  @JSImport("rxjs/internal/util/lift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasLift(source: Any): /* is rxjs.anon.Lift */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasLift")(source.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.anon.Lift */ Boolean]
  
  inline def operate[T, R](
    init: js.Function2[
      /* liftedSource */ Observable[T], 
      /* subscriber */ Subscriber[R], 
      js.Function0[Unit] | Unit
    ]
  ): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("operate")(init.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
}
