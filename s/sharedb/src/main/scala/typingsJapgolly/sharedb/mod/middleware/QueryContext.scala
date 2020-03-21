package typingsJapgolly.sharedb.mod.middleware

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharedb.agentMod.^
import typingsJapgolly.sharedb.mod.DB
import typingsJapgolly.sharedb.mod.Projection
import typingsJapgolly.sharedb.mod.ProjectionFields
import typingsJapgolly.sharedb.mod.sharedb
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

trait QueryContext extends BaseContext {
  var channel: String
  var collection: String
  var db: DB | Null
  var fields: js.UndefOr[ProjectionFields] = js.undefined
  var index: String
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var projection: js.UndefOr[Projection] = js.undefined
  var query: js.Any
  var snapshotProjection: Projection | Null
}

object QueryContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb,
    channel: String,
    collection: String,
    index: String,
    query: js.Any,
    db: DB = null,
    fields: ProjectionFields = null,
    options: StringDictionary[js.Any] = null,
    projection: Projection = null,
    snapshotProjection: Projection = null
  ): QueryContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (snapshotProjection != null) __obj.updateDynamic("snapshotProjection")(snapshotProjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContext]
  }
}

