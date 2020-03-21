package typingsJapgolly.intlTelInput.mod._Global_.intlTelInputUtils

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait validationError extends js.Object

@JSGlobal("intlTelInputUtils.validationError")
@js.native
object validationError extends js.Object {
  @js.native
  sealed trait INVALID_COUNTRY_CODE extends validationError
  
  @js.native
  sealed trait IS_POSSIBLE extends validationError
  
  @js.native
  sealed trait NOT_A_NUMBER extends validationError
  
  @js.native
  sealed trait TOO_LONG extends validationError
  
  @js.native
  sealed trait TOO_SHORT extends validationError
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[validationError with Double] = js.native
  /* 1 */ @js.native
  object INVALID_COUNTRY_CODE extends TopLevel[INVALID_COUNTRY_CODE with Double]
  
  /* 0 */ @js.native
  object IS_POSSIBLE extends TopLevel[IS_POSSIBLE with Double]
  
  /* 4 */ @js.native
  object NOT_A_NUMBER extends TopLevel[NOT_A_NUMBER with Double]
  
  /* 3 */ @js.native
  object TOO_LONG extends TopLevel[TOO_LONG with Double]
  
  /* 2 */ @js.native
  object TOO_SHORT extends TopLevel[TOO_SHORT with Double]
  
}

