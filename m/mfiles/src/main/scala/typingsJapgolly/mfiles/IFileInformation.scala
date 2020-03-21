package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.MFFileInformationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInformation extends js.Object {
  var EmailMessage: IEmailMessageInformation
  var FileType: MFFileInformationType
  def Clear(): Unit
  def ExtractFromFile(PathToFile: String): Unit
}

object IFileInformation {
  @scala.inline
  def apply(
    Clear: Callback,
    EmailMessage: IEmailMessageInformation,
    ExtractFromFile: String => Callback,
    FileType: MFFileInformationType
  ): IFileInformation = {
    val __obj = js.Dynamic.literal(EmailMessage = EmailMessage.asInstanceOf[js.Any], FileType = FileType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clear")(Clear.toJsFn)
    __obj.updateDynamic("ExtractFromFile")(js.Any.fromFunction1((t0: java.lang.String) => ExtractFromFile(t0).runNow()))
    __obj.asInstanceOf[IFileInformation]
  }
}

