package typingsJapgolly.maximMazurokGapiClientDns.gapi.client.dns

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDns.anon.ClientOperationId
import typingsJapgolly.maximMazurokGapiClientDns.anon.DigestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsKeysResource extends StObject {
  
  /** Fetches the representation of an existing DnsKey. */
  def get(): Request[DnsKey] = js.native
  def get(request: ClientOperationId): Request[DnsKey] = js.native
  
  /** Enumerates DnsKeys to a ResourceRecordSet collection. */
  def list(): Request[DnsKeysListResponse] = js.native
  def list(request: DigestType): Request[DnsKeysListResponse] = js.native
}
