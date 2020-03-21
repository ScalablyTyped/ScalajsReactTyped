package typingsJapgolly.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ExecOptions> */
trait PartialExecOptions extends js.Object {
  var env: js.UndefOr[js.Object] = js.undefined
  var failOnNonZeroExit: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialExecOptions {
  @scala.inline
  def apply(
    env: js.Object = null,
    failOnNonZeroExit: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): PartialExecOptions = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnNonZeroExit)) __obj.updateDynamic("failOnNonZeroExit")(failOnNonZeroExit.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialExecOptions]
  }
}

