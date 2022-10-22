package typingsJapgolly.unsplashJs.anon

import typingsJapgolly.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typingsJapgolly.unsplashJs.distHelpersResponseMod.ApiResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  def get(a: TopicIdOrSlug): js.Promise[ApiResponse[typingsJapgolly.unsplashJs.distMethodsTopicsTypesMod.Full]] = js.native
  def get(a: TopicIdOrSlug, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typingsJapgolly.unsplashJs.distMethodsTopicsTypesMod.Full]] = js.native
  
  def getPhotos(a: topicIdOrSlugstringPagina): js.Promise[ApiResponse[ResultsTotal]] = js.native
  def getPhotos(a: topicIdOrSlugstringPagina, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[ResultsTotal]] = js.native
  
  def list(a: OmitStrictPaginationParamOrderBy): js.Promise[ApiResponse[ResultsTotal]] = js.native
  def list(a: OmitStrictPaginationParamOrderBy, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[ResultsTotal]] = js.native
}
