package typingsJapgolly.tstl

import typingsJapgolly.tstl.setElementListMod.SetElementList.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/internal/container/associative/SetElementList.SetElementList.Iterator</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam Unique * / any, / * import warning: RewrittenClass.unapply cls was tparam Source * / any> */
@js.native
trait IteratoranyanyanyEquals extends js.Object {
  var next_ : js.Any = js.native
  var prev_ : js.Any = js.native
  var source_ : js.Any = js.native
  var value_ : /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any = js.native
  @JSName("value")
  val value_FIteratoranyanyanyEquals: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any = js.native
  /* protected */ def _Try_value(): Unit = js.native
  def equals(obj: IteratoranyanyanyConstructor): Boolean = js.native
  def next(): IteratoranyanyanyConstructor = js.native
  def prev(): IteratoranyanyanyConstructor = js.native
  /**
    * @inheritDoc
    */
  def reverse(): ReverseIterator[
    /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Source */ _
  ] = js.native
  /**
    * @inheritDoc
    */
  def source(): js.Any = js.native
  /**
    * @inheritDoc
    */
  def value(): js.Any = js.native
}

