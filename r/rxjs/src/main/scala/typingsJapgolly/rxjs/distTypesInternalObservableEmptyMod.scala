package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableEmptyMod {
  
  @JSImport("rxjs/dist/types/internal/observable/empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/dist/types/internal/observable/empty", "EMPTY")
  @js.native
  val EMPTY_ : Observable[scala.Nothing] = js.native
  
  inline def empty(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Observable[scala.Nothing]]
  inline def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
}
