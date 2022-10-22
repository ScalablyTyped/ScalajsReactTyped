package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.AliasesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.AnnouncementsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.CourseWork.StudentSubmissionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.CourseWorkCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.CourseWorkMaterialsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.StudentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.TeachersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.TopicsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.CoursesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.InvitationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.RegistrationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardianInvitationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardiansCollection
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
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseWorkMaterial
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.DriveFile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.DriveFolder
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Feed
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Form
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.GlobalPermission
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.GradeHistory
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Guardian
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.GuardianInvitation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.IndividualStudentsOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Invitation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Link
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListAnnouncementsResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCourseAliasesResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCourseWorkMaterialResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCourseWorkResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCoursesResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListGuardianInvitationsResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListGuardiansResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListInvitationsResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListStudentSubmissionsResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListStudentsResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListTeachersResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListTopicResponse
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
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.Topic
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.UserProfile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Classroom.Schema.YouTubeVideo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classroom extends StObject {
  
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
  
  // Create a new instance of CourseWorkMaterial
  def newCourseWorkMaterial(): CourseWorkMaterial
  
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
  
  // Create a new instance of Registration
  def newRegistration(): Registration
  
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
  
  // Create a new instance of Topic
  def newTopic(): Topic
  
  // Create a new instance of UserProfile
  def newUserProfile(): UserProfile
  
  // Create a new instance of YouTubeVideo
  def newYouTubeVideo(): YouTubeVideo
}
object Classroom {
  
  inline def apply(
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
    newCourseWorkMaterial: CallbackTo[CourseWorkMaterial],
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
    newRegistration: CallbackTo[Registration],
    newSharedDriveFile: CallbackTo[SharedDriveFile],
    newShortAnswerSubmission: CallbackTo[ShortAnswerSubmission],
    newStateHistory: CallbackTo[StateHistory],
    newStudent: CallbackTo[Student],
    newStudentSubmission: CallbackTo[StudentSubmission],
    newSubmissionHistory: CallbackTo[SubmissionHistory],
    newTeacher: CallbackTo[Teacher],
    newTimeOfDay: CallbackTo[TimeOfDay],
    newTopic: CallbackTo[Topic],
    newUserProfile: CallbackTo[UserProfile],
    newYouTubeVideo: CallbackTo[YouTubeVideo]
  ): Classroom = {
    val __obj = js.Dynamic.literal(newAnnouncement = newAnnouncement.toJsFn, newAssignment = newAssignment.toJsFn, newAssignmentSubmission = newAssignmentSubmission.toJsFn, newAttachment = newAttachment.toJsFn, newCloudPubsubTopic = newCloudPubsubTopic.toJsFn, newCourse = newCourse.toJsFn, newCourseAlias = newCourseAlias.toJsFn, newCourseMaterial = newCourseMaterial.toJsFn, newCourseMaterialSet = newCourseMaterialSet.toJsFn, newCourseRosterChangesInfo = newCourseRosterChangesInfo.toJsFn, newCourseWork = newCourseWork.toJsFn, newCourseWorkChangesInfo = newCourseWorkChangesInfo.toJsFn, newCourseWorkMaterial = newCourseWorkMaterial.toJsFn, newDate = newDate.toJsFn, newDriveFile = newDriveFile.toJsFn, newDriveFolder = newDriveFolder.toJsFn, newFeed = newFeed.toJsFn, newForm = newForm.toJsFn, newGlobalPermission = newGlobalPermission.toJsFn, newGradeHistory = newGradeHistory.toJsFn, newGuardianInvitation = newGuardianInvitation.toJsFn, newIndividualStudentsOptions = newIndividualStudentsOptions.toJsFn, newInvitation = newInvitation.toJsFn, newLink = newLink.toJsFn, newMaterial = newMaterial.toJsFn, newModifyAnnouncementAssigneesRequest = newModifyAnnouncementAssigneesRequest.toJsFn, newModifyAttachmentsRequest = newModifyAttachmentsRequest.toJsFn, newModifyCourseWorkAssigneesRequest = newModifyCourseWorkAssigneesRequest.toJsFn, newModifyIndividualStudentsOptions = newModifyIndividualStudentsOptions.toJsFn, newMultipleChoiceQuestion = newMultipleChoiceQuestion.toJsFn, newMultipleChoiceSubmission = newMultipleChoiceSubmission.toJsFn, newName = newName.toJsFn, newRegistration = newRegistration.toJsFn, newSharedDriveFile = newSharedDriveFile.toJsFn, newShortAnswerSubmission = newShortAnswerSubmission.toJsFn, newStateHistory = newStateHistory.toJsFn, newStudent = newStudent.toJsFn, newStudentSubmission = newStudentSubmission.toJsFn, newSubmissionHistory = newSubmissionHistory.toJsFn, newTeacher = newTeacher.toJsFn, newTimeOfDay = newTimeOfDay.toJsFn, newTopic = newTopic.toJsFn, newUserProfile = newUserProfile.toJsFn, newYouTubeVideo = newYouTubeVideo.toJsFn)
    __obj.asInstanceOf[Classroom]
  }
  
  extension [Self <: Classroom](x: Self) {
    
    inline def setCourses(value: CoursesCollection): Self = StObject.set(x, "Courses", value.asInstanceOf[js.Any])
    
    inline def setCoursesUndefined: Self = StObject.set(x, "Courses", js.undefined)
    
    inline def setInvitations(value: InvitationsCollection): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    inline def setNewAnnouncement(value: CallbackTo[Announcement]): Self = StObject.set(x, "newAnnouncement", value.toJsFn)
    
    inline def setNewAssignment(value: CallbackTo[Assignment]): Self = StObject.set(x, "newAssignment", value.toJsFn)
    
    inline def setNewAssignmentSubmission(value: CallbackTo[AssignmentSubmission]): Self = StObject.set(x, "newAssignmentSubmission", value.toJsFn)
    
    inline def setNewAttachment(value: CallbackTo[Attachment]): Self = StObject.set(x, "newAttachment", value.toJsFn)
    
    inline def setNewCloudPubsubTopic(value: CallbackTo[CloudPubsubTopic]): Self = StObject.set(x, "newCloudPubsubTopic", value.toJsFn)
    
    inline def setNewCourse(value: CallbackTo[Course]): Self = StObject.set(x, "newCourse", value.toJsFn)
    
    inline def setNewCourseAlias(value: CallbackTo[CourseAlias]): Self = StObject.set(x, "newCourseAlias", value.toJsFn)
    
    inline def setNewCourseMaterial(value: CallbackTo[CourseMaterial]): Self = StObject.set(x, "newCourseMaterial", value.toJsFn)
    
    inline def setNewCourseMaterialSet(value: CallbackTo[CourseMaterialSet]): Self = StObject.set(x, "newCourseMaterialSet", value.toJsFn)
    
    inline def setNewCourseRosterChangesInfo(value: CallbackTo[CourseRosterChangesInfo]): Self = StObject.set(x, "newCourseRosterChangesInfo", value.toJsFn)
    
    inline def setNewCourseWork(value: CallbackTo[CourseWork]): Self = StObject.set(x, "newCourseWork", value.toJsFn)
    
    inline def setNewCourseWorkChangesInfo(value: CallbackTo[CourseWorkChangesInfo]): Self = StObject.set(x, "newCourseWorkChangesInfo", value.toJsFn)
    
    inline def setNewCourseWorkMaterial(value: CallbackTo[CourseWorkMaterial]): Self = StObject.set(x, "newCourseWorkMaterial", value.toJsFn)
    
    inline def setNewDate(value: CallbackTo[Date]): Self = StObject.set(x, "newDate", value.toJsFn)
    
    inline def setNewDriveFile(value: CallbackTo[DriveFile]): Self = StObject.set(x, "newDriveFile", value.toJsFn)
    
    inline def setNewDriveFolder(value: CallbackTo[DriveFolder]): Self = StObject.set(x, "newDriveFolder", value.toJsFn)
    
    inline def setNewFeed(value: CallbackTo[Feed]): Self = StObject.set(x, "newFeed", value.toJsFn)
    
    inline def setNewForm(value: CallbackTo[Form]): Self = StObject.set(x, "newForm", value.toJsFn)
    
    inline def setNewGlobalPermission(value: CallbackTo[GlobalPermission]): Self = StObject.set(x, "newGlobalPermission", value.toJsFn)
    
    inline def setNewGradeHistory(value: CallbackTo[GradeHistory]): Self = StObject.set(x, "newGradeHistory", value.toJsFn)
    
    inline def setNewGuardianInvitation(value: CallbackTo[GuardianInvitation]): Self = StObject.set(x, "newGuardianInvitation", value.toJsFn)
    
    inline def setNewIndividualStudentsOptions(value: CallbackTo[IndividualStudentsOptions]): Self = StObject.set(x, "newIndividualStudentsOptions", value.toJsFn)
    
    inline def setNewInvitation(value: CallbackTo[Invitation]): Self = StObject.set(x, "newInvitation", value.toJsFn)
    
    inline def setNewLink(value: CallbackTo[Link]): Self = StObject.set(x, "newLink", value.toJsFn)
    
    inline def setNewMaterial(value: CallbackTo[Material]): Self = StObject.set(x, "newMaterial", value.toJsFn)
    
    inline def setNewModifyAnnouncementAssigneesRequest(value: CallbackTo[ModifyAnnouncementAssigneesRequest]): Self = StObject.set(x, "newModifyAnnouncementAssigneesRequest", value.toJsFn)
    
    inline def setNewModifyAttachmentsRequest(value: CallbackTo[ModifyAttachmentsRequest]): Self = StObject.set(x, "newModifyAttachmentsRequest", value.toJsFn)
    
    inline def setNewModifyCourseWorkAssigneesRequest(value: CallbackTo[ModifyCourseWorkAssigneesRequest]): Self = StObject.set(x, "newModifyCourseWorkAssigneesRequest", value.toJsFn)
    
    inline def setNewModifyIndividualStudentsOptions(value: CallbackTo[ModifyIndividualStudentsOptions]): Self = StObject.set(x, "newModifyIndividualStudentsOptions", value.toJsFn)
    
    inline def setNewMultipleChoiceQuestion(value: CallbackTo[MultipleChoiceQuestion]): Self = StObject.set(x, "newMultipleChoiceQuestion", value.toJsFn)
    
    inline def setNewMultipleChoiceSubmission(value: CallbackTo[MultipleChoiceSubmission]): Self = StObject.set(x, "newMultipleChoiceSubmission", value.toJsFn)
    
    inline def setNewName(value: CallbackTo[Name]): Self = StObject.set(x, "newName", value.toJsFn)
    
    inline def setNewRegistration(value: CallbackTo[Registration]): Self = StObject.set(x, "newRegistration", value.toJsFn)
    
    inline def setNewSharedDriveFile(value: CallbackTo[SharedDriveFile]): Self = StObject.set(x, "newSharedDriveFile", value.toJsFn)
    
    inline def setNewShortAnswerSubmission(value: CallbackTo[ShortAnswerSubmission]): Self = StObject.set(x, "newShortAnswerSubmission", value.toJsFn)
    
    inline def setNewStateHistory(value: CallbackTo[StateHistory]): Self = StObject.set(x, "newStateHistory", value.toJsFn)
    
