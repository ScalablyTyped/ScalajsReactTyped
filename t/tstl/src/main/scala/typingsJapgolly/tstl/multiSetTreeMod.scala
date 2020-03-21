package typingsJapgolly.tstl

import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.multiTreeSetMod.MultiTreeSet
import typingsJapgolly.tstl.setElementListMod.SetElementList.Iterator
import typingsJapgolly.tstl.setElementListMod.SetElementList.ReverseIterator
import typingsJapgolly.tstl.setTreeMod.SetTree
import typingsJapgolly.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/MultiSetTree", JSImport.Namespace)
@js.native
object multiSetTreeMod extends js.Object {
  @js.native
  class MultiSetTree[Key, Source /* <: MultiTreeSet[Key, Source, Iterator[Key, `false`, Source], ReverseIterator[Key, `false`, Source]] */] protected () extends SetTree[Key, `false`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
    var _Nearest_by_key: js.Any = js.native
    @JSName("insert")
    def insert_false(`val`: Iterator[Key, `false`, Source]): Unit = js.native
  }
  
}

