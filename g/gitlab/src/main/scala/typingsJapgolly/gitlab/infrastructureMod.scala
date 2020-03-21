package typingsJapgolly.gitlab

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gitlab.baseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.DelResponse
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.PostResponse
import typingsJapgolly.gitlab.requestHelperMod.PutResponse
import typingsJapgolly.gitlab.utilsMod.Bundle
import typingsJapgolly.gitlab.utilsMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/infrastructure", JSImport.Namespace)
@js.native
object infrastructureMod extends js.Object {
  @js.native
  class BaseService ()
    extends typingsJapgolly.gitlab.baseServiceMod.BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
  }
  
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: String */](services: T): Bundle[T, P] = js.native
  @js.native
  object RequestHelper extends js.Object {
    @JSName("del")
    var del_Original: js.Function3[
        /* service */ typingsJapgolly.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[DelResponse]
      ] = js.native
    @JSName("get")
    var get_Original: js.Function3[
        /* service */ typingsJapgolly.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[PaginatedRequestOptions], 
        js.Promise[GetResponse]
      ] = js.native
    @JSName("post")
    var post_Original: js.Function3[
        /* service */ typingsJapgolly.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PostResponse]
      ] = js.native
    @JSName("put")
    var put_Original: js.Function3[
        /* service */ typingsJapgolly.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PutResponse]
      ] = js.native
    @JSName("stream")
    var stream_Original: js.Function3[
        /* service */ typingsJapgolly.gitlab.baseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        _
      ] = js.native
    def del(service: typingsJapgolly.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[DelResponse] = js.native
    def del(
      service: typingsJapgolly.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[DelResponse] = js.native
    def get(service: typingsJapgolly.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[GetResponse] = js.native
    def get(
      service: typingsJapgolly.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    def post(service: typingsJapgolly.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PostResponse] = js.native
    def post(
      service: typingsJapgolly.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PostResponse] = js.native
    def put(service: typingsJapgolly.gitlab.baseServiceMod.BaseService, endpoint: String): js.Promise[PutResponse] = js.native
    def put(
      service: typingsJapgolly.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PutResponse] = js.native
    def stream(service: typingsJapgolly.gitlab.baseServiceMod.BaseService, endpoint: String): js.Any = js.native
    def stream(
      service: typingsJapgolly.gitlab.baseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Any = js.native
  }
  
}

