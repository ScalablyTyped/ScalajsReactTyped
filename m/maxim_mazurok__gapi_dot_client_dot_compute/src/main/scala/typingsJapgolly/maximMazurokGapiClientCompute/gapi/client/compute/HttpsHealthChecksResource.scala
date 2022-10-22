package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FieldsHttpsHealthCheck
import typingsJapgolly.maximMazurokGapiClientCompute.anon.HttpsHealthCheckKey
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRequestId
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpsHealthChecksResource extends StObject {
  
  /** Deletes the specified HttpsHealthCheck resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.HttpsHealthCheck): Request[Operation] = js.native
  
  /** Returns the specified HttpsHealthCheck resource. Gets a list of available HTTPS health checks by making a list() request. */
  def get(): Request[HttpsHealthCheck] = js.native
  def get(request: FieldsHttpsHealthCheck): Request[HttpsHealthCheck] = js.native
  
  /** Creates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: ProjectQuotaUserRequestId): Request[Operation] = js.native
  def insert(request: Xgafv, body: HttpsHealthCheck): Request[Operation] = js.native
  
  /** Retrieves the list of HttpsHealthCheck resources available to the specified project. */
  def list(): Request[HttpsHealthCheckList] = js.native
  def list(request: MaxResults): Request[HttpsHealthCheckList] = js.native
  
  /**
    * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and
    * processing rules.
    */
  def patch(request: HttpsHealthCheckKey): Request[Operation] = js.native
  def patch(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.HttpsHealthCheck,
    body: HttpsHealthCheck
  ): Request[Operation] = js.native
  
  /** Updates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def update(request: HttpsHealthCheckKey): Request[Operation] = js.native
  def update(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.HttpsHealthCheck,
    body: HttpsHealthCheck
  ): Request[Operation] = js.native
}
