package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.BreakStatement_
  - typingsJapgolly.babelTypes.mod.ContinueStatement_
  - typingsJapgolly.babelTypes.mod.ReturnStatement_
  - typingsJapgolly.babelTypes.mod.ThrowStatement_
  - typingsJapgolly.babelTypes.mod.YieldExpression_
  - typingsJapgolly.babelTypes.mod.AwaitExpression_
*/
trait Terminatorless extends StObject
object Terminatorless {
  
  inline def AwaitExpression_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.AwaitExpression_]
  }
  
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
  
  inline def YieldExpression_(argument: Expression, delegate: Boolean, end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.YieldExpression_]
  }
}
