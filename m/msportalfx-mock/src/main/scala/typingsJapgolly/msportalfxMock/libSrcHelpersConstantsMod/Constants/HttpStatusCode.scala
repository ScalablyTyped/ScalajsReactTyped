package typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpStatusCode extends StObject
/**
  * Http status codes
  */
@JSImport("msportalfx-mock/lib/src/Helpers/constants", "Constants.HttpStatusCode")
@js.native
object HttpStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpStatusCode & Double] = js.native
  
  @js.native
  sealed trait Accepted
    extends StObject
       with HttpStatusCode
  /* 202 */ val Accepted: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Accepted & Double = js.native
  
  @js.native
  sealed trait Ambiguous
    extends StObject
       with HttpStatusCode
  /* 300 */ val Ambiguous: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Ambiguous & Double = js.native
  
  @js.native
  sealed trait BadGateway
    extends StObject
       with HttpStatusCode
  /* 502 */ val BadGateway: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.BadGateway & Double = js.native
  
  @js.native
  sealed trait BadRequest
    extends StObject
       with HttpStatusCode
  /* 400 */ val BadRequest: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.BadRequest & Double = js.native
  
  @js.native
  sealed trait Conflict
    extends StObject
       with HttpStatusCode
  /* 409 */ val Conflict: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Conflict & Double = js.native
  
  @js.native
  sealed trait Continue
    extends StObject
       with HttpStatusCode
  /* 100 */ val Continue: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Continue & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with HttpStatusCode
  /* 201 */ val Created: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Created & Double = js.native
  
  @js.native
  sealed trait ExpectationFailed
    extends StObject
       with HttpStatusCode
  /* 417 */ val ExpectationFailed: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.ExpectationFailed & Double = js.native
  
  @js.native
  sealed trait Forbidden
    extends StObject
       with HttpStatusCode
  /* 403 */ val Forbidden: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Forbidden & Double = js.native
  
  @js.native
  sealed trait Found
    extends StObject
       with HttpStatusCode
  /* 302 */ val Found: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Found & Double = js.native
  
  @js.native
  sealed trait GatewayTimeout
    extends StObject
       with HttpStatusCode
  /* 504 */ val GatewayTimeout: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.GatewayTimeout & Double = js.native
  
  @js.native
  sealed trait Gone
    extends StObject
       with HttpStatusCode
  /* 410 */ val Gone: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Gone & Double = js.native
  
  @js.native
  sealed trait HttpVersionNotSupported
    extends StObject
       with HttpStatusCode
  /* 505 */ val HttpVersionNotSupported: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.HttpVersionNotSupported & Double = js.native
  
  @js.native
  sealed trait InternalServerError
    extends StObject
       with HttpStatusCode
  /* 500 */ val InternalServerError: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.InternalServerError & Double = js.native
  
  @js.native
  sealed trait LengthRequired
    extends StObject
       with HttpStatusCode
  /* 411 */ val LengthRequired: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.LengthRequired & Double = js.native
  
  @js.native
  sealed trait MethodNotAllowed
    extends StObject
       with HttpStatusCode
  /* 405 */ val MethodNotAllowed: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.MethodNotAllowed & Double = js.native
  
  @js.native
  sealed trait Moved
    extends StObject
       with HttpStatusCode
  /* 301 */ val Moved: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Moved & Double = js.native
  
  @js.native
  sealed trait MovedPermanently
    extends StObject
       with HttpStatusCode
  /* 301 */ val MovedPermanently: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.MovedPermanently & Double = js.native
  
  @js.native
  sealed trait MultipleChoices
    extends StObject
       with HttpStatusCode
  /* 300 */ val MultipleChoices: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.MultipleChoices & Double = js.native
  
  @js.native
  sealed trait NoContent
    extends StObject
       with HttpStatusCode
  /* 204 */ val NoContent: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NoContent & Double = js.native
  
  @js.native
  sealed trait NonAuthoritativeInformation
    extends StObject
       with HttpStatusCode
  /* 203 */ val NonAuthoritativeInformation: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NonAuthoritativeInformation & Double = js.native
  
  @js.native
  sealed trait NotAcceptable
    extends StObject
       with HttpStatusCode
  /* 406 */ val NotAcceptable: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NotAcceptable & Double = js.native
  
  @js.native
  sealed trait NotFound
    extends StObject
       with HttpStatusCode
  /* 404 */ val NotFound: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NotFound & Double = js.native
  
  @js.native
  sealed trait NotImplemented
    extends StObject
       with HttpStatusCode
  /* 501 */ val NotImplemented: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NotImplemented & Double = js.native
  
  @js.native
  sealed trait NotModified
    extends StObject
       with HttpStatusCode
  /* 304 */ val NotModified: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NotModified & Double = js.native
  
  @js.native
  sealed trait Ok
    extends StObject
       with HttpStatusCode
  /* 200 */ val Ok: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Ok & Double = js.native
  
  @js.native
  sealed trait PartialContent
    extends StObject
       with HttpStatusCode
  /* 206 */ val PartialContent: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.PartialContent & Double = js.native
  
  @js.native
  sealed trait PaymentRequired
    extends StObject
       with HttpStatusCode
  /* 402 */ val PaymentRequired: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.PaymentRequired & Double = js.native
  
  @js.native
  sealed trait PreconditionFailed
    extends StObject
       with HttpStatusCode
  /* 412 */ val PreconditionFailed: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.PreconditionFailed & Double = js.native
  
  @js.native
  sealed trait ProxyAuthenticationRequired
    extends StObject
       with HttpStatusCode
  /* 407 */ val ProxyAuthenticationRequired: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.ProxyAuthenticationRequired & Double = js.native
  
  @js.native
  sealed trait Redirect
    extends StObject
       with HttpStatusCode
  /* 302 */ val Redirect: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Redirect & Double = js.native
  
  @js.native
  sealed trait RedirectKeepVerb
    extends StObject
       with HttpStatusCode
  /* 307 */ val RedirectKeepVerb: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RedirectKeepVerb & Double = js.native
  
  @js.native
  sealed trait RedirectMethod
    extends StObject
       with HttpStatusCode
  /* 303 */ val RedirectMethod: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RedirectMethod & Double = js.native
  
  @js.native
  sealed trait RequestEntityTooLarge
    extends StObject
       with HttpStatusCode
  /* 413 */ val RequestEntityTooLarge: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RequestEntityTooLarge & Double = js.native
  
  @js.native
  sealed trait RequestTimeout
    extends StObject
       with HttpStatusCode
  /* 408 */ val RequestTimeout: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RequestTimeout & Double = js.native
  
  @js.native
  sealed trait RequestUriTooLong
    extends StObject
       with HttpStatusCode
  /* 414 */ val RequestUriTooLong: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RequestUriTooLong & Double = js.native
  
  @js.native
  sealed trait RequestedRangeNotSatisfiable
    extends StObject
       with HttpStatusCode
  /* 416 */ val RequestedRangeNotSatisfiable: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RequestedRangeNotSatisfiable & Double = js.native
  
  @js.native
  sealed trait ResetContent
    extends StObject
       with HttpStatusCode
  /* 205 */ val ResetContent: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.ResetContent & Double = js.native
  
  @js.native
  sealed trait SeeOther
    extends StObject
       with HttpStatusCode
  /* 303 */ val SeeOther: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.SeeOther & Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable
    extends StObject
       with HttpStatusCode
  /* 503 */ val ServiceUnavailable: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.ServiceUnavailable & Double = js.native
  
  @js.native
  sealed trait SwitchingProtocols
    extends StObject
       with HttpStatusCode
  /* 101 */ val SwitchingProtocols: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.SwitchingProtocols & Double = js.native
  
  @js.native
  sealed trait TemporaryRedirect
    extends StObject
       with HttpStatusCode
  /* 307 */ val TemporaryRedirect: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.TemporaryRedirect & Double = js.native
  
  @js.native
  sealed trait Unauthorized
    extends StObject
       with HttpStatusCode
  /* 401 */ val Unauthorized: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Unauthorized & Double = js.native
  
  @js.native
  sealed trait UnsupportedMediaType
    extends StObject
       with HttpStatusCode
  /* 415 */ val UnsupportedMediaType: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.UnsupportedMediaType & Double = js.native
  
  @js.native
  sealed trait Unused
    extends StObject
       with HttpStatusCode
  /* 306 */ val Unused: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Unused & Double = js.native
  
  @js.native
  sealed trait UpgradeRequired
    extends StObject
       with HttpStatusCode
  /* 426 */ val UpgradeRequired: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.UpgradeRequired & Double = js.native
  
  @js.native
  sealed trait UseProxy
    extends StObject
       with HttpStatusCode
  /* 305 */ val UseProxy: typingsJapgolly.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.UseProxy & Double = js.native
}
