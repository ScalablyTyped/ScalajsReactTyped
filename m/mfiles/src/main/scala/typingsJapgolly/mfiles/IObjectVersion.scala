package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInDocumentClass
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectClass
import typingsJapgolly.mfiles.MFiles.MFObjectVersionFlag
import typingsJapgolly.mfiles.MFiles.MFSpecialObjectFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersion extends js.Object {
  val AccessedByMeUtc: js.Date
  val CheckedOutAtUtc: js.Date
  val CheckedOutTo: Double
  val CheckedOutToHostName: String
  val CheckedOutToUserName: String
  val CheckedOutVersion: Double
  val Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  val CreatedUtc: js.Date
  val Deleted: Boolean
  val DisplayID: String
  val DisplayIDAvailable: Boolean
  val Files: IObjectFiles
  val FilesCount: Double
  val HasAssignments: Boolean
  val HasSharedFiles: Boolean
  val IsAccessedByMeValid: Boolean
  val IsObjectConflict: Boolean
  val IsObjectShortcut: Boolean
  val LastModifiedUtc: js.Date
  val LatestCheckedInVersion: Double
  val LatestCheckedInVersionOrCheckedOutVersion: Boolean
  val ObjVer: IObjVer
  val ObjectCheckedOut: Boolean
  val ObjectCheckedOutToThisUserOnAnyComputer: Boolean
  val ObjectCheckedOutToThisUserOnThisComputer: Boolean
  val ObjectFlags: MFSpecialObjectFlag
  val ObjectGUID: String
  val ObjectVersionFlags: MFObjectVersionFlag
  val OriginalObjID: IObjID
  val OriginalVaultGUID: String
  val SingleFile: Boolean
  val ThisVersionCheckedOut: Boolean
  val ThisVersionLatestToThisUser: Boolean
  val Title: String
  val VersionGUID: String
  val VisibleAfterOperation: Boolean
  def Clone(): IObjectVersion
  def GetNameForFileSystem(IncludeID: Boolean): String
  def GetNameForFileSystemEx(IncludeID: Boolean, UseOriginalID: Boolean): String
}

object IObjectVersion {
  @scala.inline
  def apply(
    AccessedByMeUtc: js.Date,
    CheckedOutAtUtc: js.Date,
    CheckedOutTo: Double,
    CheckedOutToHostName: String,
    CheckedOutToUserName: String,
    CheckedOutVersion: Double,
    Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double,
    Clone: CallbackTo[IObjectVersion],
    CreatedUtc: js.Date,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    Files: IObjectFiles,
    FilesCount: Double,
    GetNameForFileSystem: Boolean => CallbackTo[String],
    GetNameForFileSystemEx: (Boolean, Boolean) => CallbackTo[String],
    HasAssignments: Boolean,
    HasSharedFiles: Boolean,
    IsAccessedByMeValid: Boolean,
    IsObjectConflict: Boolean,
    IsObjectShortcut: Boolean,
    LastModifiedUtc: js.Date,
    LatestCheckedInVersion: Double,
    LatestCheckedInVersionOrCheckedOutVersion: Boolean,
    ObjVer: IObjVer,
    ObjectCheckedOut: Boolean,
    ObjectCheckedOutToThisUserOnAnyComputer: Boolean,
    ObjectCheckedOutToThisUserOnThisComputer: Boolean,
    ObjectFlags: MFSpecialObjectFlag,
    ObjectGUID: String,
    ObjectVersionFlags: MFObjectVersionFlag,
    OriginalObjID: IObjID,
    OriginalVaultGUID: String,
    SingleFile: Boolean,
    ThisVersionCheckedOut: Boolean,
    ThisVersionLatestToThisUser: Boolean,
    Title: String,
    VersionGUID: String,
    VisibleAfterOperation: Boolean
  ): IObjectVersion = {
    val __obj = js.Dynamic.literal(AccessedByMeUtc = AccessedByMeUtc.asInstanceOf[js.Any], CheckedOutAtUtc = CheckedOutAtUtc.asInstanceOf[js.Any], CheckedOutTo = CheckedOutTo.asInstanceOf[js.Any], CheckedOutToHostName = CheckedOutToHostName.asInstanceOf[js.Any], CheckedOutToUserName = CheckedOutToUserName.asInstanceOf[js.Any], CheckedOutVersion = CheckedOutVersion.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], CreatedUtc = CreatedUtc.asInstanceOf[js.Any], Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], FilesCount = FilesCount.asInstanceOf[js.Any], HasAssignments = HasAssignments.asInstanceOf[js.Any], HasSharedFiles = HasSharedFiles.asInstanceOf[js.Any], IsAccessedByMeValid = IsAccessedByMeValid.asInstanceOf[js.Any], IsObjectConflict = IsObjectConflict.asInstanceOf[js.Any], IsObjectShortcut = IsObjectShortcut.asInstanceOf[js.Any], LastModifiedUtc = LastModifiedUtc.asInstanceOf[js.Any], LatestCheckedInVersion = LatestCheckedInVersion.asInstanceOf[js.Any], LatestCheckedInVersionOrCheckedOutVersion = LatestCheckedInVersionOrCheckedOutVersion.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], ObjectCheckedOut = ObjectCheckedOut.asInstanceOf[js.Any], ObjectCheckedOutToThisUserOnAnyComputer = ObjectCheckedOutToThisUserOnAnyComputer.asInstanceOf[js.Any], ObjectCheckedOutToThisUserOnThisComputer = ObjectCheckedOutToThisUserOnThisComputer.asInstanceOf[js.Any], ObjectFlags = ObjectFlags.asInstanceOf[js.Any], ObjectGUID = ObjectGUID.asInstanceOf[js.Any], ObjectVersionFlags = ObjectVersionFlags.asInstanceOf[js.Any], OriginalObjID = OriginalObjID.asInstanceOf[js.Any], OriginalVaultGUID = OriginalVaultGUID.asInstanceOf[js.Any], SingleFile = SingleFile.asInstanceOf[js.Any], ThisVersionCheckedOut = ThisVersionCheckedOut.asInstanceOf[js.Any], ThisVersionLatestToThisUser = ThisVersionLatestToThisUser.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], VersionGUID = VersionGUID.asInstanceOf[js.Any], VisibleAfterOperation = VisibleAfterOperation.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetNameForFileSystem")(js.Any.fromFunction1((t0: scala.Boolean) => GetNameForFileSystem(t0).runNow()))
    __obj.updateDynamic("GetNameForFileSystemEx")(js.Any.fromFunction2((t0: scala.Boolean, t1: scala.Boolean) => GetNameForFileSystemEx(t0, t1).runNow()))
    __obj.asInstanceOf[IObjectVersion]
  }
}

