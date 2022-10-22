package typingsJapgolly.mobx

import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsIterableMod {
  
  @JSImport("mobx/dist/utils/iterable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeIterable[T](iterator: js.Iterator[T]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeIterable")(iterator.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
}
