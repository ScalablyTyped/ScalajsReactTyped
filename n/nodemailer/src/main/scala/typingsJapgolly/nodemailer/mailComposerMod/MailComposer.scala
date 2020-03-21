package typingsJapgolly.nodemailer.mailComposerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodemailer.mailerMod.Attachment
import typingsJapgolly.nodemailer.mailerMod.Options
import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the object for composing a MimeNode instance out from the mail options */
trait MailComposer extends js.Object {
  var mail: Options
  var message: typingsJapgolly.nodemailer.mimeNodeMod.^  | `false`
  /** Builds MimeNode instance */
  def compile(): typingsJapgolly.nodemailer.mimeNodeMod.^
  /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
  def getAlternatives(): js.Array[Attachment]
  /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
  def getAttachments(findRelated: Boolean): js.Array[Attachment]
}

object MailComposer {
  @scala.inline
  def apply(
    compile: CallbackTo[typingsJapgolly.nodemailer.mimeNodeMod.^],
    getAlternatives: CallbackTo[js.Array[Attachment]],
    getAttachments: Boolean => CallbackTo[js.Array[Attachment]],
    mail: Options,
    message: typingsJapgolly.nodemailer.mimeNodeMod.^  | `false`
  ): MailComposer = {
    val __obj = js.Dynamic.literal(mail = mail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("compile")(compile.toJsFn)
    __obj.updateDynamic("getAlternatives")(getAlternatives.toJsFn)
    __obj.updateDynamic("getAttachments")(js.Any.fromFunction1((t0: scala.Boolean) => getAttachments(t0).runNow()))
    __obj.asInstanceOf[MailComposer]
  }
}

