package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlList extends js.Object {
  val AutomaticComponents: IAccessControlListComponentContainer
  val CheckedOutToUserID: Double
  var CustomComponent: IAccessControlListComponent
  val HasCheckedOutToUserID: Boolean
  var IsFullyAuthoritative: Boolean
  def Clone(): IAccessControlList
  def CloneFrom(AccessControlList: IAccessControlList): Unit
  def EqualTo(AccessControlList: IAccessControlList): Boolean
  def HasIdenticalPermissions(AccessControlList: IAccessControlList): Boolean
}

object IAccessControlList {
  @scala.inline
  def apply(
    AutomaticComponents: IAccessControlListComponentContainer,
    CheckedOutToUserID: Double,
    Clone: CallbackTo[IAccessControlList],
    CloneFrom: IAccessControlList => Callback,
    CustomComponent: IAccessControlListComponent,
    EqualTo: IAccessControlList => CallbackTo[Boolean],
    HasCheckedOutToUserID: Boolean,
    HasIdenticalPermissions: IAccessControlList => CallbackTo[Boolean],
    IsFullyAuthoritative: Boolean
  ): IAccessControlList = {
    val __obj = js.Dynamic.literal(AutomaticComponents = AutomaticComponents.asInstanceOf[js.Any], CheckedOutToUserID = CheckedOutToUserID.asInstanceOf[js.Any], CustomComponent = CustomComponent.asInstanceOf[js.Any], HasCheckedOutToUserID = HasCheckedOutToUserID.asInstanceOf[js.Any], IsFullyAuthoritative = IsFullyAuthoritative.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IAccessControlList) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("EqualTo")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IAccessControlList) => EqualTo(t0).runNow()))
    __obj.updateDynamic("HasIdenticalPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IAccessControlList) => HasIdenticalPermissions(t0).runNow()))
    __obj.asInstanceOf[IAccessControlList]
  }
}

