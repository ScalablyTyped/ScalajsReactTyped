package typingsJapgolly.qunit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  var after: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
  /**
    * Runs after each test.
    */
  var afterEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
  /**
    * Runs before the first test.
    */
  var before: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
  /**
    * Runs before each test.
    */
  var beforeEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    after: /* assert */ Assert => Callback = null,
    afterEach: /* assert */ Assert => Callback = null,
    before: /* assert */ Assert => Callback = null,
    beforeEach: /* assert */ Assert => Callback = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => after(t0).runNow()))
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => afterEach(t0).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => before(t0).runNow()))
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction1((t0: /* assert */ typingsJapgolly.qunit.Assert) => beforeEach(t0).runNow()))
    __obj.asInstanceOf[Hooks]
  }
}

