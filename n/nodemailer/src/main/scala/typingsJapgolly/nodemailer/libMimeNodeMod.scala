package typingsJapgolly.nodemailer

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.nodemailer.anon.Value
import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import typingsJapgolly.nodemailer.nodemailerStrings.B
import typingsJapgolly.nodemailer.nodemailerStrings.Q
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMimeNodeMod {
  
  /**
    * Creates a new mime tree node. Assumes 'multipart/ *' as the content type
    * if it is a branch, anything else counts as leaf. If rootNode is missing from
    * the options, assumes this is the root.
    */
  @JSImport("nodemailer/lib/mime-node", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MimeNode {
    def this(contentType: String) = this()
    def this(contentType: String, options: Options) = this()
    def this(contentType: Unit, options: Options) = this()
  }
  
  trait Addresses extends StObject {
    
    var bcc: js.UndefOr[js.Array[String]] = js.undefined
    
    var cc: js.UndefOr[js.Array[String]] = js.undefined
    
    var from: js.UndefOr[js.Array[String]] = js.undefined
    
    var `reply-to`: js.UndefOr[js.Array[String]] = js.undefined
    
    var sender: js.UndefOr[js.Array[String]] = js.undefined
    
    var to: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Addresses {
    
    inline def apply(): Addresses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Addresses]
    }
    
    extension [Self <: Addresses](x: Self) {
      
      inline def setBcc(value: js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      inline def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value*))
      
      inline def setCc(value: js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      inline def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value*))
      
      inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def `setReply-to`(value: js.Array[String]): Self = StObject.set(x, "reply-to", value.asInstanceOf[js.Any])
      
      inline def `setReply-toUndefined`: Self = StObject.set(x, "reply-to", js.undefined)
      
      inline def `setReply-toVarargs`(value: String*): Self = StObject.set(x, "reply-to", js.Array(value*))
      
      inline def setSender(value: js.Array[String]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
      
      inline def setSenderVarargs(value: String*): Self = StObject.set(x, "sender", js.Array(value*))
      
      inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  trait Envelope extends StObject {
    
    /** includes an address object or is set to false */
    var from: String | `false`
    
    /** includes an array of address objects */
    var to: js.Array[String]
  }
  object Envelope {
    
    inline def apply(from: String | `false`, to: js.Array[String]): Envelope = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Envelope]
    }
    
    extension [Self <: Envelope](x: Self) {
      
      inline def setFrom(value: String | `false`): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  /**
    * Creates a new mime tree node. Assumes 'multipart/ *' as the content type
    * if it is a branch, anything else counts as leaf. If rootNode is missing from
    * the options, assumes this is the root.
    */
  @js.native
  trait MimeNode extends StObject {
    
    def addHeader(headers: js.Array[Value]): this.type = js.native
    def addHeader(headers: StringDictionary[String]): this.type = js.native
    /**
      * Adds a header value. If the value for selected key exists, the value is appended
      * as a new field and old one is not touched.
      * You can set multiple values as well by using [{key:'', value:''}] or
      * {key: 'value'} as the first argument.
      */
    def addHeader(key: String, value: String): this.type = js.native
    
    /** Appends an existing node to the mime tree. Removes the node from an existing tree if needed */
    def appendChild(childNode: MimeNode): MimeNode = js.native
    
    def build(): js.Promise[Buffer] = js.native
    /** Generate the message and return it with a callback or promise */
    def build(callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
    
    /** Builds the header block for the mime node. Append \r\n\r\n before writing the content */
    def buildHeaders(): String = js.native
    
    /** Creates and appends a child node.Arguments provided are passed to MimeNode constructor */
    def createChild(contentType: String): MimeNode = js.native
    def createChild(contentType: String, options: Options): MimeNode = js.native
    
    /**
      * Streams the rfc2822 message from the current node. If this is a root node,
      * mandatory header fields are set if missing (Date, Message-Id, MIME-Version)
      */
    def createReadStream(): Readable = js.native
    def createReadStream(options: ReadableOptions): Readable = js.native
    
    /** Generates and returns an object with parsed address fields */
    def getAddresses(): Addresses = js.native
    
    /** Generates and returns SMTP envelope with the sender address and a list of recipients addresses */
    def getEnvelope(): Envelope = js.native
    
    /** Retrieves the first mathcing value of a selected key */
    def getHeader(key: String): String = js.native
    
    def getTransferEncoding(): String = js.native
    
    /** Returns Message-Id value. If it does not exist, then creates one */
    def messageId(): String = js.native
    
    /**
      * Appends a post process function. The functon is run after transforms and
      * uses the following syntax
      *
      *   processFunc(input) -> outputStream
      */
    def processFunc(processFunc: js.Function1[/* outputStream */ Readable, Readable]): Unit = js.native
    
    /** Removes current node from the mime tree */
    def remove(): this.type = js.native
    
    /** Replaces current node with another node */
    def replace(node: MimeNode): MimeNode = js.native
    
    /**
      * Sets body content for current node. If the value is a string, charset is added automatically
      * to Content-Type (if it is text/ *). If the value is a Buffer, you need to specify
      * the charset yourself
      */
    def setContent(content: String): this.type = js.native
    def setContent(content: Buffer): this.type = js.native
    def setContent(content: Readable): this.type = js.native
    
    /** Sets envelope to be used instead of the generated one */
    def setEnvelope(envelope: typingsJapgolly.nodemailer.libMailerMod.Envelope): this.type = js.native
    
    def setHeader(headers: js.Array[Value]): this.type = js.native
    def setHeader(headers: StringDictionary[String]): this.type = js.native
    /**
      * Sets a header value. If the value for selected key exists, it is overwritten.
      * You can set multiple values as well by using [{key:'', value:''}] or
      * {key: 'value'} as the first argument.
      */
    def setHeader(key: String, value: String): this.type = js.native
    def setHeader(key: String, value: js.Array[String]): this.type = js.native
    
    /** Sets pregenerated content that will be used as the output of this node */
    def setRaw(raw: String): this.type = js.native
    def setRaw(raw: Buffer): this.type = js.native
    def setRaw(raw: Readable): this.type = js.native
    
    def stream(
      outputStream: Readable,
      options: ReadableOptions,
      done: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    /**
      * Appends a transform stream object to the transforms list. Final output
      * is passed through this stream before exposing
      */
    def transform(transform: Transform): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /** shared part of the unique multipart boundary */
    var baseBoundary: js.UndefOr[String] = js.undefined
    
    /** filename for an attachment node */
    var filename: js.UndefOr[String] = js.undefined
    
    /** If true, do not exclude Bcc from the generated headers */
    var keepBcc: js.UndefOr[Boolean] = js.undefined
    
    /** method to normalize header keys for custom caseing */
    var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.undefined
    
    /** immediate parent for this node */
    var parentNode: js.UndefOr[MimeNode] = js.undefined
    
    /** root node for this tree */
    var rootNode: js.UndefOr[MimeNode] = js.undefined
    
    /** either 'Q' (the default) or 'B' */
    var textEncoding: js.UndefOr[B | Q] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBaseBoundary(value: String): Self = StObject.set(x, "baseBoundary", value.asInstanceOf[js.Any])
      
      inline def setBaseBoundaryUndefined: Self = StObject.set(x, "baseBoundary", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setKeepBcc(value: Boolean): Self = StObject.set(x, "keepBcc", value.asInstanceOf[js.Any])
      
      inline def setKeepBccUndefined: Self = StObject.set(x, "keepBcc", js.undefined)
      
      inline def setNormalizeHeaderKey(value: /* key */ String => String): Self = StObject.set(x, "normalizeHeaderKey", js.Any.fromFunction1(value))
      
      inline def setNormalizeHeaderKeyUndefined: Self = StObject.set(x, "normalizeHeaderKey", js.undefined)
      
      inline def setParentNode(value: MimeNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
      
      inline def setRootNode(value: MimeNode): Self = StObject.set(x, "rootNode", value.asInstanceOf[js.Any])
      
      inline def setRootNodeUndefined: Self = StObject.set(x, "rootNode", js.undefined)
      
      inline def setTextEncoding(value: B | Q): Self = StObject.set(x, "textEncoding", value.asInstanceOf[js.Any])
      
      inline def setTextEncodingUndefined: Self = StObject.set(x, "textEncoding", js.undefined)
    }
  }
}
