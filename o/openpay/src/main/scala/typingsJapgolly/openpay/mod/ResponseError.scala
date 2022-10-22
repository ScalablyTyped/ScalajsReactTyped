package typingsJapgolly.openpay.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseError extends StObject
@JSImport("openpay", "ResponseError")
@js.native
object ResponseError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseError & Double] = js.native
  
  @js.native
  sealed trait BadRequest
    extends StObject
       with ResponseError
  /* 1001 */ val BadRequest: typingsJapgolly.openpay.mod.ResponseError.BadRequest & Double = js.native
  
  @js.native
  sealed trait BankAccountConflict
    extends StObject
       with ResponseError
  /* 2001 */ val BankAccountConflict: typingsJapgolly.openpay.mod.ResponseError.BankAccountConflict & Double = js.native
  
  @js.native
  sealed trait BankAuthorizationRequired
    extends StObject
       with ResponseError
  /* 3012 */ val BankAuthorizationRequired: typingsJapgolly.openpay.mod.ResponseError.BankAuthorizationRequired & Double = js.native
  
  @js.native
  sealed trait CardConflict
    extends StObject
       with ResponseError
  /* 2002 */ val CardConflict: typingsJapgolly.openpay.mod.ResponseError.CardConflict & Double = js.native
  
  @js.native
  sealed trait CardExpiredOnCharge
    extends StObject
       with ResponseError
  /* 3002 */ val CardExpiredOnCharge: typingsJapgolly.openpay.mod.ResponseError.CardExpiredOnCharge & Double = js.native
  
  @js.native
  sealed trait CardExpiredOnSave
    extends StObject
       with ResponseError
  /* 2005 */ val CardExpiredOnSave: typingsJapgolly.openpay.mod.ResponseError.CardExpiredOnSave & Double = js.native
  
  @js.native
  sealed trait CardPointsUnavailable
    extends StObject
       with ResponseError
  /* 2008 */ val CardPointsUnavailable: typingsJapgolly.openpay.mod.ResponseError.CardPointsUnavailable & Double = js.native
  
  @js.native
  sealed trait Conflict
    extends StObject
       with ResponseError
  /* 1006 */ val Conflict: typingsJapgolly.openpay.mod.ResponseError.Conflict & Double = js.native
  
  @js.native
  sealed trait CustomerExternalIdConflict
    extends StObject
       with ResponseError
  /* 2003 */ val CustomerExternalIdConflict: typingsJapgolly.openpay.mod.ResponseError.CustomerExternalIdConflict & Double = js.native
  
  @js.native
  sealed trait DeclinedCard
    extends StObject
       with ResponseError
  /* 3001 */ val DeclinedCard: typingsJapgolly.openpay.mod.ResponseError.DeclinedCard & Double = js.native
  
  @js.native
  sealed trait DisabledAccount
    extends StObject
       with ResponseError
  /* 1008 */ val DisabledAccount: typingsJapgolly.openpay.mod.ResponseError.DisabledAccount & Double = js.native
  
  @js.native
  sealed trait Forbidden
    extends StObject
       with ResponseError
  /* 1010 */ val Forbidden: typingsJapgolly.openpay.mod.ResponseError.Forbidden & Double = js.native
  
  @js.native
  sealed trait ForbiddenOperation
    extends StObject
       with ResponseError
  /* 3006 */ val ForbiddenOperation: typingsJapgolly.openpay.mod.ResponseError.ForbiddenOperation & Double = js.native
  
  @js.native
  sealed trait FraudulentCard
    extends StObject
       with ResponseError
  /* 3005 */ val FraudulentCard: typingsJapgolly.openpay.mod.ResponseError.FraudulentCard & Double = js.native
  
  @js.native
  sealed trait InsufficientAccountFunds
    extends StObject
       with ResponseError
  /* 4001 */ val InsufficientAccountFunds: typingsJapgolly.openpay.mod.ResponseError.InsufficientAccountFunds & Double = js.native
  
  @js.native
  sealed trait InsufficientCardFunds
    extends StObject
       with ResponseError
  /* 3003 */ val InsufficientCardFunds: typingsJapgolly.openpay.mod.ResponseError.InsufficientCardFunds & Double = js.native
  
  @js.native
  sealed trait InvalidCardSecurityCode
    extends StObject
       with ResponseError
  /* 2009 */ val InvalidCardSecurityCode: typingsJapgolly.openpay.mod.ResponseError.InvalidCardSecurityCode & Double = js.native
  
  @js.native
  sealed trait InvalidCardVerifyingCode
    extends StObject
       with ResponseError
  /* 2004 */ val InvalidCardVerifyingCode: typingsJapgolly.openpay.mod.ResponseError.InvalidCardVerifyingCode & Double = js.native
  
  @js.native
  sealed trait LostCard
    extends StObject
       with ResponseError
  /* 3009 */ val LostCard: typingsJapgolly.openpay.mod.ResponseError.LostCard & Double = js.native
  
  @js.native
  sealed trait MissingCardSecurityCode
    extends StObject
       with ResponseError
  /* 2006 */ val MissingCardSecurityCode: typingsJapgolly.openpay.mod.ResponseError.MissingCardSecurityCode & Double = js.native
  
  @js.native
  sealed trait NotFound
    extends StObject
       with ResponseError
  /* 1005 */ val NotFound: typingsJapgolly.openpay.mod.ResponseError.NotFound & Double = js.native
  
  @js.native
  sealed trait OpenpayInternalError
    extends StObject
       with ResponseError
  /* 1000 */ val OpenpayInternalError: typingsJapgolly.openpay.mod.ResponseError.OpenpayInternalError & Double = js.native
  
  @js.native
  sealed trait RejectedTransaction
    extends StObject
       with ResponseError
  /* 1007 */ val RejectedTransaction: typingsJapgolly.openpay.mod.ResponseError.RejectedTransaction & Double = js.native
  
  @js.native
  sealed trait RequestEntityTooLarge
    extends StObject
       with ResponseError
  /* 1009 */ val RequestEntityTooLarge: typingsJapgolly.openpay.mod.ResponseError.RequestEntityTooLarge & Double = js.native
  
  @js.native
  sealed trait RestrictedCard
    extends StObject
       with ResponseError
  /* 3010 */ val RestrictedCard: typingsJapgolly.openpay.mod.ResponseError.RestrictedCard & Double = js.native
  
  @js.native
  sealed trait RetainedCard
    extends StObject
       with ResponseError
  /* 3011 */ val RetainedCard: typingsJapgolly.openpay.mod.ResponseError.RetainedCard & Double = js.native
  
  @js.native
  sealed trait SandboxCard
    extends StObject
       with ResponseError
  /* 2007 */ val SandboxCard: typingsJapgolly.openpay.mod.ResponseError.SandboxCard & Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable
    extends StObject
       with ResponseError
  /* 1004 */ val ServiceUnavailable: typingsJapgolly.openpay.mod.ResponseError.ServiceUnavailable & Double = js.native
  
  @js.native
  sealed trait StolenCard
    extends StObject
       with ResponseError
  /* 3004 */ val StolenCard: typingsJapgolly.openpay.mod.ResponseError.StolenCard & Double = js.native
  
  @js.native
  sealed trait Unauthorized
    extends StObject
       with ResponseError
  /* 1002 */ val Unauthorized: typingsJapgolly.openpay.mod.ResponseError.Unauthorized & Double = js.native
  
  @js.native
  sealed trait UnprocessableEntity
    extends StObject
       with ResponseError
  /* 1003 */ val UnprocessableEntity: typingsJapgolly.openpay.mod.ResponseError.UnprocessableEntity & Double = js.native
  
  @js.native
  sealed trait UnsupportedCard
    extends StObject
       with ResponseError
  /* 3008 */ val UnsupportedCard: typingsJapgolly.openpay.mod.ResponseError.UnsupportedCard & Double = js.native
}
