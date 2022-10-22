package typingsJapgolly.mimetext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mimetext.anon.PartialEnvironmentContext
import typingsJapgolly.mimetext.anon.RequiredMailboxInput
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mimetext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMimeMessage(): NodeMIMEMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("createMimeMessage")().asInstanceOf[NodeMIMEMessage]
  
  trait EnvironmentContext extends StObject {
    
    var store: js.Array[MIMEHeader]
    
    def toBase64(input: Any): String
  }
  object EnvironmentContext {
    
    inline def apply(store: js.Array[MIMEHeader], toBase64: Any => String): EnvironmentContext = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], toBase64 = js.Any.fromFunction1(toBase64))
      __obj.asInstanceOf[EnvironmentContext]
    }
    
    extension [Self <: EnvironmentContext](x: Self) {
      
      inline def setStore(value: js.Array[MIMEHeader]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreVarargs(value: MIMEHeader*): Self = StObject.set(x, "store", js.Array(value*))
      
      inline def setToBase64(value: Any => String): Self = StObject.set(x, "toBase64", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mimetext.mimetextStrings.OBJECT
    - typingsJapgolly.mimetext.mimetextStrings.SPEC_COMPLIANT_TEXT
    - typingsJapgolly.mimetext.mimetextStrings.TEXT
  */
  trait InputType extends StObject
  object InputType {
    
    inline def OBJECT: typingsJapgolly.mimetext.mimetextStrings.OBJECT = "OBJECT".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.OBJECT]
    
    inline def SPEC_COMPLIANT_TEXT: typingsJapgolly.mimetext.mimetextStrings.SPEC_COMPLIANT_TEXT = "SPEC_COMPLIANT_TEXT".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.SPEC_COMPLIANT_TEXT]
    
    inline def TEXT: typingsJapgolly.mimetext.mimetextStrings.TEXT = "TEXT".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.TEXT]
  }
  
  trait MIMEHeader extends StObject {
    
    var custom: Boolean
    
    def dump(v: Any): Any
    
    var generator: js.UndefOr[js.Function0[String]] = js.undefined
    
    var name: String
    
    var placement: MIMEPlacement
    
    var value: String | Null
  }
  object MIMEHeader {
    
    inline def apply(custom: Boolean, dump: Any => Any, name: String, placement: MIMEPlacement): MIMEHeader = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], dump = js.Any.fromFunction1(dump), name = name.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[MIMEHeader]
    }
    
    extension [Self <: MIMEHeader](x: Self) {
      
      inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setDump(value: Any => Any): Self = StObject.set(x, "dump", js.Any.fromFunction1(value))
      
      inline def setGenerator(value: CallbackTo[String]): Self = StObject.set(x, "generator", value.toJsFn)
      
      inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: MIMEPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait MIMEMessageContent extends StObject {
    
    def dump(envctx: PartialEnvironmentContext, boundaries: MailboxBoundaries): String
    
    def getHeader(key: String): js.UndefOr[String]
    
    def getHeaders(): Record[String, String]
    
    def isAttachment(): Boolean
    
    def setHeader(key: String, value: String): this.type
    
    def setHeaders(headers: MessageHeaders): this.type
  }
  object MIMEMessageContent {
    
    inline def apply(
      dump: (PartialEnvironmentContext, MailboxBoundaries) => String,
      getHeader: String => js.UndefOr[String],
      getHeaders: CallbackTo[Record[String, String]],
      isAttachment: CallbackTo[Boolean],
      setHeader: (String, String) => MIMEMessageContent,
      setHeaders: MessageHeaders => MIMEMessageContent
    ): MIMEMessageContent = {
      val __obj = js.Dynamic.literal(dump = js.Any.fromFunction2(dump), getHeader = js.Any.fromFunction1(getHeader), getHeaders = getHeaders.toJsFn, isAttachment = isAttachment.toJsFn, setHeader = js.Any.fromFunction2(setHeader), setHeaders = js.Any.fromFunction1(setHeaders))
      __obj.asInstanceOf[MIMEMessageContent]
    }
    
    extension [Self <: MIMEMessageContent](x: Self) {
      
      inline def setDump(value: (PartialEnvironmentContext, MailboxBoundaries) => String): Self = StObject.set(x, "dump", js.Any.fromFunction2(value))
      
      inline def setGetHeader(value: String => js.UndefOr[String]): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      inline def setGetHeaders(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "getHeaders", value.toJsFn)
      
      inline def setIsAttachment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAttachment", value.toJsFn)
      
      inline def setSetHeader(value: (String, String) => MIMEMessageContent): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
      
      inline def setSetHeaders(value: MessageHeaders => MIMEMessageContent): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mimetext.mimetextStrings.content
    - typingsJapgolly.mimetext.mimetextStrings.header
  */
  trait MIMEPlacement extends StObject
  object MIMEPlacement {
    
    inline def content: typingsJapgolly.mimetext.mimetextStrings.content = "content".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.content]
    
    inline def header: typingsJapgolly.mimetext.mimetextStrings.header = "header".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.header]
  }
  
  type MailLocation = String | MailLocationData
  
  trait MailLocationData extends StObject {
    
    var addr: String
    
    var name: js.UndefOr[String] = js.undefined
  }
  object MailLocationData {
    
    inline def apply(addr: String): MailLocationData = {
      val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailLocationData]
    }
    
    extension [Self <: MailLocationData](x: Self) {
      
      inline def setAddr(value: String): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Mailbox extends StObject {
    
    def createMailbox(): Unit
    
    def dump(): String
    
    def findInputType(input: String): InputType
    
    def getAddrDomain(): String
    
    def parseSpecCompliantText(text: String): MailLocationData
    
    def toObject(): RequiredMailboxInput
  }
  object Mailbox {
    
    inline def apply(
      createMailbox: Callback,
      dump: CallbackTo[String],
      findInputType: String => InputType,
      getAddrDomain: CallbackTo[String],
      parseSpecCompliantText: String => MailLocationData,
      toObject: CallbackTo[RequiredMailboxInput]
    ): Mailbox = {
      val __obj = js.Dynamic.literal(createMailbox = createMailbox.toJsFn, dump = dump.toJsFn, findInputType = js.Any.fromFunction1(findInputType), getAddrDomain = getAddrDomain.toJsFn, parseSpecCompliantText = js.Any.fromFunction1(parseSpecCompliantText), toObject = toObject.toJsFn)
      __obj.asInstanceOf[Mailbox]
    }
    
    extension [Self <: Mailbox](x: Self) {
      
      inline def setCreateMailbox(value: Callback): Self = StObject.set(x, "createMailbox", value.toJsFn)
      
      inline def setDump(value: CallbackTo[String]): Self = StObject.set(x, "dump", value.toJsFn)
      
      inline def setFindInputType(value: String => InputType): Self = StObject.set(x, "findInputType", js.Any.fromFunction1(value))
      
      inline def setGetAddrDomain(value: CallbackTo[String]): Self = StObject.set(x, "getAddrDomain", value.toJsFn)
      
      inline def setParseSpecCompliantText(value: String => MailLocationData): Self = StObject.set(x, "parseSpecCompliantText", js.Any.fromFunction1(value))
      
      inline def setToObject(value: CallbackTo[RequiredMailboxInput]): Self = StObject.set(x, "toObject", value.toJsFn)
    }
  }
  
  trait MailboxBoundaries extends StObject {
    
    var alt: String
    
    var mixed: String
  }
  object MailboxBoundaries {
    
    inline def apply(alt: String, mixed: String): MailboxBoundaries = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], mixed = mixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailboxBoundaries]
    }
    
    extension [Self <: MailboxBoundaries](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setMixed(value: String): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
    }
  }
  
  trait MailboxInput
    extends StObject
       with MailLocationData
       with RecipientOptions
  object MailboxInput {
    
    inline def apply(addr: String): MailboxInput = {
      val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailboxInput]
    }
  }
  
  trait MailboxOptions extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MailboxOptions {
    
    inline def apply(): MailboxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailboxOptions]
    }
    
    extension [Self <: MailboxOptions](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type MessageHeaders = js.Array[String] | (Record[String, String])
  
  @js.native
  trait MimeMessage extends StObject {
    
    def asAttachments(): js.Array[MIMEMessageContent] = js.native
    
    def asEncoded(): String = js.native
    
    def asRaw(): String = js.native
    
    def generateBoundaries(): MailboxBoundaries = js.native
    
    def getHeader(key: String): js.UndefOr[String] = js.native
    
    def getMessageByType(`type`: String): js.UndefOr[MIMEMessageContent] = js.native
    
    def getRecipients(): js.Array[Mailbox] = js.native
    def getRecipients(options: RecipientOptions): js.Array[Mailbox] = js.native
    
    def getSender(): Mailbox = js.native
    
    def getSubject(): js.UndefOr[String] = js.native
    
    def setAttachment(name: String, `type`: TextFormat, attachment: String): MIMEMessageContent = js.native
    
    def setBcc(bcc: js.Array[MailLocation]): js.Array[Mailbox] = js.native
    def setBcc(bcc: MailLocation): js.Array[Mailbox] = js.native
    
    def setCc(cc: js.Array[MailLocation]): js.Array[Mailbox] = js.native
    def setCc(cc: MailLocation): js.Array[Mailbox] = js.native
    
    def setHeader(key: String, value: String): String = js.native
    
    def setMessage(format: TextFormat, message: String): MIMEMessageContent = js.native
    def setMessage(format: TextFormat, message: String, moreHeaders: MessageHeaders): MIMEMessageContent = js.native
    
    def setRecipient(recipient: js.Array[MailLocation]): js.Array[Mailbox] = js.native
    def setRecipient(recipient: js.Array[MailLocation], options: RecipientOptions): js.Array[Mailbox] = js.native
    def setRecipient(recipient: MailLocation): js.Array[Mailbox] = js.native
    def setRecipient(recipient: MailLocation, options: RecipientOptions): js.Array[Mailbox] = js.native
    
    def setSender(sender: js.Array[MailLocation]): Mailbox = js.native
    def setSender(sender: MailLocation): Mailbox = js.native
    
    def setSubject(subject: String): String = js.native
    
    def setTo(to: js.Array[MailLocation]): js.Array[Mailbox] = js.native
    def setTo(to: MailLocation): js.Array[Mailbox] = js.native
  }
  
  type NodeMIMEMessage = MimeMessage
  
  trait RecipientOptions extends StObject {
    
    var `type`: js.UndefOr[RecipientType] = js.undefined
  }
  object RecipientOptions {
    
    inline def apply(): RecipientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecipientOptions]
    }
    
    extension [Self <: RecipientOptions](x: Self) {
      
      inline def setType(value: RecipientType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mimetext.mimetextStrings.bcc
    - typingsJapgolly.mimetext.mimetextStrings.cc
    - typingsJapgolly.mimetext.mimetextStrings.to
  */
  trait RecipientType extends StObject
  object RecipientType {
    
    inline def bcc: typingsJapgolly.mimetext.mimetextStrings.bcc = "bcc".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.bcc]
    
    inline def cc: typingsJapgolly.mimetext.mimetextStrings.cc = "cc".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.cc]
    
    inline def to: typingsJapgolly.mimetext.mimetextStrings.to = "to".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.to]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mimetext.mimetextStrings.textSlashhtml
    - typingsJapgolly.mimetext.mimetextStrings.textSlashplain
  */
  trait TextFormat extends StObject
  object TextFormat {
    
    inline def textSlashhtml: typingsJapgolly.mimetext.mimetextStrings.textSlashhtml = "text/html".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.textSlashhtml]
    
    inline def textSlashplain: typingsJapgolly.mimetext.mimetextStrings.textSlashplain = "text/plain".asInstanceOf[typingsJapgolly.mimetext.mimetextStrings.textSlashplain]
  }
}
