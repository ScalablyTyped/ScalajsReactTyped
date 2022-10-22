package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable
import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsPublishLastMod {
  
  @JSImport("rxjs-compat/operators/publishLast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publishLast[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishLast")().asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
}
