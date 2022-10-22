package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.meteorTypings.anon.Attachments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorEmailMod {
  
  object Email {
    
    @JSImport("meteor/email", "Email")
    @js.native
    val ^ : js.Any = js.native
    
    inline def send(options: Attachments): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait MailComposer extends StObject {
    
    def addHeader(name: String, value: String): Unit
    
    def pipe(stream: Any): Unit
    
    def setMessageOption(from: String, to: String, body: String, html: String): Unit
    
    def streamMessage(): Unit
  }
  object MailComposer {
    
    @JSImport("meteor/email", "MailComposer")
    @js.native
    val ^ : typingsJapgolly.meteorTypings.meteorEmailMod.MailComposerStatic = js.native
    
    extension [Self <: typingsJapgolly.meteorTypings.meteorEmailMod.MailComposer](x: Self) {
      
      inline def setAddHeader(value: (String, String) => Callback): Self = StObject.set(x, "addHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setPipe(value: Any => Callback): Self = StObject.set(x, "pipe", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetMessageOption(value: (String, String, String, String) => Callback): Self = StObject.set(x, "setMessageOption", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setStreamMessage(value: Callback): Self = StObject.set(x, "streamMessage", value.toJsFn)
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("meteor/email", "MailComposer")
  @js.native
  open class MailComposerCls protected ()
    extends StObject
       with typingsJapgolly.meteorTypings.meteorEmailMod.MailComposer {
    def this(options: typingsJapgolly.meteorTypings.meteorEmailMod.MailComposerOptions) = this()
    
    /* CompleteClass */
    override def addHeader(name: String, value: String): Unit = js.native
    
    /* CompleteClass */
    override def pipe(stream: Any): Unit = js.native
    
    /* CompleteClass */
    override def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
    
    /* CompleteClass */
    override def streamMessage(): Unit = js.native
  }
  
  trait MailComposerOptions extends StObject {
    
    var charset: String
    
    var encoding: String
    
    var escapeSMTP: Boolean
    
    var forceEmbeddedImages: Boolean
    
    var keepBcc: Boolean
  }
  object MailComposerOptions {
    
    inline def apply(
      charset: String,
      encoding: String,
      escapeSMTP: Boolean,
      forceEmbeddedImages: Boolean,
      keepBcc: Boolean
    ): typingsJapgolly.meteorTypings.meteorEmailMod.MailComposerOptions = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escapeSMTP = escapeSMTP.asInstanceOf[js.Any], forceEmbeddedImages = forceEmbeddedImages.asInstanceOf[js.Any], keepBcc = keepBcc.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.meteorTypings.meteorEmailMod.MailComposerOptions]
    }
    
    extension [Self <: typingsJapgolly.meteorTypings.meteorEmailMod.MailComposerOptions](x: Self) {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEscapeSMTP(value: Boolean): Self = StObject.set(x, "escapeSMTP", value.asInstanceOf[js.Any])
      
      inline def setForceEmbeddedImages(value: Boolean): Self = StObject.set(x, "forceEmbeddedImages", value.asInstanceOf[js.Any])
      
      inline def setKeepBcc(value: Boolean): Self = StObject.set(x, "keepBcc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MailComposerStatic
    extends StObject
       with Instantiable1[
          /* options */ typingsJapgolly.meteorTypings.meteorEmailMod.MailComposerOptions, 
          typingsJapgolly.meteorTypings.meteorEmailMod.MailComposer
        ]
}
