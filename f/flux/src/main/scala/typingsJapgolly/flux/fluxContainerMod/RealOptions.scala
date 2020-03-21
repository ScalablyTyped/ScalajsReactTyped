package typingsJapgolly.flux.fluxContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealOptions extends js.Object {
  /** @default true */
  var pure: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var withContext: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var withProps: js.UndefOr[Boolean] = js.undefined
}

object RealOptions {
  @scala.inline
  def apply(
    pure: js.UndefOr[Boolean] = js.undefined,
    withContext: js.UndefOr[Boolean] = js.undefined,
    withProps: js.UndefOr[Boolean] = js.undefined
  ): RealOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    if (!js.isUndefined(withContext)) __obj.updateDynamic("withContext")(withContext.asInstanceOf[js.Any])
    if (!js.isUndefined(withProps)) __obj.updateDynamic("withProps")(withProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealOptions]
  }
}

