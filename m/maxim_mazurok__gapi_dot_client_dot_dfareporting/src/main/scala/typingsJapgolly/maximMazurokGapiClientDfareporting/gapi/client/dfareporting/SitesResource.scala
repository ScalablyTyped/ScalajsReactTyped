package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AcceptsInterstitialPlacements
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.OauthtokenPrettyPrintProfileIdQuotaUser
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.PrettyPrintProfileIdQuotaUserResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesResource extends StObject {
  
  /** Gets one site by ID. */
  def get(): Request[Site] = js.native
  def get(request: Alt): Request[Site] = js.native
  
  def insert(request: Callback, body: Site): Request[Site] = js.native
  /** Inserts a new site. */
  def insert(request: OauthtokenPrettyPrintProfileIdQuotaUser): Request[Site] = js.native
  
  /** Retrieves a list of sites, possibly filtered. This method supports paging. */
  def list(): Request[SitesListResponse] = js.native
  def list(request: AcceptsInterstitialPlacements): Request[SitesListResponse] = js.native
  
  def patch(request: Alt, body: Site): Request[Site] = js.native
  /** Updates an existing site. This method supports patch semantics. */
  def patch(request: PrettyPrintProfileIdQuotaUserResource): Request[Site] = js.native
  
  def update(request: Callback, body: Site): Request[Site] = js.native
  /** Updates an existing site. */
  def update(request: OauthtokenPrettyPrintProfileIdQuotaUser): Request[Site] = js.native
}
