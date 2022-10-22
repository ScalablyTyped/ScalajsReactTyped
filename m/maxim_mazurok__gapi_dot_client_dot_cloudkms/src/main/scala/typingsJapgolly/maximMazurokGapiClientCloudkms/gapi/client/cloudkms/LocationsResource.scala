package typingsJapgolly.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudkms.anon.Callback
import typingsJapgolly.maximMazurokGapiClientCloudkms.anon.KeyLocation
import typingsJapgolly.maximMazurokGapiClientCloudkms.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var ekmConnections: EkmConnectionsResource = js.native
  
  def generateRandomBytes(request: KeyLocation, body: GenerateRandomBytesRequest): Request[GenerateRandomBytesResponse] = js.native
  /** Generate random bytes using the Cloud KMS randomness source in the provided location. */
  def generateRandomBytes(request: typingsJapgolly.maximMazurokGapiClientCloudkms.anon.Location): Request[GenerateRandomBytesResponse] = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  var keyRings: KeyRingsResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: PageToken): Request[ListLocationsResponse] = js.native
}
