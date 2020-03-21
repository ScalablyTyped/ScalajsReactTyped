package typingsJapgolly.tstl

import typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/internal/container/associative/MapElementList.MapElementList.Iterator</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam T * / any, / * import warning: RewrittenClass.unapply cls was tparam Unique * / any, / * import warning: RewrittenClass.unapply cls was tparam Source * / any> */
@js.native
trait IteratoranyanyanyanyEquals extends js.Object {
  /**
    * The first, key element.
    */
  @JSName("first")
  val first_FIteratoranyanyanyanyEquals: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any = js.native
  var list_ : js.Any = js.native
  var next_ : js.Any = js.native
  var prev_ : js.Any = js.native
  /**
    * The second, stored element.
    */
  @JSName("second")
  var second_FIteratoranyanyanyanyEquals: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any = js.native
  var value_ : EntryanyanyConstructor = js.native
  @JSName("value")
  val value_FIteratoranyanyanyanyEquals: EntryanyanyConstructor = js.native
  /* protected */ def _Try_value(): Unit = js.native
  def equals(obj: IteratoranyanyanyanyConstructor): Boolean = js.native
  /**
    * @inheritDoc
    */
  def first(): js.Any = js.native
  def next(): IteratoranyanyanyanyConstructor = js.native
  def prev(): IteratoranyanyanyanyConstructor = js.native
  /**
    * @inheritDoc
    */
  def reverse(): ReverseIterator[
    /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Source */ _
  ] = js.native
  /**
    * @inheritDoc
    */
  def second(): js.Any = js.native
  /**
    * @inheritDoc
    */
  def second(`val`: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any): js.Any = js.native
  /**
    * @inheritDoc
    */
  def source(): js.Any = js.native
  /**
    * @inheritDoc
    */
  def value(): EntryanyanyConstructor = js.native
}

