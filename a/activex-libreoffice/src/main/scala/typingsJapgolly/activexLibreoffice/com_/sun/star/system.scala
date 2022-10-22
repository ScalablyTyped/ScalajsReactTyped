package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object system {
  
  /**
    * Specifies a {@link SimpleCommandMail} service. Implementations of such a service, do implement an interface to send mail messages via the current
    * configured command line mail application.
    * @see com.sun.star.system.XSimpleMailClient
    */
  type SimpleCommandMail = XSimpleMailClientSupplier
  
  object SimpleMailClientFlags {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def DEFAULTS: `0` = 0.asInstanceOf[`0`]
      
      inline def NO_LOGON_DIALOG: `2` = 2.asInstanceOf[`2`]
      
      inline def NO_USER_INTERFACE: `1` = 1.asInstanceOf[`1`]
    }
  }
  
  /**
    * Specifies a {@link SimpleSystemMail} service. Implementations of such a service implement an interface to send mail messages via the currently
    * configured system mail client.
    * @see com.sun.star.system.XSimpleMailClient
    */
  type SimpleSystemMail = XSimpleMailClientSupplier
  
  /**
    * Specifies a system executer service. Such a service makes it possible to execute an arbitrary system command.
    * @see com.sun.star.system.XSystemShellExecute
    */
  type SystemShellExecute = XSystemShellExecute
  
  /**
    * May be thrown in cases of errors executing a command using the {@link SystemShellExecute} service. {@link com.sun.star.uno.Exception.Message} may
    * contain a system error message, but it is not mandatory. The member PosixError specifies a POSIX conforming error code or -1 for unknown errors.
    */
  trait SystemShellExecuteException
    extends StObject
       with Exception {
    
    /** A POSIX conforming error code or -1 for unknown errors. */
    var PosixError: Double
  }
  object SystemShellExecuteException {
    
    inline def apply(Context: XInterface, Message: String, PosixError: Double): SystemShellExecuteException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], PosixError = PosixError.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemShellExecuteException]
    }
    
    extension [Self <: SystemShellExecuteException](x: Self) {
      
      inline def setPosixError(value: Double): Self = StObject.set(x, "PosixError", value.asInstanceOf[js.Any])
    }
  }
  
  object SystemShellExecuteFlags {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def DEFAULTS: `0` = 0.asInstanceOf[`0`]
      
      inline def NO_SYSTEM_ERROR_MESSAGE: `1` = 1.asInstanceOf[`1`]
      
      inline def URIS_ONLY: `2` = 2.asInstanceOf[`2`]
    }
  }
  
  /** Specifies an interface for creating and sending email messages. */
  trait XSimpleMailClient
    extends StObject
       with XInterface {
    
    /**
      * Create a simple mail message object that implements the interface {@link XSimpleMailMessage} .
      * @returns An object that implements the {@link XSimpleMailMessage} interface.
      */
    def createSimpleMailMessage(): XSimpleMailMessage
    
    /**
      * Sends a given simple mail message object that implements the interface {@link XSimpleMailMessage} .
      * @param xSimpleMailMessage Specifies a configured mail object to be sent.
      * @param aFlag Specifies different flags that control the send process if the flag NO_USER_INTERFACE is specified. A recipient address must have been spec
      * @see com.sun.star.system.XSimpleMailMessage
      * @see com.sun.star.system.SimpleMailClientFlags
      * @throws com::sun::star::lang::IllegalArgumentException If invalid or excluding flags have been specified.The flag NO_USER_INTERFACE is specified and no r
      * @throws com::sun::star::uno::Exception if an error occurs while sending the mail. The Message member of the exception may contain an error description.
      */
    def sendSimpleMailMessage(xSimpleMailMessage: XSimpleMailMessage, aFlag: Double): Unit
  }
  object XSimpleMailClient {
    
    inline def apply(
      acquire: Callback,
      createSimpleMailMessage: CallbackTo[XSimpleMailMessage],
      queryInterface: `type` => Any,
      release: Callback,
      sendSimpleMailMessage: (XSimpleMailMessage, Double) => Callback
    ): XSimpleMailClient = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createSimpleMailMessage = createSimpleMailMessage.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, sendSimpleMailMessage = js.Any.fromFunction2((t0: XSimpleMailMessage, t1: Double) => (sendSimpleMailMessage(t0, t1)).runNow()))
      __obj.asInstanceOf[XSimpleMailClient]
    }
    
    extension [Self <: XSimpleMailClient](x: Self) {
      
      inline def setCreateSimpleMailMessage(value: CallbackTo[XSimpleMailMessage]): Self = StObject.set(x, "createSimpleMailMessage", value.toJsFn)
      
      inline def setSendSimpleMailMessage(value: (XSimpleMailMessage, Double) => Callback): Self = StObject.set(x, "sendSimpleMailMessage", js.Any.fromFunction2((t0: XSimpleMailMessage, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * Implementations of this interface do provide access to a simple mail client if there is one available
    * @see com.sun.star.system.XSimpleMailClient
    */
  trait XSimpleMailClientSupplier
    extends StObject
       with XInterface {
    
    /**
      * Allows a client to query for an object that implements {@link XSimpleMailClient} .
      * @returns An interface to a simple mail client if there is one available on the system or an empty reference else.
      * @see com.sun.star.system.XSimpleMailClient
      */
    def querySimpleMailClient(): XSimpleMailClient
  }
  object XSimpleMailClientSupplier {
    
    inline def apply(
      acquire: Callback,
      queryInterface: `type` => Any,
      querySimpleMailClient: CallbackTo[XSimpleMailClient],
      release: Callback
    ): XSimpleMailClientSupplier = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), querySimpleMailClient = querySimpleMailClient.toJsFn, release = release.toJsFn)
      __obj.asInstanceOf[XSimpleMailClientSupplier]
    }
    
    extension [Self <: XSimpleMailClientSupplier](x: Self) {
      
      inline def setQuerySimpleMailClient(value: CallbackTo[XSimpleMailClient]): Self = StObject.set(x, "querySimpleMailClient", value.toJsFn)
    }
  }
  
  /** This interface lets a client set or get the information of a simple mail message. */
  trait XSimpleMailMessage
    extends StObject
       with XInterface {
    
    /**
      * To get the attachment of a simple mail message.
      * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
      */
    var Attachement: SafeArray[String]
    
    /**
      * To get the BCC recipients of a simple mail message.
      * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
      */
    var BccRecipient: SafeArray[String]
    
    /**
      * To get the cc recipients of a simple mail message.
      * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
      */
    var CcRecipient: SafeArray[String]
    
    /**
      * To get the email address of the originator of a simple mail message.
      * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
      */
    var Originator: String
    
    /**
      * To get the recipient of the simple mail message.
      * @returns The specified email address of a recipient if any has been specified or an empty string.
      */
    var Recipient: String
    
    /**
      * To get the subject of a simple mail message.
      * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
      */
    var Subject: String
    
    /**
      * To get the attachment of a simple mail message.
      * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
      */
    def getAttachement(): SafeArray[String]
    
    /**
      * To get the BCC recipients of a simple mail message.
      * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
      */
    def getBccRecipient(): SafeArray[String]
    
    /**
      * To get the cc recipients of a simple mail message.
      * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
      */
    def getCcRecipient(): SafeArray[String]
    
    /**
      * To get the email address of the originator of a simple mail message.
      * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
      */
    def getOriginator(): String
    
    /**
      * To get the recipient of the simple mail message.
      * @returns The specified email address of a recipient if any has been specified or an empty string.
      */
    def getRecipient(): String
    
    /**
      * To get the subject of a simple mail message.
      * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
      */
    def getSubject(): String
    
    /**
      * To set an attachment of a simple mail message.
      * @param aAttachement Sets a sequence of file URLs specifying the files that should be attached to the mail. The given file URLs must conform to [Rfc1738]
      * @throws com::sun::star::lang::IllegalArgumentException if at least one of the given file URLs is invalid (doesn't conform to [Rfc1738]{@link url="http://
      */
    def setAttachement(aAttachement: SeqEquiv[String]): Unit
    
    /**
      * To set the BCC recipient of a simple mail message.
      * @param aBccRecipient A sequence with the email addresses of one or more BCC recipients. An empty sequence means there are no BCC recipients.
      */
    def setBccRecipient(aBccRecipient: SeqEquiv[String]): Unit
    
    /**
      * To set the cc recipients of a simple mail message.
      * @param aCcRecipient Sets a sequence with the email addresses of one or more cc recipients. The method does not check if the given addresses are valid. A
      */
    def setCcRecipient(aCcRecipient: SeqEquiv[String]): Unit
    
    /**
      * To set the email address of the originator of a simple mail message.
      * @param aOriginator Sets the email address of the originator of the mail.
      */
    def setOriginator(aOriginator: String): Unit
    
    /**
      * To set the recipient of the simple mail message.
      * @param aRecipient The email address of a recipient. The method doesn't check if the given email address is valid.
      */
    def setRecipient(aRecipient: String): Unit
    
    /**
      * To set the subject of a simple mail message.
      * @param aSubject Sets the subject of the simple mail message.
      */
    def setSubject(aSubject: String): Unit
  }
  object XSimpleMailMessage {
    
    inline def apply(
      Attachement: SafeArray[String],
      BccRecipient: SafeArray[String],
      CcRecipient: SafeArray[String],
      Originator: String,
      Recipient: String,
      Subject: String,
      acquire: Callback,
      getAttachement: CallbackTo[SafeArray[String]],
      getBccRecipient: CallbackTo[SafeArray[String]],
      getCcRecipient: CallbackTo[SafeArray[String]],
      getOriginator: CallbackTo[String],
      getRecipient: CallbackTo[String],
      getSubject: CallbackTo[String],
      queryInterface: `type` => Any,
      release: Callback,
      setAttachement: SeqEquiv[String] => Callback,
      setBccRecipient: SeqEquiv[String] => Callback,
      setCcRecipient: SeqEquiv[String] => Callback,
      setOriginator: String => Callback,
      setRecipient: String => Callback,
      setSubject: String => Callback
    ): XSimpleMailMessage = {
      val __obj = js.Dynamic.literal(Attachement = Attachement.asInstanceOf[js.Any], BccRecipient = BccRecipient.asInstanceOf[js.Any], CcRecipient = CcRecipient.asInstanceOf[js.Any], Originator = Originator.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAttachement = getAttachement.toJsFn, getBccRecipient = getBccRecipient.toJsFn, getCcRecipient = getCcRecipient.toJsFn, getOriginator = getOriginator.toJsFn, getRecipient = getRecipient.toJsFn, getSubject = getSubject.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAttachement = js.Any.fromFunction1((t0: SeqEquiv[String]) => setAttachement(t0).runNow()), setBccRecipient = js.Any.fromFunction1((t0: SeqEquiv[String]) => setBccRecipient(t0).runNow()), setCcRecipient = js.Any.fromFunction1((t0: SeqEquiv[String]) => setCcRecipient(t0).runNow()), setOriginator = js.Any.fromFunction1((t0: String) => setOriginator(t0).runNow()), setRecipient = js.Any.fromFunction1((t0: String) => setRecipient(t0).runNow()), setSubject = js.Any.fromFunction1((t0: String) => setSubject(t0).runNow()))
      __obj.asInstanceOf[XSimpleMailMessage]
    }
    
    extension [Self <: XSimpleMailMessage](x: Self) {
      
      inline def setAttachement(value: SafeArray[String]): Self = StObject.set(x, "Attachement", value.asInstanceOf[js.Any])
      
      inline def setBccRecipient(value: SafeArray[String]): Self = StObject.set(x, "BccRecipient", value.asInstanceOf[js.Any])
      
      inline def setCcRecipient(value: SafeArray[String]): Self = StObject.set(x, "CcRecipient", value.asInstanceOf[js.Any])
      
      inline def setGetAttachement(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getAttachement", value.toJsFn)
      
      inline def setGetBccRecipient(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getBccRecipient", value.toJsFn)
      
      inline def setGetCcRecipient(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getCcRecipient", value.toJsFn)
      
      inline def setGetOriginator(value: CallbackTo[String]): Self = StObject.set(x, "getOriginator", value.toJsFn)
      
      inline def setGetRecipient(value: CallbackTo[String]): Self = StObject.set(x, "getRecipient", value.toJsFn)
      
      inline def setGetSubject(value: CallbackTo[String]): Self = StObject.set(x, "getSubject", value.toJsFn)
      
      inline def setOriginator(value: String): Self = StObject.set(x, "Originator", value.asInstanceOf[js.Any])
      
      inline def setRecipient(value: String): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
      
      inline def setSetAttachement(value: SeqEquiv[String] => Callback): Self = StObject.set(x, "setAttachement", js.Any.fromFunction1((t0: SeqEquiv[String]) => value(t0).runNow()))
      
      inline def setSetBccRecipient(value: SeqEquiv[String] => Callback): Self = StObject.set(x, "setBccRecipient", js.Any.fromFunction1((t0: SeqEquiv[String]) => value(t0).runNow()))
      
      inline def setSetCcRecipient(value: SeqEquiv[String] => Callback): Self = StObject.set(x, "setCcRecipient", js.Any.fromFunction1((t0: SeqEquiv[String]) => value(t0).runNow()))
      
      inline def setSetOriginator(value: String => Callback): Self = StObject.set(x, "setOriginator", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetRecipient(value: String => Callback): Self = StObject.set(x, "setRecipient", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetSubject(value: String => Callback): Self = StObject.set(x, "setSubject", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This interface extends {@link XSimpleMailMessage}
    * @since LibreOffice 4.2
    */
  trait XSimpleMailMessage2
    extends StObject
       with XSimpleMailMessage {
    
    var Body: String
  }
  object XSimpleMailMessage2 {
    
    inline def apply(
      Attachement: SafeArray[String],
      BccRecipient: SafeArray[String],
      Body: String,
      CcRecipient: SafeArray[String],
      Originator: String,
      Recipient: String,
      Subject: String,
      acquire: Callback,
      getAttachement: CallbackTo[SafeArray[String]],
      getBccRecipient: CallbackTo[SafeArray[String]],
      getCcRecipient: CallbackTo[SafeArray[String]],
      getOriginator: CallbackTo[String],
      getRecipient: CallbackTo[String],
      getSubject: CallbackTo[String],
      queryInterface: `type` => Any,
      release: Callback,
      setAttachement: SeqEquiv[String] => Callback,
      setBccRecipient: SeqEquiv[String] => Callback,
      setCcRecipient: SeqEquiv[String] => Callback,
      setOriginator: String => Callback,
      setRecipient: String => Callback,
      setSubject: String => Callback
    ): XSimpleMailMessage2 = {
      val __obj = js.Dynamic.literal(Attachement = Attachement.asInstanceOf[js.Any], BccRecipient = BccRecipient.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], CcRecipient = CcRecipient.asInstanceOf[js.Any], Originator = Originator.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAttachement = getAttachement.toJsFn, getBccRecipient = getBccRecipient.toJsFn, getCcRecipient = getCcRecipient.toJsFn, getOriginator = getOriginator.toJsFn, getRecipient = getRecipient.toJsFn, getSubject = getSubject.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAttachement = js.Any.fromFunction1((t0: SeqEquiv[String]) => setAttachement(t0).runNow()), setBccRecipient = js.Any.fromFunction1((t0: SeqEquiv[String]) => setBccRecipient(t0).runNow()), setCcRecipient = js.Any.fromFunction1((t0: SeqEquiv[String]) => setCcRecipient(t0).runNow()), setOriginator = js.Any.fromFunction1((t0: String) => setOriginator(t0).runNow()), setRecipient = js.Any.fromFunction1((t0: String) => setRecipient(t0).runNow()), setSubject = js.Any.fromFunction1((t0: String) => setSubject(t0).runNow()))
      __obj.asInstanceOf[XSimpleMailMessage2]
    }
    
    extension [Self <: XSimpleMailMessage2](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    }
  }
  
  /** Specifies an interface for executing a system command. */
  trait XSystemShellExecute
    extends StObject
       with XInterface {
    
    /**
      * Executes an arbitrary system command.
      * @param aCommand Specifies the command to execute. This may be an executable file or a document which is registered with an application on a specific pla
      * @param aParameter Specifies a list of space separated parameters. The method does not validate the given parameters, but only passes it as a parameter t
      * @param nFlags Specifies different flags to control the execution of this method, for example, avoid showing system error messages, in case of failures, etc.
      * @see com.sun.star.system.SystemShellExecuteFlags
      * @throws com::sun::star::lang::IllegalArgumentException when the specified flags are wrong or exclude each other; also thrown, with an ArgumentPosition of
      * @throws com::sun::star::system::SystemShellExecuteException in the case of errors when trying to executed the specified command.
      */
    def execute(aCommand: String, aParameter: String, nFlags: Double): Unit
  }
  object XSystemShellExecute {
    
    inline def apply(
      acquire: Callback,
      execute: (String, String, Double) => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XSystemShellExecute = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, execute = js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (execute(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XSystemShellExecute]
    }
    
    extension [Self <: XSystemShellExecute](x: Self) {
      
      inline def setExecute(value: (String, String, Double) => Callback): Self = StObject.set(x, "execute", js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (value(t0, t1, t2)).runNow()))
    }
  }
}
