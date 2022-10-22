package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsSkipMod {
  
  @JSImport("rxjs/dist/types/internal/operators/skip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skip[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
