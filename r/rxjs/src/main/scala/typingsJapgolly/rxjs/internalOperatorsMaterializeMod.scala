package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableNotification
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsMaterializeMod {
  
  @JSImport("rxjs/internal/operators/materialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def materialize[T](): OperatorFunction[T, Notification[T] & ObservableNotification[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("materialize")().asInstanceOf[OperatorFunction[T, Notification[T] & ObservableNotification[T]]]
}
