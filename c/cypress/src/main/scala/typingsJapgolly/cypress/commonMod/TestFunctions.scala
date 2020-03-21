package typingsJapgolly.cypress.commonMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.Mocha_
import typingsJapgolly.cypress.Mocha_.Test_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFunctions extends js.Object {
  /**
    * Exclusive test-case.
    */
  def only(mocha: Mocha_, test: Test_): Test_
  /**
    * Number of retry attempts
    */
  def retries(n: Double): Unit
  /**
    * Pending test case.
    */
  def skip(title: String): Unit
}

object TestFunctions {
  @scala.inline
  def apply(only: (Mocha_, Test_) => CallbackTo[Test_], retries: Double => Callback, skip: String => Callback): TestFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("only")(js.Any.fromFunction2((t0: typingsJapgolly.cypress.Mocha_, t1: typingsJapgolly.cypress.Mocha_.Test_) => only(t0, t1).runNow()))
    __obj.updateDynamic("retries")(js.Any.fromFunction1((t0: scala.Double) => retries(t0).runNow()))
    __obj.updateDynamic("skip")(js.Any.fromFunction1((t0: java.lang.String) => skip(t0).runNow()))
    __obj.asInstanceOf[TestFunctions]
  }
}

