package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestId
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ProjectQuotaUserResource
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserRequestIdUploadType
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourceUploadTypeUploadprotocolUrlMap
import typingsJapgolly.maximMazurokGapiClientCompute.anon.UploadprotocolUrlMapUserIp
import typingsJapgolly.maximMazurokGapiClientCompute.anon.UrlMapUserIpXgafv
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMapsResource extends StObject {
  
  /** Retrieves the list of all UrlMap resources, regional and global, available to the specified project. */
  def aggregatedList(): Request[UrlMapsAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[UrlMapsAggregatedList] = js.native
  
  /** Deletes the specified UrlMap resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: QuotaUserRequestIdUploadType): Request[Operation] = js.native
  
  /** Returns the specified UrlMap resource. Gets a list of available URL maps by making a list() request. */
  def get(): Request[UrlMap] = js.native
  def get(request: UploadprotocolUrlMapUserIp): Request[UrlMap] = js.native
  
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestId): Request[Operation] = js.native
  def insert(request: Xgafv, body: UrlMap): Request[Operation] = js.native
  
  def invalidateCache(request: QuotaUserRequestIdUploadType, body: CacheInvalidationRule): Request[Operation] = js.native
  /**
    * Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap. For more information, see [Invalidating cached
    * content](/cdn/docs/invalidating-cached-content).
    */
  def invalidateCache(request: UrlMapUserIpXgafv): Request[Operation] = js.native
  
  /** Retrieves the list of UrlMap resources available to the specified project. */
  def list(): Request[UrlMapList] = js.native
  def list(request: MaxResults): Request[UrlMapList] = js.native
  
  def patch(request: QuotaUserRequestIdUploadType, body: UrlMap): Request[Operation] = js.native
  /** Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules. */
  def patch(request: ResourceUploadTypeUploadprotocolUrlMap): Request[Operation] = js.native
  
  def update(request: QuotaUserRequestIdUploadType, body: UrlMap): Request[Operation] = js.native
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: ResourceUploadTypeUploadprotocolUrlMap): Request[Operation] = js.native
  
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: ProjectQuotaUserResource): Request[UrlMapsValidateResponse] = js.native
  def validate(request: UploadprotocolUrlMapUserIp, body: UrlMapsValidateRequest): Request[UrlMapsValidateResponse] = js.native
}
