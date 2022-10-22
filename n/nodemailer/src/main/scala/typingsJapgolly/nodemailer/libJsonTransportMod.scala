package typingsJapgolly.nodemailer

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodemailer.libMailerMod.Address
import typingsJapgolly.nodemailer.libMimeNodeMod.Envelope
import typingsJapgolly.nodemailer.libSharedMod.Logger
import typingsJapgolly.nodemailer.mod.Transport
import typingsJapgolly.nodemailer.mod.TransportOptions
import typingsJapgolly.nodemailer.nodemailerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonTransportMod {
  
  @JSImport("nodemailer/lib/json-transport", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with JSONTransport {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var logger: Logger = js.native
    
    /* CompleteClass */
    @JSName("mailer")
    var mailer_JSONTransport: typingsJapgolly.nodemailer.libMailerMod.^[SentMessageInfo] = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    override def send(
      mail: typingsJapgolly.nodemailer.libMailerMailMessageMod.^[SentMessageInfo],
      callback: js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var verify: (js.UndefOr[
        js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
      ]) & js.UndefOr[js.Function0[js.Promise[`true`]]] = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  
  trait JSONTransport
    extends StObject
       with Transport[SentMessageInfo] {
    
    var logger: Logger
    
    @JSName("mailer")
    var mailer_JSONTransport: typingsJapgolly.nodemailer.libMailerMod.^[SentMessageInfo]
    
    var options: Options
  }
  object JSONTransport {
    
    inline def apply(
      logger: Logger,
      mailer: typingsJapgolly.nodemailer.libMailerMod.^[SentMessageInfo],
      name: String,
      options: Options,
      send: (typingsJapgolly.nodemailer.libMailerMailMessageMod.^[SentMessageInfo], js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]) => Callback,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
        ]) & js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String
    ): JSONTransport = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], send = js.Any.fromFunction2((t0: typingsJapgolly.nodemailer.libMailerMailMessageMod.^[SentMessageInfo], t1: js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]) => (send(t0, t1)).runNow()), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONTransport]
    }
    
    extension [Self <: JSONTransport](x: Self) {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMailer(value: typingsJapgolly.nodemailer.libMailerMod.^[SentMessageInfo]): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type MailOptions = typingsJapgolly.nodemailer.libMailerMod.Options
  
  trait Options
    extends StObject
       with typingsJapgolly.nodemailer.libMailerMod.Options
       with TransportOptions {
    
    var jsonTransport: `true`
    
    var skipEncoding: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal(jsonTransport = true)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setJsonTransport(value: `true`): Self = StObject.set(x, "jsonTransport", value.asInstanceOf[js.Any])
      
      inline def setSkipEncoding(value: Boolean): Self = StObject.set(x, "skipEncoding", value.asInstanceOf[js.Any])
      
      inline def setSkipEncodingUndefined: Self = StObject.set(x, "skipEncoding", js.undefined)
    }
  }
  
  trait SentMessageInfo extends StObject {
    
    var accepted: js.Array[String | Address]
    
    /** an envelope object {from:‘address’, to:[‘address’]} */
    var envelope: Envelope
    
    /** JSON string */
    var message: String
    
    /** the Message-ID header value */
    var messageId: String
    
    var pending: js.Array[String | Address]
    
    var rejected: js.Array[String | Address]
    
    var response: String
  }
  object SentMessageInfo {
    
    inline def apply(
      accepted: js.Array[String | Address],
      envelope: Envelope,
      message: String,
      messageId: String,
      pending: js.Array[String | Address],
      rejected: js.Array[String | Address],
      response: String
    ): SentMessageInfo = {
      val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    extension [Self <: SentMessageInfo](x: Self) {
      
      inline def setAccepted(value: js.Array[String | Address]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      inline def setAcceptedVarargs(value: (String | Address)*): Self = StObject.set(x, "accepted", js.Array(value*))
      
      inline def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setPending(value: js.Array[String | Address]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingVarargs(value: (String | Address)*): Self = StObject.set(x, "pending", js.Array(value*))
      
      inline def setRejected(value: js.Array[String | Address]): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRejectedVarargs(value: (String | Address)*): Self = StObject.set(x, "rejected", js.Array(value*))
      
      inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
