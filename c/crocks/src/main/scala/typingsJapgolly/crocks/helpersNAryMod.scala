package typingsJapgolly.crocks

import typingsJapgolly.crocks.internalTypesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersNAryMod {
  
  @JSImport("crocks/helpers/nAry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(n: Double): js.Function1[/* fn */ VariadicFunction, VariadicFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ VariadicFunction, VariadicFunction]]
  /**
    * nAry :: Number -> ((*) -> a) -> (*) -> a
    */
  inline def default(n: Double, fn: VariadicFunction): VariadicFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(n.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[VariadicFunction]
}
