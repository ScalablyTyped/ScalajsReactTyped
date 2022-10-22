package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnArrayKeysMod {
  
  /* was `typeof core.Array.keys` */
  inline def apply[T](array: ArrayLike[T]): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Double]]
  
  @JSImport("core-js/fn/array/keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
