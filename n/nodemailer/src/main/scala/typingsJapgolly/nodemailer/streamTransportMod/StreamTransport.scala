package typingsJapgolly.nodemailer.streamTransportMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodemailer.mod.Transport
import typingsJapgolly.nodemailer.nodemailerBooleans.`true`
import typingsJapgolly.nodemailer.sharedMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamTransport extends Transport {
  var logger: Logger
  @JSName("mailer")
  var mailer_StreamTransport: typingsJapgolly.nodemailer.mailerMod.^
  var options: Options
  var winbreak: Boolean
}

object StreamTransport {
  @scala.inline
  def apply(
    logger: Logger,
    mailer: typingsJapgolly.nodemailer.mailerMod.^,
    name: String,
    options: Options,
    send: (typingsJapgolly.nodemailer.mailMessageMod.^, js.Function2[
      /* err */ js.Error | Null, 
      /* info */ typingsJapgolly.nodemailer.mod.SentMessageInfo, 
      Unit
    ]) => Callback,
    version: String,
    winbreak: Boolean,
    close: js.UndefOr[Callback] = js.undefined,
    verify: (js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]] = null
  ): StreamTransport = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.nodemailer.mailMessageMod.^, t1: js.Function2[
  /* err */ js.Error | scala.Null, 
  /* info */ typingsJapgolly.nodemailer.mod.SentMessageInfo, 
  scala.Unit]) => send(t0, t1).runNow()))
    close.foreach(p => __obj.updateDynamic("close")(p.toJsFn))
    if (verify != null) __obj.updateDynamic("verify")(verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamTransport]
  }
}

