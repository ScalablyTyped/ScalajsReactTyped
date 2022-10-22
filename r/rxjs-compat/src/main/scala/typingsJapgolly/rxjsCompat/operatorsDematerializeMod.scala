package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableNotification
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ValueFromNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsDematerializeMod {
  
  @JSImport("rxjs-compat/operators/dematerialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dematerialize[N /* <: ObservableNotification[Any] */](): OperatorFunction[N, ValueFromNotification[N]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dematerialize")().asInstanceOf[OperatorFunction[N, ValueFromNotification[N]]]
}
