package typingsJapgolly.concatMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T, R](xs: js.Array[T], fn: js.Function2[/* x */ T, /* i */ Double, R | js.Array[R]]): js.Array[R] = (^.asInstanceOf[js.Dynamic].apply(xs.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  
  @JSImport("concat-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
