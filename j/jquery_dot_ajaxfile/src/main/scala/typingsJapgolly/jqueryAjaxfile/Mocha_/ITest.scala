package typingsJapgolly.jqueryAjaxfile.Mocha_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Test` class. */
trait ITest extends IRunnable {
  var parent: ISuite
  var pending: Boolean
  def fullTitle(): String
}

object ITest {
  @scala.inline
  def apply(
    async: Boolean,
    fn: js.Function,
    fullTitle: CallbackTo[String],
    parent: ISuite,
    pending: Boolean,
    sync: Boolean,
    timedOut: Boolean,
    title: String
  ): ITest = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("fullTitle")(fullTitle.toJsFn)
    __obj.asInstanceOf[ITest]
  }
}

