package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableIifMod {
  
  @JSImport("rxjs/internal/observable/iif", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iif[T, F](condition: js.Function0[Boolean], trueResult: ObservableInput[T], falseResult: ObservableInput[F]): Observable[T | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("iif")(condition.asInstanceOf[js.Any], trueResult.asInstanceOf[js.Any], falseResult.asInstanceOf[js.Any])).asInstanceOf[Observable[T | F]]
}
