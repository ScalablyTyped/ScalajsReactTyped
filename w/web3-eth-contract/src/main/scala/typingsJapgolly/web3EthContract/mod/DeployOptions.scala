package typingsJapgolly.web3EthContract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployOptions extends js.Object {
  var arguments: js.UndefOr[js.Array[_]] = js.undefined
  var data: String
}

object DeployOptions {
  @scala.inline
  def apply(data: String, arguments: js.Array[_] = null): DeployOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployOptions]
  }
}

