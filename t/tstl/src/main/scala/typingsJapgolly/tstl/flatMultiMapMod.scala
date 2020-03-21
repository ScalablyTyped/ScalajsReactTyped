package typingsJapgolly.tstl

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.flatMultiMapMod.FlatMultiMap.Iterator
import typingsJapgolly.tstl.flatMultiMapMod.FlatMultiMap.ReverseIterator
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipairMod.IPair
import typingsJapgolly.tstl.itreemapMod.ITreeMap
import typingsJapgolly.tstl.multiTreeMapMod.MultiTreeMap
import typingsJapgolly.tstl.tstlBooleans.`false`
import typingsJapgolly.tstl.tstlStrings.experimental
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/container/FlatMultiMap", JSImport.Namespace)
@js.native
object flatMultiMapMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class FlatMultiMap[Key, T] () extends MultiTreeMap[Key, T, FlatMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
    def this(comp: Comparator[Key, Key]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: FlatMultiMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]]
    ) = this()
    def this(items: js.Array[IPair[Key, T]], comp: Comparator[Key, Key]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      comp: Comparator[Key, Key]
    ) = this()
    var _Capsule_key: js.Any = js.native
    var key_comp_ : js.Any = js.native
    /* protected */ def _Handle_erase(has0: js.Object, has1: js.Object): Unit = js.native
    /* protected */ def _Handle_insert(has0: js.Object, has1: js.Object): Unit = js.native
    /**
      * @inheritDoc
      */
    def nth(index: Double): Iterator[Key, T] = js.native
  }
  
  @js.native
  object FlatMultiMap extends js.Object {
    val Iterator: Instantiable0[
        typingsJapgolly.tstl.mapElementVectorMod.MapElementVector.Iterator[
          js.Object, 
          js.Object, 
          Boolean, 
          ITreeMap[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typingsJapgolly.tstl.mapElementVectorMod.MapElementVector.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typingsJapgolly.tstl.mapElementVectorMod.MapElementVector.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typingsJapgolly.tstl.mapElementVectorMod.MapElementVector.ReverseIterator[
          js.Object, 
          js.Object, 
          Boolean, 
          ITreeMap[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typingsJapgolly.tstl.mapElementVectorMod.MapElementVector.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typingsJapgolly.tstl.mapElementVectorMod.MapElementVector.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val __MODULE: experimental = js.native
    type Iterator[Key, T] = typingsJapgolly.tstl.mapElementVectorMod.MapElementVector.Iterator[Key, T, `false`, FlatMultiMap[Key, T]]
    type ReverseIterator[Key, T] = typingsJapgolly.tstl.mapElementVectorMod.MapElementVector.ReverseIterator[Key, T, `false`, FlatMultiMap[Key, T]]
  }
  
}

