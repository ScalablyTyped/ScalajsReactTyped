package typingsJapgolly.itSort

import typingsJapgolly.itSort.itSortInts.`-1`
import typingsJapgolly.itSort.itSortInts.`0`
import typingsJapgolly.itSort.itSortInts.`1`
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](source: js.Iterable[T], sorter: js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`]): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  /**
    * Collects all values from an async iterator, sorts them
    * using the passed function and yields them
    *
    * @template T
    * @param {AsyncIterable<T> | Iterable<T>} source
    * @param {(a: T, b: T) => -1 | 0 | 1} sorter
    */
  inline def apply[T](source: AsyncIterable[T], sorter: js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`]): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  
  @JSImport("it-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
