package typingsJapgolly.unsplashJs

import typingsJapgolly.unsplashJs.anon.DownloadLocation_
import typingsJapgolly.unsplashJs.anon.ResponseResponse
import typingsJapgolly.unsplashJs.anon.Total
import typingsJapgolly.unsplashJs.anon.Url
import typingsJapgolly.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typingsJapgolly.unsplashJs.distHelpersRequestMod.CompleteRequestParams
import typingsJapgolly.unsplashJs.distHelpersResponseMod.HandleResponse
import typingsJapgolly.unsplashJs.distMethodsPhotosTypesMod.Full
import typingsJapgolly.unsplashJs.distMethodsPhotosTypesMod.Random
import typingsJapgolly.unsplashJs.distMethodsPhotosTypesMod.Stats
import typingsJapgolly.unsplashJs.distTypesRequestMod.OrientationParam
import typingsJapgolly.unsplashJs.distTypesRequestMod.PaginationParams
import typingsJapgolly.unsplashJs.unsplashJsStrings.high
import typingsJapgolly.unsplashJs.unsplashJsStrings.low
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsPhotosMod {
  
  object get {
    
    @JSImport("unsplash-js/dist/methods/photos", "get")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: PhotoId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: PhotoId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: PhotoId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/photos", "get.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Full] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Full]]
    inline def handleResponse_=(x: HandleResponse[Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object getRandom {
    
    @JSImport("unsplash-js/dist/methods/photos", "getRandom")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: RandomParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: RandomParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/photos", "getRandom.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Random | js.Array[Random]] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Random | js.Array[Random]] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Random | js.Array[Random]]]
    inline def handleResponse_=(x: HandleResponse[Random | js.Array[Random]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object getStats {
    
    @JSImport("unsplash-js/dist/methods/photos", "getStats")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(params: PhotoId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(a: PhotoId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: PhotoId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/photos", "getStats.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Stats] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
    inline def handleResponse_=(x: HandleResponse[Stats]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object list {
    
    @JSImport("unsplash-js/dist/methods/photos", "list")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
    inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/photos", "list.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Total] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
    inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  object trackDownload {
    
    @JSImport("unsplash-js/dist/methods/photos", "trackDownload")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handleRequest(a: DownloadLocation_): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
    inline def handleRequest(a: DownloadLocation_, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
    
    @JSImport("unsplash-js/dist/methods/photos", "trackDownload.handleResponse")
    @js.native
    def handleResponse: HandleResponse[Url] = js.native
    inline def handleResponse(args: ResponseResponse): js.Promise[Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Url]]
    inline def handleResponse_=(x: HandleResponse[Url]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
  }
  
  trait PhotoId extends StObject {
    
    var photoId: String
  }
  object PhotoId {
    
    inline def apply(photoId: String): PhotoId = {
      val __obj = js.Dynamic.literal(photoId = photoId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoId]
    }
    
    extension [Self <: PhotoId](x: Self) {
      
      inline def setPhotoId(value: String): Self = StObject.set(x, "photoId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RandomParams
    extends StObject
       with OrientationParam {
    
    var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var contentFilter: js.UndefOr[low | high] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var featured: js.UndefOr[Boolean] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var topicIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object RandomParams {
    
    inline def apply(): RandomParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomParams]
    }
    
    extension [Self <: RandomParams](x: Self) {
      
      inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
      
      inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
      
      inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value*))
      
      inline def setContentFilter(value: low | high): Self = StObject.set(x, "contentFilter", value.asInstanceOf[js.Any])
      
      inline def setContentFilterUndefined: Self = StObject.set(x, "contentFilter", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
      
      inline def setFeaturedUndefined: Self = StObject.set(x, "featured", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setTopicIds(value: js.Array[String]): Self = StObject.set(x, "topicIds", value.asInstanceOf[js.Any])
      
      inline def setTopicIdsUndefined: Self = StObject.set(x, "topicIds", js.undefined)
      
      inline def setTopicIdsVarargs(value: String*): Self = StObject.set(x, "topicIds", js.Array(value*))
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
