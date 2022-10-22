package typingsJapgolly.unsplashJs.anon

import typingsJapgolly.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typingsJapgolly.unsplashJs.distHelpersResponseMod.ApiResponse
import typingsJapgolly.unsplashJs.distMethodsPhotosMod.RandomParams
import typingsJapgolly.unsplashJs.distMethodsPhotosTypesMod.Random
import typingsJapgolly.unsplashJs.distMethodsPhotosTypesMod.Stats
import typingsJapgolly.unsplashJs.distTypesRequestMod.PaginationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends StObject {
  
  def get(a: PhotoIdString): js.Promise[ApiResponse[typingsJapgolly.unsplashJs.distMethodsTopicsTypesMod.Full]] = js.native
  def get(a: PhotoIdString, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typingsJapgolly.unsplashJs.distMethodsTopicsTypesMod.Full]] = js.native
  
  def getRandom(): js.Promise[ApiResponse[Random | js.Array[Random]]] = js.native
  def getRandom(a: Unit, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Random | js.Array[Random]]] = js.native
  def getRandom(a: RandomParams): js.Promise[ApiResponse[Random | js.Array[Random]]] = js.native
  def getRandom(a: RandomParams, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Random | js.Array[Random]]] = js.native
  
  def getStats(a: PhotoIdString): js.Promise[ApiResponse[Stats]] = js.native
  def getStats(a: PhotoIdString, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Stats]] = js.native
  
  def list(): js.Promise[ApiResponse[ResultsTotal]] = js.native
  def list(a: Unit, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[ResultsTotal]] = js.native
  def list(a: PaginationParams): js.Promise[ApiResponse[ResultsTotal]] = js.native
  def list(a: PaginationParams, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[ResultsTotal]] = js.native
  
  def trackDownload(a: DownloadLocation_): js.Promise[ApiResponse[Url]] = js.native
  def trackDownload(a: DownloadLocation_, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Url]] = js.native
}
