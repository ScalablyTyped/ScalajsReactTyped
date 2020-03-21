package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.CoursesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.InvitationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.RegistrationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfilesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Announcement
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Assignment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.AssignmentSubmission
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Attachment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.CloudPubsubTopic
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Course
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseAlias
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseMaterial
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseMaterialSet
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseRosterChangesInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseWork
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseWorkChangesInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.DriveFile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.DriveFolder
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Feed
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Form
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.GlobalPermission
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.GradeHistory
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.GuardianInvitation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.IndividualStudentsOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Invitation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Link
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Material
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyAnnouncementAssigneesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyAttachmentsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyCourseWorkAssigneesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyIndividualStudentsOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.MultipleChoiceQuestion
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.MultipleChoiceSubmission
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Name
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Registration
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.SharedDriveFile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ShortAnswerSubmission
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.StateHistory
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Student
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.StudentSubmission
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.SubmissionHistory
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Teacher
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.TimeOfDay
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.UserProfile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.YouTubeVideo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classroom_ extends js.Object {
  var Courses: js.UndefOr[CoursesCollection] = js.undefined
  var Invitations: js.UndefOr[InvitationsCollection] = js.undefined
  var Registrations: js.UndefOr[RegistrationsCollection] = js.undefined
  var UserProfiles: js.UndefOr[UserProfilesCollection] = js.undefined
  // Create a new instance of Announcement
  def newAnnouncement(): Announcement
  // Create a new instance of Assignment
  def newAssignment(): Assignment
  // Create a new instance of AssignmentSubmission
  def newAssignmentSubmission(): AssignmentSubmission
  // Create a new instance of Attachment
  def newAttachment(): Attachment
  // Create a new instance of CloudPubsubTopic
  def newCloudPubsubTopic(): CloudPubsubTopic
  // Create a new instance of Course
  def newCourse(): Course
  // Create a new instance of CourseAlias
  def newCourseAlias(): CourseAlias
  // Create a new instance of CourseMaterial
  def newCourseMaterial(): CourseMaterial
  // Create a new instance of CourseMaterialSet
  def newCourseMaterialSet(): CourseMaterialSet
  // Create a new instance of CourseRosterChangesInfo
  def newCourseRosterChangesInfo(): CourseRosterChangesInfo
  // Create a new instance of CourseWork
  def newCourseWork(): CourseWork
  // Create a new instance of CourseWorkChangesInfo
  def newCourseWorkChangesInfo(): CourseWorkChangesInfo
  // Create a new instance of Date
  def newDate(): Date
  // Create a new instance of DriveFile
  def newDriveFile(): DriveFile
  // Create a new instance of DriveFolder
  def newDriveFolder(): DriveFolder
  // Create a new instance of Feed
  def newFeed(): Feed
  // Create a new instance of Form
  def newForm(): Form
  // Create a new instance of GlobalPermission
  def newGlobalPermission(): GlobalPermission
  // Create a new instance of GradeHistory
  def newGradeHistory(): GradeHistory
  // Create a new instance of GuardianInvitation
  def newGuardianInvitation(): GuardianInvitation
  // Create a new instance of IndividualStudentsOptions
  def newIndividualStudentsOptions(): IndividualStudentsOptions
  // Create a new instance of Invitation
  def newInvitation(): Invitation
  // Create a new instance of Link
  def newLink(): Link
  // Create a new instance of Material
  def newMaterial(): Material
  // Create a new instance of ModifyAnnouncementAssigneesRequest
  def newModifyAnnouncementAssigneesRequest(): ModifyAnnouncementAssigneesRequest
  // Create a new instance of ModifyAttachmentsRequest
  def newModifyAttachmentsRequest(): ModifyAttachmentsRequest
  // Create a new instance of ModifyCourseWorkAssigneesRequest
  def newModifyCourseWorkAssigneesRequest(): ModifyCourseWorkAssigneesRequest
  // Create a new instance of ModifyIndividualStudentsOptions
  def newModifyIndividualStudentsOptions(): ModifyIndividualStudentsOptions
  // Create a new instance of MultipleChoiceQuestion
  def newMultipleChoiceQuestion(): MultipleChoiceQuestion
  // Create a new instance of MultipleChoiceSubmission
  def newMultipleChoiceSubmission(): MultipleChoiceSubmission
  // Create a new instance of Name
  def newName(): Name
  // Create a new instance of ReclaimStudentSubmissionRequest
  def newReclaimStudentSubmissionRequest(): js.Any
  // Create a new instance of Registration
  def newRegistration(): Registration
  // Create a new instance of ReturnStudentSubmissionRequest
  def newReturnStudentSubmissionRequest(): js.Any
  // Create a new instance of SharedDriveFile
  def newSharedDriveFile(): SharedDriveFile
  // Create a new instance of ShortAnswerSubmission
  def newShortAnswerSubmission(): ShortAnswerSubmission
  // Create a new instance of StateHistory
  def newStateHistory(): StateHistory
  // Create a new instance of Student
  def newStudent(): Student
  // Create a new instance of StudentSubmission
  def newStudentSubmission(): StudentSubmission
  // Create a new instance of SubmissionHistory
  def newSubmissionHistory(): SubmissionHistory
  // Create a new instance of Teacher
  def newTeacher(): Teacher
  // Create a new instance of TimeOfDay
  def newTimeOfDay(): TimeOfDay
  // Create a new instance of TurnInStudentSubmissionRequest
  def newTurnInStudentSubmissionRequest(): js.Any
  // Create a new instance of UserProfile
  def newUserProfile(): UserProfile
  // Create a new instance of YouTubeVideo
  def newYouTubeVideo(): YouTubeVideo
}

