package typingsJapgolly.maximMazurokGapiClientTranslate.gapi.client.translate

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTranslate.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientTranslate.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTranslate.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTranslate.anon.Fields
import typingsJapgolly.maximMazurokGapiClientTranslate.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlossaryEntriesResource extends StObject {
  
  /** Creates a glossary entry. */
  def create(request: Accesstoken): Request[GlossaryEntry] = js.native
  def create(request: Alt, body: GlossaryEntry): Request[GlossaryEntry] = js.native
  
  /** Deletes a single entry from the glossary */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a single glossary entry by the given id. */
  def get(): Request[GlossaryEntry] = js.native
  def get(request: Callback): Request[GlossaryEntry] = js.native
  
  /** List the entries for the glossary. */
  def list(): Request[ListGlossaryEntriesResponse] = js.native
  def list(request: Fields): Request[ListGlossaryEntriesResponse] = js.native
  
  def patch(request: Callback, body: GlossaryEntry): Request[GlossaryEntry] = js.native
  /** Updates a glossary entry. */
  def patch(request: Key): Request[GlossaryEntry] = js.native
}
