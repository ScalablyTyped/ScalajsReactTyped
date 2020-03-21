package typingsJapgolly.qunit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedHooks extends js.Object {
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  def after(fn: js.Function1[/* assert */ Assert, Unit]): Unit
  /**
    * Runs after each test.
    */
  def afterEach(fn: js.Function1[/* assert */ Assert, Unit]): Unit
  /**
    * Runs before the first test.
    */
  def before(fn: js.Function1[/* assert */ Assert, Unit]): Unit
  /**
    * Runs before each test.
    */
  def beforeEach(fn: js.Function1[/* assert */ Assert, Unit]): Unit
}

object NestedHooks {
  @scala.inline
  def apply(
    after: js.Function1[/* assert */ Assert, Unit] => Callback,
    afterEach: js.Function1[/* assert */ Assert, Unit] => Callback,
    before: js.Function1[/* assert */ Assert, Unit] => Callback,
    beforeEach: js.Function1[/* assert */ Assert, Unit] => Callback
  ): NestedHooks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(js.Any.fromFunction1((t0: js.Function1[/* assert */ typingsJapgolly.qunit.Assert, scala.Unit]) => after(t0).runNow()))
    __obj.updateDynamic("afterEach")(js.Any.fromFunction1((t0: js.Function1[/* assert */ typingsJapgolly.qunit.Assert, scala.Unit]) => afterEach(t0).runNow()))
    __obj.updateDynamic("before")(js.Any.fromFunction1((t0: js.Function1[/* assert */ typingsJapgolly.qunit.Assert, scala.Unit]) => before(t0).runNow()))
    __obj.updateDynamic("beforeEach")(js.Any.fromFunction1((t0: js.Function1[/* assert */ typingsJapgolly.qunit.Assert, scala.Unit]) => beforeEach(t0).runNow()))
    __obj.asInstanceOf[NestedHooks]
  }
}

