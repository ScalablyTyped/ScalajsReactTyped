package typingsJapgolly.googleProtobuf.descriptorPbMod.MethodOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var idempotencyLevel: js.UndefOr[IdempotencyLevel] = js.undefined
  var uninterpretedOptionList: js.Array[typingsJapgolly.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[typingsJapgolly.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject],
    deprecated: js.UndefOr[Boolean] = js.undefined,
    idempotencyLevel: IdempotencyLevel = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (idempotencyLevel != null) __obj.updateDynamic("idempotencyLevel")(idempotencyLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

