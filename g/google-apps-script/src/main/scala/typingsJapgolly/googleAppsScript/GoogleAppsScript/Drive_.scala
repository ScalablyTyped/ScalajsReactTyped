package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.AboutCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.AppsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.ChangesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.ChannelsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.ChildrenCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.CommentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.DrivesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.FilesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.ParentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.PermissionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.PropertiesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.RealtimeCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.RepliesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.RevisionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Collection.TeamdrivesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.Channel
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.ChildReference
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.Comment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentContext
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentReply
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveBackgroundImageFile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveCapabilities
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveRestrictions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.File
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.FileCapabilities
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.FileImageMediaMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.FileImageMediaMetadataLocation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.FileIndexableText
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.FileLabels
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.FileThumbnail
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.FileVideoMediaMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.ParentReference
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionPermissionDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionTeamDrivePermissionDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.Property
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.Revision
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDrive
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveBackgroundImageFile
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveCapabilities
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveRestrictions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.User
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.UserPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive_ extends js.Object {
  var About: js.UndefOr[AboutCollection] = js.undefined
  var Apps: js.UndefOr[AppsCollection] = js.undefined
  var Changes: js.UndefOr[ChangesCollection] = js.undefined
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  var Children: js.UndefOr[ChildrenCollection] = js.undefined
  var Comments: js.UndefOr[CommentsCollection] = js.undefined
  var Drives: js.UndefOr[DrivesCollection] = js.undefined
  var Files: js.UndefOr[FilesCollection] = js.undefined
  var Parents: js.UndefOr[ParentsCollection] = js.undefined
  var Permissions: js.UndefOr[PermissionsCollection] = js.undefined
  var Properties: js.UndefOr[PropertiesCollection] = js.undefined
  var Realtime: js.UndefOr[RealtimeCollection] = js.undefined
  var Replies: js.UndefOr[RepliesCollection] = js.undefined
  var Revisions: js.UndefOr[RevisionsCollection] = js.undefined
  var Teamdrives: js.UndefOr[TeamdrivesCollection] = js.undefined
  // Create a new instance of Channel
  def newChannel(): Channel
  // Create a new instance of ChildReference
  def newChildReference(): ChildReference
  // Create a new instance of Comment
  def newComment(): Comment
  // Create a new instance of CommentContext
  def newCommentContext(): CommentContext
  // Create a new instance of CommentReply
  def newCommentReply(): CommentReply
  // Create a new instance of Drive
  def newDrive(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive
  // Create a new instance of DriveBackgroundImageFile
  def newDriveBackgroundImageFile(): DriveBackgroundImageFile
  // Create a new instance of DriveCapabilities
  def newDriveCapabilities(): DriveCapabilities
  // Create a new instance of DriveRestrictions
  def newDriveRestrictions(): DriveRestrictions
  // Create a new instance of File
  def newFile(): File
  // Create a new instance of FileCapabilities
  def newFileCapabilities(): FileCapabilities
  // Create a new instance of FileImageMediaMetadata
  def newFileImageMediaMetadata(): FileImageMediaMetadata
  // Create a new instance of FileImageMediaMetadataLocation
  def newFileImageMediaMetadataLocation(): FileImageMediaMetadataLocation
  // Create a new instance of FileIndexableText
  def newFileIndexableText(): FileIndexableText
  // Create a new instance of FileLabels
  def newFileLabels(): FileLabels
  // Create a new instance of FileThumbnail
  def newFileThumbnail(): FileThumbnail
  // Create a new instance of FileVideoMediaMetadata
  def newFileVideoMediaMetadata(): FileVideoMediaMetadata
  // Create a new instance of ParentReference
  def newParentReference(): ParentReference
  // Create a new instance of Permission
  def newPermission(): Permission
  // Create a new instance of PermissionPermissionDetails
  def newPermissionPermissionDetails(): PermissionPermissionDetails
  // Create a new instance of PermissionTeamDrivePermissionDetails
  def newPermissionTeamDrivePermissionDetails(): PermissionTeamDrivePermissionDetails
  // Create a new instance of Property
  def newProperty(): Property
  // Create a new instance of Revision
  def newRevision(): Revision
  // Create a new instance of TeamDrive
  def newTeamDrive(): TeamDrive
  // Create a new instance of TeamDriveBackgroundImageFile
  def newTeamDriveBackgroundImageFile(): TeamDriveBackgroundImageFile
  // Create a new instance of TeamDriveCapabilities
  def newTeamDriveCapabilities(): TeamDriveCapabilities
  // Create a new instance of TeamDriveRestrictions
  def newTeamDriveRestrictions(): TeamDriveRestrictions
  // Create a new instance of User
  def newUser(): User
  // Create a new instance of UserPicture
  def newUserPicture(): UserPicture
}

object Drive_ {
  @scala.inline
  def apply(
    newChannel: CallbackTo[Channel],
    newChildReference: CallbackTo[ChildReference],
    newComment: CallbackTo[Comment],
    newCommentContext: CallbackTo[CommentContext],
    newCommentReply: CallbackTo[CommentReply],
    newDrive: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive],
    newDriveBackgroundImageFile: CallbackTo[DriveBackgroundImageFile],
    newDriveCapabilities: CallbackTo[DriveCapabilities],
    newDriveRestrictions: CallbackTo[DriveRestrictions],
    newFile: CallbackTo[File],
    newFileCapabilities: CallbackTo[FileCapabilities],
    newFileImageMediaMetadata: CallbackTo[FileImageMediaMetadata],
    newFileImageMediaMetadataLocation: CallbackTo[FileImageMediaMetadataLocation],
    newFileIndexableText: CallbackTo[FileIndexableText],
    newFileLabels: CallbackTo[FileLabels],
    newFileThumbnail: CallbackTo[FileThumbnail],
    newFileVideoMediaMetadata: CallbackTo[FileVideoMediaMetadata],
    newParentReference: CallbackTo[ParentReference],
    newPermission: CallbackTo[Permission],
    newPermissionPermissionDetails: CallbackTo[PermissionPermissionDetails],
    newPermissionTeamDrivePermissionDetails: CallbackTo[PermissionTeamDrivePermissionDetails],
    newProperty: CallbackTo[Property],
    newRevision: CallbackTo[Revision],
    newTeamDrive: CallbackTo[TeamDrive],
    newTeamDriveBackgroundImageFile: CallbackTo[TeamDriveBackgroundImageFile],
    newTeamDriveCapabilities: CallbackTo[TeamDriveCapabilities],
    newTeamDriveRestrictions: CallbackTo[TeamDriveRestrictions],
    newUser: CallbackTo[User],
    newUserPicture: CallbackTo[UserPicture],
    About: AboutCollection = null,
    Apps: AppsCollection = null,
    Changes: ChangesCollection = null,
    Channels: ChannelsCollection = null,
    Children: ChildrenCollection = null,
    Comments: CommentsCollection = null,
    Drives: DrivesCollection = null,
    Files: FilesCollection = null,
    Parents: ParentsCollection = null,
    Permissions: PermissionsCollection = null,
    Properties: PropertiesCollection = null,
    Realtime: RealtimeCollection = null,
    Replies: RepliesCollection = null,
    Revisions: RevisionsCollection = null,
    Teamdrives: TeamdrivesCollection = null
  ): Drive_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newChannel")(newChannel.toJsFn)
    __obj.updateDynamic("newChildReference")(newChildReference.toJsFn)
    __obj.updateDynamic("newComment")(newComment.toJsFn)
    __obj.updateDynamic("newCommentContext")(newCommentContext.toJsFn)
    __obj.updateDynamic("newCommentReply")(newCommentReply.toJsFn)
    __obj.updateDynamic("newDrive")(newDrive.toJsFn)
    __obj.updateDynamic("newDriveBackgroundImageFile")(newDriveBackgroundImageFile.toJsFn)
    __obj.updateDynamic("newDriveCapabilities")(newDriveCapabilities.toJsFn)
    __obj.updateDynamic("newDriveRestrictions")(newDriveRestrictions.toJsFn)
    __obj.updateDynamic("newFile")(newFile.toJsFn)
    __obj.updateDynamic("newFileCapabilities")(newFileCapabilities.toJsFn)
    __obj.updateDynamic("newFileImageMediaMetadata")(newFileImageMediaMetadata.toJsFn)
    __obj.updateDynamic("newFileImageMediaMetadataLocation")(newFileImageMediaMetadataLocation.toJsFn)
    __obj.updateDynamic("newFileIndexableText")(newFileIndexableText.toJsFn)
    __obj.updateDynamic("newFileLabels")(newFileLabels.toJsFn)
    __obj.updateDynamic("newFileThumbnail")(newFileThumbnail.toJsFn)
    __obj.updateDynamic("newFileVideoMediaMetadata")(newFileVideoMediaMetadata.toJsFn)
    __obj.updateDynamic("newParentReference")(newParentReference.toJsFn)
    __obj.updateDynamic("newPermission")(newPermission.toJsFn)
    __obj.updateDynamic("newPermissionPermissionDetails")(newPermissionPermissionDetails.toJsFn)
    __obj.updateDynamic("newPermissionTeamDrivePermissionDetails")(newPermissionTeamDrivePermissionDetails.toJsFn)
    __obj.updateDynamic("newProperty")(newProperty.toJsFn)
    __obj.updateDynamic("newRevision")(newRevision.toJsFn)
    __obj.updateDynamic("newTeamDrive")(newTeamDrive.toJsFn)
    __obj.updateDynamic("newTeamDriveBackgroundImageFile")(newTeamDriveBackgroundImageFile.toJsFn)
    __obj.updateDynamic("newTeamDriveCapabilities")(newTeamDriveCapabilities.toJsFn)
    __obj.updateDynamic("newTeamDriveRestrictions")(newTeamDriveRestrictions.toJsFn)
    __obj.updateDynamic("newUser")(newUser.toJsFn)
    __obj.updateDynamic("newUserPicture")(newUserPicture.toJsFn)
    if (About != null) __obj.updateDynamic("About")(About.asInstanceOf[js.Any])
    if (Apps != null) __obj.updateDynamic("Apps")(Apps.asInstanceOf[js.Any])
    if (Changes != null) __obj.updateDynamic("Changes")(Changes.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (Children != null) __obj.updateDynamic("Children")(Children.asInstanceOf[js.Any])
    if (Comments != null) __obj.updateDynamic("Comments")(Comments.asInstanceOf[js.Any])
    if (Drives != null) __obj.updateDynamic("Drives")(Drives.asInstanceOf[js.Any])
    if (Files != null) __obj.updateDynamic("Files")(Files.asInstanceOf[js.Any])
    if (Parents != null) __obj.updateDynamic("Parents")(Parents.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    if (Realtime != null) __obj.updateDynamic("Realtime")(Realtime.asInstanceOf[js.Any])
    if (Replies != null) __obj.updateDynamic("Replies")(Replies.asInstanceOf[js.Any])
    if (Revisions != null) __obj.updateDynamic("Revisions")(Revisions.asInstanceOf[js.Any])
    if (Teamdrives != null) __obj.updateDynamic("Teamdrives")(Teamdrives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive_]
  }
}

