package typingsJapgolly.tstl.tstlMod

import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "ForwardList")
@js.native
/**
  * Default Constructor.
  */
class ForwardList[T] ()
  extends typingsJapgolly.tstl.forwardListMod.ForwardList[T] {
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
  def this(obj: typingsJapgolly.tstl.forwardListMod.ForwardList[T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
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
  def this(n: Double, `val`: T) = this()
}

@JSImport("tstl/container", "ForwardList")
@js.native
object ForwardList extends js.Object {
  /**
    * Iterator of {@link ForwardList}
    *
    * @author Jeongho Nam - https://github.com/samchon
    */
  @js.native
  class Iterator[T] protected ()
    extends typingsJapgolly.tstl.forwardListMod.ForwardList.Iterator[T]
  
}

