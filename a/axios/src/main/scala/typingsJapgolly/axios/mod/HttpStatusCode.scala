package typingsJapgolly.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpStatusCode extends StObject
@JSImport("axios", "HttpStatusCode")
@js.native
object HttpStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpStatusCode & Double] = js.native
  
  @js.native
  sealed trait Accepted
    extends StObject
       with HttpStatusCode
  /* 202 */ val Accepted: typingsJapgolly.axios.mod.HttpStatusCode.Accepted & Double = js.native
  
  @js.native
  sealed trait AlreadyReported
    extends StObject
       with HttpStatusCode
  /* 208 */ val AlreadyReported: typingsJapgolly.axios.mod.HttpStatusCode.AlreadyReported & Double = js.native
  
  @js.native
  sealed trait BadGateway
    extends StObject
       with HttpStatusCode
  /* 502 */ val BadGateway: typingsJapgolly.axios.mod.HttpStatusCode.BadGateway & Double = js.native
  
  @js.native
  sealed trait BadRequest
    extends StObject
       with HttpStatusCode
  /* 400 */ val BadRequest: typingsJapgolly.axios.mod.HttpStatusCode.BadRequest & Double = js.native
  
  @js.native
  sealed trait Conflict
    extends StObject
       with HttpStatusCode
  /* 409 */ val Conflict: typingsJapgolly.axios.mod.HttpStatusCode.Conflict & Double = js.native
  
  @js.native
  sealed trait Continue
    extends StObject
       with HttpStatusCode
  /* 100 */ val Continue: typingsJapgolly.axios.mod.HttpStatusCode.Continue & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with HttpStatusCode
  /* 201 */ val Created: typingsJapgolly.axios.mod.HttpStatusCode.Created & Double = js.native
  
  @js.native
  sealed trait EarlyHints
    extends StObject
       with HttpStatusCode
  /* 103 */ val EarlyHints: typingsJapgolly.axios.mod.HttpStatusCode.EarlyHints & Double = js.native
  
  @js.native
  sealed trait ExpectationFailed
    extends StObject
       with HttpStatusCode
  /* 417 */ val ExpectationFailed: typingsJapgolly.axios.mod.HttpStatusCode.ExpectationFailed & Double = js.native
  
  @js.native
  sealed trait FailedDependency
    extends StObject
       with HttpStatusCode
  /* 424 */ val FailedDependency: typingsJapgolly.axios.mod.HttpStatusCode.FailedDependency & Double = js.native
  
  @js.native
  sealed trait Forbidden
    extends StObject
       with HttpStatusCode
  /* 403 */ val Forbidden: typingsJapgolly.axios.mod.HttpStatusCode.Forbidden & Double = js.native
  
  @js.native
  sealed trait Found
    extends StObject
       with HttpStatusCode
  /* 302 */ val Found: typingsJapgolly.axios.mod.HttpStatusCode.Found & Double = js.native
  
  @js.native
  sealed trait GatewayTimeout
    extends StObject
       with HttpStatusCode
  /* 504 */ val GatewayTimeout: typingsJapgolly.axios.mod.HttpStatusCode.GatewayTimeout & Double = js.native
  
  @js.native
  sealed trait Gone
    extends StObject
       with HttpStatusCode
  /* 410 */ val Gone: typingsJapgolly.axios.mod.HttpStatusCode.Gone & Double = js.native
  
  @js.native
  sealed trait HttpVersionNotSupported
    extends StObject
       with HttpStatusCode
  /* 505 */ val HttpVersionNotSupported: typingsJapgolly.axios.mod.HttpStatusCode.HttpVersionNotSupported & Double = js.native
  
  @js.native
  sealed trait ImATeapot
    extends StObject
       with HttpStatusCode
  /* 418 */ val ImATeapot: typingsJapgolly.axios.mod.HttpStatusCode.ImATeapot & Double = js.native
  
  @js.native
  sealed trait ImUsed
    extends StObject
       with HttpStatusCode
  /* 226 */ val ImUsed: typingsJapgolly.axios.mod.HttpStatusCode.ImUsed & Double = js.native
  
  @js.native
  sealed trait InsufficientStorage
    extends StObject
       with HttpStatusCode
  /* 507 */ val InsufficientStorage: typingsJapgolly.axios.mod.HttpStatusCode.InsufficientStorage & Double = js.native
  
  @js.native
  sealed trait InternalServerError
    extends StObject
       with HttpStatusCode
  /* 500 */ val InternalServerError: typingsJapgolly.axios.mod.HttpStatusCode.InternalServerError & Double = js.native
  
  @js.native
  sealed trait LengthRequired
    extends StObject
       with HttpStatusCode
  /* 411 */ val LengthRequired: typingsJapgolly.axios.mod.HttpStatusCode.LengthRequired & Double = js.native
  
  @js.native
  sealed trait Locked
    extends StObject
       with HttpStatusCode
  /* 423 */ val Locked: typingsJapgolly.axios.mod.HttpStatusCode.Locked & Double = js.native
  
  @js.native
  sealed trait LoopDetected
    extends StObject
       with HttpStatusCode
  /* 508 */ val LoopDetected: typingsJapgolly.axios.mod.HttpStatusCode.LoopDetected & Double = js.native
  
  @js.native
  sealed trait MethodNotAllowed
    extends StObject
       with HttpStatusCode
  /* 405 */ val MethodNotAllowed: typingsJapgolly.axios.mod.HttpStatusCode.MethodNotAllowed & Double = js.native
  
  @js.native
  sealed trait MisdirectedRequest
    extends StObject
       with HttpStatusCode
  /* 421 */ val MisdirectedRequest: typingsJapgolly.axios.mod.HttpStatusCode.MisdirectedRequest & Double = js.native
  
  @js.native
  sealed trait MovedPermanently
    extends StObject
       with HttpStatusCode
  /* 301 */ val MovedPermanently: typingsJapgolly.axios.mod.HttpStatusCode.MovedPermanently & Double = js.native
  
  @js.native
  sealed trait MultiStatus
    extends StObject
       with HttpStatusCode
  /* 207 */ val MultiStatus: typingsJapgolly.axios.mod.HttpStatusCode.MultiStatus & Double = js.native
  
  @js.native
  sealed trait MultipleChoices
    extends StObject
       with HttpStatusCode
  /* 300 */ val MultipleChoices: typingsJapgolly.axios.mod.HttpStatusCode.MultipleChoices & Double = js.native
  
  @js.native
  sealed trait NetworkAuthenticationRequired
    extends StObject
       with HttpStatusCode
  /* 511 */ val NetworkAuthenticationRequired: typingsJapgolly.axios.mod.HttpStatusCode.NetworkAuthenticationRequired & Double = js.native
  
  @js.native
  sealed trait NoContent
    extends StObject
       with HttpStatusCode
  /* 204 */ val NoContent: typingsJapgolly.axios.mod.HttpStatusCode.NoContent & Double = js.native
  
  @js.native
  sealed trait NonAuthoritativeInformation
    extends StObject
       with HttpStatusCode
  /* 203 */ val NonAuthoritativeInformation: typingsJapgolly.axios.mod.HttpStatusCode.NonAuthoritativeInformation & Double = js.native
  
  @js.native
  sealed trait NotAcceptable
    extends StObject
       with HttpStatusCode
  /* 406 */ val NotAcceptable: typingsJapgolly.axios.mod.HttpStatusCode.NotAcceptable & Double = js.native
  
  @js.native
  sealed trait NotExtended
    extends StObject
       with HttpStatusCode
  /* 510 */ val NotExtended: typingsJapgolly.axios.mod.HttpStatusCode.NotExtended & Double = js.native
  
  @js.native
  sealed trait NotFound
    extends StObject
       with HttpStatusCode
  /* 404 */ val NotFound: typingsJapgolly.axios.mod.HttpStatusCode.NotFound & Double = js.native
  
  @js.native
  sealed trait NotImplemented
    extends StObject
       with HttpStatusCode
  /* 501 */ val NotImplemented: typingsJapgolly.axios.mod.HttpStatusCode.NotImplemented & Double = js.native
  
  @js.native
  sealed trait NotModified
    extends StObject
       with HttpStatusCode
  /* 304 */ val NotModified: typingsJapgolly.axios.mod.HttpStatusCode.NotModified & Double = js.native
  
  @js.native
  sealed trait Ok
    extends StObject
       with HttpStatusCode
  /* 200 */ val Ok: typingsJapgolly.axios.mod.HttpStatusCode.Ok & Double = js.native
  
  @js.native
  sealed trait PartialContent
    extends StObject
       with HttpStatusCode
  /* 206 */ val PartialContent: typingsJapgolly.axios.mod.HttpStatusCode.PartialContent & Double = js.native
  
  @js.native
  sealed trait PayloadTooLarge
    extends StObject
       with HttpStatusCode
  /* 413 */ val PayloadTooLarge: typingsJapgolly.axios.mod.HttpStatusCode.PayloadTooLarge & Double = js.native
  
  @js.native
  sealed trait PaymentRequired
    extends StObject
       with HttpStatusCode
  /* 402 */ val PaymentRequired: typingsJapgolly.axios.mod.HttpStatusCode.PaymentRequired & Double = js.native
  
  @js.native
  sealed trait PermanentRedirect
    extends StObject
       with HttpStatusCode
  /* 308 */ val PermanentRedirect: typingsJapgolly.axios.mod.HttpStatusCode.PermanentRedirect & Double = js.native
  
  @js.native
  sealed trait PreconditionFailed
    extends StObject
       with HttpStatusCode
  /* 412 */ val PreconditionFailed: typingsJapgolly.axios.mod.HttpStatusCode.PreconditionFailed & Double = js.native
  
  @js.native
  sealed trait PreconditionRequired
    extends StObject
       with HttpStatusCode
  /* 428 */ val PreconditionRequired: typingsJapgolly.axios.mod.HttpStatusCode.PreconditionRequired & Double = js.native
  
  @js.native
  sealed trait Processing
    extends StObject
       with HttpStatusCode
  /* 102 */ val Processing: typingsJapgolly.axios.mod.HttpStatusCode.Processing & Double = js.native
  
  @js.native
  sealed trait ProxyAuthenticationRequired
    extends StObject
       with HttpStatusCode
  /* 407 */ val ProxyAuthenticationRequired: typingsJapgolly.axios.mod.HttpStatusCode.ProxyAuthenticationRequired & Double = js.native
  
  @js.native
  sealed trait RangeNotSatisfiable
    extends StObject
       with HttpStatusCode
  /* 416 */ val RangeNotSatisfiable: typingsJapgolly.axios.mod.HttpStatusCode.RangeNotSatisfiable & Double = js.native
  
  @js.native
  sealed trait RequestHeaderFieldsTooLarge
    extends StObject
       with HttpStatusCode
  /* 431 */ val RequestHeaderFieldsTooLarge: typingsJapgolly.axios.mod.HttpStatusCode.RequestHeaderFieldsTooLarge & Double = js.native
  
  @js.native
  sealed trait RequestTimeout
    extends StObject
       with HttpStatusCode
  /* 408 */ val RequestTimeout: typingsJapgolly.axios.mod.HttpStatusCode.RequestTimeout & Double = js.native
  
  @js.native
  sealed trait ResetContent
    extends StObject
       with HttpStatusCode
  /* 205 */ val ResetContent: typingsJapgolly.axios.mod.HttpStatusCode.ResetContent & Double = js.native
  
  @js.native
  sealed trait SeeOther
    extends StObject
       with HttpStatusCode
  /* 303 */ val SeeOther: typingsJapgolly.axios.mod.HttpStatusCode.SeeOther & Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable
    extends StObject
       with HttpStatusCode
  /* 503 */ val ServiceUnavailable: typingsJapgolly.axios.mod.HttpStatusCode.ServiceUnavailable & Double = js.native
  
  @js.native
  sealed trait SwitchingProtocols
    extends StObject
       with HttpStatusCode
  /* 101 */ val SwitchingProtocols: typingsJapgolly.axios.mod.HttpStatusCode.SwitchingProtocols & Double = js.native
  
  @js.native
  sealed trait TemporaryRedirect
    extends StObject
       with HttpStatusCode
  /* 307 */ val TemporaryRedirect: typingsJapgolly.axios.mod.HttpStatusCode.TemporaryRedirect & Double = js.native
  
  @js.native
  sealed trait TooEarly
    extends StObject
       with HttpStatusCode
  /* 425 */ val TooEarly: typingsJapgolly.axios.mod.HttpStatusCode.TooEarly & Double = js.native
  
  @js.native
  sealed trait TooManyRequests
    extends StObject
       with HttpStatusCode
  /* 429 */ val TooManyRequests: typingsJapgolly.axios.mod.HttpStatusCode.TooManyRequests & Double = js.native
  
  @js.native
  sealed trait Unauthorized
    extends StObject
       with HttpStatusCode
  /* 401 */ val Unauthorized: typingsJapgolly.axios.mod.HttpStatusCode.Unauthorized & Double = js.native
  
  @js.native
  sealed trait UnavailableForLegalReasons
    extends StObject
       with HttpStatusCode
  /* 451 */ val UnavailableForLegalReasons: typingsJapgolly.axios.mod.HttpStatusCode.UnavailableForLegalReasons & Double = js.native
  
  @js.native
  sealed trait UnprocessableEntity
    extends StObject
       with HttpStatusCode
  /* 422 */ val UnprocessableEntity: typingsJapgolly.axios.mod.HttpStatusCode.UnprocessableEntity & Double = js.native
  
  @js.native
  sealed trait UnsupportedMediaType
    extends StObject
       with HttpStatusCode
  /* 415 */ val UnsupportedMediaType: typingsJapgolly.axios.mod.HttpStatusCode.UnsupportedMediaType & Double = js.native
  
  @js.native
  sealed trait Unused
    extends StObject
       with HttpStatusCode
  /* 306 */ val Unused: typingsJapgolly.axios.mod.HttpStatusCode.Unused & Double = js.native
  
  @js.native
  sealed trait UpgradeRequired
    extends StObject
       with HttpStatusCode
  /* 426 */ val UpgradeRequired: typingsJapgolly.axios.mod.HttpStatusCode.UpgradeRequired & Double = js.native
  
  @js.native
  sealed trait UriTooLong
    extends StObject
       with HttpStatusCode
  /* 414 */ val UriTooLong: typingsJapgolly.axios.mod.HttpStatusCode.UriTooLong & Double = js.native
  
  @js.native
  sealed trait UseProxy
    extends StObject
       with HttpStatusCode
  /* 305 */ val UseProxy: typingsJapgolly.axios.mod.HttpStatusCode.UseProxy & Double = js.native
  
  @js.native
  sealed trait VariantAlsoNegotiates
    extends StObject
       with HttpStatusCode
  /* 506 */ val VariantAlsoNegotiates: typingsJapgolly.axios.mod.HttpStatusCode.VariantAlsoNegotiates & Double = js.native
}
