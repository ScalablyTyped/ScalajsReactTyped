package typingsJapgolly.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.IncludeUsedIpRanges
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.Key
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworksResource extends StObject {
  
  /** Service producers use this method to get the configuration of their connection including the import/export of custom routes and subnetwork routes with public IP. */
  def get(): Request[ConsumerConfig] = js.native
  def get(request: IncludeUsedIpRanges): Request[ConsumerConfig] = js.native
  
  var peeredDnsDomains: PeeredDnsDomainsResource = js.native
  
  def updateConsumerConfig(request: Key, body: UpdateConsumerConfigRequest): Request[Operation] = js.native
  /** Service producers use this method to update the configuration of their connection including the import/export of custom routes and subnetwork routes with public IP. */
  def updateConsumerConfig(request: Xgafv): Request[Operation] = js.native
}
