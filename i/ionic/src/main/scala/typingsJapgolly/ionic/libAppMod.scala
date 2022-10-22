package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.Branches
import typingsJapgolly.ionic.anon.PartialPaginateArgsRespon
import typingsJapgolly.ionic.anon.PickAppnameorg
import typingsJapgolly.ionic.definitionsMod.App
import typingsJapgolly.ionic.definitionsMod.AppAssociation
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IPaginator
import typingsJapgolly.ionic.definitionsMod.PaginatorState
import typingsJapgolly.ionic.definitionsMod.ResourceClientCreate
import typingsJapgolly.ionic.definitionsMod.ResourceClientLoad
import typingsJapgolly.ionic.definitionsMod.ResourceClientPaginate
import typingsJapgolly.ionic.definitionsMod.Response
import typingsJapgolly.ionic.libHttpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppMod {
  
  @JSImport("ionic/lib/app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/app", "AppClient")
  @js.native
  open class AppClient protected ()
    extends ResourceClient
       with ResourceClientLoad[App]
       with ResourceClientCreate[App, AppCreateDetails]
       with ResourceClientPaginate[App] {
    def this(token: String, e: AppClientDeps) = this()
    
    /* CompleteClass */
    override def create(details: AppCreateDetails): js.Promise[App] = js.native
    
    def createAssociation(id: String, association: Branches): js.Promise[AppAssociation] = js.native
    
    def deleteAssociation(id: String): js.Promise[Unit] = js.native
    
    val e: AppClientDeps = js.native
    
    def load(id: String): js.Promise[App] = js.native
    
    def paginate(args: Unit, orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
    def paginate(args: PartialPaginateArgsRespon): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
    def paginate(args: PartialPaginateArgsRespon, orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
    
    val token: String = js.native
  }
  
  inline def formatName(app: PickAppnameorg): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatName")(app.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait AppClientDeps extends StObject {
    
    val client: IClient
  }
  object AppClientDeps {
    
    inline def apply(client: IClient): AppClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppClientDeps]
    }
    
    extension [Self <: AppClientDeps](x: Self) {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppCreateDetails extends StObject {
    
    val name: String
    
    val org_id: js.UndefOr[String] = js.undefined
  }
  object AppCreateDetails {
    
    inline def apply(name: String): AppCreateDetails = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCreateDetails]
    }
    
    extension [Self <: AppCreateDetails](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrg_id(value: String): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
      
      inline def setOrg_idUndefined: Self = StObject.set(x, "org_id", js.undefined)
    }
  }
}
