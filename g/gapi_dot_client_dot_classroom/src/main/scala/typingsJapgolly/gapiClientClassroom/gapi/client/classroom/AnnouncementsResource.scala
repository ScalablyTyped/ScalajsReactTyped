package typingsJapgolly.gapiClientClassroom.gapi.client.classroom

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClassroom.AnonAlt
import typingsJapgolly.gapiClientClassroom.AnonAnnouncementStates
import typingsJapgolly.gapiClientClassroom.AnonCourseId
import typingsJapgolly.gapiClientClassroom.AnonFields
import typingsJapgolly.gapiClientClassroom.AnonId
import typingsJapgolly.gapiClientClassroom.AnonKey
import typingsJapgolly.gapiClientClassroom.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnouncementsResource extends js.Object {
  def create(request: AnonAlt, body: Announcement): Request_[Announcement] = js.native
  /**
    * Creates an announcement.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course, create announcements in the requested course, share a
    * Drive attachment, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    * &#42; `FAILED_PRECONDITION` for the following request error:
    * &#42; AttachmentNotVisible
    */
  def create(request: AnonCourseId): Request_[Announcement] = js.native
  /**
    * Deletes an announcement.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding announcement item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting developer project did not create
    * the corresponding announcement, if the requesting user is not permitted
    * to delete the requested course or for access errors.
    * &#42; `FAILED_PRECONDITION` if the requested announcement has already been
    * deleted.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(request: AnonFields): Request_[js.Object] = js.native
  /**
    * Returns an announcement.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or announcement, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or announcement does not exist.
    */
  def get(request: AnonFields): Request_[Announcement] = js.native
  /**
    * Returns a list of announcements that the requester is permitted to view.
    *
    * Course students may only view `PUBLISHED` announcements. Course teachers
    * and domain administrators may view all announcements.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access
    * the requested course or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    */
  def list(request: AnonAnnouncementStates): Request_[ListAnnouncementsResponse] = js.native
  def modifyAssignees(request: AnonFields, body: ModifyAnnouncementAssigneesRequest): Request_[Announcement] = js.native
  /**
    * Modifies assignee mode and options of an announcement.
    *
    * Only a teacher of the course that contains the announcement may
    * call this method.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or course work does not exist.
    */
  def modifyAssignees(request: AnonId): Request_[Announcement] = js.native
  /**
    * Updates one or more fields of an announcement.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting developer project did not create
    * the corresponding announcement or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `FAILED_PRECONDITION` if the requested announcement has already been
    * deleted.
    * &#42; `NOT_FOUND` if the requested course or announcement does not exist
    */
  def patch(request: AnonKey): Request_[Announcement] = js.native
  def patch(request: AnonOauthtoken, body: Announcement): Request_[Announcement] = js.native
}

