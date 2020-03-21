package typingsJapgolly.mocha.commonMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mocha.Mocha_.Suite_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteFunctions extends js.Object {
  /**
    * Creates a suite.
    */
  def create(opts: CreateOptions): Suite_
  /**
    * Create an exclusive Suite; convenience function
    */
  def only(opts: CreateOptions): Suite_
  /**
    * Create a Suite, but skip it; convenience function
    */
  def skip(opts: CreateOptions): Suite_
}

object SuiteFunctions {
  @scala.inline
  def apply(
    create: CreateOptions => CallbackTo[Suite_],
    only: CreateOptions => CallbackTo[Suite_],
    skip: CreateOptions => CallbackTo[Suite_]
  ): SuiteFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.mocha.commonMod.CreateOptions) => create(t0).runNow()))
    __obj.updateDynamic("only")(js.Any.fromFunction1((t0: typingsJapgolly.mocha.commonMod.CreateOptions) => only(t0).runNow()))
    __obj.updateDynamic("skip")(js.Any.fromFunction1((t0: typingsJapgolly.mocha.commonMod.CreateOptions) => skip(t0).runNow()))
    __obj.asInstanceOf[SuiteFunctions]
  }
}

