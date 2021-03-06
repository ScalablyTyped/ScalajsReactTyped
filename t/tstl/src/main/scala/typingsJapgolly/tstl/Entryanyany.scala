package typingsJapgolly.tstl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/utility/Entry.Entry</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam T * / any> */
trait Entryanyany extends js.Object {
  /**
    * The first, key element.
    */
  val first: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any
  /**
    * The second, mapped element.
    */
  var second: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
  /**
    * @inheritDoc
    */
  def equals(
    obj: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ]
  ): Boolean
  /**
    * @inheritDoc
    */
  def less(
    obj: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ]
  ): Boolean
}

object Entryanyany {
  @scala.inline
  def apply(
    equals: Entry[js.Any, js.Any] => CallbackTo[Boolean],
    first: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any,
    less: Entry[js.Any, js.Any] => CallbackTo[Boolean],
    second: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
  ): Entryanyany = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.tstl.entryMod.Entry[js.Any, js.Any]) => equals(t0).runNow()))
    __obj.updateDynamic("less")(js.Any.fromFunction1((t0: typingsJapgolly.tstl.entryMod.Entry[js.Any, js.Any]) => less(t0).runNow()))
    __obj.asInstanceOf[Entryanyany]
  }
}

