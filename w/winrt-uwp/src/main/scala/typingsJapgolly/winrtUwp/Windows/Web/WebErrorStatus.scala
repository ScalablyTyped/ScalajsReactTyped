package typingsJapgolly.winrtUwp.Windows.Web

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebErrorStatus extends js.Object

/** Defines errors encountered during operations involving web services, such as authentication, proxy configuration, and destination URIs. */
@JSGlobal("Windows.Web.WebErrorStatus")
@js.native
object WebErrorStatus extends js.Object {
  /** The server was acting as a gateway or proxy and received an invalid response from the upstream server. */
  @js.native
  sealed trait badGateway extends WebErrorStatus
  
  /** The request cannot be fulfilled due to bad syntax. */
  @js.native
  sealed trait badRequest extends WebErrorStatus
  
  /** Cannot connect to destination. */
  @js.native
  sealed trait cannotConnect extends WebErrorStatus
  
  /** The SSL certificate common name does not match the web address. */
  @js.native
  sealed trait certificateCommonNameIsIncorrect extends WebErrorStatus
  
  /** The SSL certificate contains errors. */
  @js.native
  sealed trait certificateContainsErrors extends WebErrorStatus
  
  /** The SSL certificate has expired. */
  @js.native
  sealed trait certificateExpired extends WebErrorStatus
  
  /** The SSL certificate is invalid. */
  @js.native
  sealed trait certificateIsInvalid extends WebErrorStatus
  
  /** The SSL certificate has been revoked. */
  @js.native
  sealed trait certificateRevoked extends WebErrorStatus
  
  /** Indicates that the request could not be processed because of conflict in the request. */
  @js.native
  sealed trait conflict extends WebErrorStatus
  
  /** The connection was aborted. */
  @js.native
  sealed trait connectionAborted extends WebErrorStatus
  
  /** The connection was reset. */
  @js.native
  sealed trait connectionReset extends WebErrorStatus
  
  /** The connection was ended. */
  @js.native
  sealed trait disconnected extends WebErrorStatus
  
  /** The server returned an invalid or unrecognized response. */
  @js.native
  sealed trait errorHttpInvalidServerResponse extends WebErrorStatus
  
  /** The server cannot meet the requirements of the Expect request-header field. */
  @js.native
  sealed trait expectationFailed extends WebErrorStatus
  
  /** The server has refused the request. */
  @js.native
  sealed trait forbidden extends WebErrorStatus
  
  /** The resource was found but is available in a location different from the one included in the request. */
  @js.native
  sealed trait found extends WebErrorStatus
  
  /** The server was acting as a gateway or proxy and did not receive a timely response from the upstream server. */
  @js.native
  sealed trait gatewayTimeout extends WebErrorStatus
  
  /** Indicates that the resource requested is no longer available and will not be available again. */
  @js.native
  sealed trait gone extends WebErrorStatus
  
  /** Could not resolve provided host name. */
  @js.native
  sealed trait hostNameNotResolved extends WebErrorStatus
  
  /** Redirected from a location to a secure location. */
  @js.native
  sealed trait httpToHttpsOnRedirection extends WebErrorStatus
  
  /** The server does not support the HTTP protocol version used in the request. */
  @js.native
  sealed trait httpVersionNotSupported extends WebErrorStatus
  
  /** Redirected from a secure location to an unsecure location. */
  @js.native
  sealed trait httpsToHttpOnRedirection extends WebErrorStatus
  
  /** A generic error message, given when no more specific message is suitable. */
  @js.native
  sealed trait internalServerError extends WebErrorStatus
  
  /** The request did not specify the length of its content, which is required by the requested resource. */
  @js.native
  sealed trait lengthRequired extends WebErrorStatus
  
  /** A request was made of a resource using a request method not supported by that resource. */
  @js.native
  sealed trait methodNotAllowed extends WebErrorStatus
  
  /** This and all future requests should be directed to the given URI. */
  @js.native
  sealed trait movedPermanently extends WebErrorStatus
  
  /** The requested URL represents a high level grouping of which lower level selections need to be made. */
  @js.native
  sealed trait multipleChoices extends WebErrorStatus
  
  /** The requested resource is only capable of generating content not acceptable according to the Accept headers sent in the request. */
  @js.native
  sealed trait notAcceptable extends WebErrorStatus
  
  /** The requested resource could not be found but may be available again in the future. */
  @js.native
  sealed trait notFound extends WebErrorStatus
  
