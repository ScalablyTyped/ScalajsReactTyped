package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.AccesstokenAltAutoscaler
import typingsJapgolly.maximMazurokGapiClientCompute.anon.AltAutoscaler
import typingsJapgolly.maximMazurokGapiClientCompute.anon.AltAutoscalerCallback
import typingsJapgolly.maximMazurokGapiClientCompute.anon.AutoscalerCallback
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionAutoscalersResource extends StObject {
  
  /** Deletes the specified autoscaler. */
  def delete(): Request[Operation] = js.native
  def delete(request: AltAutoscaler): Request[Operation] = js.native
  
  /** Returns the specified autoscaler. */
  def get(): Request[Autoscaler] = js.native
  def get(request: AutoscalerCallback): Request[Autoscaler] = js.native
  
  def insert(request: Oauthtoken, body: Autoscaler): Request[Operation] = js.native
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: PrettyPrintProjectQuotaUserRegion): Request[Operation] = js.native
  
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(): Request[RegionAutoscalerList] = js.native
  def list(request: Filter): Request[RegionAutoscalerList] = js.native
  
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    */
  def patch(request: AccesstokenAltAutoscaler): Request[Operation] = js.native
  def patch(request: AltAutoscalerCallback, body: Autoscaler): Request[Operation] = js.native
  
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: AccesstokenAltAutoscaler): Request[Operation] = js.native
  def update(request: AltAutoscalerCallback, body: Autoscaler): Request[Operation] = js.native
}