    inline def setNewStudent(value: CallbackTo[Student]): Self = StObject.set(x, "newStudent", value.toJsFn)
    
    inline def setNewStudentSubmission(value: CallbackTo[StudentSubmission]): Self = StObject.set(x, "newStudentSubmission", value.toJsFn)
    
    inline def setNewSubmissionHistory(value: CallbackTo[SubmissionHistory]): Self = StObject.set(x, "newSubmissionHistory", value.toJsFn)
    
    inline def setNewTeacher(value: CallbackTo[Teacher]): Self = StObject.set(x, "newTeacher", value.toJsFn)
    
    inline def setNewTimeOfDay(value: CallbackTo[TimeOfDay]): Self = StObject.set(x, "newTimeOfDay", value.toJsFn)
    
    inline def setNewTopic(value: CallbackTo[Topic]): Self = StObject.set(x, "newTopic", value.toJsFn)
    
    inline def setNewUserProfile(value: CallbackTo[UserProfile]): Self = StObject.set(x, "newUserProfile", value.toJsFn)
    
    inline def setNewYouTubeVideo(value: CallbackTo[YouTubeVideo]): Self = StObject.set(x, "newYouTubeVideo", value.toJsFn)
    
    inline def setRegistrations(value: RegistrationsCollection): Self = StObject.set(x, "Registrations", value.asInstanceOf[js.Any])
    
    inline def setRegistrationsUndefined: Self = StObject.set(x, "Registrations", js.undefined)
    
    inline def setUserProfiles(value: UserProfilesCollection): Self = StObject.set(x, "UserProfiles", value.asInstanceOf[js.Any])
    
    inline def setUserProfilesUndefined: Self = StObject.set(x, "UserProfiles", js.undefined)
  }
  
  object Collection {
    
    object Courses {
      
      @js.native
      trait AliasesCollection extends StObject {
        
        // Creates an alias for a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to create the alias or for access errors.
        // *`NOT_FOUND` if the course does not exist.
        // *`ALREADY_EXISTS` if the alias already exists.
        // *`FAILED_PRECONDITION` if the alias requested does not make sense for the requesting user or course (for example, if a user not in a domain attempts to access a domain-scoped alias).
        def create(resource: CourseAlias, courseId: String): CourseAlias = js.native
        
        // Returns a list of aliases for a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the course or for access errors.
        // *`NOT_FOUND` if the course does not exist.
        def list(courseId: String): ListCourseAliasesResponse = js.native
        // Returns a list of aliases for a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the course or for access errors.
        // *`NOT_FOUND` if the course does not exist.
        def list(courseId: String, optionalArgs: js.Object): ListCourseAliasesResponse = js.native
        
        // Deletes an alias of a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to remove the alias or for access errors.
        // *`NOT_FOUND` if the alias does not exist.
        // *`FAILED_PRECONDITION` if the alias requested does not make sense for the requesting user or course (for example, if a user not in a domain attempts to delete a domain-scoped alias).
        def remove(courseId: String, alias: String): Unit = js.native
      }
      
      @js.native
      trait AnnouncementsCollection extends StObject {
        
        // Creates an announcement. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create announcements in the requested course, share a Drive attachment, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        // *`FAILED_PRECONDITION` for the following request error: * AttachmentNotVisible
        def create(resource: Announcement, courseId: String): Announcement = js.native
        
        // Returns an announcement. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or announcement, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course or announcement does not exist.
        def get(courseId: String, id: String): Announcement = js.native
        
        // Returns a list of announcements that the requester is permitted to view. Course students may only view `PUBLISHED` announcements. Course teachers and domain administrators may view all announcements. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        def list(courseId: String): ListAnnouncementsResponse = js.native
        // Returns a list of announcements that the requester is permitted to view. Course students may only view `PUBLISHED` announcements. Course teachers and domain administrators may view all announcements. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        def list(courseId: String, optionalArgs: js.Object): ListAnnouncementsResponse = js.native
        
        // Modifies assignee mode and options of an announcement. Only a teacher of the course that contains the announcement may call this method. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course or course work does not exist.
        def modifyAssignees(resource: ModifyAnnouncementAssigneesRequest, courseId: String, id: String): Announcement = js.native
        
        // Updates one or more fields of an announcement. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding announcement or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`FAILED_PRECONDITION` if the requested announcement has already been deleted.
        // *`NOT_FOUND` if the requested course or announcement does not exist
        def patch(resource: Announcement, courseId: String, id: String): Announcement = js.native
        // Updates one or more fields of an announcement. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding announcement or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`FAILED_PRECONDITION` if the requested announcement has already been deleted.
        // *`NOT_FOUND` if the requested course or announcement does not exist
        def patch(resource: Announcement, courseId: String, id: String, optionalArgs: js.Object): Announcement = js.native
        
        // Deletes an announcement. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding announcement item. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding announcement, if the requesting user is not permitted to delete the requested course or for access errors.
        // *`FAILED_PRECONDITION` if the requested announcement has already been deleted.
        // *`NOT_FOUND` if no course exists with the requested ID.
        def remove(courseId: String, id: String): Unit = js.native
      }
      
      object CourseWork {
        
        @js.native
        trait StudentSubmissionsCollection extends StObject {
          
          // Returns a student submission.
          // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, course work, or student submission or for access errors.
          // *`INVALID_ARGUMENT` if the request is malformed.
          // *`NOT_FOUND` if the requested course, course work, or student submission does not exist.
          def get(courseId: String, courseWorkId: String, id: String): StudentSubmission = js.native
          
          // Returns a list of student submissions that the requester is permitted to view, factoring in the OAuth scopes of the request. `-` may be specified as the `course_work_id` to include student submissions for multiple course work items. Course students may only view their own work. Course teachers and domain administrators may view all student submissions. This method returns the following error codes:
          // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, or for access errors.
          // *`INVALID_ARGUMENT` if the request is malformed.
          // *`NOT_FOUND` if the requested course does not exist.
          def list(courseId: String, courseWorkId: String): ListStudentSubmissionsResponse = js.native
          // Returns a list of student submissions that the requester is permitted to view, factoring in the OAuth scopes of the request. `-` may be specified as the `course_work_id` to include student submissions for multiple course work items. Course students may only view their own work. Course teachers and domain administrators may view all student submissions. This method returns the following error codes:
          // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, or for access errors.
          // *`INVALID_ARGUMENT` if the request is malformed.
          // *`NOT_FOUND` if the requested course does not exist.
          def list(courseId: String, courseWorkId: String, optionalArgs: js.Object): ListStudentSubmissionsResponse = js.native
          
          // Modifies attachments of student submission. Attachments may only be added to student submissions belonging to course work objects with a `workType` of `ASSIGNMENT`. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes:
          // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, if the user is not permitted to modify attachments on the requested student submission, or for access errors.
          // *`INVALID_ARGUMENT` if the request is malformed.
          // *`NOT_FOUND` if the requested course, course work, or student submission does not exist.
          def modifyAttachments(resource: ModifyAttachmentsRequest, courseId: String, courseWorkId: String, id: String): StudentSubmission = js.native
          
          // Updates one or more fields of a student submission. See google.classroom.v1.StudentSubmission for details of which fields may be updated and who may change them. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes:
          // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the user is not permitted to make the requested modification to the student submission, or for access errors.
          // *`INVALID_ARGUMENT` if the request is malformed.
          // *`NOT_FOUND` if the requested course, course work, or student submission does not exist.
          def patch(resource: StudentSubmission, courseId: String, courseWorkId: String, id: String): StudentSubmission = js.native
          // Updates one or more fields of a student submission. See google.classroom.v1.StudentSubmission for details of which fields may be updated and who may change them. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes:
          // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the user is not permitted to make the requested modification to the student submission, or for access errors.
          // *`INVALID_ARGUMENT` if the request is malformed.
          // *`NOT_FOUND` if the requested course, course work, or student submission does not exist.
          def patch(
            resource: StudentSubmission,
            courseId: String,
            courseWorkId: String,
            id: String,
            optionalArgs: js.Object
          ): StudentSubmission = js.native
          
          // Reclaims a student submission on behalf of the student that owns it. Reclaiming a student submission transfers ownership of attached Drive files to the student and updates the submission state. Only the student that owns the requested student submission may call this method, and only for a student submission that has been turned in. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes:
          // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, unsubmit the requested student submission, or for access errors.
          // *`FAILED_PRECONDITION` if the student submission has not been turned in.
          // *`INVALID_ARGUMENT` if the request is malformed.
          // *`NOT_FOUND` if the requested course, course work, or student submission does not exist.
          def reclaim(courseId: String, courseWorkId: String, id: String): Unit = js.native
          
          // Returns a student submission. Returning a student submission transfers ownership of attached Drive files to the student and may also update the submission state. Unlike the Classroom application, returning a student submission does not set assignedGrade to the draftGrade value. Only a teacher of the course that contains the requested student submission may call this method. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes:
          // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, return the requested student submission, or for access errors.
          // *`INVALID_ARGUMENT` if the request is malformed.
          // *`NOT_FOUND` if the requested course, course work, or student submission does not exist.
          def `return`(rcourseId: String, courseWorkId: String, id: String): Unit = js.native
          
          // Turns in a student submission. Turning in a student submission transfers ownership of attached Drive files to the teacher and may also update the submission state. This may only be called by the student that owns the specified student submission. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes:
          // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, turn in the requested student submission, or for access errors.
          // *`INVALID_ARGUMENT` if the request is malformed.
          // *`NOT_FOUND` if the requested course, course work, or student submission does not exist.
          def turnIn(courseId: String, courseWorkId: String, id: String): Unit = js.native
        }
      }
      
      @js.native
      trait CourseWorkCollection extends StObject {
        
        var StudentSubmissions: js.UndefOr[StudentSubmissionsCollection] = js.native
        
        // Creates course work. The resulting course work (and corresponding student submissions) are associated with the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to make the request. Classroom API requests to modify course work and student submissions must be made with an OAuth client ID from the associated Developer Console project. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create course work in the requested course, share a Drive attachment, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        // *`FAILED_PRECONDITION` for the following request error: * AttachmentNotVisible
        def create(resource: CourseWork, courseId: String): CourseWork = js.native
        
        // Returns course work. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course or course work does not exist.
        def get(courseId: String, id: String): CourseWork = js.native
        
        // Returns a list of course work that the requester is permitted to view. Course students may only view `PUBLISHED` course work. Course teachers and domain administrators may view all course work. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        def list(courseId: String): ListCourseWorkResponse = js.native
        // Returns a list of course work that the requester is permitted to view. Course students may only view `PUBLISHED` course work. Course teachers and domain administrators may view all course work. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        def list(courseId: String, optionalArgs: js.Object): ListCourseWorkResponse = js.native
        
        // Modifies assignee mode and options of a coursework. Only a teacher of the course that contains the coursework may call this method. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course or course work does not exist.
        def modifyAssignees(resource: ModifyCourseWorkAssigneesRequest, courseId: String, id: String): CourseWork = js.native
        
