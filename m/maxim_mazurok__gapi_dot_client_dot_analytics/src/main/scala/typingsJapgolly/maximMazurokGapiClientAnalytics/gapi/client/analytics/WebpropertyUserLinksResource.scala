package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AccountIdAlt
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.FieldsKeyLinkId
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.OauthtokenPrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.QuotaUserUserIp
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Startindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpropertyUserLinksResource extends StObject {
  
  /** Removes a user from the given web property. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUserUserIp): Request[Unit] = js.native
  
  def insert(request: AccountIdAlt, body: EntityUserLink): Request[EntityUserLink] = js.native
  /** Adds a new user to the given web property. */
  def insert(request: OauthtokenPrettyPrintQuotaUser): Request[EntityUserLink] = js.native
  
  /** Lists webProperty-user links for a given web property. */
  def list(): Request[EntityUserLinks] = js.native
  def list(request: Startindex): Request[EntityUserLinks] = js.native
  
  /** Updates permissions for an existing user on the given web property. */
  def update(request: FieldsKeyLinkId): Request[EntityUserLink] = js.native
  def update(request: QuotaUserUserIp, body: EntityUserLink): Request[EntityUserLink] = js.native
}
