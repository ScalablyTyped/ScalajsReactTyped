package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsSampleMod {
  
  @JSImport("rxjs/internal/operators/sample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sample[T](notifier: Observable[Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
