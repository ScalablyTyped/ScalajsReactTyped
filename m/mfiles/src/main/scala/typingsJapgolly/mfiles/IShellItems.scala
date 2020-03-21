package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellItems extends js.Object {
  val Count: Double
  val Folders: IFolderDefs
  val ObjectFiles: IObjectFileAndObjVerOfMultipleFiles
  val ObjectVersions: IObjectVersions
  val ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
  def GetObjectVersionsCount(): Double
}

object IShellItems {
  @scala.inline
  def apply(
    Count: Double,
    Folders: IFolderDefs,
    GetObjectVersionsCount: CallbackTo[Double],
    ObjectFiles: IObjectFileAndObjVerOfMultipleFiles,
    ObjectVersions: IObjectVersions,
    ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
  ): IShellItems = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Folders = Folders.asInstanceOf[js.Any], ObjectFiles = ObjectFiles.asInstanceOf[js.Any], ObjectVersions = ObjectVersions.asInstanceOf[js.Any], ObjectVersionsAndProperties = ObjectVersionsAndProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("GetObjectVersionsCount")(GetObjectVersionsCount.toJsFn)
    __obj.asInstanceOf[IShellItems]
  }
}

