package typingsJapgolly.ionic.snapshotMod

import typingsJapgolly.ionic.AnonIdString
import typingsJapgolly.ionic.PartialPaginateArgsResponGuard
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IPaginator
import typingsJapgolly.ionic.definitionsMod.PaginatorState
import typingsJapgolly.ionic.definitionsMod.ResourceClientLoad
import typingsJapgolly.ionic.definitionsMod.ResourceClientPaginate
import typingsJapgolly.ionic.definitionsMod.Response
import typingsJapgolly.ionic.definitionsMod.Snapshot
import typingsJapgolly.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/snapshot", "SnapshotClient")
@js.native
class SnapshotClient protected ()
  extends ResourceClient
     with ResourceClientLoad[Snapshot]
     with ResourceClientPaginate[Snapshot] {
  def this(hasClientAppToken: SnapshotClientDeps) = this()
  var app: AnonIdString = js.native
  var client: IClient = js.native
  var token: String = js.native
  def load(id: String): js.Promise[Snapshot] = js.native
  def paginate(args: PartialPaginateArgsResponGuard): IPaginator[Response[js.Array[Snapshot]], PaginatorState] = js.native
}

