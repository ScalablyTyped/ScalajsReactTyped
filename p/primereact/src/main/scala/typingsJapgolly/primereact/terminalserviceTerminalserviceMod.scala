package typingsJapgolly.primereact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalserviceTerminalserviceMod {
  
  @JSImport("primereact/terminalservice/terminalservice", "TerminalService")
  @js.native
  val TerminalService: TerminalServiceOptions = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.command
    - typingsJapgolly.primereact.primereactStrings.response
    - typingsJapgolly.primereact.primereactStrings.clear
  */
  trait TerminalServiceActionType extends StObject
  object TerminalServiceActionType {
    
    inline def clear: typingsJapgolly.primereact.primereactStrings.clear = "clear".asInstanceOf[typingsJapgolly.primereact.primereactStrings.clear]
    
    inline def command: typingsJapgolly.primereact.primereactStrings.command = "command".asInstanceOf[typingsJapgolly.primereact.primereactStrings.command]
    
    inline def response: typingsJapgolly.primereact.primereactStrings.response = "response".asInstanceOf[typingsJapgolly.primereact.primereactStrings.response]
  }
  
  @js.native
  trait TerminalServiceOptions extends StObject {
    
    def emit(action: TerminalServiceActionType): Unit = js.native
    def emit(action: TerminalServiceActionType, params: Any): Unit = js.native
    
    def off(action: TerminalServiceActionType, fn: Any): Unit = js.native
    
    def on(action: TerminalServiceActionType, fn: Any): Unit = js.native
  }
}