  /** The server either does not recognize the request method, or it lacks the ability to fulfill the request. */
  @js.native
  sealed trait notImplemented extends WebErrorStatus
  
  /** Indicates the resource has not been modified since last requested. */
  @js.native
  sealed trait notModified extends WebErrorStatus
  
  /** The operation was canceled. */
  @js.native
  sealed trait operationCanceled extends WebErrorStatus
  
  /** Reserved. */
  @js.native
  sealed trait paymentRequired extends WebErrorStatus
  
  /** The server does not meet one of the preconditions that the requester put on the request. */
  @js.native
  sealed trait preconditionFailed extends WebErrorStatus
  
  /** The client must first authenticate itself with the proxy. */
  @js.native
  sealed trait proxyAuthenticationRequired extends WebErrorStatus
  
  /** The request redirect failed. */
  @js.native
  sealed trait redirectFailed extends WebErrorStatus
  
  /** The request is larger than the server is willing or able to process. */
  @js.native
  sealed trait requestEntityTooLarge extends WebErrorStatus
  
  /** The server timed out waiting for the request. */
  @js.native
  sealed trait requestTimeout extends WebErrorStatus
  
  /** Provided URI length exceeds the maximum length the server can process. */
  @js.native
  sealed trait requestUriTooLong extends WebErrorStatus
  
  /** The client has asked for a portion of the file, but the server cannot supply that portion. */
  @js.native
  sealed trait requestedRangeNotSatisfiable extends WebErrorStatus
  
  /** The response to the request can be found under another URI using a GET method. */
  @js.native
  sealed trait seeOther extends WebErrorStatus
  
  /** The server is not responding. */
  @js.native
  sealed trait serverUnreachable extends WebErrorStatus
  
  /** The server is currently unavailable. */
  @js.native
  sealed trait serviceUnavailable extends WebErrorStatus
  
  /** The requested resource resides temporarily under a different URI. */
  @js.native
  sealed trait temporaryRedirect extends WebErrorStatus
  
  /** The connection has timed out. */
  @js.native
  sealed trait timeout extends WebErrorStatus
  
  /** Authentication has failed or credentials have not yet been provided. */
  @js.native
  sealed trait unauthorized extends WebErrorStatus
  
  /** An unexpected client-side error has occurred. */
  @js.native
  sealed trait unexpectedClientError extends WebErrorStatus
  
  /** A request was unexpectedly redirected. */
  @js.native
  sealed trait unexpectedRedirection extends WebErrorStatus
  
  /** An unexpected server-side error has occurred. */
  @js.native
  sealed trait unexpectedServerError extends WebErrorStatus
  
  /** An unexpected status code indicating a failure was received. */
  @js.native
  sealed trait unexpectedStatusCode extends WebErrorStatus
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknown extends WebErrorStatus
  
  /** The request entity has a media type which the server or resource does not support. */
  @js.native
  sealed trait unsupportedMediaType extends WebErrorStatus
  
