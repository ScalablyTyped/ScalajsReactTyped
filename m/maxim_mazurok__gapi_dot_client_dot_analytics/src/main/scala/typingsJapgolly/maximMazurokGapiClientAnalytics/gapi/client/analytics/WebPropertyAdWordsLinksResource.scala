package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AccountIdAlt
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.KeyOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Startindex
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.UserIpWebPropertyAdWordsLinkId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.WebPropertyAdWordsLinkId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebPropertyAdWordsLinksResource extends StObject {
  
  /** Deletes a web property-Google Ads link. */
  def delete(): Request[Unit] = js.native
  def delete(request: WebPropertyAdWordsLinkId): Request[Unit] = js.native
  
  /** Returns a web property-Google Ads link to which the user has access. */
  def get(): Request[EntityAdWordsLink] = js.native
  def get(request: WebPropertyAdWordsLinkId): Request[EntityAdWordsLink] = js.native
  
  def insert(request: AccountIdAlt, body: EntityAdWordsLink): Request[EntityAdWordsLink] = js.native
  /** Creates a webProperty-Google Ads link. */
  def insert(request: KeyOauthtokenPrettyPrint): Request[EntityAdWordsLink] = js.native
  
  /** Lists webProperty-Google Ads links for a given web property. */
  def list(): Request[EntityAdWordsLinks] = js.native
  def list(request: Startindex): Request[EntityAdWordsLinks] = js.native
  
  /** Updates an existing webProperty-Google Ads link. This method supports patch semantics. */
  def patch(request: UserIpWebPropertyAdWordsLinkId): Request[EntityAdWordsLink] = js.native
  def patch(request: WebPropertyAdWordsLinkId, body: EntityAdWordsLink): Request[EntityAdWordsLink] = js.native
  
  /** Updates an existing webProperty-Google Ads link. */
  def update(request: UserIpWebPropertyAdWordsLinkId): Request[EntityAdWordsLink] = js.native
  def update(request: WebPropertyAdWordsLinkId, body: EntityAdWordsLink): Request[EntityAdWordsLink] = js.native
}
