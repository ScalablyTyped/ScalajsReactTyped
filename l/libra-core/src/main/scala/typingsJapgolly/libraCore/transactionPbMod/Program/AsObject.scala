package typingsJapgolly.libraCore.transactionPbMod.Program

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var argumentsList: js.Array[typingsJapgolly.libraCore.transactionPbMod.TransactionArgument.AsObject]
  var code: scala.scalajs.js.typedarray.Uint8Array | String
  var modulesList: js.Array[scala.scalajs.js.typedarray.Uint8Array | String]
}

object AsObject {
  @scala.inline
  def apply(
    argumentsList: js.Array[typingsJapgolly.libraCore.transactionPbMod.TransactionArgument.AsObject],
    code: scala.scalajs.js.typedarray.Uint8Array | String,
    modulesList: js.Array[scala.scalajs.js.typedarray.Uint8Array | String]
  ): AsObject = {
    val __obj = js.Dynamic.literal(argumentsList = argumentsList.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], modulesList = modulesList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

