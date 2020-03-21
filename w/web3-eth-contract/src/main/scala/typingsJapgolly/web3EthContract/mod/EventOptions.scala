package typingsJapgolly.web3EthContract.mod

import typingsJapgolly.web3Core.mod.BlockNumber
import typingsJapgolly.web3Core.mod.LogsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends LogsOptions {
  var filter: js.UndefOr[Filter] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(
    address: String | js.Array[String] = null,
    filter: Filter = null,
    fromBlock: BlockNumber = null,
    topics: js.Array[String | js.Array[String] | Null] = null
  ): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptions]
  }
}

