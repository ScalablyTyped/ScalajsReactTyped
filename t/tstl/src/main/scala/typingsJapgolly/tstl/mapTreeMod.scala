package typingsJapgolly.tstl

import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.ipairMod.IPair
import typingsJapgolly.tstl.itreemapMod.ITreeMap
import typingsJapgolly.tstl.mapElementListMod.MapElementList.Iterator
import typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator
import typingsJapgolly.tstl.pairMod.Pair
import typingsJapgolly.tstl.xtreeMod.XTree
import typingsJapgolly.tstl.xtreenodeMod.XTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/MapTree", JSImport.Namespace)
@js.native
object mapTreeMod extends js.Object {
  @js.native
  abstract class MapTree[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] protected () extends XTree[Iterator[Key, T, Unique, Source]] {
    def this(
      source: Source,
      comp: Comparator[Key, Key],
      it_comp: Comparator[Iterator[Key, T, Unique, Source], Iterator[Key, T, Unique, Source]]
    ) = this()
    var key_compare_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    var value_compare_ : js.Any = js.native
    def equal_range(key: Key): Pair[Iterator[Key, T, Unique, Source], Iterator[Key, T, Unique, Source]] = js.native
    def get_by_key(key: Key): (XTreeNode[Iterator[Key, T, Unique, Source]]) | Null = js.native
    def key_comp(): Comparator[Key, Key] = js.native
    def key_eq(): Comparator[Key, Key] = js.native
    def lower_bound(key: Key): Iterator[Key, T, Unique, Source] = js.native
    def nearest_by_key(key: Key): (XTreeNode[Iterator[Key, T, Unique, Source]]) | Null = js.native
    def source(): Source = js.native
    def upper_bound(key: Key): Iterator[Key, T, Unique, Source] = js.native
    def value_comp(): Comparator[IPair[Key, T], IPair[Key, T]] = js.native
  }
  
}

