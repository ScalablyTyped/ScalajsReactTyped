package typingsJapgolly.ionic.appMod

import typingsJapgolly.ionic.AnonBranches
import typingsJapgolly.ionic.PartialPaginateArgsRespon
import typingsJapgolly.ionic.definitionsMod.App
import typingsJapgolly.ionic.definitionsMod.AppAssociation
import typingsJapgolly.ionic.definitionsMod.IPaginator
import typingsJapgolly.ionic.definitionsMod.PaginatorState
import typingsJapgolly.ionic.definitionsMod.ResourceClientCreate
import typingsJapgolly.ionic.definitionsMod.ResourceClientLoad
import typingsJapgolly.ionic.definitionsMod.ResourceClientPaginate
import typingsJapgolly.ionic.definitionsMod.Response
import typingsJapgolly.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/app", "AppClient")
@js.native
class AppClient protected ()
  extends ResourceClient
     with ResourceClientLoad[App]
     with ResourceClientCreate[App, AppCreateDetails]
     with ResourceClientPaginate[App] {
  def this(token: String, e: AppClientDeps) = this()
  val e: AppClientDeps = js.native
  val token: String = js.native
  /* CompleteClass */
  override def create(details: AppCreateDetails): js.Promise[App] = js.native
  def createAssociation(id: String, association: AnonBranches): js.Promise[AppAssociation] = js.native
  def deleteAssociation(id: String): js.Promise[Unit] = js.native
  def load(id: String): js.Promise[App] = js.native
  def paginate(args: PartialPaginateArgsRespon): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
  def paginate(args: PartialPaginateArgsRespon, orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
}

