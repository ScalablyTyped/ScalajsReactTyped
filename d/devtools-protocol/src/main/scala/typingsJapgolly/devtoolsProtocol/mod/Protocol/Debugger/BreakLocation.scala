package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`return`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.call
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.debuggerStatement
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakLocation extends StObject {
  
  /**
    * Column number in the script (0-based).
    */
  var columnNumber: js.UndefOr[integer] = js.undefined
  
  /**
    * Line number in the script (0-based).
    */
  var lineNumber: integer
  
  /**
    * Script identifier as reported in the `Debugger.scriptParsed`.
    */
  var scriptId: ScriptId
  
  /**
    *  (BreakLocationType enum)
    */
  var `type`: js.UndefOr[debuggerStatement | call | `return`] = js.undefined
}
object BreakLocation {
  
  inline def apply(lineNumber: integer, scriptId: ScriptId): BreakLocation = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakLocation]
  }
  
  extension [Self <: BreakLocation](x: Self) {
    
    inline def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setType(value: debuggerStatement | call | `return`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
