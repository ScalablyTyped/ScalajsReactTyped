package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTakeMod {
  
  @JSImport("rxjs-compat/operator/take", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def take[T](count: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
