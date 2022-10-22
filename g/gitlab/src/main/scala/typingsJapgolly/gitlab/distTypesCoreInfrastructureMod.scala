package typingsJapgolly.gitlab

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.DelResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PostResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.PutResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureUtilsMod.Bundle
import typingsJapgolly.gitlab.distTypesCoreInfrastructureUtilsMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreInfrastructureMod {
  
  @JSImport("gitlab/dist/types/core/infrastructure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gitlab/dist/types/core/infrastructure", "BaseService")
  @js.native
  open class BaseService ()
    extends typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
  }
  
  object RequestHelper {
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.del")
    @js.native
    def del: js.Function3[
        /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[DelResponse]
      ] = js.native
    inline def del(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): js.Promise[DelResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DelResponse]]
    inline def del(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[DelResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DelResponse]]
    inline def del_=(
      x: js.Function3[
          /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[DelResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("del")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.get")
    @js.native
    def get: js.Function3[
        /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[PaginatedRequestOptions], 
        js.Promise[GetResponse]
      ] = js.native
    inline def get(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): js.Promise[GetResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResponse]]
    inline def get(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: PaginatedRequestOptions
    ): js.Promise[GetResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResponse]]
    inline def get_=(
      x: js.Function3[
          /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[PaginatedRequestOptions], 
          js.Promise[GetResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.post")
    @js.native
    def post: js.Function3[
        /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PostResponse]
      ] = js.native
    inline def post(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): js.Promise[PostResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PostResponse]]
    inline def post(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PostResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PostResponse]]
    inline def post_=(
      x: js.Function3[
          /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[PostResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("post")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.put")
    @js.native
    def put: js.Function3[
        /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PutResponse]
      ] = js.native
    inline def put(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): js.Promise[PutResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutResponse]]
    inline def put(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PutResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutResponse]]
    inline def put_=(
      x: js.Function3[
          /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[PutResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("put")(x.asInstanceOf[js.Any])
    
    @JSImport("gitlab/dist/types/core/infrastructure", "RequestHelper.stream")
    @js.native
    def stream: js.Function3[
        /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        Any
      ] = js.native
    inline def stream(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def stream(
      service: typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def stream_=(
      x: js.Function3[
          /* service */ typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
  }
  
  inline def bundler[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */](services: T): Bundle[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundler")(services.asInstanceOf[js.Any]).asInstanceOf[Bundle[T, P]]
}
