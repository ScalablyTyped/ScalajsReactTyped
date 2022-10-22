package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.AccountIdAlt
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.PrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.ProfileIdQuotaUser
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Startindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilesResource extends StObject {
  
  /** Deletes a view (profile). */
  def delete(): Request[Unit] = js.native
  def delete(request: FieldsKey): Request[Unit] = js.native
  
  /** Gets a view (profile) to which the user has access. */
  def get(): Request[Profile] = js.native
  def get(request: FieldsKey): Request[Profile] = js.native
  
  def insert(request: AccountIdAlt, body: Profile): Request[Profile] = js.native
  /** Create a new view (profile). */
  def insert(request: PrettyPrintQuotaUser): Request[Profile] = js.native
  
  /** Lists views (profiles) to which the user has access. */
  def list(): Request[Profiles] = js.native
  def list(request: Startindex): Request[Profiles] = js.native
  
  def patch(request: FieldsKey, body: Profile): Request[Profile] = js.native
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: ProfileIdQuotaUser): Request[Profile] = js.native
  
  def update(request: FieldsKey, body: Profile): Request[Profile] = js.native
  /** Updates an existing view (profile). */
  def update(request: ProfileIdQuotaUser): Request[Profile] = js.native
}
