package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FieldsHealthCheck
import typingsJapgolly.maximMazurokGapiClientCompute.anon.HealthCheckKey
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProject
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthChecksResource extends StObject {
  
  /** Retrieves the list of all HealthCheck resources, regional and global, available to the specified project. */
  def aggregatedList(): Request[HealthChecksAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[HealthChecksAggregatedList] = js.native
  
  /** Deletes the specified HealthCheck resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.HealthCheck): Request[Operation] = js.native
  
  /** Returns the specified HealthCheck resource. Gets a list of available health checks by making a list() request. */
  def get(): Request[HealthCheck] = js.native
  def get(request: FieldsHealthCheck): Request[HealthCheck] = js.native
  
  /** Creates a HealthCheck resource in the specified project using the data included in the request. */
  def insert(request: OauthtokenPrettyPrintProject): Request[Operation] = js.native
  def insert(request: Xgafv, body: HealthCheck): Request[Operation] = js.native
  
  /** Retrieves the list of HealthCheck resources available to the specified project. */
  def list(): Request[HealthCheckList] = js.native
  def list(request: MaxResults): Request[HealthCheckList] = js.native
  
  /**
    * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and
    * processing rules.
    */
  def patch(request: HealthCheckKey): Request[Operation] = js.native
  def patch(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.HealthCheck, body: HealthCheck): Request[Operation] = js.native
  
  /** Updates a HealthCheck resource in the specified project using the data included in the request. */
  def update(request: HealthCheckKey): Request[Operation] = js.native
  def update(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.HealthCheck, body: HealthCheck): Request[Operation] = js.native
}
