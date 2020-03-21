package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultSharedLinkOperations extends js.Object {
  def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): ISharedLinkInfo
  def DeleteSharedLink(AccessKey: String): Unit
  def GetSharedLink(AccessKey: String): ISharedLinkInfo
  def GetSharedLinks(CreatedByUser: Double): ISharedLinkInfos
  def GetSharedLinksByObject(ObjID: IObjID): ISharedLinkInfos
}

object IVaultSharedLinkOperations {
  @scala.inline
  def apply(
    CreateSharedLink: ISharedLinkInfo => CallbackTo[ISharedLinkInfo],
    DeleteSharedLink: String => Callback,
    GetSharedLink: String => CallbackTo[ISharedLinkInfo],
    GetSharedLinks: Double => CallbackTo[ISharedLinkInfos],
    GetSharedLinksByObject: IObjID => CallbackTo[ISharedLinkInfos]
  ): IVaultSharedLinkOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CreateSharedLink")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ISharedLinkInfo) => CreateSharedLink(t0).runNow()))
    __obj.updateDynamic("DeleteSharedLink")(js.Any.fromFunction1((t0: java.lang.String) => DeleteSharedLink(t0).runNow()))
    __obj.updateDynamic("GetSharedLink")(js.Any.fromFunction1((t0: java.lang.String) => GetSharedLink(t0).runNow()))
    __obj.updateDynamic("GetSharedLinks")(js.Any.fromFunction1((t0: scala.Double) => GetSharedLinks(t0).runNow()))
    __obj.updateDynamic("GetSharedLinksByObject")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjID) => GetSharedLinksByObject(t0).runNow()))
    __obj.asInstanceOf[IVaultSharedLinkOperations]
  }
}

