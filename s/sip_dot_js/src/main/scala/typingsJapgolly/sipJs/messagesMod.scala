package typingsJapgolly.sipJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sipJs.bodyMod.Body
import typingsJapgolly.sipJs.logMod.LoggerFactory
import typingsJapgolly.sipJs.loggerMod.Logger
import typingsJapgolly.sipJs.outgoingRequestMessageMod.OutgoingRequestMessageOptions
import typingsJapgolly.sipJs.outgoingResponseMod.OutgoingResponse
import typingsJapgolly.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages", JSImport.Namespace)
@js.native
object messagesMod extends js.Object {
  @js.native
  class DigestAuthentication protected ()
    extends typingsJapgolly.sipJs.digestAuthenticationMod.DigestAuthentication {
    def this(loggerFactory: LoggerFactory) = this()
    def this(loggerFactory: LoggerFactory, username: String) = this()
    def this(loggerFactory: LoggerFactory, username: js.UndefOr[scala.Nothing], password: String) = this()
    /**
      * Constructor.
      * @param loggerFactory - LoggerFactory.
      * @param username - Username.
      * @param password - Password.
      */
    def this(loggerFactory: LoggerFactory, username: String, password: String) = this()
  }
  
  @js.native
  class IncomingMessage ()
    extends typingsJapgolly.sipJs.incomingMessageMod.IncomingMessage
  
  @js.native
  class IncomingRequestMessage ()
    extends typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage
  
  @js.native
  class IncomingResponseMessage ()
    extends typingsJapgolly.sipJs.incomingResponseMessageMod.IncomingResponseMessage
  
  @js.native
  class NameAddrHeader protected ()
    extends typingsJapgolly.sipJs.nameAddrHeaderMod.NameAddrHeader {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(uri: typingsJapgolly.sipJs.uriMod.URI, displayName: String, parameters: StringDictionary[String]) = this()
  }
  
  @js.native
  class OutgoingRequestMessage protected ()
    extends typingsJapgolly.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage {
    def this(
      method: String,
      ruri: typingsJapgolly.sipJs.uriMod.URI,
      fromURI: typingsJapgolly.sipJs.uriMod.URI,
      toURI: typingsJapgolly.sipJs.uriMod.URI
    ) = this()
    def this(
      method: String,
      ruri: typingsJapgolly.sipJs.uriMod.URI,
      fromURI: typingsJapgolly.sipJs.uriMod.URI,
      toURI: typingsJapgolly.sipJs.uriMod.URI,
      options: OutgoingRequestMessageOptions
    ) = this()
    def this(
      method: String,
      ruri: typingsJapgolly.sipJs.uriMod.URI,
      fromURI: typingsJapgolly.sipJs.uriMod.URI,
      toURI: typingsJapgolly.sipJs.uriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: typingsJapgolly.sipJs.uriMod.URI,
      fromURI: typingsJapgolly.sipJs.uriMod.URI,
      toURI: typingsJapgolly.sipJs.uriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
  }
  
  @js.native
  class Parameters protected ()
    extends typingsJapgolly.sipJs.parametersMod.Parameters {
    def this(parameters: StringDictionary[String]) = this()
  }
  
  @js.native
  class URI protected ()
    extends typingsJapgolly.sipJs.uriMod.URI {
    /**
      * Constructor
      * @param scheme -
      * @param user -
      * @param host -
      * @param port -
      * @param parameters -
      * @param headers -
      */
    def this(scheme: String, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any, headers: js.Any) = this()
  }
  
  def constructOutgoingResponse(
    message: typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: String): Body = js.native
  def fromBodyLegacy(bodyLegacy: AnonBody): Body = js.native
  def getBody(message: Body): js.UndefOr[Body] = js.native
  def getBody(message: typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def getBody(message: typingsJapgolly.sipJs.incomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[Body] = js.native
  def getBody(message: typingsJapgolly.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = js.native
  @js.native
  object C extends js.Object {
    val ACK: typingsJapgolly.sipJs.sipJsStrings.ACK = js.native
    val BYE: typingsJapgolly.sipJs.sipJsStrings.BYE = js.native
    val CANCEL: typingsJapgolly.sipJs.sipJsStrings.CANCEL = js.native
    val INFO: typingsJapgolly.sipJs.sipJsStrings.INFO = js.native
    val INVITE: typingsJapgolly.sipJs.sipJsStrings.INVITE = js.native
    val MESSAGE: typingsJapgolly.sipJs.sipJsStrings.MESSAGE = js.native
    val NOTIFY: typingsJapgolly.sipJs.sipJsStrings.NOTIFY = js.native
    val OPTIONS: typingsJapgolly.sipJs.sipJsStrings.OPTIONS = js.native
    val PRACK: typingsJapgolly.sipJs.sipJsStrings.PRACK = js.native
    val PUBLISH: typingsJapgolly.sipJs.sipJsStrings.PUBLISH = js.native
    val REFER: typingsJapgolly.sipJs.sipJsStrings.REFER = js.native
    val REGISTER: typingsJapgolly.sipJs.sipJsStrings.REGISTER = js.native
    val SUBSCRIBE: typingsJapgolly.sipJs.sipJsStrings.SUBSCRIBE = js.native
    val UPDATE: typingsJapgolly.sipJs.sipJsStrings.UPDATE = js.native
  }
  
  @js.native
  object Grammar extends js.Object {
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    def URIParse(uri: String): js.UndefOr[typingsJapgolly.sipJs.uriMod.URI] = js.native
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typingsJapgolly.sipJs.nameAddrHeaderMod.NameAddrHeader] = js.native
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    def parse(input: String, startRule: String): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object OutgoingRequestMessage extends js.Object {
    /** Get a copy of the default options. */
    var getDefaultOptions: js.Any = js.native
    var makeNameAddrHeader: js.Any = js.native
  }
  
  @js.native
  object Parser extends js.Object {
    def getHeader(data: js.Any, headerStart: Double): Double = js.native
    def parseHeader(
      message: typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
      data: js.Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | AnonError = js.native
    def parseHeader(
      message: typingsJapgolly.sipJs.incomingResponseMessageMod.IncomingResponseMessage,
      data: js.Any,
      headerStart: Double,
      headerEnd: Double
    ): Boolean | AnonError = js.native
    def parseMessage(data: String, logger: Logger): js.UndefOr[
        typingsJapgolly.sipJs.incomingRequestMessageMod.IncomingRequestMessage | typingsJapgolly.sipJs.incomingResponseMessageMod.IncomingResponseMessage
      ] = js.native
  }
  
}

