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
trait Terminatorless
  extends StObject
     with _Node
object Terminatorless {
  
  inline def AwaitExpression_(argument: Expression): typingsJapgolly.babelTypes.mod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.AwaitExpression_]
  }
  
  inline def BreakStatement_(): typingsJapgolly.babelTypes.mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BreakStatement_]
  }
  
  inline def ContinueStatement_(): typingsJapgolly.babelTypes.mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ContinueStatement_]
  }
  
  inline def ReturnStatement_(): typingsJapgolly.babelTypes.mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ReturnStatement_]
  }
  
  inline def ThrowStatement_(argument: Expression): typingsJapgolly.babelTypes.mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ThrowStatement_]
  }
  
  inline def YieldExpression_(delegate: Boolean): typingsJapgolly.babelTypes.mod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.YieldExpression_]
  }
}
