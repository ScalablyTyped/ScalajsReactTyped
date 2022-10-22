package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.ConditionalExpression_
  - typingsJapgolly.babelTypes.mod.IfStatement_
*/
trait Conditional
  extends StObject
     with _Node
object Conditional {
  
  inline def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typingsJapgolly.babelTypes.mod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ConditionalExpression_]
  }
  
  inline def IfStatement_(consequent: Statement, test: Expression): typingsJapgolly.babelTypes.mod.IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], alternate = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.IfStatement_]
  }
}
