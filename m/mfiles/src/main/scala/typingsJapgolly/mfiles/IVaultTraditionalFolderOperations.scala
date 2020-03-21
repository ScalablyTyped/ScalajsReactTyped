package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultTraditionalFolderOperations extends js.Object {
  def GetTraditionalFolderContents(Folder: Double): ITraditionalFolderContents
}

object IVaultTraditionalFolderOperations {
  @scala.inline
  def apply(GetTraditionalFolderContents: Double => CallbackTo[ITraditionalFolderContents]): IVaultTraditionalFolderOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetTraditionalFolderContents")(js.Any.fromFunction1((t0: scala.Double) => GetTraditionalFolderContents(t0).runNow()))
    __obj.asInstanceOf[IVaultTraditionalFolderOperations]
  }
}