        // Updates one or more fields of a course work. See google.classroom.v1.CourseWork for details of which fields may be updated and who may change them. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the user is not permitted to make the requested modification to the student submission, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`FAILED_PRECONDITION` if the requested course work has already been deleted.
        // *`NOT_FOUND` if the requested course, course work, or student submission does not exist.
        def patch(resource: CourseWork, courseId: String, id: String): CourseWork = js.native
        // Updates one or more fields of a course work. See google.classroom.v1.CourseWork for details of which fields may be updated and who may change them. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the user is not permitted to make the requested modification to the student submission, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`FAILED_PRECONDITION` if the requested course work has already been deleted.
        // *`NOT_FOUND` if the requested course, course work, or student submission does not exist.
        def patch(resource: CourseWork, courseId: String, id: String, optionalArgs: js.Object): CourseWork = js.native
        
        // Deletes a course work. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the requesting user is not permitted to delete the requested course or for access errors.
        // *`FAILED_PRECONDITION` if the requested course work has already been deleted.
        // *`NOT_FOUND` if no course exists with the requested ID.
        def remove(courseId: String, id: String): Unit = js.native
      }
      
      @js.native
      trait CourseWorkMaterialsCollection extends StObject {
        
        // Creates a course work material. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create course work material in the requested course, share a Drive attachment, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed or if more than 20 * materials are provided.
        // *`NOT_FOUND` if the requested course does not exist.
        // *`FAILED_PRECONDITION` for the following request error: * AttachmentNotVisible
        def create(resource: CourseWorkMaterial, courseId: String): CourseWorkMaterial = js.native
        
        // Returns a course work material. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work material, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course or course work material does not exist.
        def get(courseId: String, id: String): CourseWorkMaterial = js.native
        
        // Returns a list of course work material that the requester is permitted to view. Course students may only view `PUBLISHED` course work material. Course teachers and domain administrators may view all course work material. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        def list(courseId: String): ListCourseWorkMaterialResponse = js.native
        // Returns a list of course work material that the requester is permitted to view. Course students may only view `PUBLISHED` course work material. Course teachers and domain administrators may view all course work material. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        def list(courseId: String, optionalArgs: js.Object): ListCourseWorkMaterialResponse = js.native
        
        // Updates one or more fields of a course work material. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`FAILED_PRECONDITION` if the requested course work material has already been deleted.
        // *`NOT_FOUND` if the requested course or course work material does not exist
        def patch(resource: CourseWorkMaterial, courseId: String, id: String): CourseWorkMaterial = js.native
        // Updates one or more fields of a course work material. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`FAILED_PRECONDITION` if the requested course work material has already been deleted.
        // *`NOT_FOUND` if the requested course or course work material does not exist
        def patch(resource: CourseWorkMaterial, courseId: String, id: String, optionalArgs: js.Object): CourseWorkMaterial = js.native
        
        // Deletes a course work material. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work material item. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work material, if the requesting user is not permitted to delete the requested course or for access errors.
        // *`FAILED_PRECONDITION` if the requested course work material has already been deleted.
        // *`NOT_FOUND` if no course exists with the requested ID.
        def remove(courseId: String, id: String): Unit = js.native
      }
      
      @js.native
      trait StudentsCollection extends StObject {
        
        // Adds a user as a student of a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to create students in this course or for access errors.
        // *`NOT_FOUND` if the requested course ID does not exist.
        // *`FAILED_PRECONDITION` if the requested user's account is disabled, for the following request errors: * CourseMemberLimitReached * CourseNotModifiable * UserGroupsMembershipLimitReached
        // *`ALREADY_EXISTS` if the user is already a student or teacher in the course.
        def create(resource: Student, courseId: String): Student = js.native
        // Adds a user as a student of a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to create students in this course or for access errors.
        // *`NOT_FOUND` if the requested course ID does not exist.
        // *`FAILED_PRECONDITION` if the requested user's account is disabled, for the following request errors: * CourseMemberLimitReached * CourseNotModifiable * UserGroupsMembershipLimitReached
        // *`ALREADY_EXISTS` if the user is already a student or teacher in the course.
        def create(resource: Student, courseId: String, optionalArgs: js.Object): Student = js.native
        
        // Returns a student of a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to view students of this course or for access errors.
        // *`NOT_FOUND` if no student of this course has the requested ID or if the course does not exist.
        def get(courseId: String, userId: String): Student = js.native
        
        // Returns a list of students of this course that the requester is permitted to view. This method returns the following error codes:
        // *`NOT_FOUND` if the course does not exist.
        // *`PERMISSION_DENIED` for access errors.
        def list(courseId: String): ListStudentsResponse = js.native
        // Returns a list of students of this course that the requester is permitted to view. This method returns the following error codes:
        // *`NOT_FOUND` if the course does not exist.
        // *`PERMISSION_DENIED` for access errors.
        def list(courseId: String, optionalArgs: js.Object): ListStudentsResponse = js.native
        
        // Deletes a student of a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to delete students of this course or for access errors.
        // *`NOT_FOUND` if no student of this course has the requested ID or if the course does not exist.
        def remove(courseId: String, userId: String): Unit = js.native
      }
      
      @js.native
      trait TeachersCollection extends StObject {
        
        // Creates a teacher of a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to create teachers in this course or for access errors.
        // *`NOT_FOUND` if the requested course ID does not exist.
        // *`FAILED_PRECONDITION` if the requested user's account is disabled, for the following request errors: * CourseMemberLimitReached * CourseNotModifiable * CourseTeacherLimitReached * UserGroupsMembershipLimitReached
        // *`ALREADY_EXISTS` if the user is already a teacher or student in the course.
        def create(resource: Teacher, courseId: String): Teacher = js.native
        
        // Returns a teacher of a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to view teachers of this course or for access errors.
        // *`NOT_FOUND` if no teacher of this course has the requested ID or if the course does not exist.
        def get(courseId: String, userId: String): Teacher = js.native
        
        // Returns a list of teachers of this course that the requester is permitted to view. This method returns the following error codes:
        // *`NOT_FOUND` if the course does not exist.
        // *`PERMISSION_DENIED` for access errors.
        def list(courseId: String): ListTeachersResponse = js.native
        // Returns a list of teachers of this course that the requester is permitted to view. This method returns the following error codes:
        // *`NOT_FOUND` if the course does not exist.
        // *`PERMISSION_DENIED` for access errors.
        def list(courseId: String, optionalArgs: js.Object): ListTeachersResponse = js.native
        
        // Deletes a teacher of a course. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to delete teachers of this course or for access errors.
        // *`NOT_FOUND` if no teacher of this course has the requested ID or if the course does not exist.
        // *`FAILED_PRECONDITION` if the requested ID belongs to the primary teacher of this course.
        def remove(courseId: String, userId: String): Unit = js.native
      }
      
      @js.native
      trait TopicsCollection extends StObject {
        
        // Creates a topic. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create a topic in the requested course, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        def create(resource: Topic, courseId: String): Topic = js.native
        
        // Returns a topic. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or topic, or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course or topic does not exist.
        def get(courseId: String, id: String): Topic = js.native
        
        // Returns the list of topics that the requester is permitted to view. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        def list(courseId: String): ListTopicResponse = js.native
        // Returns the list of topics that the requester is permitted to view. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course does not exist.
        def list(courseId: String, optionalArgs: js.Object): ListTopicResponse = js.native
        
        // Updates one or more fields of a topic. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding topic or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course or topic does not exist
        def patch(resource: Topic, courseId: String, id: String): Topic = js.native
        // Updates one or more fields of a topic. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting developer project did not create the corresponding topic or for access errors.
        // *`INVALID_ARGUMENT` if the request is malformed.
        // *`NOT_FOUND` if the requested course or topic does not exist
        def patch(resource: Topic, courseId: String, id: String, optionalArgs: js.Object): Topic = js.native
        
        // Deletes a topic. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not allowed to delete the requested topic or for access errors.
        // *`FAILED_PRECONDITION` if the requested topic has already been deleted.
        // *`NOT_FOUND` if no course or topic exists with the requested ID.
        def remove(courseId: String, id: String): Unit = js.native
      }
    }
    
    @js.native
    trait CoursesCollection extends StObject {
      
      var Aliases: js.UndefOr[AliasesCollection] = js.native
      
      var Announcements: js.UndefOr[AnnouncementsCollection] = js.native
      
      var CourseWork: js.UndefOr[CourseWorkCollection] = js.native
      
      var CourseWorkMaterials: js.UndefOr[CourseWorkMaterialsCollection] = js.native
      
      var Students: js.UndefOr[StudentsCollection] = js.native
      
      var Teachers: js.UndefOr[TeachersCollection] = js.native
      
      var Topics: js.UndefOr[TopicsCollection] = js.native
      
      // Creates a course. The user specified in `ownerId` is the owner of the created course and added as a teacher. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to create courses or for access errors.
      // *`NOT_FOUND` if the primary teacher is not a valid user.
      // *`FAILED_PRECONDITION` if the course owner's account is disabled or for the following request errors: * UserGroupsMembershipLimitReached
      // *`ALREADY_EXISTS` if an alias was specified in the `id` and already exists.
      def create(resource: Course): Course = js.native
      
      // Returns a course. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors.
      // *`NOT_FOUND` if no course exists with the requested ID.
      def get(id: String): Course = js.native
      
      // Returns a list of courses that the requesting user is permitted to view, restricted to those that match the request. Returned courses are ordered by creation time, with the most recently created coming first. This method returns the following error codes:
      // *`PERMISSION_DENIED` for access errors.
      // *`INVALID_ARGUMENT` if the query argument is malformed.
      // *`NOT_FOUND` if any users specified in the query arguments do not exist.
      def list(): ListCoursesResponse = js.native
      // Returns a list of courses that the requesting user is permitted to view, restricted to those that match the request. Returned courses are ordered by creation time, with the most recently created coming first. This method returns the following error codes:
      // *`PERMISSION_DENIED` for access errors.
      // *`INVALID_ARGUMENT` if the query argument is malformed.
      // *`NOT_FOUND` if any users specified in the query arguments do not exist.
      def list(optionalArgs: js.Object): ListCoursesResponse = js.native
      
      // Updates one or more fields in a course. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to modify the requested course or for access errors.
      // *`NOT_FOUND` if no course exists with the requested ID.
      // *`INVALID_ARGUMENT` if invalid fields are specified in the update mask or if no update mask is supplied.
      // *`FAILED_PRECONDITION` for the following request errors: * CourseNotModifiable
      def patch(resource: Course, id: String): Course = js.native
      // Updates one or more fields in a course. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to modify the requested course or for access errors.
      // *`NOT_FOUND` if no course exists with the requested ID.
      // *`INVALID_ARGUMENT` if invalid fields are specified in the update mask or if no update mask is supplied.
      // *`FAILED_PRECONDITION` for the following request errors: * CourseNotModifiable
      def patch(resource: Course, id: String, optionalArgs: js.Object): Course = js.native
      
      // Deletes a course. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to delete the requested course or for access errors.
      // *`NOT_FOUND` if no course exists with the requested ID.
      def remove(id: String): Unit = js.native
      
      // Updates a course. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to modify the requested course or for access errors.
      // *`NOT_FOUND` if no course exists with the requested ID.
      // *`FAILED_PRECONDITION` for the following request errors: * CourseNotModifiable
      def update(resource: Course, id: String): Course = js.native
    }
    
    @js.native
    trait InvitationsCollection extends StObject {
      
