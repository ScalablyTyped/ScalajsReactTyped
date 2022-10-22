package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnArrayEntriesMod {
  
  /* was `typeof core.Array.entries` */
  inline def apply[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Tuple2[Double, T]]]
  
  @JSImport("core-js/fn/array/entries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
