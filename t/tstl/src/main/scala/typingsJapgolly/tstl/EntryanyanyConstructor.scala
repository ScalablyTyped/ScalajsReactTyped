package typingsJapgolly.tstl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/utility/Entry.Entry</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam T * / any> */
trait EntryanyanyConstructor extends js.Object {
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
  def equals(obj: Entryanyany): Boolean
  /**
    * @inheritDoc
    */
  def less(obj: Entryanyany): Boolean
}

object EntryanyanyConstructor {
  @scala.inline
  def apply(
    equals: Entryanyany => CallbackTo[Boolean],
    first: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any,
    less: Entryanyany => CallbackTo[Boolean],
    second: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
  ): EntryanyanyConstructor = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.tstl.Entryanyany) => equals(t0).runNow()))
    __obj.updateDynamic("less")(js.Any.fromFunction1((t0: typingsJapgolly.tstl.Entryanyany) => less(t0).runNow()))
    __obj.asInstanceOf[EntryanyanyConstructor]
  }
}

