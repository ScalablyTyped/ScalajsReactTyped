package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMapToMod {
  
  @JSImport("rxjs-compat/operator/mapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapTo[T, R](value: R): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTo")(value.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
}
