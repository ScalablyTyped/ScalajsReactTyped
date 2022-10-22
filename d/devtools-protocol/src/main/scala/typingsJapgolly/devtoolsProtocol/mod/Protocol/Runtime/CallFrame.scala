package typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime

import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallFrame extends StObject {
  
  /**
    * JavaScript script column number (0-based).
    */
  var columnNumber: integer
  
  /**
    * JavaScript function name.
    */
  var functionName: String
  
  /**
    * JavaScript script line number (0-based).
    */
  var lineNumber: integer
  
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId
  
  /**
    * JavaScript script name or url.
    */
  var url: String
}
object CallFrame {
  
  inline def apply(columnNumber: integer, functionName: String, lineNumber: integer, scriptId: ScriptId, url: String): CallFrame = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFrame]
  }
  
  extension [Self <: CallFrame](x: Self) {
    
    inline def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