      // Accepts an invitation, removing it and adding the invited user to the teachers or students (as appropriate) of the specified course. Only the invited user may accept an invitation. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to accept the requested invitation or for access errors.
      // *`FAILED_PRECONDITION` for the following request errors: * CourseMemberLimitReached * CourseNotModifiable * CourseTeacherLimitReached * UserGroupsMembershipLimitReached
      // *`NOT_FOUND` if no invitation exists with the requested ID.
      def accept(id: String): Unit = js.native
      
      // Creates an invitation. Only one invitation for a user and course may exist at a time. Delete and re-create an invitation to make changes. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to create invitations for this course or for access errors.
      // *`NOT_FOUND` if the course or the user does not exist.
      // *`FAILED_PRECONDITION` if the requested user's account is disabled or if the user already has this role or a role with greater permissions.
      // *`ALREADY_EXISTS` if an invitation for the specified user and course already exists.
      def create(resource: Invitation): Invitation = js.native
      
      // Returns an invitation. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to view the requested invitation or for access errors.
      // *`NOT_FOUND` if no invitation exists with the requested ID.
      def get(id: String): Invitation = js.native
      
      // Returns a list of invitations that the requesting user is permitted to view, restricted to those that match the list request. *Note:* At least one of `user_id` or `course_id` must be supplied. Both fields can be supplied. This method returns the following error codes:
      // *`PERMISSION_DENIED` for access errors.
      def list(): ListInvitationsResponse = js.native
      // Returns a list of invitations that the requesting user is permitted to view, restricted to those that match the list request. *Note:* At least one of `user_id` or `course_id` must be supplied. Both fields can be supplied. This method returns the following error codes:
      // *`PERMISSION_DENIED` for access errors.
      def list(optionalArgs: js.Object): ListInvitationsResponse = js.native
      
      // Deletes an invitation. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to delete the requested invitation or for access errors.
      // *`NOT_FOUND` if no invitation exists with the requested ID.
      def remove(id: String): Unit = js.native
    }
    
    trait RegistrationsCollection extends StObject {
      
      // Creates a `Registration`, causing Classroom to start sending notifications from the provided `feed` to the destination provided in `cloudPubSubTopic`. Returns the created `Registration`. Currently, this will be the same as the argument, but with server-assigned fields such as `expiry_time` and `id` filled in. Note that any value specified for the `expiry_time` or `id` fields will be ignored. While Classroom may validate the `cloudPubSubTopic` and return errors on a best effort basis, it is the caller's responsibility to ensure that it exists and that Classroom has permission to publish to it. This method may return the following error codes:
      // *`PERMISSION_DENIED` if: * the authenticated user does not have permission to receive notifications from the requested field; or * the current user has not granted access to the current Cloud project with the appropriate scope for the requested feed. Note that domain-wide delegation of authority is not currently supported for this purpose. If the request has the appropriate scope, but no grant exists, a Request Errors is returned. * another access error is encountered.
      // *`INVALID_ARGUMENT` if: * no `cloudPubsubTopic` is specified, or the specified `cloudPubsubTopic` is not valid; or * no `feed` is specified, or the specified `feed` is not valid.
      // *`NOT_FOUND` if: * the specified `feed` cannot be located, or the requesting user does not have permission to determine whether or not it exists; or * the specified `cloudPubsubTopic` cannot be located, or Classroom has not been granted permission to publish to it.
      def create(resource: Registration): Registration
      
      // Deletes a `Registration`, causing Classroom to stop sending notifications for that `Registration`.
      def remove(registrationId: String): Unit
    }
    object RegistrationsCollection {
      
      inline def apply(create: Registration => Registration, remove: String => Callback): RegistrationsCollection = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
        __obj.asInstanceOf[RegistrationsCollection]
      }
      
      extension [Self <: RegistrationsCollection](x: Self) {
        
        inline def setCreate(value: Registration => Registration): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
        
        inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
    
    object UserProfiles {
      
      @js.native
      trait GuardianInvitationsCollection extends StObject {
        
        // Creates a guardian invitation, and sends an email to the guardian asking them to confirm that they are the student's guardian. Once the guardian accepts the invitation, their `state` will change to `COMPLETED` and they will start receiving guardian notifications. A `Guardian` resource will also be created to represent the active guardian. The request object must have the `student_id` and `invited_email_address` fields set. Failing to set these fields, or setting any other fields in the request, will result in an error. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the current user does not have permission to manage guardians, if the guardian in question has already rejected too many requests for that student, if guardians are not enabled for the domain in question, or for other access errors.
        // *`RESOURCE_EXHAUSTED` if the student or guardian has exceeded the guardian link limit.
        // *`INVALID_ARGUMENT` if the guardian email address is not valid (for example, if it is too long), or if the format of the student ID provided cannot be recognized (it is not an email address, nor a `user_id` from this API). This error will also be returned if read-only fields are set, or if the `state` field is set to to a value other than `PENDING`.
        // *`NOT_FOUND` if the student ID provided is a valid student ID, but Classroom has no record of that student.
        // *`ALREADY_EXISTS` if there is already a pending guardian invitation for the student and `invited_email_address` provided, or if the provided `invited_email_address` matches the Google account of an existing `Guardian` for this user.
        def create(resource: GuardianInvitation, studentId: String): GuardianInvitation = js.native
        
        // Returns a specific guardian invitation. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the requesting user is not permitted to view guardian invitations for the student identified by the `student_id`, if guardians are not enabled for the domain in question, or for other access errors.
        // *`INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot be recognized (it is not an email address, nor a `student_id` from the API, nor the literal string `me`).
        // *`NOT_FOUND` if Classroom cannot find any record of the given student or `invitation_id`. May also be returned if the student exists, but the requesting user does not have access to see that student.
        def get(studentId: String, invitationId: String): GuardianInvitation = js.native
        
        // Returns a list of guardian invitations that the requesting user is permitted to view, filtered by the parameters provided. This method returns the following error codes:
        // *`PERMISSION_DENIED` if a `student_id` is specified, and the requesting user is not permitted to view guardian invitations for that student, if `"-"` is specified as the `student_id` and the user is not a domain administrator, if guardians are not enabled for the domain in question, or for other access errors.
        // *`INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot be recognized (it is not an email address, nor a `student_id` from the API, nor the literal string `me`). May also be returned if an invalid `page_token` or `state` is provided.
        // *`NOT_FOUND` if a `student_id` is specified, and its format can be recognized, but Classroom has no record of that student.
        def list(studentId: String): ListGuardianInvitationsResponse = js.native
        // Returns a list of guardian invitations that the requesting user is permitted to view, filtered by the parameters provided. This method returns the following error codes:
        // *`PERMISSION_DENIED` if a `student_id` is specified, and the requesting user is not permitted to view guardian invitations for that student, if `"-"` is specified as the `student_id` and the user is not a domain administrator, if guardians are not enabled for the domain in question, or for other access errors.
        // *`INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot be recognized (it is not an email address, nor a `student_id` from the API, nor the literal string `me`). May also be returned if an invalid `page_token` or `state` is provided.
        // *`NOT_FOUND` if a `student_id` is specified, and its format can be recognized, but Classroom has no record of that student.
        def list(studentId: String, optionalArgs: js.Object): ListGuardianInvitationsResponse = js.native
        
        // Modifies a guardian invitation. Currently, the only valid modification is to change the `state` from `PENDING` to `COMPLETE`. This has the effect of withdrawing the invitation. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the current user does not have permission to manage guardians, if guardians are not enabled for the domain in question or for other access errors.
        // *`FAILED_PRECONDITION` if the guardian link is not in the `PENDING` state.
        // *`INVALID_ARGUMENT` if the format of the student ID provided cannot be recognized (it is not an email address, nor a `user_id` from this API), or if the passed `GuardianInvitation` has a `state` other than `COMPLETE`, or if it modifies fields other than `state`.
        // *`NOT_FOUND` if the student ID provided is a valid student ID, but Classroom has no record of that student, or if the `id` field does not refer to a guardian invitation known to Classroom.
        def patch(resource: GuardianInvitation, studentId: String, invitationId: String): GuardianInvitation = js.native
        // Modifies a guardian invitation. Currently, the only valid modification is to change the `state` from `PENDING` to `COMPLETE`. This has the effect of withdrawing the invitation. This method returns the following error codes:
        // *`PERMISSION_DENIED` if the current user does not have permission to manage guardians, if guardians are not enabled for the domain in question or for other access errors.
        // *`FAILED_PRECONDITION` if the guardian link is not in the `PENDING` state.
        // *`INVALID_ARGUMENT` if the format of the student ID provided cannot be recognized (it is not an email address, nor a `user_id` from this API), or if the passed `GuardianInvitation` has a `state` other than `COMPLETE`, or if it modifies fields other than `state`.
        // *`NOT_FOUND` if the student ID provided is a valid student ID, but Classroom has no record of that student, or if the `id` field does not refer to a guardian invitation known to Classroom.
        def patch(resource: GuardianInvitation, studentId: String, invitationId: String, optionalArgs: js.Object): GuardianInvitation = js.native
      }
      
      @js.native
      trait GuardiansCollection extends StObject {
        
        // Returns a specific guardian. This method returns the following error codes:
        // *`PERMISSION_DENIED` if no user that matches the provided `student_id` is visible to the requesting user, if the requesting user is not permitted to view guardian information for the student identified by the `student_id`, if guardians are not enabled for the domain in question, or for other access errors.
        // *`INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot be recognized (it is not an email address, nor a `student_id` from the API, nor the literal string `me`).
        // *`NOT_FOUND` if the requesting user is permitted to view guardians for the requested `student_id`, but no `Guardian` record exists for that student that matches the provided `guardian_id`.
        def get(studentId: String, guardianId: String): Guardian = js.native
        
        // Returns a list of guardians that the requesting user is permitted to view, restricted to those that match the request. To list guardians for any student that the requesting user may view guardians for, use the literal character `-` for the student ID. This method returns the following error codes:
        // *`PERMISSION_DENIED` if a `student_id` is specified, and the requesting user is not permitted to view guardian information for that student, if `"-"` is specified as the `student_id` and the user is not a domain administrator, if guardians are not enabled for the domain in question, if the `invited_email_address` filter is set by a user who is not a domain administrator, or for other access errors.
        // *`INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot be recognized (it is not an email address, nor a `student_id` from the API, nor the literal string `me`). May also be returned if an invalid `page_token` is provided.
        // *`NOT_FOUND` if a `student_id` is specified, and its format can be recognized, but Classroom has no record of that student.
        def list(studentId: String): ListGuardiansResponse = js.native
        // Returns a list of guardians that the requesting user is permitted to view, restricted to those that match the request. To list guardians for any student that the requesting user may view guardians for, use the literal character `-` for the student ID. This method returns the following error codes:
        // *`PERMISSION_DENIED` if a `student_id` is specified, and the requesting user is not permitted to view guardian information for that student, if `"-"` is specified as the `student_id` and the user is not a domain administrator, if guardians are not enabled for the domain in question, if the `invited_email_address` filter is set by a user who is not a domain administrator, or for other access errors.
        // *`INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot be recognized (it is not an email address, nor a `student_id` from the API, nor the literal string `me`). May also be returned if an invalid `page_token` is provided.
        // *`NOT_FOUND` if a `student_id` is specified, and its format can be recognized, but Classroom has no record of that student.
        def list(studentId: String, optionalArgs: js.Object): ListGuardiansResponse = js.native
        
