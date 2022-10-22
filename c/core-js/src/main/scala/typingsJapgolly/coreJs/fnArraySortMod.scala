package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnArraySortMod {
  
  /* was `typeof core.Array.sort` */
  inline def apply[T](array: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  inline def apply[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Array[T]]
  
  @JSImport("core-js/fn/array/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
