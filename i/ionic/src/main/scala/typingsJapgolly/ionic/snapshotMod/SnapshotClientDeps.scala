package typingsJapgolly.ionic.snapshotMod

import typingsJapgolly.ionic.AnonIdString
import typingsJapgolly.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotClientDeps extends js.Object {
  val app: AnonIdString
  val client: IClient
  val token: String
}

object SnapshotClientDeps {
  @scala.inline
  def apply(app: AnonIdString, client: IClient, token: String): SnapshotClientDeps = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnapshotClientDeps]
  }
}

