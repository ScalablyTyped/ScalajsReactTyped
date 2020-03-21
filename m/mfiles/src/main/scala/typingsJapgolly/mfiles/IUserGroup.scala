package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroup extends js.Object {
  var ID: Double
  var Members: IIDs
  var Name: String
  val Predefined: Boolean
  def AddMember(ID: Double): Unit
  def Clone(): IUserGroup
  def CloneFrom(UserGroup: IUserGroup): Unit
  def RemoveMember(ID: Double): Unit
}

object IUserGroup {
  @scala.inline
  def apply(
    AddMember: Double => Callback,
    Clone: CallbackTo[IUserGroup],
    CloneFrom: IUserGroup => Callback,
    ID: Double,
    Members: IIDs,
    Name: String,
    Predefined: Boolean,
    RemoveMember: Double => Callback
  ): IUserGroup = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any])
    __obj.updateDynamic("AddMember")(js.Any.fromFunction1((t0: scala.Double) => AddMember(t0).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IUserGroup) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("RemoveMember")(js.Any.fromFunction1((t0: scala.Double) => RemoveMember(t0).runNow()))
    __obj.asInstanceOf[IUserGroup]
  }
}

