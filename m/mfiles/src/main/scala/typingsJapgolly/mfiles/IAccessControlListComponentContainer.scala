package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentContainer extends js.Object {
  val Count: Double
  def At(AccessControlListComponentKey: IAccessControlListComponentKey): IAccessControlListComponent
  def GetKeys(): IAccessControlListComponentKeys
  def HasKey(AccessControlListComponentKey: IAccessControlListComponentKey): Boolean
}

object IAccessControlListComponentContainer {
  @scala.inline
  def apply(
    At: IAccessControlListComponentKey => CallbackTo[IAccessControlListComponent],
    Count: Double,
    GetKeys: CallbackTo[IAccessControlListComponentKeys],
    HasKey: IAccessControlListComponentKey => CallbackTo[Boolean]
  ): IAccessControlListComponentContainer = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("At")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IAccessControlListComponentKey) => At(t0).runNow()))
    __obj.updateDynamic("GetKeys")(GetKeys.toJsFn)
    __obj.updateDynamic("HasKey")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IAccessControlListComponentKey) => HasKey(t0).runNow()))
    __obj.asInstanceOf[IAccessControlListComponentContainer]
  }
}

