package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMapToMod {
  
  @JSImport("rxjs-compat/operators/mapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapTo[R](value: R): OperatorFunction[Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTo")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, R]]
  
  inline def mapTo_TR[T, R](value: R): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTo")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
}
