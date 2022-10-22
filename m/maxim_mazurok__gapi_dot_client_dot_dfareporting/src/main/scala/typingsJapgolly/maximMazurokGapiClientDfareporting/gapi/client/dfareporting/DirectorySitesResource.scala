package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AcceptsInStreamVideoPlacements
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.CallbackFieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectorySitesResource extends StObject {
  
  /** Gets one directory site by ID. */
  def get(): Request[DirectorySite] = js.native
  def get(request: Alt): Request[DirectorySite] = js.native
  
  /** Inserts a new directory site. */
  def insert(request: CallbackFieldsKey): Request[DirectorySite] = js.native
  def insert(request: Callback, body: DirectorySite): Request[DirectorySite] = js.native
  
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(): Request[DirectorySitesListResponse] = js.native
  def list(request: AcceptsInStreamVideoPlacements): Request[DirectorySitesListResponse] = js.native
}
