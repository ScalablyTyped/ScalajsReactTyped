package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFAdditionalClassInfoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdditionalClassInfo extends js.Object {
  var AssignmentClassInfo: IAssignmentClassInfo
  val InfoType: MFAdditionalClassInfoType
  def Clear(): Unit
  def Clone(): IAdditionalClassInfo
}

object IAdditionalClassInfo {
  @scala.inline
  def apply(
    AssignmentClassInfo: IAssignmentClassInfo,
    Clear: Callback,
    Clone: CallbackTo[IAdditionalClassInfo],
    InfoType: MFAdditionalClassInfoType
  ): IAdditionalClassInfo = {
    val __obj = js.Dynamic.literal(AssignmentClassInfo = AssignmentClassInfo.asInstanceOf[js.Any], InfoType = InfoType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clear")(Clear.toJsFn)
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IAdditionalClassInfo]
  }
}