        // Deletes a guardian. The guardian will no longer receive guardian notifications and the guardian will no longer be accessible via the API. This method returns the following error codes:
        // *`PERMISSION_DENIED` if no user that matches the provided `student_id` is visible to the requesting user, if the requesting user is not permitted to manage guardians for the student identified by the `student_id`, if guardians are not enabled for the domain in question, or for other access errors.
        // *`INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot be recognized (it is not an email address, nor a `student_id` from the API).
        // *`NOT_FOUND` if the requesting user is permitted to modify guardians for the requested `student_id`, but no `Guardian` record exists for that student with the provided `guardian_id`.
        def remove(studentId: String, guardianId: String): Unit = js.native
      }
    }
    
    trait UserProfilesCollection extends StObject {
      
      var GuardianInvitations: js.UndefOr[GuardianInvitationsCollection] = js.undefined
      
      var Guardians: js.UndefOr[GuardiansCollection] = js.undefined
      
      // Returns a user profile. This method returns the following error codes:
      // *`PERMISSION_DENIED` if the requesting user is not permitted to access this user profile, if no profile exists with the requested ID, or for access errors.
      def get(userId: String): UserProfile
    }
    object UserProfilesCollection {
      
      inline def apply(get: String => UserProfile): UserProfilesCollection = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
        __obj.asInstanceOf[UserProfilesCollection]
      }
      
      extension [Self <: UserProfilesCollection](x: Self) {
        
        inline def setGet(value: String => UserProfile): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setGuardianInvitations(value: GuardianInvitationsCollection): Self = StObject.set(x, "GuardianInvitations", value.asInstanceOf[js.Any])
        
        inline def setGuardianInvitationsUndefined: Self = StObject.set(x, "GuardianInvitations", js.undefined)
        
        inline def setGuardians(value: GuardiansCollection): Self = StObject.set(x, "Guardians", value.asInstanceOf[js.Any])
        
        inline def setGuardiansUndefined: Self = StObject.set(x, "Guardians", js.undefined)
      }
    }
  }
  
  object Schema {
    
    trait Announcement extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.undefined
      
      var assigneeMode: js.UndefOr[String] = js.undefined
      
      var courseId: js.UndefOr[String] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var creatorUserId: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
      
      var materials: js.UndefOr[js.Array[Material]] = js.undefined
      
      var scheduledTime: js.UndefOr[String] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
      
      var updateTime: js.UndefOr[String] = js.undefined
    }
    object Announcement {
      