object Classroom_ {
  @scala.inline
  def apply(
    newAnnouncement: CallbackTo[Announcement],
    newAssignment: CallbackTo[Assignment],
    newAssignmentSubmission: CallbackTo[AssignmentSubmission],
    newAttachment: CallbackTo[Attachment],
    newCloudPubsubTopic: CallbackTo[CloudPubsubTopic],
    newCourse: CallbackTo[Course],
    newCourseAlias: CallbackTo[CourseAlias],
    newCourseMaterial: CallbackTo[CourseMaterial],
    newCourseMaterialSet: CallbackTo[CourseMaterialSet],
    newCourseRosterChangesInfo: CallbackTo[CourseRosterChangesInfo],
    newCourseWork: CallbackTo[CourseWork],
    newCourseWorkChangesInfo: CallbackTo[CourseWorkChangesInfo],
    newDate: CallbackTo[Date],
    newDriveFile: CallbackTo[DriveFile],
    newDriveFolder: CallbackTo[DriveFolder],
    newFeed: CallbackTo[Feed],
    newForm: CallbackTo[Form],
    newGlobalPermission: CallbackTo[GlobalPermission],
    newGradeHistory: CallbackTo[GradeHistory],
    newGuardianInvitation: CallbackTo[GuardianInvitation],
    newIndividualStudentsOptions: CallbackTo[IndividualStudentsOptions],
    newInvitation: CallbackTo[Invitation],
    newLink: CallbackTo[Link],
    newMaterial: CallbackTo[Material],
    newModifyAnnouncementAssigneesRequest: CallbackTo[ModifyAnnouncementAssigneesRequest],
    newModifyAttachmentsRequest: CallbackTo[ModifyAttachmentsRequest],
    newModifyCourseWorkAssigneesRequest: CallbackTo[ModifyCourseWorkAssigneesRequest],
    newModifyIndividualStudentsOptions: CallbackTo[ModifyIndividualStudentsOptions],
    newMultipleChoiceQuestion: CallbackTo[MultipleChoiceQuestion],
    newMultipleChoiceSubmission: CallbackTo[MultipleChoiceSubmission],
    newName: CallbackTo[Name],
    newReclaimStudentSubmissionRequest: CallbackTo[js.Any],
    newRegistration: CallbackTo[Registration],
    newReturnStudentSubmissionRequest: CallbackTo[js.Any],
    newSharedDriveFile: CallbackTo[SharedDriveFile],
    newShortAnswerSubmission: CallbackTo[ShortAnswerSubmission],
    newStateHistory: CallbackTo[StateHistory],
    newStudent: CallbackTo[Student],
    newStudentSubmission: CallbackTo[StudentSubmission],
    newSubmissionHistory: CallbackTo[SubmissionHistory],
    newTeacher: CallbackTo[Teacher],
    newTimeOfDay: CallbackTo[TimeOfDay],
    newTurnInStudentSubmissionRequest: CallbackTo[js.Any],
    newUserProfile: CallbackTo[UserProfile],
    newYouTubeVideo: CallbackTo[YouTubeVideo],
    Courses: CoursesCollection = null,
    Invitations: InvitationsCollection = null,
    Registrations: RegistrationsCollection = null,
    UserProfiles: UserProfilesCollection = null
  ): Classroom_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAnnouncement")(newAnnouncement.toJsFn)
    __obj.updateDynamic("newAssignment")(newAssignment.toJsFn)
    __obj.updateDynamic("newAssignmentSubmission")(newAssignmentSubmission.toJsFn)
    __obj.updateDynamic("newAttachment")(newAttachment.toJsFn)
    __obj.updateDynamic("newCloudPubsubTopic")(newCloudPubsubTopic.toJsFn)
    __obj.updateDynamic("newCourse")(newCourse.toJsFn)
    __obj.updateDynamic("newCourseAlias")(newCourseAlias.toJsFn)
    __obj.updateDynamic("newCourseMaterial")(newCourseMaterial.toJsFn)
    __obj.updateDynamic("newCourseMaterialSet")(newCourseMaterialSet.toJsFn)
    __obj.updateDynamic("newCourseRosterChangesInfo")(newCourseRosterChangesInfo.toJsFn)
    __obj.updateDynamic("newCourseWork")(newCourseWork.toJsFn)
    __obj.updateDynamic("newCourseWorkChangesInfo")(newCourseWorkChangesInfo.toJsFn)
    __obj.updateDynamic("newDate")(newDate.toJsFn)
    __obj.updateDynamic("newDriveFile")(newDriveFile.toJsFn)
    __obj.updateDynamic("newDriveFolder")(newDriveFolder.toJsFn)
    __obj.updateDynamic("newFeed")(newFeed.toJsFn)
    __obj.updateDynamic("newForm")(newForm.toJsFn)
    __obj.updateDynamic("newGlobalPermission")(newGlobalPermission.toJsFn)
    __obj.updateDynamic("newGradeHistory")(newGradeHistory.toJsFn)
    __obj.updateDynamic("newGuardianInvitation")(newGuardianInvitation.toJsFn)
    __obj.updateDynamic("newIndividualStudentsOptions")(newIndividualStudentsOptions.toJsFn)
    __obj.updateDynamic("newInvitation")(newInvitation.toJsFn)
    __obj.updateDynamic("newLink")(newLink.toJsFn)
    __obj.updateDynamic("newMaterial")(newMaterial.toJsFn)
    __obj.updateDynamic("newModifyAnnouncementAssigneesRequest")(newModifyAnnouncementAssigneesRequest.toJsFn)
    __obj.updateDynamic("newModifyAttachmentsRequest")(newModifyAttachmentsRequest.toJsFn)
    __obj.updateDynamic("newModifyCourseWorkAssigneesRequest")(newModifyCourseWorkAssigneesRequest.toJsFn)
    __obj.updateDynamic("newModifyIndividualStudentsOptions")(newModifyIndividualStudentsOptions.toJsFn)
    __obj.updateDynamic("newMultipleChoiceQuestion")(newMultipleChoiceQuestion.toJsFn)
    __obj.updateDynamic("newMultipleChoiceSubmission")(newMultipleChoiceSubmission.toJsFn)
    __obj.updateDynamic("newName")(newName.toJsFn)
    __obj.updateDynamic("newReclaimStudentSubmissionRequest")(newReclaimStudentSubmissionRequest.toJsFn)
    __obj.updateDynamic("newRegistration")(newRegistration.toJsFn)
    __obj.updateDynamic("newReturnStudentSubmissionRequest")(newReturnStudentSubmissionRequest.toJsFn)
    __obj.updateDynamic("newSharedDriveFile")(newSharedDriveFile.toJsFn)
    __obj.updateDynamic("newShortAnswerSubmission")(newShortAnswerSubmission.toJsFn)
    __obj.updateDynamic("newStateHistory")(newStateHistory.toJsFn)
    __obj.updateDynamic("newStudent")(newStudent.toJsFn)
    __obj.updateDynamic("newStudentSubmission")(newStudentSubmission.toJsFn)
    __obj.updateDynamic("newSubmissionHistory")(newSubmissionHistory.toJsFn)
    __obj.updateDynamic("newTeacher")(newTeacher.toJsFn)
    __obj.updateDynamic("newTimeOfDay")(newTimeOfDay.toJsFn)
    __obj.updateDynamic("newTurnInStudentSubmissionRequest")(newTurnInStudentSubmissionRequest.toJsFn)
    __obj.updateDynamic("newUserProfile")(newUserProfile.toJsFn)
    __obj.updateDynamic("newYouTubeVideo")(newYouTubeVideo.toJsFn)
    if (Courses != null) __obj.updateDynamic("Courses")(Courses.asInstanceOf[js.Any])
    if (Invitations != null) __obj.updateDynamic("Invitations")(Invitations.asInstanceOf[js.Any])
    if (Registrations != null) __obj.updateDynamic("Registrations")(Registrations.asInstanceOf[js.Any])
    if (UserProfiles != null) __obj.updateDynamic("UserProfiles")(UserProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classroom_]
  }
}

