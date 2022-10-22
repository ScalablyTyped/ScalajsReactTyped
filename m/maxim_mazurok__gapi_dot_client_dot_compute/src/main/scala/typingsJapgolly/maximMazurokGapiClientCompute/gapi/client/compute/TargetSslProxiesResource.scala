package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.AltCallbackFieldsKeyOauthtokenPrettyPrintProject
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.QuotaUserTargetSslProxy
import typingsJapgolly.maximMazurokGapiClientCompute.anon.RequestIdResourceTargetSslProxy
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourceTargetSslProxy
import typingsJapgolly.maximMazurokGapiClientCompute.anon.ResourceTargetSslProxyUploadType
import typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetSslProxyUploadType
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetSslProxiesResource extends StObject {
  
  /** Deletes the specified TargetSslProxy resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by making a list() request. */
  def get(): Request[TargetSslProxy] = js.native
  def get(request: QuotaUserTargetSslProxy): Request[TargetSslProxy] = js.native
  
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: AltCallbackFieldsKeyOauthtokenPrettyPrintProject): Request[Operation] = js.native
  def insert(request: Xgafv, body: TargetSslProxy): Request[Operation] = js.native
  
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(): Request[TargetSslProxyList] = js.native
  def list(request: MaxResults): Request[TargetSslProxyList] = js.native
  
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: ResourceTargetSslProxy): Request[Operation] = js.native
  def setBackendService(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetSslProxy,
    body: TargetSslProxiesSetBackendServiceRequest
  ): Request[Operation] = js.native
  
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: TargetSslProxyUploadType): Request[Operation] = js.native
  def setProxyHeader(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetSslProxy,
    body: TargetSslProxiesSetProxyHeaderRequest
  ): Request[Operation] = js.native
  
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: RequestIdResourceTargetSslProxy): Request[Operation] = js.native
  def setSslCertificates(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetSslProxy,
    body: TargetSslProxiesSetSslCertificatesRequest
  ): Request[Operation] = js.native
  
  /**
    * Sets the SSL policy for TargetSslProxy. The SSL policy specifies the server-side support for SSL features. This affects connections between clients and the SSL proxy load balancer.
    * They do not affect the connection between the load balancer and the backends.
    */
  def setSslPolicy(request: ResourceTargetSslProxyUploadType): Request[Operation] = js.native
  def setSslPolicy(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.TargetSslProxy,
    body: SslPolicyReference
  ): Request[Operation] = js.native
}
