package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.Req
import typingsJapgolly.ionic.definitionsMod.APIResponse
import typingsJapgolly.ionic.definitionsMod.APIResponseSuccess
import typingsJapgolly.ionic.definitionsMod.HttpMethod
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.IPaginator
import typingsJapgolly.ionic.definitionsMod.PagePaginatorState
import typingsJapgolly.ionic.definitionsMod.PaginateArgs
import typingsJapgolly.ionic.definitionsMod.PaginatorDeps
import typingsJapgolly.ionic.definitionsMod.PaginatorGuard
import typingsJapgolly.ionic.definitionsMod.PaginatorRequestGenerator
import typingsJapgolly.ionic.definitionsMod.PaginatorState
import typingsJapgolly.ionic.definitionsMod.ResourceClientRequestModifiers
import typingsJapgolly.ionic.definitionsMod.Response
import typingsJapgolly.ionic.definitionsMod.SuperAgentError
import typingsJapgolly.ionic.definitionsMod.TokenPaginatorState
import typingsJapgolly.ionic.libErrorsMod.FatalException
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.superagent.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpMod {
  
  @JSImport("ionic/lib/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/http", "CONTENT_TYPE_JSON")
  @js.native
  val CONTENT_TYPE_JSON: /* "application/json" */ String = js.native
  
  @JSImport("ionic/lib/http", "Client")
  @js.native
  open class Client protected ()
    extends StObject
       with IClient {
    def this(config: IConfig) = this()
    
    /* CompleteClass */
    var config: IConfig = js.native
    
    /* CompleteClass */
    override def `do`(req: typingsJapgolly.ionic.definitionsMod.SuperAgentRequest): js.Promise[APIResponseSuccess] = js.native
    
    /* CompleteClass */
    override def make(method: HttpMethod, path: String): js.Promise[Req] = js.native
    
    /* CompleteClass */
    override def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState] = js.native
  }
  
  @JSImport("ionic/lib/http", "ERROR_UNKNOWN_CONTENT_TYPE")
  @js.native
  val ERROR_UNKNOWN_CONTENT_TYPE: /* "UNKNOWN_CONTENT_TYPE" */ String = js.native
  
  @JSImport("ionic/lib/http", "ERROR_UNKNOWN_RESPONSE_FORMAT")
  @js.native
  val ERROR_UNKNOWN_RESPONSE_FORMAT: /* "UNKNOWN_RESPONSE_FORMAT" */ String = js.native
  
  @JSImport("ionic/lib/http", "Paginator")
  @js.native
  open class Paginator[T /* <: Response[js.Array[js.Object]] */] protected ()
    extends StObject
       with IPaginator[T, PagePaginatorState] {
    def this(hasClientReqgenGuardStateMax: PaginatorDeps[T, PagePaginatorState]) = this()
    
    /* protected */ var client: IClient = js.native
    
    /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
    /* protected */ @JSName("guard")
    var guard_Original: PaginatorGuard[T] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Paginator: js.Function0[this.type] = js.native
    
    /* protected */ var max: js.UndefOr[Double] = js.native
    
    def next(): IteratorResult[js.Promise[T], Any] = js.native
    
    /* protected */ def reqgen(): js.Promise[Req] = js.native
    /* protected */ @JSName("reqgen")
    var reqgen_Original: PaginatorRequestGenerator = js.native
  }
  
  /* note: abstract class */ @JSImport("ionic/lib/http", "ResourceClient")
  @js.native
  open class ResourceClient () extends StObject {
    
    /* protected */ def applyAuthentication(req: Request, token: String): Unit = js.native
    
    /* protected */ def applyModifiers(req: Request): Unit = js.native
    /* protected */ def applyModifiers(req: Request, modifiers: ResourceClientRequestModifiers): Unit = js.native
  }
  
  @JSImport("ionic/lib/http", "TokenPaginator")
  @js.native
  open class TokenPaginator[T /* <: Response[js.Array[js.Object]] */] protected ()
    extends StObject
       with IPaginator[T, TokenPaginatorState] {
    def this(hasClientReqgenGuardStateMax: PaginatorDeps[T, TokenPaginatorState]) = this()
    
    /* protected */ var client: IClient = js.native
    
    /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
    /* protected */ @JSName("guard")
    var guard_Original: PaginatorGuard[T] = js.native
    
    def isPageTokenResponseMeta(meta: Any): /* is ionic.ionic/definitions.APIResponsePageTokenMeta */ Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_TokenPaginator: js.Function0[this.type] = js.native
    
    /* protected */ var max: js.UndefOr[Double] = js.native
    
    def next(): IteratorResult[js.Promise[T], Any] = js.native
    
    /* protected */ def reqgen(): js.Promise[Req] = js.native
    /* protected */ @JSName("reqgen")
    var reqgen_Original: PaginatorRequestGenerator = js.native
  }
  
  inline def createFatalAPIFormat(req: SuperAgentRequest, res: APIResponse): FatalException = (^.asInstanceOf[js.Dynamic].applyDynamic("createFatalAPIFormat")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[FatalException]
  
  inline def formatResponseError(req: SuperAgentRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatResponseError")(req.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatResponseError(req: SuperAgentRequest, status: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatResponseError")(req.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatResponseError(req: SuperAgentRequest, status: Double, body: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatResponseError")(req.asInstanceOf[js.Any], status.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatResponseError(req: SuperAgentRequest, status: Double, body: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatResponseError")(req.asInstanceOf[js.Any], status.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatResponseError(req: SuperAgentRequest, status: Unit, body: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatResponseError")(req.asInstanceOf[js.Any], status.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatResponseError(req: SuperAgentRequest, status: Unit, body: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatResponseError")(req.asInstanceOf[js.Any], status.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatSuperAgentError(e: SuperAgentError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatSuperAgentError")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transformAPIResponse(r: SuperAgentResponse): APIResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("transformAPIResponse")(r.asInstanceOf[js.Any]).asInstanceOf[APIResponse]
  
  type SuperAgentRequest = typingsJapgolly.superagent.mod.SuperAgentRequest
  
  type SuperAgentResponse = typingsJapgolly.superagent.mod.Response
}
