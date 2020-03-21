package typingsJapgolly.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentOptions extends js.Object {
  /** Execute only this test/experiment? (false) */
  var only: js.UndefOr[Boolean] = js.undefined
  /** Execute tests in parallel? (false) */
  var parallel: js.UndefOr[Boolean] = js.undefined
  /** Skip execution? (false) */
  var skip: js.UndefOr[Boolean] = js.undefined
  /** Set a specific timeout in milliseconds (2000) */
  var timeout: js.UndefOr[Double] = js.undefined
}

object ExperimentOptions {
  @scala.inline
  def apply(
    only: js.UndefOr[Boolean] = js.undefined,
    parallel: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): ExperimentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentOptions]
  }
}

