package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.AccesstokenAddress
import typingsJapgolly.maximMazurokGapiClientCompute.anon.AddressAlt
import typingsJapgolly.maximMazurokGapiClientCompute.anon.AltCallbackFields
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalAddressesResource extends StObject {
  
  /** Deletes the specified address resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: AccesstokenAddress): Request[Operation] = js.native
  
  /** Returns the specified address resource. Gets a list of available addresses by making a list() request. */
  def get(): Request[Address] = js.native
  def get(request: AddressAlt): Request[Address] = js.native
  
  /** Creates an address resource in the specified project by using the data included in the request. */
  def insert(request: AltCallbackFields): Request[Operation] = js.native
  def insert(request: Xgafv, body: Address): Request[Operation] = js.native
  
  /** Retrieves a list of global addresses. */
  def list(): Request[AddressList] = js.native
  def list(request: MaxResults): Request[AddressList] = js.native
}
