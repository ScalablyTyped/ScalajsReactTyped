package typingsJapgolly.nodemailer.sendmailTransportMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodemailer.mod.Transport
import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import typingsJapgolly.nodemailer.nodemailerBooleans.`true`
import typingsJapgolly.nodemailer.sharedMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendmailTransport extends Transport {
  var args: js.Array[String] | `false`
  var logger: Logger
  @JSName("mailer")
  var mailer_SendmailTransport: typingsJapgolly.nodemailer.mailerMod.^
  var options: Options
  var path: String
  var winbreak: Boolean
}

object SendmailTransport {
  @scala.inline
  def apply(
    args: js.Array[String] | `false`,
    logger: Logger,
    mailer: typingsJapgolly.nodemailer.mailerMod.^,
    name: String,
    options: Options,
    path: String,
    send: (typingsJapgolly.nodemailer.mailMessageMod.^, js.Function2[
      /* err */ js.Error | Null, 
      /* info */ typingsJapgolly.nodemailer.mod.SentMessageInfo, 
      Unit
    ]) => Callback,
    version: String,
    winbreak: Boolean,
    close: js.UndefOr[Callback] = js.undefined,
    verify: (js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]] = null
  ): SendmailTransport = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.nodemailer.mailMessageMod.^, t1: js.Function2[
  /* err */ js.Error | scala.Null, 
  /* info */ typingsJapgolly.nodemailer.mod.SentMessageInfo, 
  scala.Unit]) => send(t0, t1).runNow()))
    close.foreach(p => __obj.updateDynamic("close")(p.toJsFn))
    if (verify != null) __obj.updateDynamic("verify")(verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendmailTransport]
  }
}

