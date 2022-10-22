package typingsJapgolly.unsplashJs

import typingsJapgolly.unsplashJs.anon.OmitStrictPaginationParam
import typingsJapgolly.unsplashJs.anon.ResponseResponse
import typingsJapgolly.unsplashJs.anon.ResultsTotal
import typingsJapgolly.unsplashJs.anon.Total
import typingsJapgolly.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typingsJapgolly.unsplashJs.distHelpersRequestMod.CompleteRequestParams
import typingsJapgolly.unsplashJs.distHelpersResponseMod.HandleResponse
import typingsJapgolly.unsplashJs.distMethodsTopicsTypesMod.Full
import typingsJapgolly.unsplashJs.distTypesRequestMod.OrientationParam
import typingsJapgolly.unsplashJs.distTypesRequestMod.PaginationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsTopicsMod {
  
  object get {
    
    @JSImport("unsplash-js/dist/methods/topics", "get")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: TopicIdOrSlug): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: TopicIdOrSlug, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/topics", "get.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Full] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Full]]
    inline def handleResponse_=(x: HandleResponse[Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object getPhotos {
    
    @JSImport("unsplash-js/dist/methods/topics", "getPhotos")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: TopicIdOrSlug & PaginationParams & OrientationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(
      a: TopicIdOrSlug & PaginationParams & OrientationParam,
      additionalFetchOptions: AdditionalFetchOptions
    ): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/topics", "getPhotos.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Total] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
    inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object list {
    
    @JSImport("unsplash-js/dist/methods/topics", "list")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: OmitStrictPaginationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: OmitStrictPaginationParam, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/topics", "list.handleResponse")
    @js.native
    def handleResponse: HandleResponse[ResultsTotal] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
    inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  trait TopicIdOrSlug extends StObject {
    
    var topicIdOrSlug: String
  }
  object TopicIdOrSlug {
    
    inline def apply(topicIdOrSlug: String): TopicIdOrSlug = {
      val __obj = js.Dynamic.literal(topicIdOrSlug = topicIdOrSlug.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicIdOrSlug]
    }
    
    extension [Self <: TopicIdOrSlug](x: Self) {
      
      inline def setTopicIdOrSlug(value: String): Self = StObject.set(x, "topicIdOrSlug", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.unsplashJs.unsplashJsStrings.latest
    - typingsJapgolly.unsplashJs.unsplashJsStrings.oldest
    - typingsJapgolly.unsplashJs.unsplashJsStrings.position
    - typingsJapgolly.unsplashJs.unsplashJsStrings.featured
  */
  trait TopicOrderBy extends StObject
  object TopicOrderBy {
    
    inline def featured: typingsJapgolly.unsplashJs.unsplashJsStrings.featured = "featured".asInstanceOf[typingsJapgolly.unsplashJs.unsplashJsStrings.featured]
    
    inline def latest: typingsJapgolly.unsplashJs.unsplashJsStrings.latest = "latest".asInstanceOf[typingsJapgolly.unsplashJs.unsplashJsStrings.latest]
    
    inline def oldest: typingsJapgolly.unsplashJs.unsplashJsStrings.oldest = "oldest".asInstanceOf[typingsJapgolly.unsplashJs.unsplashJsStrings.oldest]
    
    inline def position: typingsJapgolly.unsplashJs.unsplashJsStrings.position = "position".asInstanceOf[typingsJapgolly.unsplashJs.unsplashJsStrings.position]
  }
}
