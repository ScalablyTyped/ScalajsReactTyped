package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AccesstokenAltCallback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AltCallbackFields
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.CompanionCreativeIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends StObject {
  
  /** Gets one creative by ID. */
  def get(): Request[Creative] = js.native
  def get(request: Alt): Request[Creative] = js.native
  
  /** Inserts a new creative. */
  def insert(request: AccesstokenAltCallback): Request[Creative] = js.native
  def insert(request: Callback, body: Creative): Request[Creative] = js.native
  
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(): Request[CreativesListResponse] = js.native
  def list(request: CompanionCreativeIds): Request[CreativesListResponse] = js.native
  
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: AltCallbackFields): Request[Creative] = js.native
  def patch(request: Alt, body: Creative): Request[Creative] = js.native
  
  /** Updates an existing creative. */
  def update(request: AccesstokenAltCallback): Request[Creative] = js.native
  def update(request: Callback, body: Creative): Request[Creative] = js.native
}
