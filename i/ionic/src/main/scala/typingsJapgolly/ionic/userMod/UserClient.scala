package typingsJapgolly.ionic.userMod

import typingsJapgolly.ionic.definitionsMod.GithubBranch
import typingsJapgolly.ionic.definitionsMod.GithubRepo
import typingsJapgolly.ionic.definitionsMod.IPaginator
import typingsJapgolly.ionic.definitionsMod.ResourceClientLoad
import typingsJapgolly.ionic.definitionsMod.Response
import typingsJapgolly.ionic.definitionsMod.TokenPaginatorState
import typingsJapgolly.ionic.definitionsMod.User
import typingsJapgolly.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/user", "UserClient")
@js.native
class UserClient protected ()
  extends ResourceClient
     with ResourceClientLoad[User] {
  def this(token: String, e: UserClientDeps) = this()
  val e: UserClientDeps = js.native
  val token: String = js.native
  def load(id: Double): js.Promise[User] = js.native
  def loadSelf(): js.Promise[User] = js.native
  def oAuthGithubLogin(id: Double): js.Promise[String] = js.native
  def paginateGithubBranches(userId: Double, repoId: Double): IPaginator[Response[js.Array[GithubBranch]], TokenPaginatorState] = js.native
  def paginateGithubRepositories(id: Double): IPaginator[Response[js.Array[GithubRepo]], TokenPaginatorState] = js.native
}

