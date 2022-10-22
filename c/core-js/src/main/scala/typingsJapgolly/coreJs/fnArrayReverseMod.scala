package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnArrayReverseMod {
  
  /* was `typeof core.Array.reverse` */
  inline def apply[T](array: ArrayLike[T]): Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Array[T]]
  
  @JSImport("core-js/fn/array/reverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
