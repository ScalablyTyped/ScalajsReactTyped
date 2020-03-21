package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UssdResultCode extends js.Object

/** Describes the USSD response codes for messages sent to the network. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
@js.native
object UssdResultCode extends js.Object {
  /** The USSD message that was received is either a USSD request from the network or a response to a message sent to the network. Additional information is needed. The USSD session is open. */
  @js.native
  sealed trait actionRequired extends UssdResultCode
  
  /** The USSD session has been closed because there was no response from the network. */
  @js.native
  sealed trait networkTimeout extends UssdResultCode
  
  /** The USSD message that was received is either a USSD notification from the network or a response to an earlier request. No further information is necessary. The USSD session is closed. */
  @js.native
  sealed trait noActionRequired extends UssdResultCode
  
  /** The previous USSD request failed because the request was invalid or cannot be handled by the driver, device, or network. */
  @js.native
  sealed trait operationNotSupported extends UssdResultCode
  
  /** The previous USSD request failed because another local client has an active USSD session. */
  @js.native
  sealed trait otherLocalClient extends UssdResultCode
  
  /** The USSD session has been terminated by the network or a local client. */
  @js.native
  sealed trait terminated extends UssdResultCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UssdResultCode with Double] = js.native
  /* 1 */ @js.native
  object actionRequired extends TopLevel[actionRequired with Double]
  
  /* 5 */ @js.native
  object networkTimeout extends TopLevel[networkTimeout with Double]
  
  /* 0 */ @js.native
  object noActionRequired extends TopLevel[noActionRequired with Double]
  
  /* 4 */ @js.native
  object operationNotSupported extends TopLevel[operationNotSupported with Double]
  
  /* 3 */ @js.native
  object otherLocalClient extends TopLevel[otherLocalClient with Double]
  
  /* 2 */ @js.native
  object terminated extends TopLevel[terminated with Double]
  
}

