package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One of:
  * - IT_SCRIPTLINE; the engine returns the statement that will be executed next.
  * - IT_MSGBOX; the engine returns a script execution error message. This type can only be returned if the parameter qInteractOnError was set to true when calling the ConfigureReload method.
  * - IT_BREAK; the engine breaks and waits for a response on what to do next.
  * - IT_END; the engine has finished to execute all statements in the script.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_SCRIPTLINE
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_MSGBOX
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_BREAK
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_END
*/
trait InteractionType extends StObject
object InteractionType {
  
  inline def IT_BREAK: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_BREAK = "IT_BREAK".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_BREAK]
  
  inline def IT_END: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_END = "IT_END".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_END]
  
  inline def IT_MSGBOX: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_MSGBOX = "IT_MSGBOX".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_MSGBOX]
  
  inline def IT_SCRIPTLINE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_SCRIPTLINE = "IT_SCRIPTLINE".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_SCRIPTLINE]
}
