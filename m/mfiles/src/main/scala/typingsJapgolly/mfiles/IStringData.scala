package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFStringDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringData extends js.Object {
  var AsString: String
  val StringDataType: MFStringDataType
  def Clone(): IStringData
}

object IStringData {
  @scala.inline
  def apply(AsString: String, Clone: CallbackTo[IStringData], StringDataType: MFStringDataType): IStringData = {
    val __obj = js.Dynamic.literal(AsString = AsString.asInstanceOf[js.Any], StringDataType = StringDataType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IStringData]
  }
}

