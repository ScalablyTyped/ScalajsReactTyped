package typingsJapgolly.pulumiQuery

import typingsJapgolly.pulumiQuery.baseMod.IterableBase
import typingsJapgolly.pulumiQuery.interfacesMod.AsyncQuerySource
import typingsJapgolly.pulumiQuery.interfacesMod.AsyncQueryable
import typingsJapgolly.pulumiQuery.interfacesMod.AsyncQueryableGrouping
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncQueryableMod {
  
  @JSImport("@pulumi/query/asyncQueryable", "AsyncQueryableImpl")
  @js.native
  open class AsyncQueryableImpl[TSource] protected ()
    extends IterableBase[TSource]
       with AsyncQueryable[TSource] {
    /* protected */ def this(source: AsyncQuerySource[TSource]) = this()
  }
  /* static members */
  object AsyncQueryableImpl {
    
    @JSImport("@pulumi/query/asyncQueryable", "AsyncQueryableImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[TSource](source: AsyncQuerySource[TSource]): AsyncQueryableImpl[TSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncQueryableImpl[TSource]]
  }
  
  @JSImport("@pulumi/query/asyncQueryable", "GroupingImpl")
  @js.native
  open class GroupingImpl[TKey, TSource] protected ()
    extends AsyncQueryableImpl[TSource]
       with AsyncQueryableGrouping[TKey, TSource] {
    def this(key: TKey, group: AsyncIterable[TSource]) = this()
  }
}
