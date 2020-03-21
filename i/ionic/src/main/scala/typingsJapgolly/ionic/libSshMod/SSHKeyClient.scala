package typingsJapgolly.ionic.libSshMod

import typingsJapgolly.ionic.AnonIdNumber
import typingsJapgolly.ionic.PartialPaginateArgsResponMax
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IPaginator
import typingsJapgolly.ionic.definitionsMod.PaginatorState
import typingsJapgolly.ionic.definitionsMod.ResourceClientCreate
import typingsJapgolly.ionic.definitionsMod.ResourceClientDelete
import typingsJapgolly.ionic.definitionsMod.ResourceClientLoad
import typingsJapgolly.ionic.definitionsMod.ResourceClientPaginate
import typingsJapgolly.ionic.definitionsMod.Response
import typingsJapgolly.ionic.definitionsMod.SSHKey
import typingsJapgolly.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/ssh", "SSHKeyClient")
@js.native
class SSHKeyClient protected ()
  extends ResourceClient
     with ResourceClientLoad[SSHKey]
     with ResourceClientDelete
     with ResourceClientCreate[SSHKey, SSHKeyCreateDetails]
     with ResourceClientPaginate[SSHKey] {
  def this(hasClientTokenUser: SSHKeyClientDeps) = this()
  var client: IClient = js.native
  var token: String = js.native
  var user: AnonIdNumber = js.native
  /* CompleteClass */
  override def create(details: SSHKeyCreateDetails): js.Promise[SSHKey] = js.native
  def load(id: String): js.Promise[SSHKey] = js.native
  def paginate(args: PartialPaginateArgsResponMax): IPaginator[Response[js.Array[SSHKey]], PaginatorState] = js.native
}

