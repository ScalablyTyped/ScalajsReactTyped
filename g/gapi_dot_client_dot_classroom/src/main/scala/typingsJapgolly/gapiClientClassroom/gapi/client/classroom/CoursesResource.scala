package typingsJapgolly.gapiClientClassroom.gapi.client.classroom

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClassroom.AnonCallbackFields
import typingsJapgolly.gapiClientClassroom.AnonCourseStates
import typingsJapgolly.gapiClientClassroom.AnonIdKey
import typingsJapgolly.gapiClientClassroom.AnonKeyOauthtoken
import typingsJapgolly.gapiClientClassroom.AnonOauthtokenPrettyPrint
import typingsJapgolly.gapiClientClassroom.AnonPrettyPrintQuotaUser
import typingsJapgolly.gapiClientClassroom.AnonQuotaUserResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoursesResource extends js.Object {
  var aliases: AliasesResource = js.native
  var announcements: AnnouncementsResource = js.native
  var courseWork: CourseWorkResource = js.native
  var students: StudentsResource = js.native
  var teachers: TeachersResource = js.native
  var topics: TopicsResource = js.native
  /**
    * Creates a course.
    *
    * The user specified in `ownerId` is the owner of the created course
    * and added as a teacher.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to create
    * courses or for access errors.
    * &#42; `NOT_FOUND` if the primary teacher is not a valid user.
    * &#42; `FAILED_PRECONDITION` if the course owner's account is disabled or for
    * the following request errors:
    * &#42; UserGroupsMembershipLimitReached
    * &#42; `ALREADY_EXISTS` if an alias was specified in the `id` and
    * already exists.
    */
  def create(request: AnonCallbackFields): Request_[Course] = js.native
  def create(request: AnonKeyOauthtoken, body: Course): Request_[Course] = js.native
  /**
    * Deletes a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to delete the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(request: AnonIdKey): Request_[js.Object] = js.native
  /**
    * Returns a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    */
  def get(request: AnonIdKey): Request_[Course] = js.native
  /**
    * Returns a list of courses that the requesting user is permitted to view,
    * restricted to those that match the request. Returned courses are ordered by
    * creation time, with the most recently created coming first.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` for access errors.
    * &#42; `INVALID_ARGUMENT` if the query argument is malformed.
    * &#42; `NOT_FOUND` if any users specified in the query arguments do not exist.
    */
  def list(request: AnonCourseStates): Request_[ListCoursesResponse] = js.native
  /**
    * Updates one or more fields in a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to modify the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    * &#42; `INVALID_ARGUMENT` if invalid fields are specified in the update mask or
    * if no update mask is supplied.
    * &#42; `FAILED_PRECONDITION` for the following request errors:
    * &#42; CourseNotModifiable
    */
  def patch(request: AnonOauthtokenPrettyPrint): Request_[Course] = js.native
  def patch(request: AnonPrettyPrintQuotaUser, body: Course): Request_[Course] = js.native
  def update(request: AnonIdKey, body: Course): Request_[Course] = js.native
  /**
    * Updates a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to modify the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    * &#42; `FAILED_PRECONDITION` for the following request errors:
    * &#42; CourseNotModifiable
    */
  def update(request: AnonQuotaUserResource): Request_[Course] = js.native
}

