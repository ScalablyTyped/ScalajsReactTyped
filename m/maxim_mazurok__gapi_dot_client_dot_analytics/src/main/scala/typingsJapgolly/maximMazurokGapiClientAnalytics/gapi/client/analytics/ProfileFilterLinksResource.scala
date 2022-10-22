package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.KeyLinkId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.KeyMaxresults
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.LinkIdOauthtoken
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.PrettyPrintProfileId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileFilterLinksResource extends StObject {
  
  /** Delete a profile filter link. */
  def delete(): Request[Unit] = js.native
  def delete(request: KeyLinkId): Request[Unit] = js.native
  
  /** Returns a single profile filter link. */
  def get(): Request[ProfileFilterLink] = js.native
  def get(request: KeyLinkId): Request[ProfileFilterLink] = js.native
  
  def insert(request: FieldsKey, body: ProfileFilterLink): Request[ProfileFilterLink] = js.native
  /** Create a new profile filter link. */
  def insert(request: PrettyPrintProfileId): Request[ProfileFilterLink] = js.native
  
  /** Lists all profile filter links for a profile. */
  def list(): Request[ProfileFilterLinks] = js.native
  def list(request: KeyMaxresults): Request[ProfileFilterLinks] = js.native
  
  def patch(request: KeyLinkId, body: ProfileFilterLink): Request[ProfileFilterLink] = js.native
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: LinkIdOauthtoken): Request[ProfileFilterLink] = js.native
  
  def update(request: KeyLinkId, body: ProfileFilterLink): Request[ProfileFilterLink] = js.native
  /** Update an existing profile filter link. */
  def update(request: LinkIdOauthtoken): Request[ProfileFilterLink] = js.native
}
