package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalOperatorsRetryMod.RetryConfig
import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsRetryMod {
  
  @JSImport("rxjs-compat/operators/retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retry[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def retry[T](config: RetryConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(config.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def retry[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
