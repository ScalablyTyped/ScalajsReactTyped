package typingsJapgolly.maximMazurokGapiClientMemcache.gapi.client.memcache

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientMemcache.anon.Alt
import typingsJapgolly.maximMazurokGapiClientMemcache.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Alt): Request[Location] = js.native
  
  var instances: InstancesResource = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: PageSize): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
}
