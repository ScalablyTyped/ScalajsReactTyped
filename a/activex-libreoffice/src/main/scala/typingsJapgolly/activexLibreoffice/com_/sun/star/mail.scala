package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XCurrentContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mail {
  
  /**
    * A {@link MailAttachment} specifies a mail message attachment.
    * @see com.sun.star.mail.XMailMessage
    * @since OOo 2.0
    */
  trait MailAttachment extends StObject {
    
    /**
      * The actual data which should be attached to a mail message. It is expected that the transferable delivers the data as sequence of bytes. Although a
      * transferable may support multiple data flavors only the first data flavor supplied will be used to retrieve the data and it is expected that the type
      * of the data is a sequence of bytes.
      * @see com.sun.star.datatransfer.XTransferable
      */
    var Data: XTransferable
    
    /** The name of the attachment as seen by the recipient of the mail message. ReadableName must not be empty. */
    var ReadableName: String
  }
  object MailAttachment {
    
    inline def apply(Data: XTransferable, ReadableName: String): MailAttachment = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], ReadableName = ReadableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailAttachment]
    }
    
    extension [Self <: MailAttachment](x: Self) {
      
      inline def setData(value: XTransferable): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setReadableName(value: String): Self = StObject.set(x, "ReadableName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An {@link MailException} is the base of all mail related exceptions.
    * @since OOo 2.0
    */
  type MailException = Exception
  
  /** @since OOo 2.0 */
  trait MailMessage
    extends StObject
       with XMailMessage {
    
    /**
      * Constructs an instance of a mail message.
      * @param sTo [in] the e-mail address of the recipient. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
      * @param sFrom [in] the e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org
      * @param sSubject [in] the subject of the mail message.
      * @param xBody [in] the body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support
      * @see com.sun.star.mail.XMailMessage
      * @see com.sun.star.datatransfer.XTransferable
      */
    def create(sTo: String, sFrom: String, sSubject: String, xBody: XTransferable): Unit
    
    /**
      * Constructs an instance of a mail message.
      * @param sTo [in] the e-mail address of the recipient. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
      * @param sFrom [in] the e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org
      * @param sSubject [in] the subject of the mail message.
      * @param xBody [in] the body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support
      * @param aMailAttachment [in] specifies an attachment which should be send with this mail message.
      * @see com.sun.star.mail.XMailMessage
      * @see com.sun.star.datatransfer.XTransferable
      * @see com.sun.star.mail.MailAttachment
      */
    def createWithAttachment(
      sTo: String,
      sFrom: String,
      sSubject: String,
      xBody: XTransferable,
      aMailAttachment: MailAttachment
    ): Unit
  }
  object MailMessage {
    
    inline def apply(
      Attachments: SafeArray[MailAttachment],
      BccRecipients: SafeArray[String],
      Body: XTransferable,
      CcRecipients: SafeArray[String],
      Recipients: SafeArray[String],
      ReplyToAddress: String,
      SenderAddress: String,
      SenderName: String,
      Subject: String,
      acquire: Callback,
      addAttachment: MailAttachment => Callback,
      addBccRecipient: String => Callback,
      addCcRecipient: String => Callback,
      addRecipient: String => Callback,
      create: (String, String, String, XTransferable) => Callback,
      createWithAttachment: (String, String, String, XTransferable, MailAttachment) => Callback,
      getAttachments: CallbackTo[SafeArray[MailAttachment]],
      getBccRecipients: CallbackTo[SafeArray[String]],
      getCcRecipients: CallbackTo[SafeArray[String]],
      getRecipients: CallbackTo[SafeArray[String]],
      queryInterface: `type` => Any,
      release: Callback
    ): MailMessage = {
      val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], BccRecipients = BccRecipients.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], CcRecipients = CcRecipients.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], ReplyToAddress = ReplyToAddress.asInstanceOf[js.Any], SenderAddress = SenderAddress.asInstanceOf[js.Any], SenderName = SenderName.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = acquire.toJsFn, addAttachment = js.Any.fromFunction1((t0: MailAttachment) => addAttachment(t0).runNow()), addBccRecipient = js.Any.fromFunction1((t0: String) => addBccRecipient(t0).runNow()), addCcRecipient = js.Any.fromFunction1((t0: String) => addCcRecipient(t0).runNow()), addRecipient = js.Any.fromFunction1((t0: String) => addRecipient(t0).runNow()), create = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XTransferable) => (create(t0, t1, t2, t3)).runNow()), createWithAttachment = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: XTransferable, t4: MailAttachment) => (createWithAttachment(t0, t1, t2, t3, t4)).runNow()), getAttachments = getAttachments.toJsFn, getBccRecipients = getBccRecipients.toJsFn, getCcRecipients = getCcRecipients.toJsFn, getRecipients = getRecipients.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[MailMessage]
    }
    
    extension [Self <: MailMessage](x: Self) {
      
      inline def setCreate(value: (String, String, String, XTransferable) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XTransferable) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setCreateWithAttachment(value: (String, String, String, XTransferable, MailAttachment) => Callback): Self = StObject.set(x, "createWithAttachment", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: XTransferable, t4: MailAttachment) => (value(t0, t1, t2, t3, t4)).runNow()))
    }
  }
  
  /** @since OOo 2.0 */
  @js.native
  trait MailServiceProvider
    extends StObject
       with XMailServiceProvider {
    
    /**
      * Creation method.
      * @see com.sun.star.mail.XMailServiceProvider
      */
    def create(): Unit = js.native
  }
  
  /** @since OOo 2.0 */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  */
  trait MailServiceType extends StObject
  object MailServiceType {
    
    /** A IMAP service */
    inline def IMAP: `2` = 2.asInstanceOf[`2`]
    
    /** A POP3 service */
    inline def POP3: `1` = 1.asInstanceOf[`1`]
    
    /** A SMTP service */
    inline def SMTP: `0` = 0.asInstanceOf[`0`]
  }
  
  /**
    * A {@link NoMailServiceProviderException} will be thrown if an appropriate provider for requested mail service could not be found or could not be
    * created.
    * @see com.sun.star.mail.MailService
    * @since OOo 2.0
    */
  type NoMailServiceProviderException = MailException
  
  /**
    * A {@link NoMailTransportProviderException} will be thrown if an appropriate provider for sending mail messages could not be found or could not be
    * created.
    * @see com.sun.star.mail.MailServer
    * @since OOo 2.0
    */
  type NoMailTransportProviderException = MailException
  
  /**
    * A SendFailedException will be thrown if a mail message could not be sent because the e-mail addresses of some recipients are invalid. E-mail addresses
    * have to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
    * @see com.sun.star.mail.XMailService
    * @since OOo 2.0
    */
  trait SendMailMessageFailedException
    extends StObject
       with Exception {
    
    /** The addresses which are invalid because they do not conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} . */
    var InvalidAddresses: SafeArray[String]
    
    /** The addresses to which the mail message was sent successfully. */
    var ValidSentAddresses: SafeArray[String]
    
    /** The addresses which are valid but to which the message was not sent. */
    var ValidUnsentAddresses: SafeArray[String]
  }
  object SendMailMessageFailedException {
    
    inline def apply(
      Context: XInterface,
      InvalidAddresses: SafeArray[String],
      Message: String,
      ValidSentAddresses: SafeArray[String],
      ValidUnsentAddresses: SafeArray[String]
    ): SendMailMessageFailedException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], InvalidAddresses = InvalidAddresses.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], ValidSentAddresses = ValidSentAddresses.asInstanceOf[js.Any], ValidUnsentAddresses = ValidUnsentAddresses.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMailMessageFailedException]
    }
    
    extension [Self <: SendMailMessageFailedException](x: Self) {
      
      inline def setInvalidAddresses(value: SafeArray[String]): Self = StObject.set(x, "InvalidAddresses", value.asInstanceOf[js.Any])
      
      inline def setValidSentAddresses(value: SafeArray[String]): Self = StObject.set(x, "ValidSentAddresses", value.asInstanceOf[js.Any])
      
      inline def setValidUnsentAddresses(value: SafeArray[String]): Self = StObject.set(x, "ValidUnsentAddresses", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents an interface that will be used to query for user information which are necessary to login to a network resource. An implementation of this
    * interface may for instance show a dialog to query the user for the necessary data.
    * @since OOo 2.0
    */
  trait XAuthenticator
    extends StObject
       with XInterface {
    
    /**
      * Will be called when the password of the user is needed.
      * @returns the password of the user.
      */
    val Password: String
    
    /**
      * Will be called when the user name is needed.
      * @returns the user name.
      */
    val UserName: String
    
    /**
      * Will be called when the password of the user is needed.
      * @returns the password of the user.
      */
    def getPassword(): String
    
    /**
      * Will be called when the user name is needed.
      * @returns the user name.
      */
    def getUserName(): String
  }
  object XAuthenticator {
    
    inline def apply(
      Password: String,
      UserName: String,
      acquire: Callback,
      getPassword: CallbackTo[String],
      getUserName: CallbackTo[String],
      queryInterface: `type` => Any,
      release: Callback
    ): XAuthenticator = {
      val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPassword = getPassword.toJsFn, getUserName = getUserName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XAuthenticator]
    }
    
    extension [Self <: XAuthenticator](x: Self) {
      
      inline def setGetPassword(value: CallbackTo[String]): Self = StObject.set(x, "getPassword", value.toJsFn)
      
      inline def setGetUserName(value: CallbackTo[String]): Self = StObject.set(x, "getUserName", value.toJsFn)
      
      inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The listener interface for connection events.
    * @see com.sun.star.mail.XMailService
    * @since OOo 2.0
    */
  trait XConnectionListener
    extends StObject
       with XEventListener {
    
    /**
      * Invoked when the connection to the mail server is established.
      * @param aEvent [in] specific information regarding this event.
      * @see com.sun.star.lang.EventObject
      */
    def connected(aEvent: EventObject): Unit
    
    /**
      * Invoked when the connection to the mail server is closed.
      * @param aEvent [in] specific information regarding this event.
      * @see com.sun.star.lang.EventObject
      */
    def disconnected(aEvent: EventObject): Unit
  }
  object XConnectionListener {
    
    inline def apply(
      acquire: Callback,
      connected: EventObject => Callback,
      disconnected: EventObject => Callback,
      disposing: EventObject => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XConnectionListener = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, connected = js.Any.fromFunction1((t0: EventObject) => connected(t0).runNow()), disconnected = js.Any.fromFunction1((t0: EventObject) => disconnected(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XConnectionListener]
    }
    
    extension [Self <: XConnectionListener](x: Self) {
      
      inline def setConnected(value: EventObject => Callback): Self = StObject.set(x, "connected", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
      
      inline def setDisconnected(value: EventObject => Callback): Self = StObject.set(x, "disconnected", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    }
  }
  
  /**
    * Represents a mail message.
    * @see com.sun.star.mail.XMailService
    * @since OOo 2.0
    */
  trait XMailMessage
    extends StObject
       with XInterface {
    
    /**
      * Return a sequence of {@link MailAttachment} 's that will be attached to this mail message.
      * @see com.sun.star.mail.MailAttachment
      */
    val Attachments: SafeArray[MailAttachment]
    
    /** Return a sequence of the e-mail addresses of all the BCC recipients of this mail message. */
    val BccRecipients: SafeArray[String]
    
    /**
      * The body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support multiple data
      * flavors only the first data flavor supplied will be used to retrieve the data and it is expected that the data will be provided as a string.
      * @see com.sun.star.datatransfer.XTransferable
      */
    var Body: XTransferable
    
    /** Return a sequence of the e-mail addresses of all the Cc recipients of this mail message. */
    val CcRecipients: SafeArray[String]
    
    /** Return a sequence of the e-mail addresses of all recipients of this mail message. */
    val Recipients: SafeArray[String]
    
    /**
      * The e-mail address where replies on this mail message should be sent to. If the e-mail address doesn't conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message later will fail. If no ReplyToAddress is set replies go to the SenderAddress.
      */
    var ReplyToAddress: String
    
    /**
      * The e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} .
      */
    var SenderAddress: String
    
    /** The display name of the sender of this mail message. */
    var SenderName: String
    
    /** The subject of a mail message. */
    var Subject: String
    
    /**
      * Add a file attachment to a mail message.
      *
      * param aMailAttachment [in] specifies a file which should be attached to this mail message.
      * @see com.sun.star.mail.MailAttachment
      */
    def addAttachment(aMailAttachment: MailAttachment): Unit
    
    /**
      * Add an BCC recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
      * @param sRecipientAddress [in] the e-mail address of the BCC recipient.
      */
    def addBccRecipient(sRecipientAddress: String): Unit
    
    /**
      * Add an Cc recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
      * @param sRecipientAddress [in] the e-mail address of the Cc recipient.
      */
    def addCcRecipient(sRecipientAddress: String): Unit
    
    /**
      * Add an recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
      * @param sRecipientAddress [in] the e-mail address of the recipient.
      */
    def addRecipient(sRecipientAddress: String): Unit
    
    /**
      * Return a sequence of {@link MailAttachment} 's that will be attached to this mail message.
      * @see com.sun.star.mail.MailAttachment
      */
    def getAttachments(): SafeArray[MailAttachment]
    
    /** Return a sequence of the e-mail addresses of all the BCC recipients of this mail message. */
    def getBccRecipients(): SafeArray[String]
    
    /** Return a sequence of the e-mail addresses of all the Cc recipients of this mail message. */
    def getCcRecipients(): SafeArray[String]
    
    /** Return a sequence of the e-mail addresses of all recipients of this mail message. */
    def getRecipients(): SafeArray[String]
  }
  object XMailMessage {
    
    inline def apply(
      Attachments: SafeArray[MailAttachment],
      BccRecipients: SafeArray[String],
      Body: XTransferable,
      CcRecipients: SafeArray[String],
      Recipients: SafeArray[String],
      ReplyToAddress: String,
      SenderAddress: String,
      SenderName: String,
      Subject: String,
      acquire: Callback,
      addAttachment: MailAttachment => Callback,
      addBccRecipient: String => Callback,
      addCcRecipient: String => Callback,
      addRecipient: String => Callback,
      getAttachments: CallbackTo[SafeArray[MailAttachment]],
      getBccRecipients: CallbackTo[SafeArray[String]],
      getCcRecipients: CallbackTo[SafeArray[String]],
      getRecipients: CallbackTo[SafeArray[String]],
      queryInterface: `type` => Any,
      release: Callback
    ): XMailMessage = {
      val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], BccRecipients = BccRecipients.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], CcRecipients = CcRecipients.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], ReplyToAddress = ReplyToAddress.asInstanceOf[js.Any], SenderAddress = SenderAddress.asInstanceOf[js.Any], SenderName = SenderName.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = acquire.toJsFn, addAttachment = js.Any.fromFunction1((t0: MailAttachment) => addAttachment(t0).runNow()), addBccRecipient = js.Any.fromFunction1((t0: String) => addBccRecipient(t0).runNow()), addCcRecipient = js.Any.fromFunction1((t0: String) => addCcRecipient(t0).runNow()), addRecipient = js.Any.fromFunction1((t0: String) => addRecipient(t0).runNow()), getAttachments = getAttachments.toJsFn, getBccRecipients = getBccRecipients.toJsFn, getCcRecipients = getCcRecipients.toJsFn, getRecipients = getRecipients.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XMailMessage]
    }
    
    extension [Self <: XMailMessage](x: Self) {
      
      inline def setAddAttachment(value: MailAttachment => Callback): Self = StObject.set(x, "addAttachment", js.Any.fromFunction1((t0: MailAttachment) => value(t0).runNow()))
      
      inline def setAddBccRecipient(value: String => Callback): Self = StObject.set(x, "addBccRecipient", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAddCcRecipient(value: String => Callback): Self = StObject.set(x, "addCcRecipient", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAddRecipient(value: String => Callback): Self = StObject.set(x, "addRecipient", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAttachments(value: SafeArray[MailAttachment]): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
      
      inline def setBccRecipients(value: SafeArray[String]): Self = StObject.set(x, "BccRecipients", value.asInstanceOf[js.Any])
      
      inline def setBody(value: XTransferable): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setCcRecipients(value: SafeArray[String]): Self = StObject.set(x, "CcRecipients", value.asInstanceOf[js.Any])
      
      inline def setGetAttachments(value: CallbackTo[SafeArray[MailAttachment]]): Self = StObject.set(x, "getAttachments", value.toJsFn)
      
      inline def setGetBccRecipients(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getBccRecipients", value.toJsFn)
      
      inline def setGetCcRecipients(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getCcRecipients", value.toJsFn)
      
      inline def setGetRecipients(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getRecipients", value.toJsFn)
      
      inline def setRecipients(value: SafeArray[String]): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
      
      inline def setReplyToAddress(value: String): Self = StObject.set(x, "ReplyToAddress", value.asInstanceOf[js.Any])
      
      inline def setSenderAddress(value: String): Self = StObject.set(x, "SenderAddress", value.asInstanceOf[js.Any])
      
      inline def setSenderName(value: String): Self = StObject.set(x, "SenderName", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a mail server abstraction.
    * @since OOo 2.0
    */
  trait XMailService
    extends StObject
       with XInterface {
    
    /**
      * Return the context of the current connection. The context contains information like the server name, port, connection type etc.
      *
      *
      *
      * **Precondition**: `isConnected` returns true.
      * @returns the current connection context.
      * @see com.sun.star.mail.connectUser
      * @see com.sun.star.io.NotConnectedException
      * @throws com::sun::star::io::NotConnectedException if no connection is currently established.
      */
    val CurrentConnectionContext: XCurrentContext
    
    /**
      * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
      * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
      * based connection
      * @returns a sequence of supported connection types.
      */
    val SupportedConnectionTypes: SafeArray[String]
    
    /**
      * Register a connection listener.
      * @param xListener [in] a listener that will be informed about connection events.
      * @see com.sun.star.mail.XConnectionListener
      */
    def addConnectionListener(xListener: XConnectionListener): Unit
    
    /**
      * Connect to a mail service. Only one connection to a mail service can be established at a time.
      * @param xConnectionContext [in] an interface used to query for connection related information. The context must contain the following values: **ServerNam
      * @param xAuthenticator [in] an interface used to query for the necessary user information needed to login to the mail server. If no authentication is req
      * @see com.sun.star.uno.XCurrentContext
      * @see com.sun.star.mail.XAuthenticator
      * @see com.sun.star.lang.IllegalArgumentException
      * @see com.sun.star.io.AlreadyConnectedException
      * @see com.sun.star.io.UnknownHostException
      * @see com.sun.star.io.NoRouteToHostException
      * @see com.sun.star.io.ConnectException
      * @see com.sun.star.auth.AuthenticationException
      * @see com.sun.star.mail.IllegalStateException
      * @see com.sun.star.mail.MailException
      * @throws com::sun::star::lang::IllegalArgumentException if the provided connection context contains invalid values or misses required connection parameters.
      * @throws com::sun::star::io::AlreadyConnectedException on a try to connect to an already connect mail server.
      * @throws com::sun::star::io::UnknownHostException usually if the IP address of the mail server could not be determined. Possible causes are a broken netwo
      * @throws com::sun::star::io::NoRouteToHostException if an error occurred to connect to the remote mail server. Typically the remote mail server cannot be
      * @throws com::sun::star::io::ConnectException if an error occurred while attempting to connect to the remote mail server. Typically the connection was ref
      * @throws com::sun::star::auth::AuthenticationException if the specified user could not be logged in.
      * @throws com::sun::star::mail::MailException for other errors during login.
      */
    def connect(xConnectionContext: XCurrentContext, xAuthenticator: XAuthenticator): Unit
    
    /**
      * Disconnect from a mail service.
      * @throws com::sun::star::mail::MailException if errors occur during disconnecting.
      */
    def disconnect(): Unit
    
    /**
      * Return the context of the current connection. The context contains information like the server name, port, connection type etc.
      *
      *
      *
      * **Precondition**: `isConnected` returns true.
      * @returns the current connection context.
      * @see com.sun.star.mail.connectUser
      * @see com.sun.star.io.NotConnectedException
      * @throws com::sun::star::io::NotConnectedException if no connection is currently established.
      */
    def getCurrentConnectionContext(): XCurrentContext
    
    /**
      * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
      * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
      * based connection
      * @returns a sequence of supported connection types.
      */
    def getSupportedConnectionTypes(): SafeArray[String]
    
    /**
      * Returns whether a connection to a mail service currently exist or not.
      * @returns `TRUE` if a connection to a mail service is established.
      */
    def isConnected(): Boolean
    
    /**
      * Unregister a connection listener.
      * @param xListener [in] a listener that no longer need to be informed about connection events.
      * @see com.sun.star.mail.XConnectionListener
      */
    def removeConnectionListener(xListener: XConnectionListener): Unit
  }
  object XMailService {
    
    inline def apply(
      CurrentConnectionContext: XCurrentContext,
      SupportedConnectionTypes: SafeArray[String],
      acquire: Callback,
      addConnectionListener: XConnectionListener => Callback,
      connect: (XCurrentContext, XAuthenticator) => Callback,
      disconnect: Callback,
      getCurrentConnectionContext: CallbackTo[XCurrentContext],
      getSupportedConnectionTypes: CallbackTo[SafeArray[String]],
      isConnected: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeConnectionListener: XConnectionListener => Callback
    ): XMailService = {
      val __obj = js.Dynamic.literal(CurrentConnectionContext = CurrentConnectionContext.asInstanceOf[js.Any], SupportedConnectionTypes = SupportedConnectionTypes.asInstanceOf[js.Any], acquire = acquire.toJsFn, addConnectionListener = js.Any.fromFunction1((t0: XConnectionListener) => addConnectionListener(t0).runNow()), connect = js.Any.fromFunction2((t0: XCurrentContext, t1: XAuthenticator) => (connect(t0, t1)).runNow()), disconnect = disconnect.toJsFn, getCurrentConnectionContext = getCurrentConnectionContext.toJsFn, getSupportedConnectionTypes = getSupportedConnectionTypes.toJsFn, isConnected = isConnected.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeConnectionListener = js.Any.fromFunction1((t0: XConnectionListener) => removeConnectionListener(t0).runNow()))
      __obj.asInstanceOf[XMailService]
    }
    
    extension [Self <: XMailService](x: Self) {
      
      inline def setAddConnectionListener(value: XConnectionListener => Callback): Self = StObject.set(x, "addConnectionListener", js.Any.fromFunction1((t0: XConnectionListener) => value(t0).runNow()))
      
      inline def setConnect(value: (XCurrentContext, XAuthenticator) => Callback): Self = StObject.set(x, "connect", js.Any.fromFunction2((t0: XCurrentContext, t1: XAuthenticator) => (value(t0, t1)).runNow()))
      
      inline def setCurrentConnectionContext(value: XCurrentContext): Self = StObject.set(x, "CurrentConnectionContext", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setGetCurrentConnectionContext(value: CallbackTo[XCurrentContext]): Self = StObject.set(x, "getCurrentConnectionContext", value.toJsFn)
      
      inline def setGetSupportedConnectionTypes(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSupportedConnectionTypes", value.toJsFn)
      
      inline def setIsConnected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConnected", value.toJsFn)
      
      inline def setRemoveConnectionListener(value: XConnectionListener => Callback): Self = StObject.set(x, "removeConnectionListener", js.Any.fromFunction1((t0: XConnectionListener) => value(t0).runNow()))
      
      inline def setSupportedConnectionTypes(value: SafeArray[String]): Self = StObject.set(x, "SupportedConnectionTypes", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A factory for creating different mail services.
    * @since OOo 2.0
    */
  trait XMailServiceProvider
    extends StObject
       with XInterface {
    
    /**
      * A factory method.
      * @param aType [in] the type of the requested mail service.
      * @returns A {@link XMailService} interface.
      * @see com.sun.star.mail.XMailServiceProvider
      * @see com.sun.star.mail.MailServiceType
      */
    def create(aType: MailServiceType): XMailService
  }
  object XMailServiceProvider {
    
    inline def apply(
      acquire: Callback,
      create: MailServiceType => XMailService,
      queryInterface: `type` => Any,
      release: Callback
    ): XMailServiceProvider = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, create = js.Any.fromFunction1(create), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XMailServiceProvider]
    }
    
    extension [Self <: XMailServiceProvider](x: Self) {
      
      inline def setCreate(value: MailServiceType => XMailService): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Represents a SMTP service abstraction.
    * @see com.sun.star.mail.XMailService
    * @see com.sun.star.mail.XMailMessage
    * @since OOo 2.0
    */
  trait XSmtpService
    extends StObject
       with XMailService {
    
    /**
      * Send a mail message to its recipients.
      * @param xMailMessage [in] the mail message to be sent.
      * @see com.sun.star.mail.XMailMessage
      * @see com.sun.star.io.NotConnectedException
      * @see com.sun.star.mail.SendMailMessageFailedException
      * @see com.sun.star.mail.MailException
      * @see com.sun.star.datatransfer.UnsupportedFlavorException
      * @throws com::sun::star::io::NotConnectedException if no user is currently connected to the mail server.
      * @throws com::sun::star::mail::SendMailMessageFailedException if the message could not be sent because of invalid recipient addresses. The e-mail addresse
      * @throws com::sun::star::mail::MailException is thrown on other errors that may happen during sending. A possible reason may be for instance that a file a
      * @throws com::sun::star::datatransfer::UnsupportedFlavorException is thrown when the body of the mail message is provided in an unsupported mime content t
      */
    def sendMailMessage(xMailMessage: XMailMessage): Unit
  }
  object XSmtpService {
    
    inline def apply(
      CurrentConnectionContext: XCurrentContext,
      SupportedConnectionTypes: SafeArray[String],
      acquire: Callback,
      addConnectionListener: XConnectionListener => Callback,
      connect: (XCurrentContext, XAuthenticator) => Callback,
      disconnect: Callback,
      getCurrentConnectionContext: CallbackTo[XCurrentContext],
      getSupportedConnectionTypes: CallbackTo[SafeArray[String]],
      isConnected: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeConnectionListener: XConnectionListener => Callback,
      sendMailMessage: XMailMessage => Callback
    ): XSmtpService = {
      val __obj = js.Dynamic.literal(CurrentConnectionContext = CurrentConnectionContext.asInstanceOf[js.Any], SupportedConnectionTypes = SupportedConnectionTypes.asInstanceOf[js.Any], acquire = acquire.toJsFn, addConnectionListener = js.Any.fromFunction1((t0: XConnectionListener) => addConnectionListener(t0).runNow()), connect = js.Any.fromFunction2((t0: XCurrentContext, t1: XAuthenticator) => (connect(t0, t1)).runNow()), disconnect = disconnect.toJsFn, getCurrentConnectionContext = getCurrentConnectionContext.toJsFn, getSupportedConnectionTypes = getSupportedConnectionTypes.toJsFn, isConnected = isConnected.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeConnectionListener = js.Any.fromFunction1((t0: XConnectionListener) => removeConnectionListener(t0).runNow()), sendMailMessage = js.Any.fromFunction1((t0: XMailMessage) => sendMailMessage(t0).runNow()))
      __obj.asInstanceOf[XSmtpService]
    }
    
    extension [Self <: XSmtpService](x: Self) {
      
      inline def setSendMailMessage(value: XMailMessage => Callback): Self = StObject.set(x, "sendMailMessage", js.Any.fromFunction1((t0: XMailMessage) => value(t0).runNow()))
    }
  }
}
