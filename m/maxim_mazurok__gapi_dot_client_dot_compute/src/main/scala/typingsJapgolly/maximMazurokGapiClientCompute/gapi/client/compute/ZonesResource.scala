package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZonesResource extends StObject {
  
  /** Returns the specified Zone resource. Gets a list of available zones by making a list() request. */
  def get(): Request[Zone] = js.native
  def get(request: PrettyPrintProjectQuotaUserUploadType): Request[Zone] = js.native
  
  /** Retrieves the list of Zone resources available to the specified project. */
  def list(): Request[ZoneList] = js.native
  def list(request: MaxResults): Request[ZoneList] = js.native
}
