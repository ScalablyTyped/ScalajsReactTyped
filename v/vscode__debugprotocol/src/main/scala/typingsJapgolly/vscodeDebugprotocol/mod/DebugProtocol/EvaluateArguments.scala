package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.clipboard
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.hover
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.repl
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.variables
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.watch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `evaluate` request. */
trait EvaluateArguments extends StObject {
  
  /** The context in which the evaluate request is used.
  			Values: 
  			'variables': evaluate is called from a variables view context.
  			'watch': evaluate is called from a watch view context.
  			'repl': evaluate is called from a REPL context.
  			'hover': evaluate is called to generate the debug hover contents.
  			This value should only be used if the corresponding capability `supportsEvaluateForHovers` is true.
  			'clipboard': evaluate is called to generate clipboard contents.
  			This value should only be used if the corresponding capability `supportsClipboardContext` is true.
  			etc.
  		*/
  var context: js.UndefOr[variables | watch | repl | hover | clipboard | String] = js.undefined
  
  /** The expression to evaluate. */
  var expression: String
  
  /** Specifies details on how to format the result.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportsValueFormattingOptions` is true.
  		*/
  var format: js.UndefOr[ValueFormat] = js.undefined
  
  /** Evaluate the expression in the scope of this stack frame. If not specified, the expression is evaluated in the global scope. */
  var frameId: js.UndefOr[Double] = js.undefined
}
object EvaluateArguments {
  
  inline def apply(expression: String): EvaluateArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateArguments]
  }
  
  extension [Self <: EvaluateArguments](x: Self) {
    
    inline def setContext(value: variables | watch | repl | hover | clipboard | String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ValueFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
  }
}