  /** The requested resource must be accessed through the proxy given by the Location field. */
  @js.native
  sealed trait useProxy extends WebErrorStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebErrorStatus with Double] = js.native
  /* 49 */ @js.native
  object badGateway extends TopLevel[badGateway with Double]
  
  /* 29 */ @js.native
  object badRequest extends TopLevel[badRequest with Double]
  
  /* 14 */ @js.native
  object cannotConnect extends TopLevel[cannotConnect with Double]
  
  /* 1 */ @js.native
  object certificateCommonNameIsIncorrect extends TopLevel[certificateCommonNameIsIncorrect with Double]
  
  /* 3 */ @js.native
  object certificateContainsErrors extends TopLevel[certificateContainsErrors with Double]
  
  /* 2 */ @js.native
  object certificateExpired extends TopLevel[certificateExpired with Double]
  
  /* 5 */ @js.native
  object certificateIsInvalid extends TopLevel[certificateIsInvalid with Double]
  
  /* 4 */ @js.native
  object certificateRevoked extends TopLevel[certificateRevoked with Double]
  
  /* 38 */ @js.native
  object conflict extends TopLevel[conflict with Double]
  
  /* 9 */ @js.native
  object connectionAborted extends TopLevel[connectionAborted with Double]
  
  /* 10 */ @js.native
  object connectionReset extends TopLevel[connectionReset with Double]
  
  /* 11 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  /* 8 */ @js.native
  object errorHttpInvalidServerResponse extends TopLevel[errorHttpInvalidServerResponse with Double]
  
  /* 46 */ @js.native
  object expectationFailed extends TopLevel[expectationFailed with Double]
  
  /* 32 */ @js.native
  object forbidden extends TopLevel[forbidden with Double]
  
  /* 24 */ @js.native
  object found extends TopLevel[found with Double]
  
  /* 51 */ @js.native
  object gatewayTimeout extends TopLevel[gatewayTimeout with Double]
  
  /* 39 */ @js.native
  object gone extends TopLevel[gone with Double]
  
  /* 15 */ @js.native
  object hostNameNotResolved extends TopLevel[hostNameNotResolved with Double]
  
  /* 12 */ @js.native
  object httpToHttpsOnRedirection extends TopLevel[httpToHttpsOnRedirection with Double]
  
  /* 52 */ @js.native
  object httpVersionNotSupported extends TopLevel[httpVersionNotSupported with Double]
  
  /* 13 */ @js.native
  object httpsToHttpOnRedirection extends TopLevel[httpsToHttpOnRedirection with Double]
  
  /* 47 */ @js.native
  object internalServerError extends TopLevel[internalServerError with Double]
  
  /* 40 */ @js.native
  object lengthRequired extends TopLevel[lengthRequired with Double]
  
  /* 34 */ @js.native
  object methodNotAllowed extends TopLevel[methodNotAllowed with Double]
  
  /* 23 */ @js.native
  object movedPermanently extends TopLevel[movedPermanently with Double]
  
  /* 22 */ @js.native
  object multipleChoices extends TopLevel[multipleChoices with Double]
  
  /* 35 */ @js.native
  object notAcceptable extends TopLevel[notAcceptable with Double]
  
  /* 33 */ @js.native
  object notFound extends TopLevel[notFound with Double]
  
  /* 48 */ @js.native
  object notImplemented extends TopLevel[notImplemented with Double]
  
  /* 26 */ @js.native
  object notModified extends TopLevel[notModified with Double]
  
  /* 16 */ @js.native
  object operationCanceled extends TopLevel[operationCanceled with Double]
  
  /* 31 */ @js.native
  object paymentRequired extends TopLevel[paymentRequired with Double]
  
  /* 41 */ @js.native
  object preconditionFailed extends TopLevel[preconditionFailed with Double]
  
  /* 36 */ @js.native
  object proxyAuthenticationRequired extends TopLevel[proxyAuthenticationRequired with Double]
  
  /* 17 */ @js.native
  object redirectFailed extends TopLevel[redirectFailed with Double]
  
  /* 42 */ @js.native
  object requestEntityTooLarge extends TopLevel[requestEntityTooLarge with Double]
  
  /* 37 */ @js.native
  object requestTimeout extends TopLevel[requestTimeout with Double]
  
  /* 43 */ @js.native
  object requestUriTooLong extends TopLevel[requestUriTooLong with Double]
  
  /* 45 */ @js.native
  object requestedRangeNotSatisfiable extends TopLevel[requestedRangeNotSatisfiable with Double]
  
  /* 25 */ @js.native
  object seeOther extends TopLevel[seeOther with Double]
  
  /* 6 */ @js.native
  object serverUnreachable extends TopLevel[serverUnreachable with Double]
  
  /* 50 */ @js.native
  object serviceUnavailable extends TopLevel[serviceUnavailable with Double]
  
  /* 28 */ @js.native
  object temporaryRedirect extends TopLevel[temporaryRedirect with Double]
  
  /* 7 */ @js.native
  object timeout extends TopLevel[timeout with Double]
  
  /* 30 */ @js.native
  object unauthorized extends TopLevel[unauthorized with Double]
  
  /* 20 */ @js.native
  object unexpectedClientError extends TopLevel[unexpectedClientError with Double]
  
  /* 19 */ @js.native
  object unexpectedRedirection extends TopLevel[unexpectedRedirection with Double]
  
  /* 21 */ @js.native
  object unexpectedServerError extends TopLevel[unexpectedServerError with Double]
  
  /* 18 */ @js.native
  object unexpectedStatusCode extends TopLevel[unexpectedStatusCode with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 44 */ @js.native
  object unsupportedMediaType extends TopLevel[unsupportedMediaType with Double]
  
  /* 27 */ @js.native
  object useProxy extends TopLevel[useProxy with Double]
  
}

