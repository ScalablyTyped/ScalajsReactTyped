package typingsJapgolly.tstl.tstlMod

import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "List")
@js.native
/**
  * Default Constructor.
  */
class List[T] ()
  extends typingsJapgolly.tstl.listMod.List[T] {
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    */
  def this(items: js.Array[T]) = this()
  /**
    * Copy Constructor
    *
    * @param obj Object to copy.
    */
  def this(obj: typingsJapgolly.tstl.listMod.List[T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iteartor of the last position.
    */
  def this(
    first: IForwardIterator[T, IForwardIterator[T, _]],
    last: IForwardIterator[T, IForwardIterator[T, _]]
  ) = this()
  /**
    * Fill Constructor.
    *
    * @param size Initial size.
    * @param val Value to fill.
    */
  def this(size: Double, `val`: T) = this()
}

@JSImport("tstl/container", "List")
@js.native
object List extends js.Object {
  /**
    * Iterator of {@link List}
    *
    * @author Jeongho Nam - https://github.com/samchon
    */
  @js.native
  class Iterator[T] protected ()
    extends typingsJapgolly.tstl.listMod.List.Iterator[T]
  
  /**
    * Reverse iterator of {@link List}
    *
    * @author Jeongho Nam - https://github.com/samchon
    */
  @js.native
  class ReverseIterator[T] ()
    extends typingsJapgolly.tstl.listMod.List.ReverseIterator[T]
  
}

