package typingsJapgolly.nodemailer

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodemailer.anon.Host
import typingsJapgolly.nodemailer.libSmtpTransportMod.Options
import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import typingsJapgolly.nodemailer.nodemailerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemailer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTestAccount(): js.Promise[TestAccount] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestAccount")().asInstanceOf[js.Promise[TestAccount]]
  inline def createTestAccount(apiUrl: String): js.Promise[TestAccount] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestAccount")(apiUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TestAccount]]
  inline def createTestAccount(
    apiUrl: String,
    callback: js.Function2[/* err */ js.Error | Null, /* testAccount */ TestAccount, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestAccount")(apiUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createTestAccount(callback: js.Function2[/* err */ js.Error | Null, /* testAccount */ TestAccount, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestAccount")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createTransport(): Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")().asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: String): Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: String, defaults: Options): Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: Unit, defaults: Options): Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libJsonTransportMod.Options): Transporter[typingsJapgolly.nodemailer.libJsonTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libJsonTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libJsonTransportMod.Options,
    defaults: typingsJapgolly.nodemailer.libJsonTransportMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libJsonTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libJsonTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libJsonTransportMod.^): Transporter[typingsJapgolly.nodemailer.libJsonTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libJsonTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libJsonTransportMod.^,
    defaults: typingsJapgolly.nodemailer.libJsonTransportMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libJsonTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libJsonTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libSendmailTransportMod.Options): Transporter[typingsJapgolly.nodemailer.libSendmailTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSendmailTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libSendmailTransportMod.Options,
    defaults: typingsJapgolly.nodemailer.libSendmailTransportMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libSendmailTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSendmailTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libSendmailTransportMod.^): Transporter[typingsJapgolly.nodemailer.libSendmailTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSendmailTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libSendmailTransportMod.^,
    defaults: typingsJapgolly.nodemailer.libSendmailTransportMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libSendmailTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSendmailTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libSesTransportMod.Options): Transporter[typingsJapgolly.nodemailer.libSesTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSesTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libSesTransportMod.Options,
    defaults: typingsJapgolly.nodemailer.libSesTransportMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libSesTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSesTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libSesTransportMod.^): Transporter[typingsJapgolly.nodemailer.libSesTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSesTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libSesTransportMod.^,
    defaults: typingsJapgolly.nodemailer.libSesTransportMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libSesTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSesTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libSmtpPoolMod.Options): Transporter[typingsJapgolly.nodemailer.libSmtpPoolMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpPoolMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libSmtpPoolMod.Options,
    defaults: typingsJapgolly.nodemailer.libSmtpPoolMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libSmtpPoolMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpPoolMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libSmtpPoolMod.^): Transporter[typingsJapgolly.nodemailer.libSmtpPoolMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpPoolMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libSmtpPoolMod.^,
    defaults: typingsJapgolly.nodemailer.libSmtpPoolMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libSmtpPoolMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpPoolMod.SentMessageInfo]]
  inline def createTransport(transport: Options): Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: Options, defaults: Options): Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libSmtpTransportMod.^): Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libSmtpTransportMod.^, defaults: Options): Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libStreamTransportMod.Options): Transporter[typingsJapgolly.nodemailer.libStreamTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libStreamTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libStreamTransportMod.Options,
    defaults: typingsJapgolly.nodemailer.libStreamTransportMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libStreamTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libStreamTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typingsJapgolly.nodemailer.libStreamTransportMod.^): Transporter[typingsJapgolly.nodemailer.libStreamTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libStreamTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typingsJapgolly.nodemailer.libStreamTransportMod.^,
    defaults: typingsJapgolly.nodemailer.libStreamTransportMod.Options
  ): Transporter[typingsJapgolly.nodemailer.libStreamTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typingsJapgolly.nodemailer.libStreamTransportMod.SentMessageInfo]]
  inline def createTransport[T](transport: Transport[T]): Transporter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[T]]
  inline def createTransport[T](transport: TransportOptions): Transporter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[T]]
  inline def createTransport[T](transport: TransportOptions, defaults: TransportOptions): Transporter[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[T]]
  inline def createTransport[T](transport: Transport[T], defaults: TransportOptions): Transporter[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[T]]
  
  inline def getTestMessageUrl(info: typingsJapgolly.nodemailer.libSesTransportMod.SentMessageInfo): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestMessageUrl")(info.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  inline def getTestMessageUrl(info: typingsJapgolly.nodemailer.libSmtpTransportMod.SentMessageInfo): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestMessageUrl")(info.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  
  type SendMailOptions = typingsJapgolly.nodemailer.libMailerMod.Options
  
  type SentMessageInfo = Any
  
  trait TestAccount extends StObject {
    
    var imap: Host
    
    var pass: String
    
    var pop3: Host
    
    var smtp: Host
    
    var user: String
    
    var web: String
  }
  object TestAccount {
    
    inline def apply(imap: Host, pass: String, pop3: Host, smtp: Host, user: String, web: String): TestAccount = {
      val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pop3 = pop3.asInstanceOf[js.Any], smtp = smtp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestAccount]
    }
    
    extension [Self <: TestAccount](x: Self) {
      
      inline def setImap(value: Host): Self = StObject.set(x, "imap", value.asInstanceOf[js.Any])
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPop3(value: Host): Self = StObject.set(x, "pop3", value.asInstanceOf[js.Any])
      
      inline def setSmtp(value: Host): Self = StObject.set(x, "smtp", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setWeb(value: String): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transport[T] extends StObject {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var mailer: js.UndefOr[Transporter[T]] = js.undefined
    
    var name: String
    
    def send(
      mail: typingsJapgolly.nodemailer.libMailerMailMessageMod.^[T],
      callback: js.Function2[/* err */ js.Error | Null, /* info */ T, Unit]
    ): Unit
    
    var verify: (js.UndefOr[
        js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
      ]) & js.UndefOr[js.Function0[js.Promise[`true`]]]
    
    var version: String
  }
  object Transport {
    
    inline def apply[T](
      name: String,
      send: (typingsJapgolly.nodemailer.libMailerMailMessageMod.^[T], js.Function2[/* err */ js.Error | Null, /* info */ T, Unit]) => Callback,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
        ]) & js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String
    ): Transport[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], send = js.Any.fromFunction2((t0: typingsJapgolly.nodemailer.libMailerMailMessageMod.^[T], t1: js.Function2[/* err */ js.Error | Null, /* info */ T, Unit]) => (send(t0, t1)).runNow()), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transport[T]]
    }
    
    extension [Self <: Transport[?], T](x: Self & Transport[T]) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setMailer(value: Transporter[T]): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      inline def setMailerUndefined: Self = StObject.set(x, "mailer", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSend(
        value: (typingsJapgolly.nodemailer.libMailerMailMessageMod.^[T], js.Function2[/* err */ js.Error | Null, /* info */ T, Unit]) => Callback
      ): Self = StObject.set(x, "send", js.Any.fromFunction2((t0: typingsJapgolly.nodemailer.libMailerMailMessageMod.^[T], t1: js.Function2[/* err */ js.Error | Null, /* info */ T, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setVerify(
        value: (js.UndefOr[
              js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
            ]) & js.UndefOr[js.Function0[js.Promise[`true`]]]
      ): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransportOptions extends StObject {
    
    var component: js.UndefOr[String] = js.undefined
  }
  object TransportOptions {
    
    inline def apply(): TransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportOptions]
    }
    
    extension [Self <: TransportOptions](x: Self) {
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
  
  type Transporter[T] = typingsJapgolly.nodemailer.libMailerMod.^[T]
}
