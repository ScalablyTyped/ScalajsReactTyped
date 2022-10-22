package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.BreakStatement_
  - typingsJapgolly.babelTypes.mod.ContinueStatement_
  - typingsJapgolly.babelTypes.mod.ReturnStatement_
  - typingsJapgolly.babelTypes.mod.ThrowStatement_
*/
trait CompletionStatement extends StObject
object CompletionStatement {
  
  inline def BreakStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BreakStatement_]
  }
  
  inline def ContinueStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ContinueStatement_]
  }
  
  inline def ReturnStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ReturnStatement_]
  }
  
  inline def ThrowStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ThrowStatement_]
  }
}
