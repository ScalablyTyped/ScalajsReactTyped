package typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.Alt
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.Callback
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.UserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeachersResource extends StObject {
  
  def create(request: Alt, body: Teacher): Request[Teacher] = js.native
  /**
    * Creates a teacher of a course. Domain administrators are permitted to [directly add](https://developers.google.com/classroom/guides/manage-users) users within their domain as
    * teachers to courses within their domain. Non-admin users should send an Invitation instead. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting
    * user is not permitted to create teachers in this course or for access errors. * `NOT_FOUND` if the requested course ID does not exist. * `FAILED_PRECONDITION` if the requested
    * user's account is disabled, for the following request errors: * CourseMemberLimitReached * CourseNotModifiable * CourseTeacherLimitReached * UserGroupsMembershipLimitReached *
    * InactiveCourseOwner * `ALREADY_EXISTS` if the user is already a teacher or student in the course.
    */
  def create(request: FieldsKey): Request[Teacher] = js.native
  
  /**
    * Removes the specified teacher from the specified course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to delete
    * teachers of this course or for access errors. * `NOT_FOUND` if no teacher of this course has the requested ID or if the course does not exist. * `FAILED_PRECONDITION` if the
    * requested ID belongs to the primary teacher of this course. * `FAILED_PRECONDITION` if the requested ID belongs to the owner of the course Drive folder. * `FAILED_PRECONDITION` if
    * the course no longer has an active owner.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: UserId): Request[js.Object] = js.native
  
  /**
    * Returns a teacher of a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to view teachers of this course or for
    * access errors. * `NOT_FOUND` if no teacher of this course has the requested ID or if the course does not exist.
    */
  def get(): Request[Teacher] = js.native
  def get(request: UserId): Request[Teacher] = js.native
  
  /**
    * Returns a list of teachers of this course that the requester is permitted to view. This method returns the following error codes: * `NOT_FOUND` if the course does not exist. *
    * `PERMISSION_DENIED` for access errors.
    */
  def list(): Request[ListTeachersResponse] = js.native
  def list(request: Callback): Request[ListTeachersResponse] = js.native
}
