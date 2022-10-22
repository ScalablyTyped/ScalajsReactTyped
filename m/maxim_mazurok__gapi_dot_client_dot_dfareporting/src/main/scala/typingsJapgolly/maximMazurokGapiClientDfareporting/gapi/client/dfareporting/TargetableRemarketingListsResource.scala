package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.ActiveAdvertiserId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetableRemarketingListsResource extends StObject {
  
  /** Gets one remarketing list by ID. */
  def get(): Request[TargetableRemarketingList] = js.native
  def get(request: Alt): Request[TargetableRemarketingList] = js.native
  
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(): Request[TargetableRemarketingListsListResponse] = js.native
  def list(request: ActiveAdvertiserId): Request[TargetableRemarketingListsListResponse] = js.native
}
