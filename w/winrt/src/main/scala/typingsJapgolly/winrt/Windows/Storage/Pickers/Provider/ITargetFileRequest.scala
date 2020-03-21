package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetFileRequest extends js.Object {
  var targetFile: IStorageFile
  def getDeferral(): TargetFileRequestDeferral
}

object ITargetFileRequest {
  @scala.inline
  def apply(getDeferral: CallbackTo[TargetFileRequestDeferral], targetFile: IStorageFile): ITargetFileRequest = {
    val __obj = js.Dynamic.literal(targetFile = targetFile.asInstanceOf[js.Any])
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[ITargetFileRequest]
  }
}

