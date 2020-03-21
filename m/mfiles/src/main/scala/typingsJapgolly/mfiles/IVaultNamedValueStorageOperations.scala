package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFNamedValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultNamedValueStorageOperations extends js.Object {
  def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: String): INamedValues
  def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValueNames: IStrings): Unit
  def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValues: INamedValues): Unit
}

object IVaultNamedValueStorageOperations {
  @scala.inline
  def apply(
    GetNamedValues: (MFNamedValueType, String) => CallbackTo[INamedValues],
    RemoveNamedValues: (MFNamedValueType, String, IStrings) => Callback,
    SetNamedValues: (MFNamedValueType, String, INamedValues) => Callback
  ): IVaultNamedValueStorageOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetNamedValues")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.MFNamedValueType, t1: java.lang.String) => GetNamedValues(t0, t1).runNow()))
    __obj.updateDynamic("RemoveNamedValues")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.MFiles.MFNamedValueType, t1: java.lang.String, t2: typingsJapgolly.mfiles.IStrings) => RemoveNamedValues(t0, t1, t2).runNow()))
    __obj.updateDynamic("SetNamedValues")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.MFiles.MFNamedValueType, t1: java.lang.String, t2: typingsJapgolly.mfiles.INamedValues) => SetNamedValues(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IVaultNamedValueStorageOperations]
  }
}

