package typingsJapgolly.hapiLab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@hapi/lab.@hapi/lab.script.TestOptions, 'plan'> */
trait OmitTestOptionsplan extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var retry: js.UndefOr[Double | Boolean] = js.undefined
  var skip: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object OmitTestOptionsplan {
  @scala.inline
  def apply(
    only: js.UndefOr[Boolean] = js.undefined,
    retry: Double | Boolean = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): OmitTestOptionsplan = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTestOptionsplan]
  }
}

