package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFEmailImportance
import typingsJapgolly.mfiles.MFiles.MFEmailSensitivity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmailMessageInformation extends js.Object {
  var Cc: IStrings
  var From: String
  var Importance: MFEmailImportance
  var InReplyTo: String
  var MessageID: String
  var Received: ITimestamp
  var Sensitivity: MFEmailSensitivity
  var Sent: ITimestamp
  var Subject: String
  var To: IStrings
  def Clone(): IEmailMessageInformation
  def CloneFrom(EmailMessageInformation: IEmailMessageInformation): Unit
}

object IEmailMessageInformation {
  @scala.inline
  def apply(
    Cc: IStrings,
    Clone: CallbackTo[IEmailMessageInformation],
    CloneFrom: IEmailMessageInformation => Callback,
    From: String,
    Importance: MFEmailImportance,
    InReplyTo: String,
    MessageID: String,
    Received: ITimestamp,
    Sensitivity: MFEmailSensitivity,
    Sent: ITimestamp,
    Subject: String,
    To: IStrings
  ): IEmailMessageInformation = {
    val __obj = js.Dynamic.literal(Cc = Cc.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], InReplyTo = InReplyTo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Sensitivity = Sensitivity.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IEmailMessageInformation) => CloneFrom(t0).runNow()))
    __obj.asInstanceOf[IEmailMessageInformation]
  }
}

