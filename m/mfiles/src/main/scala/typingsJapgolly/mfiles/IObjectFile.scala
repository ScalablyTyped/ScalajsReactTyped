package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFile extends js.Object {
  val ChangeTimeUtc: js.Date
  val CreationTimeUtc: js.Date
  val Extension: String
  val FileGUID: String
  val FileVer: IFileVer
  val ID: Double
  val LastAccessTimeUtc: js.Date
  val LastWriteTimeUtc: js.Date
  val LogicalSize: Double
  val LogicalSize_32bit: Double
  val Title: String
  val Version: Double
  def GetNameForFileSystem(): String
  def ToJSON(): String
}

object IObjectFile {
  @scala.inline
  def apply(
    ChangeTimeUtc: js.Date,
    CreationTimeUtc: js.Date,
    Extension: String,
    FileGUID: String,
    FileVer: IFileVer,
    GetNameForFileSystem: CallbackTo[String],
    ID: Double,
    LastAccessTimeUtc: js.Date,
    LastWriteTimeUtc: js.Date,
    LogicalSize: Double,
    LogicalSize_32bit: Double,
    Title: String,
    ToJSON: CallbackTo[String],
    Version: Double
  ): IObjectFile = {
    val __obj = js.Dynamic.literal(ChangeTimeUtc = ChangeTimeUtc.asInstanceOf[js.Any], CreationTimeUtc = CreationTimeUtc.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FileGUID = FileGUID.asInstanceOf[js.Any], FileVer = FileVer.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], LastAccessTimeUtc = LastAccessTimeUtc.asInstanceOf[js.Any], LastWriteTimeUtc = LastWriteTimeUtc.asInstanceOf[js.Any], LogicalSize = LogicalSize.asInstanceOf[js.Any], LogicalSize_32bit = LogicalSize_32bit.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("GetNameForFileSystem")(GetNameForFileSystem.toJsFn)
    __obj.updateDynamic("ToJSON")(ToJSON.toJsFn)
    __obj.asInstanceOf[IObjectFile]
  }
}

