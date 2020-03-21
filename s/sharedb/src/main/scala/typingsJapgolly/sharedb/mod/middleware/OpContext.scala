package typingsJapgolly.sharedb.mod.middleware

import typingsJapgolly.sharedb.agentMod.^
import typingsJapgolly.sharedb.mod.sharedb
import typingsJapgolly.sharedb.sharedbMod.Op
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

trait OpContext extends BaseContext {
  var collection: String
  var id: String
  var op: Op
}

object OpContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb,
    collection: String,
    id: String,
    op: Op
  ): OpContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpContext]
  }
}

