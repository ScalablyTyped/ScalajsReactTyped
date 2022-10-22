package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.AssignedLocationId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.KeyLocationListId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.LocationListId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.LocationListIdOauthtoken
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PageSizePageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedLocationsResource extends StObject {
  
  def bulkEdit(request: KeyLocationListId, body: BulkEditAssignedLocationsRequest): Request[BulkEditAssignedLocationsResponse] = js.native
  /**
    * Bulk edits multiple assignments between locations and a single location list. The operation will delete the assigned locations provided in
    * BulkEditAssignedLocationsRequest.deleted_assigned_locations and then create the assigned locations provided in BulkEditAssignedLocationsRequest.created_assigned_locations.
    */
  def bulkEdit(request: LocationListId): Request[BulkEditAssignedLocationsResponse] = js.native
  
  def create(request: KeyLocationListId, body: AssignedLocation): Request[AssignedLocation] = js.native
  /** Creates an assignment between a location and a location list. */
  def create(request: LocationListIdOauthtoken): Request[AssignedLocation] = js.native
  
  /** Deletes the assignment between a location and a location list. */
  def delete(): Request[js.Object] = js.native
  def delete(request: AssignedLocationId): Request[js.Object] = js.native
  
  /** Lists locations assigned to a location list. */
  def list(): Request[ListAssignedLocationsResponse] = js.native
  def list(request: PageSizePageToken): Request[ListAssignedLocationsResponse] = js.native
}