      inline def apply(): Announcement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Announcement]
      }
      
      extension [Self <: Announcement](x: Self) {
        
        inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
        
        inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
        
        inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
        
        inline def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
        
        inline def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
        
        inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
        
        inline def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value*))
        
        inline def setScheduledTime(value: String): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
        
        inline def setScheduledTimeUndefined: Self = StObject.set(x, "scheduledTime", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
      }
    }
    
    trait Assignment extends StObject {
      
      var studentWorkFolder: js.UndefOr[DriveFolder] = js.undefined
    }
    object Assignment {
      
      inline def apply(): Assignment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Assignment]
      }
      
      extension [Self <: Assignment](x: Self) {
        
        inline def setStudentWorkFolder(value: DriveFolder): Self = StObject.set(x, "studentWorkFolder", value.asInstanceOf[js.Any])
        
        inline def setStudentWorkFolderUndefined: Self = StObject.set(x, "studentWorkFolder", js.undefined)
      }
    }
    
    trait AssignmentSubmission extends StObject {
      
      var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
    }
    object AssignmentSubmission {
      
      inline def apply(): AssignmentSubmission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AssignmentSubmission]
      }
      
      extension [Self <: AssignmentSubmission](x: Self) {
        
        inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
        
        inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
        
        inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
      }
    }
    
    trait Attachment extends StObject {
      
      var driveFile: js.UndefOr[DriveFile] = js.undefined
      
      var form: js.UndefOr[Form] = js.undefined
      
      var link: js.UndefOr[Link] = js.undefined
      
      var youTubeVideo: js.UndefOr[YouTubeVideo] = js.undefined
    }
    object Attachment {
      
      inline def apply(): Attachment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Attachment]
      }
      
      extension [Self <: Attachment](x: Self) {
        
        inline def setDriveFile(value: DriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
        
        inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
        
        inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setYouTubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youTubeVideo", value.asInstanceOf[js.Any])
        
        inline def setYouTubeVideoUndefined: Self = StObject.set(x, "youTubeVideo", js.undefined)
      }
    }
    
    trait CloudPubsubTopic extends StObject {
      
      var topicName: js.UndefOr[String] = js.undefined
    }
    object CloudPubsubTopic {
      
      inline def apply(): CloudPubsubTopic = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CloudPubsubTopic]
      }
      
      extension [Self <: CloudPubsubTopic](x: Self) {
        
        inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
        
        inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
      }
    }
    
    trait Course extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.undefined
      
      var calendarId: js.UndefOr[String] = js.undefined
      
      var courseGroupEmail: js.UndefOr[String] = js.undefined
      
      var courseMaterialSets: js.UndefOr[js.Array[CourseMaterialSet]] = js.undefined
      
      var courseState: js.UndefOr[String] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var descriptionHeading: js.UndefOr[String] = js.undefined
      
      var enrollmentCode: js.UndefOr[String] = js.undefined
      
      var guardiansEnabled: js.UndefOr[Boolean] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var ownerId: js.UndefOr[String] = js.undefined
      
      var room: js.UndefOr[String] = js.undefined
      
      var section: js.UndefOr[String] = js.undefined
      
      var teacherFolder: js.UndefOr[DriveFolder] = js.undefined
      
      var teacherGroupEmail: js.UndefOr[String] = js.undefined
      
      var updateTime: js.UndefOr[String] = js.undefined
    }
    object Course {
      
      inline def apply(): Course = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Course]
      }
      
      extension [Self <: Course](x: Self) {
        
        inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
        
        inline def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
        
        inline def setCourseGroupEmail(value: String): Self = StObject.set(x, "courseGroupEmail", value.asInstanceOf[js.Any])
        
        inline def setCourseGroupEmailUndefined: Self = StObject.set(x, "courseGroupEmail", js.undefined)
        
        inline def setCourseMaterialSets(value: js.Array[CourseMaterialSet]): Self = StObject.set(x, "courseMaterialSets", value.asInstanceOf[js.Any])
        
        inline def setCourseMaterialSetsUndefined: Self = StObject.set(x, "courseMaterialSets", js.undefined)
        
        inline def setCourseMaterialSetsVarargs(value: CourseMaterialSet*): Self = StObject.set(x, "courseMaterialSets", js.Array(value*))
        
        inline def setCourseState(value: String): Self = StObject.set(x, "courseState", value.asInstanceOf[js.Any])
        
        inline def setCourseStateUndefined: Self = StObject.set(x, "courseState", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionHeading(value: String): Self = StObject.set(x, "descriptionHeading", value.asInstanceOf[js.Any])
        
        inline def setDescriptionHeadingUndefined: Self = StObject.set(x, "descriptionHeading", js.undefined)
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEnrollmentCode(value: String): Self = StObject.set(x, "enrollmentCode", value.asInstanceOf[js.Any])
        
        inline def setEnrollmentCodeUndefined: Self = StObject.set(x, "enrollmentCode", js.undefined)
        
        inline def setGuardiansEnabled(value: Boolean): Self = StObject.set(x, "guardiansEnabled", value.asInstanceOf[js.Any])
        
        inline def setGuardiansEnabledUndefined: Self = StObject.set(x, "guardiansEnabled", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
        
        inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
        
        inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
        
        inline def setRoomUndefined: Self = StObject.set(x, "room", js.undefined)
        
        inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
        
        inline def setTeacherFolder(value: DriveFolder): Self = StObject.set(x, "teacherFolder", value.asInstanceOf[js.Any])
        
        inline def setTeacherFolderUndefined: Self = StObject.set(x, "teacherFolder", js.undefined)
        
        inline def setTeacherGroupEmail(value: String): Self = StObject.set(x, "teacherGroupEmail", value.asInstanceOf[js.Any])
        
        inline def setTeacherGroupEmailUndefined: Self = StObject.set(x, "teacherGroupEmail", js.undefined)
        
        inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
      }
    }
    
    trait CourseAlias extends StObject {
      
      var alias: js.UndefOr[String] = js.undefined
    }
    object CourseAlias {
      
      inline def apply(): CourseAlias = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseAlias]
      }
      
      extension [Self <: CourseAlias](x: Self) {
        
        inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      }
    }
    
    trait CourseMaterial extends StObject {
      
      var driveFile: js.UndefOr[DriveFile] = js.undefined
      
      var form: js.UndefOr[Form] = js.undefined
      
      var link: js.UndefOr[Link] = js.undefined
      
      var youTubeVideo: js.UndefOr[YouTubeVideo] = js.undefined
    }
    object CourseMaterial {
      
      inline def apply(): CourseMaterial = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseMaterial]
      }
      
      extension [Self <: CourseMaterial](x: Self) {
        
        inline def setDriveFile(value: DriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
        
        inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
        
        inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setYouTubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youTubeVideo", value.asInstanceOf[js.Any])
        
        inline def setYouTubeVideoUndefined: Self = StObject.set(x, "youTubeVideo", js.undefined)
      }
    }
    
    trait CourseMaterialSet extends StObject {
      
      var materials: js.UndefOr[js.Array[CourseMaterial]] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object CourseMaterialSet {
      
      inline def apply(): CourseMaterialSet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseMaterialSet]
      }
      
      extension [Self <: CourseMaterialSet](x: Self) {
        
        inline def setMaterials(value: js.Array[CourseMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
        
        inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
        
        inline def setMaterialsVarargs(value: CourseMaterial*): Self = StObject.set(x, "materials", js.Array(value*))
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait CourseRosterChangesInfo extends StObject {
      
      var courseId: js.UndefOr[String] = js.undefined
    }
    object CourseRosterChangesInfo {
      
      inline def apply(): CourseRosterChangesInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseRosterChangesInfo]
      }
      
      extension [Self <: CourseRosterChangesInfo](x: Self) {
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
      }
    }
    
    trait CourseWork extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.undefined
      
      var assigneeMode: js.UndefOr[String] = js.undefined
      
      var assignment: js.UndefOr[Assignment] = js.undefined
      
      var associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined
      
      var courseId: js.UndefOr[String] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var creatorUserId: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var dueDate: js.UndefOr[Date] = js.undefined
      
      var dueTime: js.UndefOr[TimeOfDay] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
      
      var materials: js.UndefOr[js.Array[Material]] = js.undefined
      
      var maxPoints: js.UndefOr[Double] = js.undefined
      
      var multipleChoiceQuestion: js.UndefOr[MultipleChoiceQuestion] = js.undefined
      
      var scheduledTime: js.UndefOr[String] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
      
      var submissionModificationMode: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var topicId: js.UndefOr[String] = js.undefined
      
      var updateTime: js.UndefOr[String] = js.undefined
      
      var workType: js.UndefOr[String] = js.undefined
    }
    object CourseWork {
      
      inline def apply(): CourseWork = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseWork]
      }
      
      extension [Self <: CourseWork](x: Self) {
        
        inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
        
        inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
        
        inline def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
        
        inline def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
        
        inline def setAssociatedWithDeveloper(value: Boolean): Self = StObject.set(x, "associatedWithDeveloper", value.asInstanceOf[js.Any])
        
        inline def setAssociatedWithDeveloperUndefined: Self = StObject.set(x, "associatedWithDeveloper", js.undefined)
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
        
        inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setDueDate(value: Date): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
        
        inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
        
        inline def setDueTime(value: TimeOfDay): Self = StObject.set(x, "dueTime", value.asInstanceOf[js.Any])
        
        inline def setDueTimeUndefined: Self = StObject.set(x, "dueTime", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
        
        inline def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
        
        inline def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
        
        inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
        
        inline def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value*))
        
        inline def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
        
        inline def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
        
        inline def setMultipleChoiceQuestion(value: MultipleChoiceQuestion): Self = StObject.set(x, "multipleChoiceQuestion", value.asInstanceOf[js.Any])
        
        inline def setMultipleChoiceQuestionUndefined: Self = StObject.set(x, "multipleChoiceQuestion", js.undefined)
        
        inline def setScheduledTime(value: String): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
        
        inline def setScheduledTimeUndefined: Self = StObject.set(x, "scheduledTime", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setSubmissionModificationMode(value: String): Self = StObject.set(x, "submissionModificationMode", value.asInstanceOf[js.Any])
        
        inline def setSubmissionModificationModeUndefined: Self = StObject.set(x, "submissionModificationMode", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
        
        inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
        
        inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
        
        inline def setWorkType(value: String): Self = StObject.set(x, "workType", value.asInstanceOf[js.Any])
        
        inline def setWorkTypeUndefined: Self = StObject.set(x, "workType", js.undefined)
      }
    }
    
    trait CourseWorkChangesInfo extends StObject {
      
      var courseId: js.UndefOr[String] = js.undefined
    }
    object CourseWorkChangesInfo {
      
      inline def apply(): CourseWorkChangesInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseWorkChangesInfo]
      }
      
      extension [Self <: CourseWorkChangesInfo](x: Self) {
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
      }
    }
    
    trait CourseWorkMaterial extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.undefined
      
      var assigneeMode: js.UndefOr[String] = js.undefined
      
      var courseId: js.UndefOr[String] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var creatorUserId: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
      
      var materials: js.UndefOr[js.Array[Material]] = js.undefined
      
      var scheduledTime: js.UndefOr[String] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var topicId: js.UndefOr[String] = js.undefined
      
      var updateTime: js.UndefOr[String] = js.undefined
    }
    object CourseWorkMaterial {
      
      inline def apply(): CourseWorkMaterial = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseWorkMaterial]
      }
      
      extension [Self <: CourseWorkMaterial](x: Self) {
        
        inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
        
        inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
        
        inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
        
        inline def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
        
        inline def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
        
        inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
        
        inline def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value*))
        
        inline def setScheduledTime(value: String): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
        
        inline def setScheduledTimeUndefined: Self = StObject.set(x, "scheduledTime", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
        
        inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
        
        inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
      }
    }
    
    trait Date extends StObject {
      
      var day: js.UndefOr[Double] = js.undefined
      
      var month: js.UndefOr[Double] = js.undefined
      
      var year: js.UndefOr[Double] = js.undefined
    }
    object Date {
      
      inline def apply(): Date = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Date]
      }
      
      extension [Self <: Date](x: Self) {
        
        inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      }
    }
    
    trait DriveFile extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var thumbnailUrl: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object DriveFile {
      
      inline def apply(): DriveFile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveFile]
      }
      
      extension [Self <: DriveFile](x: Self) {
        
        inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
        
        inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait DriveFolder extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object DriveFolder {
      
      inline def apply(): DriveFolder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveFolder]
      }
      
      extension [Self <: DriveFolder](x: Self) {
        
        inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait Feed extends StObject {
      
      var courseRosterChangesInfo: js.UndefOr[CourseRosterChangesInfo] = js.undefined
      
      var courseWorkChangesInfo: js.UndefOr[CourseWorkChangesInfo] = js.undefined
      
      var feedType: js.UndefOr[String] = js.undefined
    }
    object Feed {
      
      inline def apply(): Feed = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Feed]
      }
      
      extension [Self <: Feed](x: Self) {
        
        inline def setCourseRosterChangesInfo(value: CourseRosterChangesInfo): Self = StObject.set(x, "courseRosterChangesInfo", value.asInstanceOf[js.Any])
        
        inline def setCourseRosterChangesInfoUndefined: Self = StObject.set(x, "courseRosterChangesInfo", js.undefined)
        
        inline def setCourseWorkChangesInfo(value: CourseWorkChangesInfo): Self = StObject.set(x, "courseWorkChangesInfo", value.asInstanceOf[js.Any])
        
        inline def setCourseWorkChangesInfoUndefined: Self = StObject.set(x, "courseWorkChangesInfo", js.undefined)
        
        inline def setFeedType(value: String): Self = StObject.set(x, "feedType", value.asInstanceOf[js.Any])
        
        inline def setFeedTypeUndefined: Self = StObject.set(x, "feedType", js.undefined)
      }
    }
    
    trait Form extends StObject {
      
      var formUrl: js.UndefOr[String] = js.undefined
      
      var responseUrl: js.UndefOr[String] = js.undefined
      
      var thumbnailUrl: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object Form {
      
      inline def apply(): Form = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Form]
      }
      
      extension [Self <: Form](x: Self) {
        
        inline def setFormUrl(value: String): Self = StObject.set(x, "formUrl", value.asInstanceOf[js.Any])
        
        inline def setFormUrlUndefined: Self = StObject.set(x, "formUrl", js.undefined)
        
        inline def setResponseUrl(value: String): Self = StObject.set(x, "responseUrl", value.asInstanceOf[js.Any])
        
        inline def setResponseUrlUndefined: Self = StObject.set(x, "responseUrl", js.undefined)
        
        inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
        
        inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait GlobalPermission extends StObject {
      
      var permission: js.UndefOr[String] = js.undefined
    }
    object GlobalPermission {
      
      inline def apply(): GlobalPermission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GlobalPermission]
      }
      
      extension [Self <: GlobalPermission](x: Self) {
        
        inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
        
        inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
      }
    }
    
    trait GradeHistory extends StObject {
      
      var actorUserId: js.UndefOr[String] = js.undefined
      
      var gradeChangeType: js.UndefOr[String] = js.undefined
      
      var gradeTimestamp: js.UndefOr[String] = js.undefined
      
      var maxPoints: js.UndefOr[Double] = js.undefined
      
      var pointsEarned: js.UndefOr[Double] = js.undefined
    }
    object GradeHistory {
      
      inline def apply(): GradeHistory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GradeHistory]
      }
      
      extension [Self <: GradeHistory](x: Self) {
        
        inline def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
        
        inline def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
        
        inline def setGradeChangeType(value: String): Self = StObject.set(x, "gradeChangeType", value.asInstanceOf[js.Any])
        
        inline def setGradeChangeTypeUndefined: Self = StObject.set(x, "gradeChangeType", js.undefined)
        
        inline def setGradeTimestamp(value: String): Self = StObject.set(x, "gradeTimestamp", value.asInstanceOf[js.Any])
        
        inline def setGradeTimestampUndefined: Self = StObject.set(x, "gradeTimestamp", js.undefined)
        
        inline def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
        
        inline def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
        
        inline def setPointsEarned(value: Double): Self = StObject.set(x, "pointsEarned", value.asInstanceOf[js.Any])
        
        inline def setPointsEarnedUndefined: Self = StObject.set(x, "pointsEarned", js.undefined)
      }
    }
    
    trait Guardian extends StObject {
      
      var guardianId: js.UndefOr[String] = js.undefined
      
      var guardianProfile: js.UndefOr[UserProfile] = js.undefined
      
      var invitedEmailAddress: js.UndefOr[String] = js.undefined
      
      var studentId: js.UndefOr[String] = js.undefined
    }
    object Guardian {
      
      inline def apply(): Guardian = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Guardian]
      }
      
      extension [Self <: Guardian](x: Self) {
        
        inline def setGuardianId(value: String): Self = StObject.set(x, "guardianId", value.asInstanceOf[js.Any])
        
        inline def setGuardianIdUndefined: Self = StObject.set(x, "guardianId", js.undefined)
        
        inline def setGuardianProfile(value: UserProfile): Self = StObject.set(x, "guardianProfile", value.asInstanceOf[js.Any])
        
        inline def setGuardianProfileUndefined: Self = StObject.set(x, "guardianProfile", js.undefined)
        
        inline def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
        
        inline def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
        
        inline def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
        
        inline def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
      }
    }
    
    trait GuardianInvitation extends StObject {
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var invitationId: js.UndefOr[String] = js.undefined
      
      var invitedEmailAddress: js.UndefOr[String] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
      
      var studentId: js.UndefOr[String] = js.undefined
    }
    object GuardianInvitation {
      
      inline def apply(): GuardianInvitation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GuardianInvitation]
      }
      
      extension [Self <: GuardianInvitation](x: Self) {
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
        
        inline def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
        
        inline def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
        
        inline def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
        
        inline def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
      }
    }
    
    trait IndividualStudentsOptions extends StObject {
      
      var studentIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object IndividualStudentsOptions {
      
      inline def apply(): IndividualStudentsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IndividualStudentsOptions]
      }
      
      extension [Self <: IndividualStudentsOptions](x: Self) {
        
        inline def setStudentIds(value: js.Array[String]): Self = StObject.set(x, "studentIds", value.asInstanceOf[js.Any])
        
        inline def setStudentIdsUndefined: Self = StObject.set(x, "studentIds", js.undefined)
        
        inline def setStudentIdsVarargs(value: String*): Self = StObject.set(x, "studentIds", js.Array(value*))
      }
    }
    
    trait Invitation extends StObject {
      
      var courseId: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
      
      var userId: js.UndefOr[String] = js.undefined
    }
    object Invitation {
      
      inline def apply(): Invitation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Invitation]
      }
      
      extension [Self <: Invitation](x: Self) {
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait Link extends StObject {
      
      var thumbnailUrl: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object Link {
      
      inline def apply(): Link = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Link]
      }
      
      extension [Self <: Link](x: Self) {
        
        inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
        
        inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait ListAnnouncementsResponse extends StObject {
      
      var announcements: js.UndefOr[js.Array[Announcement]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListAnnouncementsResponse {
      
      inline def apply(): ListAnnouncementsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListAnnouncementsResponse]
      }
      
      extension [Self <: ListAnnouncementsResponse](x: Self) {
        
        inline def setAnnouncements(value: js.Array[Announcement]): Self = StObject.set(x, "announcements", value.asInstanceOf[js.Any])
        
        inline def setAnnouncementsUndefined: Self = StObject.set(x, "announcements", js.undefined)
        
        inline def setAnnouncementsVarargs(value: Announcement*): Self = StObject.set(x, "announcements", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListCourseAliasesResponse extends StObject {
      
      var aliases: js.UndefOr[js.Array[CourseAlias]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListCourseAliasesResponse {
      
      inline def apply(): ListCourseAliasesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListCourseAliasesResponse]
      }
      
      extension [Self <: ListCourseAliasesResponse](x: Self) {
        
        inline def setAliases(value: js.Array[CourseAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
        
        inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
        
        inline def setAliasesVarargs(value: CourseAlias*): Self = StObject.set(x, "aliases", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListCourseWorkMaterialResponse extends StObject {
      
      var courseWorkMaterial: js.UndefOr[js.Array[CourseWorkMaterial]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListCourseWorkMaterialResponse {
      
      inline def apply(): ListCourseWorkMaterialResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListCourseWorkMaterialResponse]
      }
      
      extension [Self <: ListCourseWorkMaterialResponse](x: Self) {
        
        inline def setCourseWorkMaterial(value: js.Array[CourseWorkMaterial]): Self = StObject.set(x, "courseWorkMaterial", value.asInstanceOf[js.Any])
        
        inline def setCourseWorkMaterialUndefined: Self = StObject.set(x, "courseWorkMaterial", js.undefined)
        
        inline def setCourseWorkMaterialVarargs(value: CourseWorkMaterial*): Self = StObject.set(x, "courseWorkMaterial", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListCourseWorkResponse extends StObject {
      
      var courseWork: js.UndefOr[js.Array[CourseWork]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListCourseWorkResponse {
      
      inline def apply(): ListCourseWorkResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListCourseWorkResponse]
      }
      
      extension [Self <: ListCourseWorkResponse](x: Self) {
        
        inline def setCourseWork(value: js.Array[CourseWork]): Self = StObject.set(x, "courseWork", value.asInstanceOf[js.Any])
        
        inline def setCourseWorkUndefined: Self = StObject.set(x, "courseWork", js.undefined)
        
        inline def setCourseWorkVarargs(value: CourseWork*): Self = StObject.set(x, "courseWork", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListCoursesResponse extends StObject {
      
      var courses: js.UndefOr[js.Array[Course]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListCoursesResponse {
      
      inline def apply(): ListCoursesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListCoursesResponse]
      }
      
      extension [Self <: ListCoursesResponse](x: Self) {
        
        inline def setCourses(value: js.Array[Course]): Self = StObject.set(x, "courses", value.asInstanceOf[js.Any])
        
        inline def setCoursesUndefined: Self = StObject.set(x, "courses", js.undefined)
        
        inline def setCoursesVarargs(value: Course*): Self = StObject.set(x, "courses", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListGuardianInvitationsResponse extends StObject {
      
      var guardianInvitations: js.UndefOr[js.Array[GuardianInvitation]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListGuardianInvitationsResponse {
      
      inline def apply(): ListGuardianInvitationsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGuardianInvitationsResponse]
      }
      
      extension [Self <: ListGuardianInvitationsResponse](x: Self) {
        
        inline def setGuardianInvitations(value: js.Array[GuardianInvitation]): Self = StObject.set(x, "guardianInvitations", value.asInstanceOf[js.Any])
        
        inline def setGuardianInvitationsUndefined: Self = StObject.set(x, "guardianInvitations", js.undefined)
        
        inline def setGuardianInvitationsVarargs(value: GuardianInvitation*): Self = StObject.set(x, "guardianInvitations", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListGuardiansResponse extends StObject {
      
      var guardians: js.UndefOr[js.Array[Guardian]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListGuardiansResponse {
      
      inline def apply(): ListGuardiansResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGuardiansResponse]
      }
      
      extension [Self <: ListGuardiansResponse](x: Self) {
        
        inline def setGuardians(value: js.Array[Guardian]): Self = StObject.set(x, "guardians", value.asInstanceOf[js.Any])
        
        inline def setGuardiansUndefined: Self = StObject.set(x, "guardians", js.undefined)
        
        inline def setGuardiansVarargs(value: Guardian*): Self = StObject.set(x, "guardians", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListInvitationsResponse extends StObject {
      
      var invitations: js.UndefOr[js.Array[Invitation]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListInvitationsResponse {
      
      inline def apply(): ListInvitationsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListInvitationsResponse]
      }
      
      extension [Self <: ListInvitationsResponse](x: Self) {
        
        inline def setInvitations(value: js.Array[Invitation]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
        
        inline def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
        
        inline def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "invitations", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait ListStudentSubmissionsResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var studentSubmissions: js.UndefOr[js.Array[StudentSubmission]] = js.undefined
    }
    object ListStudentSubmissionsResponse {
      
      inline def apply(): ListStudentSubmissionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListStudentSubmissionsResponse]
      }
      
      extension [Self <: ListStudentSubmissionsResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setStudentSubmissions(value: js.Array[StudentSubmission]): Self = StObject.set(x, "studentSubmissions", value.asInstanceOf[js.Any])
        
        inline def setStudentSubmissionsUndefined: Self = StObject.set(x, "studentSubmissions", js.undefined)
        
        inline def setStudentSubmissionsVarargs(value: StudentSubmission*): Self = StObject.set(x, "studentSubmissions", js.Array(value*))
      }
    }
    
    trait ListStudentsResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var students: js.UndefOr[js.Array[Student]] = js.undefined
    }
    object ListStudentsResponse {
      
      inline def apply(): ListStudentsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListStudentsResponse]
      }
      
      extension [Self <: ListStudentsResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setStudents(value: js.Array[Student]): Self = StObject.set(x, "students", value.asInstanceOf[js.Any])
        
        inline def setStudentsUndefined: Self = StObject.set(x, "students", js.undefined)
        
        inline def setStudentsVarargs(value: Student*): Self = StObject.set(x, "students", js.Array(value*))
      }
    }
    
    trait ListTeachersResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var teachers: js.UndefOr[js.Array[Teacher]] = js.undefined
    }
    object ListTeachersResponse {
      
      inline def apply(): ListTeachersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListTeachersResponse]
      }
      
      extension [Self <: ListTeachersResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setTeachers(value: js.Array[Teacher]): Self = StObject.set(x, "teachers", value.asInstanceOf[js.Any])
        
        inline def setTeachersUndefined: Self = StObject.set(x, "teachers", js.undefined)
        
        inline def setTeachersVarargs(value: Teacher*): Self = StObject.set(x, "teachers", js.Array(value*))
      }
    }
    
    trait ListTopicResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var topic: js.UndefOr[js.Array[Topic]] = js.undefined
    }
    object ListTopicResponse {
      
      inline def apply(): ListTopicResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListTopicResponse]
      }
      
      extension [Self <: ListTopicResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setTopic(value: js.Array[Topic]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
        
        inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
        
        inline def setTopicVarargs(value: Topic*): Self = StObject.set(x, "topic", js.Array(value*))
      }
    }
    
    trait Material extends StObject {
      
      var driveFile: js.UndefOr[SharedDriveFile] = js.undefined
      
      var form: js.UndefOr[Form] = js.undefined
      
      var link: js.UndefOr[Link] = js.undefined
      
      var youtubeVideo: js.UndefOr[YouTubeVideo] = js.undefined
    }
    object Material {
      
      inline def apply(): Material = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Material]
      }
      
      extension [Self <: Material](x: Self) {
        
        inline def setDriveFile(value: SharedDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
        
        inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
        
        inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setYoutubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youtubeVideo", value.asInstanceOf[js.Any])
        
        inline def setYoutubeVideoUndefined: Self = StObject.set(x, "youtubeVideo", js.undefined)
      }
    }
    
    trait ModifyAnnouncementAssigneesRequest extends StObject {
      
      var assigneeMode: js.UndefOr[String] = js.undefined
      
      var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
    }
    object ModifyAnnouncementAssigneesRequest {
      
      inline def apply(): ModifyAnnouncementAssigneesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyAnnouncementAssigneesRequest]
      }
      
      extension [Self <: ModifyAnnouncementAssigneesRequest](x: Self) {
        
        inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
        
        inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
        
        inline def setModifyIndividualStudentsOptions(value: ModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
        
        inline def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
      }
    }
    
    trait ModifyAttachmentsRequest extends StObject {
      
      var addAttachments: js.UndefOr[js.Array[Attachment]] = js.undefined
    }
    object ModifyAttachmentsRequest {
      
      inline def apply(): ModifyAttachmentsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyAttachmentsRequest]
      }
      
      extension [Self <: ModifyAttachmentsRequest](x: Self) {
        
        inline def setAddAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "addAttachments", value.asInstanceOf[js.Any])
        
        inline def setAddAttachmentsUndefined: Self = StObject.set(x, "addAttachments", js.undefined)
        
        inline def setAddAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "addAttachments", js.Array(value*))
      }
    }
    
    trait ModifyCourseWorkAssigneesRequest extends StObject {
      
      var assigneeMode: js.UndefOr[String] = js.undefined
      
      var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
    }
    object ModifyCourseWorkAssigneesRequest {
      
      inline def apply(): ModifyCourseWorkAssigneesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyCourseWorkAssigneesRequest]
      }
      
      extension [Self <: ModifyCourseWorkAssigneesRequest](x: Self) {
        
        inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
        
        inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
        
        inline def setModifyIndividualStudentsOptions(value: ModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
        
        inline def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
      }
    }
    
    trait ModifyIndividualStudentsOptions extends StObject {
      
      var addStudentIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var removeStudentIds: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ModifyIndividualStudentsOptions {
      
      inline def apply(): ModifyIndividualStudentsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyIndividualStudentsOptions]
      }
      
      extension [Self <: ModifyIndividualStudentsOptions](x: Self) {
        
        inline def setAddStudentIds(value: js.Array[String]): Self = StObject.set(x, "addStudentIds", value.asInstanceOf[js.Any])
        
        inline def setAddStudentIdsUndefined: Self = StObject.set(x, "addStudentIds", js.undefined)
        
        inline def setAddStudentIdsVarargs(value: String*): Self = StObject.set(x, "addStudentIds", js.Array(value*))
        
        inline def setRemoveStudentIds(value: js.Array[String]): Self = StObject.set(x, "removeStudentIds", value.asInstanceOf[js.Any])
        
        inline def setRemoveStudentIdsUndefined: Self = StObject.set(x, "removeStudentIds", js.undefined)
        
        inline def setRemoveStudentIdsVarargs(value: String*): Self = StObject.set(x, "removeStudentIds", js.Array(value*))
      }
    }
    
    trait MultipleChoiceQuestion extends StObject {
      
      var choices: js.UndefOr[js.Array[String]] = js.undefined
    }
    object MultipleChoiceQuestion {
      
      inline def apply(): MultipleChoiceQuestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MultipleChoiceQuestion]
      }
      
      extension [Self <: MultipleChoiceQuestion](x: Self) {
        
        inline def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
        
        inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
        
        inline def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value*))
      }
    }
    
    trait MultipleChoiceSubmission extends StObject {
      
      var answer: js.UndefOr[String] = js.undefined
    }
    object MultipleChoiceSubmission {
      
      inline def apply(): MultipleChoiceSubmission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MultipleChoiceSubmission]
      }
      
      extension [Self <: MultipleChoiceSubmission](x: Self) {
        
        inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
        
        inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
      }
    }
    
    trait Name extends StObject {
      
      var familyName: js.UndefOr[String] = js.undefined
      
      var fullName: js.UndefOr[String] = js.undefined
      
      var givenName: js.UndefOr[String] = js.undefined
    }
    object Name {
      
      inline def apply(): Name = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Name]
      }
      
      extension [Self <: Name](x: Self) {
        
        inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
        
        inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
        
        inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
        
        inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
        
        inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
        
        inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      }
    }
    
    trait Registration extends StObject {
      
      var cloudPubsubTopic: js.UndefOr[CloudPubsubTopic] = js.undefined
      
      var expiryTime: js.UndefOr[String] = js.undefined
      
      var feed: js.UndefOr[Feed] = js.undefined
      
      var registrationId: js.UndefOr[String] = js.undefined
    }
    object Registration {
      
      inline def apply(): Registration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Registration]
      }
      
      extension [Self <: Registration](x: Self) {
        
        inline def setCloudPubsubTopic(value: CloudPubsubTopic): Self = StObject.set(x, "cloudPubsubTopic", value.asInstanceOf[js.Any])
        
        inline def setCloudPubsubTopicUndefined: Self = StObject.set(x, "cloudPubsubTopic", js.undefined)
        
        inline def setExpiryTime(value: String): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
        
        inline def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
        
        inline def setFeed(value: Feed): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
        
        inline def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
        
        inline def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
        
        inline def setRegistrationIdUndefined: Self = StObject.set(x, "registrationId", js.undefined)
      }
    }
    
    trait SharedDriveFile extends StObject {
      
      var driveFile: js.UndefOr[DriveFile] = js.undefined
      
      var shareMode: js.UndefOr[String] = js.undefined
    }
    object SharedDriveFile {
      
      inline def apply(): SharedDriveFile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SharedDriveFile]
      }
      
      extension [Self <: SharedDriveFile](x: Self) {
        
        inline def setDriveFile(value: DriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
        
        inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
        
        inline def setShareMode(value: String): Self = StObject.set(x, "shareMode", value.asInstanceOf[js.Any])
        
        inline def setShareModeUndefined: Self = StObject.set(x, "shareMode", js.undefined)
      }
    }
    
    trait ShortAnswerSubmission extends StObject {
      
      var answer: js.UndefOr[String] = js.undefined
    }
    object ShortAnswerSubmission {
      
      inline def apply(): ShortAnswerSubmission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ShortAnswerSubmission]
      }
      
      extension [Self <: ShortAnswerSubmission](x: Self) {
        
        inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
        
        inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
      }
    }
    
    trait StateHistory extends StObject {
      
      var actorUserId: js.UndefOr[String] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
      
      var stateTimestamp: js.UndefOr[String] = js.undefined
    }
    object StateHistory {
      
      inline def apply(): StateHistory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StateHistory]
      }
      
      extension [Self <: StateHistory](x: Self) {
        
        inline def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
        
        inline def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateTimestamp(value: String): Self = StObject.set(x, "stateTimestamp", value.asInstanceOf[js.Any])
        
        inline def setStateTimestampUndefined: Self = StObject.set(x, "stateTimestamp", js.undefined)
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
    
    trait Student extends StObject {
      
      var courseId: js.UndefOr[String] = js.undefined
      
      var profile: js.UndefOr[UserProfile] = js.undefined
      
      var studentWorkFolder: js.UndefOr[DriveFolder] = js.undefined
      
      var userId: js.UndefOr[String] = js.undefined
    }
    object Student {
      
      inline def apply(): Student = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Student]
      }
      
      extension [Self <: Student](x: Self) {
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        inline def setProfile(value: UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
        
        inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
        
        inline def setStudentWorkFolder(value: DriveFolder): Self = StObject.set(x, "studentWorkFolder", value.asInstanceOf[js.Any])
        
        inline def setStudentWorkFolderUndefined: Self = StObject.set(x, "studentWorkFolder", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait StudentSubmission extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.undefined
      
      var assignedGrade: js.UndefOr[Double] = js.undefined
      
      var assignmentSubmission: js.UndefOr[AssignmentSubmission] = js.undefined
      
      var associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined
      
      var courseId: js.UndefOr[String] = js.undefined
      
      var courseWorkId: js.UndefOr[String] = js.undefined
      
      var courseWorkType: js.UndefOr[String] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var draftGrade: js.UndefOr[Double] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var late: js.UndefOr[Boolean] = js.undefined
      
      var multipleChoiceSubmission: js.UndefOr[MultipleChoiceSubmission] = js.undefined
      
      var shortAnswerSubmission: js.UndefOr[ShortAnswerSubmission] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
      
      var submissionHistory: js.UndefOr[js.Array[SubmissionHistory]] = js.undefined
      
      var updateTime: js.UndefOr[String] = js.undefined
      
      var userId: js.UndefOr[String] = js.undefined
    }
    object StudentSubmission {
      
      inline def apply(): StudentSubmission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StudentSubmission]
      }
      
      extension [Self <: StudentSubmission](x: Self) {
        
        inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        inline def setAssignedGrade(value: Double): Self = StObject.set(x, "assignedGrade", value.asInstanceOf[js.Any])
        
        inline def setAssignedGradeUndefined: Self = StObject.set(x, "assignedGrade", js.undefined)
        
        inline def setAssignmentSubmission(value: AssignmentSubmission): Self = StObject.set(x, "assignmentSubmission", value.asInstanceOf[js.Any])
        
        inline def setAssignmentSubmissionUndefined: Self = StObject.set(x, "assignmentSubmission", js.undefined)
        
        inline def setAssociatedWithDeveloper(value: Boolean): Self = StObject.set(x, "associatedWithDeveloper", value.asInstanceOf[js.Any])
        
        inline def setAssociatedWithDeveloperUndefined: Self = StObject.set(x, "associatedWithDeveloper", js.undefined)
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        inline def setCourseWorkId(value: String): Self = StObject.set(x, "courseWorkId", value.asInstanceOf[js.Any])
        
        inline def setCourseWorkIdUndefined: Self = StObject.set(x, "courseWorkId", js.undefined)
        
        inline def setCourseWorkType(value: String): Self = StObject.set(x, "courseWorkType", value.asInstanceOf[js.Any])
        
        inline def setCourseWorkTypeUndefined: Self = StObject.set(x, "courseWorkType", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setDraftGrade(value: Double): Self = StObject.set(x, "draftGrade", value.asInstanceOf[js.Any])
        
        inline def setDraftGradeUndefined: Self = StObject.set(x, "draftGrade", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLate(value: Boolean): Self = StObject.set(x, "late", value.asInstanceOf[js.Any])
        
        inline def setLateUndefined: Self = StObject.set(x, "late", js.undefined)
        
        inline def setMultipleChoiceSubmission(value: MultipleChoiceSubmission): Self = StObject.set(x, "multipleChoiceSubmission", value.asInstanceOf[js.Any])
        
        inline def setMultipleChoiceSubmissionUndefined: Self = StObject.set(x, "multipleChoiceSubmission", js.undefined)
        
        inline def setShortAnswerSubmission(value: ShortAnswerSubmission): Self = StObject.set(x, "shortAnswerSubmission", value.asInstanceOf[js.Any])
        
        inline def setShortAnswerSubmissionUndefined: Self = StObject.set(x, "shortAnswerSubmission", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setSubmissionHistory(value: js.Array[SubmissionHistory]): Self = StObject.set(x, "submissionHistory", value.asInstanceOf[js.Any])
        
        inline def setSubmissionHistoryUndefined: Self = StObject.set(x, "submissionHistory", js.undefined)
        
        inline def setSubmissionHistoryVarargs(value: SubmissionHistory*): Self = StObject.set(x, "submissionHistory", js.Array(value*))
        
        inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait SubmissionHistory extends StObject {
      
      var gradeHistory: js.UndefOr[GradeHistory] = js.undefined
      
      var stateHistory: js.UndefOr[StateHistory] = js.undefined
    }
    object SubmissionHistory {
      
      inline def apply(): SubmissionHistory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubmissionHistory]
      }
      
      extension [Self <: SubmissionHistory](x: Self) {
        
        inline def setGradeHistory(value: GradeHistory): Self = StObject.set(x, "gradeHistory", value.asInstanceOf[js.Any])
        
        inline def setGradeHistoryUndefined: Self = StObject.set(x, "gradeHistory", js.undefined)
        
        inline def setStateHistory(value: StateHistory): Self = StObject.set(x, "stateHistory", value.asInstanceOf[js.Any])
        
        inline def setStateHistoryUndefined: Self = StObject.set(x, "stateHistory", js.undefined)
      }
    }
    
    trait Teacher extends StObject {
      
      var courseId: js.UndefOr[String] = js.undefined
      
      var profile: js.UndefOr[UserProfile] = js.undefined
      
      var userId: js.UndefOr[String] = js.undefined
    }
    object Teacher {
      
      inline def apply(): Teacher = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Teacher]
      }
      
      extension [Self <: Teacher](x: Self) {
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        inline def setProfile(value: UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
        
        inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
        
        inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    trait TimeOfDay extends StObject {
      
      var hours: js.UndefOr[Double] = js.undefined
      
      var minutes: js.UndefOr[Double] = js.undefined
      
      var nanos: js.UndefOr[Double] = js.undefined
      
      var seconds: js.UndefOr[Double] = js.undefined
    }
    object TimeOfDay {
      
      inline def apply(): TimeOfDay = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimeOfDay]
      }
      
      extension [Self <: TimeOfDay](x: Self) {
        
        inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
        
        inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
        
        inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
        
        inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
        
        inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
        
        inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
        
        inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      }
    }
    
    trait Topic extends StObject {
      
      var courseId: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var topicId: js.UndefOr[String] = js.undefined
      
      var updateTime: js.UndefOr[String] = js.undefined
    }
    object Topic {
      
      inline def apply(): Topic = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Topic]
      }
      
      extension [Self <: Topic](x: Self) {
        
        inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
        
        inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
        
        inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
      }
    }
    
    trait UserProfile extends StObject {
      
      var emailAddress: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[Name] = js.undefined
      
      var permissions: js.UndefOr[js.Array[GlobalPermission]] = js.undefined
      
      var photoUrl: js.UndefOr[String] = js.undefined
      
      var verifiedTeacher: js.UndefOr[Boolean] = js.undefined
    }
    object UserProfile {
      
      inline def apply(): UserProfile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserProfile]
      }
      
      extension [Self <: UserProfile](x: Self) {
        
        inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
        
        inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPermissions(value: js.Array[GlobalPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        inline def setPermissionsVarargs(value: GlobalPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
        
        inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
        
        inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
        
        inline def setVerifiedTeacher(value: Boolean): Self = StObject.set(x, "verifiedTeacher", value.asInstanceOf[js.Any])
        
        inline def setVerifiedTeacherUndefined: Self = StObject.set(x, "verifiedTeacher", js.undefined)
      }
    }
    
    trait YouTubeVideo extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var thumbnailUrl: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object YouTubeVideo {
      
      inline def apply(): YouTubeVideo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[YouTubeVideo]
      }
      
      extension [Self <: YouTubeVideo](x: Self) {
        
        inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
        
        inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
