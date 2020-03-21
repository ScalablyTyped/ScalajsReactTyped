package typingsJapgolly.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertOptions extends js.Object {
  var returnNew: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object InsertOptions {
  @scala.inline
  def apply(
    returnNew: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): InsertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnNew)) __obj.updateDynamic("returnNew")(returnNew.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOptions]
  }
}

