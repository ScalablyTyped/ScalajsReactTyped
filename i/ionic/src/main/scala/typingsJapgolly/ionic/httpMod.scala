package typingsJapgolly.ionic

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
import typingsJapgolly.ionic.errorsMod.FatalException
import typingsJapgolly.ionic.ionicStrings.UNKNOWN_CONTENT_TYPE
import typingsJapgolly.ionic.ionicStrings.UNKNOWN_RESPONSE_FORMAT
import typingsJapgolly.ionic.ionicStrings.applicationSlashjson
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.superagent.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", JSImport.Namespace)
@js.native
object httpMod extends js.Object {
  @js.native
  class Client protected () extends IClient {
    def this(config: IConfig) = this()
    /* CompleteClass */
    override var config: IConfig = js.native
    /* CompleteClass */
    override def `do`(req: typingsJapgolly.ionic.definitionsMod.SuperAgentRequest): js.Promise[APIResponseSuccess] = js.native
    /* CompleteClass */
    override def make(method: HttpMethod, path: String): js.Promise[AnonReq] = js.native
    /* CompleteClass */
    override def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState] = js.native
  }
  
  @js.native
  class Paginator[T /* <: Response[js.Array[js.Object]] */] protected () extends IPaginator[T, PagePaginatorState] {
    def this(hasClientReqgenGuardStateMax: PaginatorDeps[T, PagePaginatorState]) = this()
    var client: IClient = js.native
    @JSName("guard")
    var guard_Original: PaginatorGuard[T] = js.native
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator_Paginator: js.Function0[this.type] = js.native
    var max: js.UndefOr[Double] = js.native
    @JSName("reqgen")
    var reqgen_Original: PaginatorRequestGenerator = js.native
    /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
    def next(): IteratorResult[js.Promise[T], _] = js.native
    /* protected */ def reqgen(): js.Promise[AnonReq] = js.native
  }
  
  @js.native
  abstract class ResourceClient () extends js.Object {
    /* protected */ def applyAuthentication(req: Request, token: String): Unit = js.native
    /* protected */ def applyModifiers(req: Request): Unit = js.native
    /* protected */ def applyModifiers(req: Request, modifiers: ResourceClientRequestModifiers): Unit = js.native
  }
  
  @js.native
  class TokenPaginator[T /* <: Response[js.Array[js.Object]] */] protected () extends IPaginator[T, TokenPaginatorState] {
    def this(hasClientReqgenGuardStateMax: PaginatorDeps[T, TokenPaginatorState]) = this()
    var client: IClient = js.native
    @JSName("guard")
    var guard_Original: PaginatorGuard[T] = js.native
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator_TokenPaginator: js.Function0[this.type] = js.native
    var max: js.UndefOr[Double] = js.native
    @JSName("reqgen")
    var reqgen_Original: PaginatorRequestGenerator = js.native
    /* protected */ def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
    def isPageTokenResponseMeta(meta: js.Any): /* is ionic.ionic/definitions.APIResponsePageTokenMeta */ Boolean = js.native
    def next(): IteratorResult[js.Promise[T], _] = js.native
    /* protected */ def reqgen(): js.Promise[AnonReq] = js.native
  }
  
  val CONTENT_TYPE_JSON: applicationSlashjson = js.native
  val ERROR_UNKNOWN_CONTENT_TYPE: UNKNOWN_CONTENT_TYPE = js.native
  val ERROR_UNKNOWN_RESPONSE_FORMAT: UNKNOWN_RESPONSE_FORMAT = js.native
  def createFatalAPIFormat(req: SuperAgentRequest, res: APIResponse): FatalException = js.native
  def formatResponseError(req: SuperAgentRequest): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double, body: String): String = js.native
  def formatResponseError(req: SuperAgentRequest, status: Double, body: js.Object): String = js.native
  def formatSuperAgentError(e: SuperAgentError): String = js.native
  def transformAPIResponse(r: SuperAgentResponse): APIResponse = js.native
  type SuperAgentRequest = typingsJapgolly.superagent.mod.SuperAgentRequest
  type SuperAgentResponse = typingsJapgolly.superagent.mod.Response
}

