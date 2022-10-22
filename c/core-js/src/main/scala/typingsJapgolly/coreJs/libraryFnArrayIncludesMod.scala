package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnArrayIncludesMod {
  
  /* was `typeof core.Array.includes` */
  inline def apply[T](array: ArrayLike[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("core-js/library/fn/array/includes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
