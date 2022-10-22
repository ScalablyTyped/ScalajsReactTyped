package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.LinkId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Maxresults
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUserLinksResource extends StObject {
  
  /** Removes a user from the given account. */
  def delete(): Request[Unit] = js.native
  def delete(request: LinkId): Request[Unit] = js.native
  
  /** Adds a new user to the given account. */
  def insert(request: Oauthtoken): Request[EntityUserLink] = js.native
  def insert(request: PrettyPrint, body: EntityUserLink): Request[EntityUserLink] = js.native
  
  /** Lists account-user links for a given account. */
  def list(): Request[EntityUserLinks] = js.native
  def list(request: Maxresults): Request[EntityUserLinks] = js.native
  
  def update(request: LinkId, body: EntityUserLink): Request[EntityUserLink] = js.native
  /** Updates permissions for an existing user on the given account. */
  def update(request: QuotaUser): Request[EntityUserLink] = js.native
}
