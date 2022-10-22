package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBreakpointByUrlRequest extends StObject {
  
  /**
    * Offset in the line to set breakpoint at.
    */
  var columnNumber: js.UndefOr[integer] = js.undefined
  
  /**
    * Expression to use as a breakpoint condition. When specified, debugger will only stop on the
    * breakpoint if this expression evaluates to true.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * Line number to set breakpoint at.
    */
  var lineNumber: integer
  
  /**
    * Script hash of the resources to set breakpoint on.
    */
  var scriptHash: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the resources to set breakpoint on.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Regex pattern for the URLs of the resources to set breakpoints on. Either `url` or
    * `urlRegex` must be specified.
    */
  var urlRegex: js.UndefOr[String] = js.undefined
}
object SetBreakpointByUrlRequest {
  
  inline def apply(lineNumber: integer): SetBreakpointByUrlRequest = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointByUrlRequest]
  }
  
  extension [Self <: SetBreakpointByUrlRequest](x: Self) {
    
    inline def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setScriptHash(value: String): Self = StObject.set(x, "scriptHash", value.asInstanceOf[js.Any])
    
    inline def setScriptHashUndefined: Self = StObject.set(x, "scriptHash", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlRegex(value: String): Self = StObject.set(x, "urlRegex", value.asInstanceOf[js.Any])
    
    inline def setUrlRegexUndefined: Self = StObject.set(x, "urlRegex", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
