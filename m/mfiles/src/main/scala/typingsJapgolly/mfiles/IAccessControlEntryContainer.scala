package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryContainer extends js.Object {
  val IsEmpty: Boolean
  def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): Unit
  def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData
  def Clear(): Unit
  def Clone(): IAccessControlEntryContainer
  def GetKeys(): IAccessControlEntryKeys
  def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys
  def HasKey(AccessControlEntryKey: IAccessControlEntryKey): Boolean
  def Remove(AccessControlEntryKey: IAccessControlEntryKey): Unit
}

object IAccessControlEntryContainer {
  @scala.inline
  def apply(
    Add: (IAccessControlEntryKey, IAccessControlEntryData) => Callback,
    At: IAccessControlEntryKey => CallbackTo[IAccessControlEntryData],
    Clear: Callback,
    Clone: CallbackTo[IAccessControlEntryContainer],
    GetKeys: CallbackTo[IAccessControlEntryKeys],
    GetKeysWithPseudoUserDefinitions: CallbackTo[IAccessControlEntryKeys],
    HasKey: IAccessControlEntryKey => CallbackTo[Boolean],
    IsEmpty: Boolean,
    Remove: IAccessControlEntryKey => Callback
  ): IAccessControlEntryContainer = {
    val __obj = js.Dynamic.literal(IsEmpty = IsEmpty.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IAccessControlEntryKey, t1: typingsJapgolly.mfiles.IAccessControlEntryData) => Add(t0, t1).runNow()))
    __obj.updateDynamic("At")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IAccessControlEntryKey) => At(t0).runNow()))
    __obj.updateDynamic("Clear")(Clear.toJsFn)
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetKeys")(GetKeys.toJsFn)
    __obj.updateDynamic("GetKeysWithPseudoUserDefinitions")(GetKeysWithPseudoUserDefinitions.toJsFn)
    __obj.updateDynamic("HasKey")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IAccessControlEntryKey) => HasKey(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IAccessControlEntryKey) => Remove(t0).runNow()))
    __obj.asInstanceOf[IAccessControlEntryContainer]
  }
}

