package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorFinallyMod {
  
  @JSImport("rxjs-compat/operator/finally", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `finally`[T](callback: js.Function0[Unit]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_finally")(callback.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
