package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorIsEmptyMod {
  
  @JSImport("rxjs-compat/operator/isEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmpty[T](): Observable_[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[Observable_[Boolean]]
}
