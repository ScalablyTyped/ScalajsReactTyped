package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AdId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.CallbackFieldsId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.KeyOauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTagsResource extends StObject {
  
  /** Deletes an existing event tag. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Gets one event tag by ID. */
  def get(): Request[EventTag] = js.native
  def get(request: Alt): Request[EventTag] = js.native
  
  def insert(request: Callback, body: EventTag): Request[EventTag] = js.native
  /** Inserts a new event tag. */
  def insert(request: KeyOauthtokenPrettyPrint): Request[EventTag] = js.native
  
  /** Retrieves a list of event tags, possibly filtered. */
  def list(): Request[EventTagsListResponse] = js.native
  def list(request: AdId): Request[EventTagsListResponse] = js.native
  
  def patch(request: Alt, body: EventTag): Request[EventTag] = js.native
  /** Updates an existing event tag. This method supports patch semantics. */
  def patch(request: CallbackFieldsId): Request[EventTag] = js.native
  
  def update(request: Callback, body: EventTag): Request[EventTag] = js.native
  /** Updates an existing event tag. */
  def update(request: KeyOauthtokenPrettyPrint): Request[EventTag] = js.native
}
