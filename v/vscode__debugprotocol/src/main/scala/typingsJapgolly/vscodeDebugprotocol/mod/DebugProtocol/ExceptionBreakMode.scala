package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration defines all possible conditions when a thrown exception should result in a break.
		never: never breaks,
		always: always breaks,
		unhandled: breaks when exception unhandled,
		userUnhandled: breaks if the exception is not handled by user code.
	*/
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.never
  - typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.always
  - typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.unhandled
  - typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.userUnhandled
*/
trait ExceptionBreakMode extends StObject
object ExceptionBreakMode {
  
  inline def always: typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.always = "always".asInstanceOf[typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.always]
  
  inline def never: typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.never = "never".asInstanceOf[typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.never]
  
  inline def unhandled: typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.unhandled = "unhandled".asInstanceOf[typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.unhandled]
  
  inline def userUnhandled: typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.userUnhandled = "userUnhandled".asInstanceOf[typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.userUnhandled]
}
