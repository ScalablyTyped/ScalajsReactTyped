package typingsJapgolly.tstl

import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.setElementListMod.SetElementList.Iterator
import typingsJapgolly.tstl.setElementListMod.SetElementList.ReverseIterator
import typingsJapgolly.tstl.setTreeMod.SetTree
import typingsJapgolly.tstl.tstlBooleans.`true`
import typingsJapgolly.tstl.uniqueTreeSetMod.UniqueTreeSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/UniqueSetTree", JSImport.Namespace)
@js.native
object uniqueSetTreeMod extends js.Object {
  @js.native
  class UniqueSetTree[Key, Source /* <: UniqueTreeSet[Key, Source, Iterator[Key, `true`, Source], ReverseIterator[Key, `true`, Source]] */] protected () extends SetTree[Key, `true`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
  }
  
}

