package typingsJapgolly.iterateValue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](iterator: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def apply[T](iterator: js.Iterable[T], callback: js.Function1[/* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("iterate-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
