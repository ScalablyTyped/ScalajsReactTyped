package typingsJapgolly.intersperse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T, U](items: js.Array[T], separator: U): js.Array[T | U] = (^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[T | U]]
  
  @JSImport("intersperse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
