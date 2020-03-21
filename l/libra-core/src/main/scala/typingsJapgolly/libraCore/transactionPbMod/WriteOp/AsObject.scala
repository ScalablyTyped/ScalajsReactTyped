package typingsJapgolly.libraCore.transactionPbMod.WriteOp

import typingsJapgolly.libraCore.transactionPbMod.WriteOpType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accessPath: js.UndefOr[typingsJapgolly.libraCore.accessPathPbMod.AccessPath.AsObject] = js.undefined
  var `type`: WriteOpType
  var value: scala.scalajs.js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    `type`: WriteOpType,
    value: scala.scalajs.js.typedarray.Uint8Array | String,
    accessPath: typingsJapgolly.libraCore.accessPathPbMod.AccessPath.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessPath != null) __obj.updateDynamic("accessPath")(accessPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

