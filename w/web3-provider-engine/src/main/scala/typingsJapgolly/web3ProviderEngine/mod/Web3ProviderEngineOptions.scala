package typingsJapgolly.web3ProviderEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web3ProviderEngineOptions extends js.Object {
  var blockTracker: js.UndefOr[js.Any] = js.undefined
  var blockTrackerProvider: js.UndefOr[js.Any] = js.undefined
  var pollingInterval: js.UndefOr[Double] = js.undefined
}

object Web3ProviderEngineOptions {
  @scala.inline
  def apply(
    blockTracker: js.Any = null,
    blockTrackerProvider: js.Any = null,
    pollingInterval: Int | Double = null
  ): Web3ProviderEngineOptions = {
    val __obj = js.Dynamic.literal()
    if (blockTracker != null) __obj.updateDynamic("blockTracker")(blockTracker.asInstanceOf[js.Any])
    if (blockTrackerProvider != null) __obj.updateDynamic("blockTrackerProvider")(blockTrackerProvider.asInstanceOf[js.Any])
    if (pollingInterval != null) __obj.updateDynamic("pollingInterval")(pollingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web3ProviderEngineOptions]
  }
}

