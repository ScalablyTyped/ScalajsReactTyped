package typingsJapgolly.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMethodOptions extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.undefined
}

object IMethodOptions {
  @scala.inline
  def apply(deprecated: js.UndefOr[Boolean] = js.undefined): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethodOptions]
  }
}

