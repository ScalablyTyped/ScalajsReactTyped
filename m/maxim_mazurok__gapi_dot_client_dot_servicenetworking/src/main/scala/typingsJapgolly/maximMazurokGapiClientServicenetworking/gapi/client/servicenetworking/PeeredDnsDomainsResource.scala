package typingsJapgolly.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.Alt
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.Key
import typingsJapgolly.maximMazurokGapiClientServicenetworking.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeeredDnsDomainsResource extends StObject {
  
  def create(request: Key, body: PeeredDnsDomain): Request[Operation] = js.native
  /** Creates a peered DNS domain which sends requests for records in given namespace originating in the service producer VPC network to the consumer VPC network to be resolved. */
  def create(request: Uploadprotocol): Request[Operation] = js.native
  
  /** Deletes a peered DNS domain. */
  def delete(): Request[Operation] = js.native
  def delete(request: Alt): Request[Operation] = js.native
  
  /** Lists peered DNS domains for a connection. */
  def list(): Request[ListPeeredDnsDomainsResponse] = js.native
  def list(request: Key): Request[ListPeeredDnsDomainsResponse] = js.native
}
