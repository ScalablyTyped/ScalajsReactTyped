package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.mod.Notification
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMaterializeMod {
  
  @JSImport("rxjs-compat/operator/materialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def materialize[T](): Observable_[Notification[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("materialize")().asInstanceOf[Observable_[Notification[T]]]
}
