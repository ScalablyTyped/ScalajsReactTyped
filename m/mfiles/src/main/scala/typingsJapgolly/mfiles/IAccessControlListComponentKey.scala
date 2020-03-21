package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentKey extends js.Object {
  var ItemID: Double
  var PropertyDefID: MFBuiltInPropertyDef | Double
  def Clone(): IAccessControlListComponentKey
}

object IAccessControlListComponentKey {
  @scala.inline
  def apply(
    Clone: CallbackTo[IAccessControlListComponentKey],
    ItemID: Double,
    PropertyDefID: MFBuiltInPropertyDef | Double
  ): IAccessControlListComponentKey = {
    val __obj = js.Dynamic.literal(ItemID = ItemID.asInstanceOf[js.Any], PropertyDefID = PropertyDefID.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IAccessControlListComponentKey]
  }
}

