package typingsJapgolly.nodemailer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodemailer.libMailerMod.Attachment
import typingsJapgolly.nodemailer.libMailerMod.Options
import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMailComposerMod {
  
  /** Creates the object for composing a MimeNode instance out from the mail options */
  @JSImport("nodemailer/lib/mail-composer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MailComposer {
    def this(mail: Options) = this()
    
    /** Builds MimeNode instance */
    /* CompleteClass */
    override def compile(): typingsJapgolly.nodemailer.libMimeNodeMod.^ = js.native
    
    /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
    /* CompleteClass */
    override def getAlternatives(): js.Array[Attachment] = js.native
    
    /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
    /* CompleteClass */
    override def getAttachments(findRelated: Boolean): js.Array[Attachment] = js.native
    
    /* CompleteClass */
    var mail: Options = js.native
    
    /* CompleteClass */
    var message: typingsJapgolly.nodemailer.libMimeNodeMod.^ | `false` = js.native
  }
  
  /** Creates the object for composing a MimeNode instance out from the mail options */
  trait MailComposer extends StObject {
    
    /** Builds MimeNode instance */
    def compile(): typingsJapgolly.nodemailer.libMimeNodeMod.^
    
    /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
    def getAlternatives(): js.Array[Attachment]
    
    /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
    def getAttachments(findRelated: Boolean): js.Array[Attachment]
    
    var mail: Options
    
    var message: typingsJapgolly.nodemailer.libMimeNodeMod.^ | `false`
  }
  object MailComposer {
    
    inline def apply(
      compile: CallbackTo[typingsJapgolly.nodemailer.libMimeNodeMod.^],
      getAlternatives: CallbackTo[js.Array[Attachment]],
      getAttachments: Boolean => js.Array[Attachment],
      mail: Options,
      message: typingsJapgolly.nodemailer.libMimeNodeMod.^ | `false`
    ): MailComposer = {
      val __obj = js.Dynamic.literal(compile = compile.toJsFn, getAlternatives = getAlternatives.toJsFn, getAttachments = js.Any.fromFunction1(getAttachments), mail = mail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailComposer]
    }
    
    extension [Self <: MailComposer](x: Self) {
      
      inline def setCompile(value: CallbackTo[typingsJapgolly.nodemailer.libMimeNodeMod.^]): Self = StObject.set(x, "compile", value.toJsFn)
      
      inline def setGetAlternatives(value: CallbackTo[js.Array[Attachment]]): Self = StObject.set(x, "getAlternatives", value.toJsFn)
      
      inline def setGetAttachments(value: Boolean => js.Array[Attachment]): Self = StObject.set(x, "getAttachments", js.Any.fromFunction1(value))
      
      inline def setMail(value: Options): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: typingsJapgolly.nodemailer.libMimeNodeMod.^ | `false`): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
