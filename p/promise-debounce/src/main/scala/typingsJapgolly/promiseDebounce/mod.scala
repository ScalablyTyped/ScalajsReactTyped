package typingsJapgolly.promiseDebounce

import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[A /* <: js.Array[Any] */, R /* <: PromiseLike[Any] */, T](fn: js.ThisFunction1[/* this */ T, /* args */ A, R]): js.Function1[/* args */ A, R] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ A, R]]
  inline def apply[A /* <: js.Array[Any] */, R /* <: PromiseLike[Any] */, T](fn: js.ThisFunction1[/* this */ T, /* args */ A, R], ctx: T): js.Function1[/* args */ A, R] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ A, R]]
  
  @JSImport("promise-debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
