package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedFileInfo extends js.Object {
  val ChangeTimeUtc: js.Date
  val Extension: String
  val LogicalSize: Double
  val LogicalSize_32bit: Double
  val Title: String
  def Clone(): ISharedFileInfo
}

object ISharedFileInfo {
  @scala.inline
  def apply(
    ChangeTimeUtc: js.Date,
    Clone: CallbackTo[ISharedFileInfo],
    Extension: String,
    LogicalSize: Double,
    LogicalSize_32bit: Double,
    Title: String
  ): ISharedFileInfo = {
    val __obj = js.Dynamic.literal(ChangeTimeUtc = ChangeTimeUtc.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], LogicalSize = LogicalSize.asInstanceOf[js.Any], LogicalSize_32bit = LogicalSize_32bit.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[ISharedFileInfo]
  }
}

