package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnArrayValuesMod {
  
  /* was `typeof core.Array.values` */
  inline def apply[T](array: ArrayLike[T]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  
  @JSImport("core-js/library/fn/array/values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
