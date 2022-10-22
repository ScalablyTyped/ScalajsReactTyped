package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the network response after sending a USSD message. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.UssdReply")
@js.native
open class UssdReply ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.UssdReply {
  
  /** Gets the message for the USSD response. */
  /* CompleteClass */
  var message: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.UssdMessage = js.native
  
  /** Gets the result code for the USSD response. */
  /* CompleteClass */
  var resultCode: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode = js.native
}
