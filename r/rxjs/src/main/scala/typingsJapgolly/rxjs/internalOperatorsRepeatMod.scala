package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalOperatorsRepeatMod.RepeatConfig
import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsRepeatMod {
  
  @JSImport("rxjs/internal/operators/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def repeat[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def repeat[T](countOrConfig: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(countOrConfig.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def repeat[T](countOrConfig: RepeatConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(countOrConfig.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
