package typingsJapgolly.arrayInitial

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](array: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def apply[T](array: ArrayLike[T], drop: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], drop.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("array-initial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
