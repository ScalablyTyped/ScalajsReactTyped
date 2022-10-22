package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectLocationsResource extends StObject {
  
  /** Returns the details for the specified interconnect location. Gets a list of available interconnect locations by making a list() request. */
  def get(): Request[InterconnectLocation] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.InterconnectLocation): Request[InterconnectLocation] = js.native
  
  /** Retrieves the list of interconnect locations available to the specified project. */
  def list(): Request[InterconnectLocationList] = js.native
  def list(request: MaxResults): Request[InterconnectLocationList] = js.native
}
