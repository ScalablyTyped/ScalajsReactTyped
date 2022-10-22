package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.KeyNotificationEndpoint
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourceUploadTypeUploadprotocolUserIpXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionNotificationEndpointsResource extends StObject {
  
  /** Deletes the specified NotificationEndpoint in the given region */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.NotificationEndpoint): Request[Operation] = js.native
  
  /** Returns the specified NotificationEndpoint resource in the given region. */
  def get(): Request[NotificationEndpoint] = js.native
  def get(request: KeyNotificationEndpoint): Request[NotificationEndpoint] = js.native
  
  def insert(request: Oauthtoken, body: NotificationEndpoint): Request[Operation] = js.native
  /** Create a NotificationEndpoint in the specified project in the given region using the parameters that are included in the request. */
  def insert(request: ResourceUploadTypeUploadprotocolUserIpXgafv): Request[Operation] = js.native
  
  /** Lists the NotificationEndpoints for a project in the given region. */
  def list(): Request[NotificationEndpointList] = js.native
  def list(request: Filter): Request[NotificationEndpointList] = js.native
}
