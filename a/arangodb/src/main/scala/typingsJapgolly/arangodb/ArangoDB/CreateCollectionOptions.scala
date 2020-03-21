package typingsJapgolly.arangodb.ArangoDB

import typingsJapgolly.arangodb.AnonAllowUserKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectionOptions extends js.Object {
  var isSystem: js.UndefOr[Boolean] = js.undefined
  var isVolatile: js.UndefOr[Boolean] = js.undefined
  var journalSize: js.UndefOr[Double] = js.undefined
  var keyOptions: js.UndefOr[AnonAllowUserKeys] = js.undefined
  var numberOfShards: js.UndefOr[Double] = js.undefined
  var replicationFactor: js.UndefOr[Double] = js.undefined
  var shardKeys: js.UndefOr[js.Array[String]] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object CreateCollectionOptions {
  @scala.inline
  def apply(
    isSystem: js.UndefOr[Boolean] = js.undefined,
    isVolatile: js.UndefOr[Boolean] = js.undefined,
    journalSize: Int | Double = null,
    keyOptions: AnonAllowUserKeys = null,
    numberOfShards: Int | Double = null,
    replicationFactor: Int | Double = null,
    shardKeys: js.Array[String] = null,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): CreateCollectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSystem)) __obj.updateDynamic("isSystem")(isSystem.asInstanceOf[js.Any])
    if (!js.isUndefined(isVolatile)) __obj.updateDynamic("isVolatile")(isVolatile.asInstanceOf[js.Any])
    if (journalSize != null) __obj.updateDynamic("journalSize")(journalSize.asInstanceOf[js.Any])
    if (keyOptions != null) __obj.updateDynamic("keyOptions")(keyOptions.asInstanceOf[js.Any])
    if (numberOfShards != null) __obj.updateDynamic("numberOfShards")(numberOfShards.asInstanceOf[js.Any])
    if (replicationFactor != null) __obj.updateDynamic("replicationFactor")(replicationFactor.asInstanceOf[js.Any])
    if (shardKeys != null) __obj.updateDynamic("shardKeys")(shardKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionOptions]
  }
}

