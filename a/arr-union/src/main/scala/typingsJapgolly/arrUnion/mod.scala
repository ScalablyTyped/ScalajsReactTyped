package typingsJapgolly.arrUnion

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](arrays: ArrayLike[T]*): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[T]]
  
  @JSImport("arr-union", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
