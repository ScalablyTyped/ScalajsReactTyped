package typingsJapgolly.coreJs

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnArrayShiftMod {
  
  /* was `typeof core.Array.shift` */
  inline def apply[T](array: ArrayLike[T]): T = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("core-js/library/fn/array/shift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
