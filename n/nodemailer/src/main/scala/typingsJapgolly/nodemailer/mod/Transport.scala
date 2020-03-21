package typingsJapgolly.nodemailer.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodemailer.mailerMod.^
import typingsJapgolly.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mailer: js.UndefOr[^] = js.undefined
  var name: String
  var verify: js.UndefOr[
    (js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]]
  ] = js.undefined
  var version: String
  def send(
    mail: typingsJapgolly.nodemailer.mailMessageMod.^,
    callback: js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit
}

object Transport {
  @scala.inline
  def apply(
    name: String,
    send: (typingsJapgolly.nodemailer.mailMessageMod.^, js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]) => Callback,
    version: String,
    close: js.UndefOr[Callback] = js.undefined,
    mailer: ^ = null,
    verify: (js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]] = null
  ): Transport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.nodemailer.mailMessageMod.^, t1: js.Function2[
  /* err */ js.Error | scala.Null, 
  /* info */ typingsJapgolly.nodemailer.mod.SentMessageInfo, 
  scala.Unit]) => send(t0, t1).runNow()))
    close.foreach(p => __obj.updateDynamic("close")(p.toJsFn))
    if (mailer != null) __obj.updateDynamic("mailer")(mailer.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transport]
  }
}

