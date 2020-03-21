package typingsJapgolly.tstl.tstlMod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.tstl.IteratoranyanyanyanyEquals
import typingsJapgolly.tstl.binaryPredicatorMod.BinaryPredicator
import typingsJapgolly.tstl.hasherMod.Hasher
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipairMod.IPair
import typingsJapgolly.tstl.mapContainerMod.MapContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "HashMap")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class HashMap[Key, T] ()
  extends typingsJapgolly.tstl.hashMapMod.HashMap[Key, T] {
  def this(hash: Hasher[Key]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(items: js.Array[IPair[Key, T]]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: typingsJapgolly.tstl.hashMapMod.HashMap[Key, T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(
    first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]]
  ) = this()
  def this(hash: Hasher[Key], equal: BinaryPredicator[Key, Key]) = this()
  def this(items: js.Array[IPair[Key, T]], hash: Hasher[Key]) = this()
  def this(
    first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    hash: Hasher[Key]
  ) = this()
  def this(items: js.Array[IPair[Key, T]], hash: Hasher[Key], equal: BinaryPredicator[Key, Key]) = this()
  def this(
    first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    hash: Hasher[Key],
    equal: BinaryPredicator[Key, Key]
  ) = this()
}

@JSImport("tstl/container", "HashMap")
@js.native
object HashMap extends js.Object {
  val Iterator: Instantiable0[
    typingsJapgolly.tstl.mapElementListMod.MapElementList.Iterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
        IteratoranyanyanyanyEquals, 
        typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val ReverseIterator: Instantiable0[
    typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
        IteratoranyanyanyanyEquals, 
        typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
}

