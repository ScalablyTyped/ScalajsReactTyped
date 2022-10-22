package typingsJapgolly.pulumiQuery

import typingsJapgolly.pulumiQuery.interfacesMod.AsyncQuerySource
import typingsJapgolly.pulumiQuery.interfacesMod.GroupedAsyncIterable
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@pulumi/query/base", "GroupedAsyncIterableImpl")
  @js.native
  open class GroupedAsyncIterableImpl[TKey, TSource] protected ()
    extends IterableBase[TSource]
       with GroupedAsyncIterable[TKey, TSource] {
    def this(key: TKey, core: AsyncIterable[TSource]) = this()
  }
  
  /* note: abstract class */ @JSImport("@pulumi/query/base", "IterableBase")
  @js.native
  open class IterableBase[T] protected ()
    extends StObject
       with AsyncIterable[T] {
    def this(source: AsyncQuerySource[T]) = this()
    
    /* protected */ val source: AsyncQuerySource[T] = js.native
  }
}
