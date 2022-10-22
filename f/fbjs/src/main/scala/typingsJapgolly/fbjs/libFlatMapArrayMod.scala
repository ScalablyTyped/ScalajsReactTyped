package typingsJapgolly.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFlatMapArrayMod {
  
  inline def apply[TValue, TNext](array: js.Array[TValue], fn: js.Function2[/* value */ TValue, /* index */ Double, js.Array[TNext]]): js.Array[TNext] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[TNext]]
  
  @JSImport("fbjs/lib/flatMapArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
