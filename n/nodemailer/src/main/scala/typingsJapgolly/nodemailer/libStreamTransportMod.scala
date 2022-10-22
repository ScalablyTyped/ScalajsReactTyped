package typingsJapgolly.nodemailer

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.nodemailer.libMailerMod.Address
import typingsJapgolly.nodemailer.libMimeNodeMod.Envelope
import typingsJapgolly.nodemailer.libSharedMod.Logger
import typingsJapgolly.nodemailer.mod.Transport
import typingsJapgolly.nodemailer.mod.TransportOptions
import typingsJapgolly.nodemailer.nodemailerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStreamTransportMod {
  
  @JSImport("nodemailer/lib/stream-transport", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StreamTransport {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var logger: Logger = js.native
    
    /* CompleteClass */
    @JSName("mailer")
    var mailer_StreamTransport: typingsJapgolly.nodemailer.libMailerMod.^[SentMessageInfo] = js.native
    
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
    
    /* CompleteClass */
    var winbreak: Boolean = js.native
  }
  
  type MailOptions = typingsJapgolly.nodemailer.libMailerMod.Options
  
  trait Options
    extends StObject
       with typingsJapgolly.nodemailer.libMailerMod.Options
       with TransportOptions {
    
    /** if true, then returns the message as a Buffer object instead of a stream */
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
    var newline: js.UndefOr[String] = js.undefined
    
    var streamTransport: `true`
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal(streamTransport = true)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setStreamTransport(value: `true`): Self = StObject.set(x, "streamTransport", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentMessageInfo extends StObject {
    
    var accepted: js.Array[String | Address]
    
    /** an envelope object {from:‘address’, to:[‘address’]} */
    var envelope: Envelope
    
    /** either stream (default) of buffer depending on the options */
    var message: Buffer | Readable
    
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
      message: Buffer | Readable,
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
      
      inline def setMessage(value: Buffer | Readable): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setPending(value: js.Array[String | Address]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingVarargs(value: (String | Address)*): Self = StObject.set(x, "pending", js.Array(value*))
      
      inline def setRejected(value: js.Array[String | Address]): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRejectedVarargs(value: (String | Address)*): Self = StObject.set(x, "rejected", js.Array(value*))
      
      inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamTransport
    extends StObject
       with Transport[SentMessageInfo] {
    
    var logger: Logger
    
    @JSName("mailer")
    var mailer_StreamTransport: typingsJapgolly.nodemailer.libMailerMod.^[SentMessageInfo]
    
    var options: Options
    
    var winbreak: Boolean
  }
  object StreamTransport {
    
    inline def apply(
      logger: Logger,
      mailer: typingsJapgolly.nodemailer.libMailerMod.^[SentMessageInfo],
      name: String,
      options: Options,
      send: (typingsJapgolly.nodemailer.libMailerMailMessageMod.^[SentMessageInfo], js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]) => Callback,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
        ]) & js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String,
      winbreak: Boolean
    ): StreamTransport = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], send = js.Any.fromFunction2((t0: typingsJapgolly.nodemailer.libMailerMailMessageMod.^[SentMessageInfo], t1: js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]) => (send(t0, t1)).runNow()), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamTransport]
    }
    
    extension [Self <: StreamTransport](x: Self) {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMailer(value: typingsJapgolly.nodemailer.libMailerMod.^[SentMessageInfo]): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setWinbreak(value: Boolean): Self = StObject.set(x, "winbreak", value.asInstanceOf[js.Any])
    }
  }
}
