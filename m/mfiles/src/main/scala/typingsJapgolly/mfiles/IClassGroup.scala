package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassGroup extends js.Object {
  var ID: Double
  var Members: IIDs
  var Name: String
  var ObjectType: MFBuiltInObjectType | Double
  def AddMember(Member: Double): Unit
  def Clone(): IClassGroup
  def RemoveMember(Member: Double): Unit
}

object IClassGroup {
  @scala.inline
  def apply(
    AddMember: Double => Callback,
    Clone: CallbackTo[IClassGroup],
    ID: Double,
    Members: IIDs,
    Name: String,
    ObjectType: MFBuiltInObjectType | Double,
    RemoveMember: Double => Callback
  ): IClassGroup = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any])
    __obj.updateDynamic("AddMember")(js.Any.fromFunction1((t0: scala.Double) => AddMember(t0).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("RemoveMember")(js.Any.fromFunction1((t0: scala.Double) => RemoveMember(t0).runNow()))
    __obj.asInstanceOf[IClassGroup]
  }
}

