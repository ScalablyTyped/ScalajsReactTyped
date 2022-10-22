package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorExhaustMod {
  
  @JSImport("rxjs-compat/operator/exhaust", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exhaust[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[Observable_[T]]
  
  inline def exhaust_TR[T, R](): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[Observable_[R]]
}
