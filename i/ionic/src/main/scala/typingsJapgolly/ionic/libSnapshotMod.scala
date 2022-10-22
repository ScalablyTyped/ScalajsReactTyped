package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.IdString
import typingsJapgolly.ionic.anon.PartialPaginateArgsResponGuard
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IPaginator
import typingsJapgolly.ionic.definitionsMod.PaginatorState
import typingsJapgolly.ionic.definitionsMod.ResourceClientLoad
import typingsJapgolly.ionic.definitionsMod.ResourceClientPaginate
import typingsJapgolly.ionic.definitionsMod.Response
import typingsJapgolly.ionic.definitionsMod.Snapshot
import typingsJapgolly.ionic.libHttpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSnapshotMod {
  
  @JSImport("ionic/lib/snapshot", "SnapshotClient")
  @js.native
  open class SnapshotClient protected ()
    extends ResourceClient
       with ResourceClientLoad[Snapshot]
       with ResourceClientPaginate[Snapshot] {
    def this(hasClientAppToken: SnapshotClientDeps) = this()
    
    /* protected */ var app: IdString = js.native
    
    /* protected */ var client: IClient = js.native
    
    def load(id: String): js.Promise[Snapshot] = js.native
    
    def paginate(args: PartialPaginateArgsResponGuard): IPaginator[Response[js.Array[Snapshot]], PaginatorState] = js.native
    
    /* protected */ var token: String = js.native
  }
  
  trait SnapshotClientDeps extends StObject {
    
    val app: IdString
    
    val client: IClient
    
    val token: String
  }
  object SnapshotClientDeps {
    
    inline def apply(app: IdString, client: IClient, token: String): SnapshotClientDeps = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotClientDeps]
    }
    
    extension [Self <: SnapshotClientDeps](x: Self) {
      
      inline def setApp(value: IdString): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
