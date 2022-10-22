package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnArrayPopMod {
  
  /* was `typeof core.Array.pop` */
  inline def apply[T](array: ArrayLike[T]): T = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("core-js/library/fn/array/pop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
