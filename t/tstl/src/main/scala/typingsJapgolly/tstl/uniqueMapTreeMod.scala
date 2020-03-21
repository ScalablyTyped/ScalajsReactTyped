package typingsJapgolly.tstl

import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.mapElementListMod.MapElementList.Iterator
import typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator
import typingsJapgolly.tstl.mapTreeMod.MapTree
import typingsJapgolly.tstl.tstlBooleans.`true`
import typingsJapgolly.tstl.uniqueTreeMapMod.UniqueTreeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/UniqueMapTree", JSImport.Namespace)
@js.native
object uniqueMapTreeMod extends js.Object {
  @js.native
  class UniqueMapTree[Key, T, Source /* <: UniqueTreeMap[
    Key, 
    T, 
    Source, 
    Iterator[Key, T, `true`, Source], 
    ReverseIterator[Key, T, `true`, Source]
  ] */] protected () extends MapTree[Key, T, `true`, Source] {
    def this(source: Source, comp: Comparator[Key, Key]) = this()
  }
  
}

