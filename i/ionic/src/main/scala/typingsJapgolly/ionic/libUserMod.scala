package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.GithubBranch
import typingsJapgolly.ionic.definitionsMod.GithubRepo
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IPaginator
import typingsJapgolly.ionic.definitionsMod.ResourceClientLoad
import typingsJapgolly.ionic.definitionsMod.Response
import typingsJapgolly.ionic.definitionsMod.TokenPaginatorState
import typingsJapgolly.ionic.definitionsMod.User
import typingsJapgolly.ionic.libHttpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUserMod {
  
  @JSImport("ionic/lib/user", "UserClient")
  @js.native
  open class UserClient protected ()
    extends ResourceClient
       with ResourceClientLoad[User] {
    def this(token: String, e: UserClientDeps) = this()
    
    val e: UserClientDeps = js.native
    
    def load(id: Double): js.Promise[User] = js.native
    
    def loadSelf(): js.Promise[User] = js.native
    
    def oAuthGithubLogin(id: Double): js.Promise[String] = js.native
    
    def paginateGithubBranches(userId: Double, repoId: Double): IPaginator[Response[js.Array[GithubBranch]], TokenPaginatorState] = js.native
    
    def paginateGithubRepositories(id: Double): IPaginator[Response[js.Array[GithubRepo]], TokenPaginatorState] = js.native
    
    val token: String = js.native
  }
  
  trait UserClientDeps extends StObject {
    
    val client: IClient
  }
  object UserClientDeps {
    
    inline def apply(client: IClient): UserClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserClientDeps]
    }
    
    extension [Self <: UserClientDeps](x: Self) {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
