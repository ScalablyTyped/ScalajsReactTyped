package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.Subscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableFromSubscribableMod {
  
  @JSImport("rxjs/dist/types/internal/observable/fromSubscribable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSubscribable[T](subscribable: Subscribable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSubscribable")(subscribable.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
}
