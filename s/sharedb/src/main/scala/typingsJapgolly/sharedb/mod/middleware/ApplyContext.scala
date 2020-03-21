package typingsJapgolly.sharedb.mod.middleware

import typingsJapgolly.sharedb.agentMod.^
import typingsJapgolly.sharedb.mod.Op
import typingsJapgolly.sharedb.mod.Projection
import typingsJapgolly.sharedb.mod.SubmitRequest
import typingsJapgolly.sharedb.mod.sharedb
import typingsJapgolly.sharedb.sharedbMod.Snapshot
import typingsJapgolly.sharedb.sharedbStrings.afterSubmit
import typingsJapgolly.sharedb.sharedbStrings.apply
import typingsJapgolly.sharedb.sharedbStrings.commit
import typingsJapgolly.sharedb.sharedbStrings.connect
import typingsJapgolly.sharedb.sharedbStrings.doc
import typingsJapgolly.sharedb.sharedbStrings.op
import typingsJapgolly.sharedb.sharedbStrings.query
import typingsJapgolly.sharedb.sharedbStrings.readSnapshots
import typingsJapgolly.sharedb.sharedbStrings.receive
import typingsJapgolly.sharedb.sharedbStrings.reply
import typingsJapgolly.sharedb.sharedbStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyContext
  extends BaseContext
     with SubmitRequest

object ApplyContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb,
    collection: String,
    id: String,
    index: String,
    op: Op,
    ops: js.Array[typingsJapgolly.sharedb.sharedbMod.Op],
    options: js.Any,
    retries: Double,
    start: Double,
    channels: js.Array[String] = null,
    maxRetries: Int | Double = null,
    projection: Projection = null,
    saveMilestoneSnapshot: js.UndefOr[Boolean] = js.undefined,
    snapshot: Snapshot = null,
    suppressPublish: js.UndefOr[Boolean] = js.undefined
  ): ApplyContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(saveMilestoneSnapshot)) __obj.updateDynamic("saveMilestoneSnapshot")(saveMilestoneSnapshot.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressPublish)) __obj.updateDynamic("suppressPublish")(suppressPublish.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyContext]
  }
}

