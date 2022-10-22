package typingsJapgolly.stylus.mod.Stylus.Nodes

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Literal
  extends StObject
     with Node {
  
  var prefixed: scala.Boolean
  
  var string: java.lang.String
  
  var `val`: java.lang.String
}
object Literal {
  
  inline def apply(
    coerce: Node => Node,
    column: Double,
    eval: CallbackTo[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    prefixed: scala.Boolean,
    shouldCoerce: java.lang.String => scala.Boolean,
    string: java.lang.String,
    toBoolean: CallbackTo[Boolean],
    toExpression: CallbackTo[Expression],
    toJSON: CallbackTo[Column],
    `val`: java.lang.String
  ): Literal = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = eval.toJsFn, filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), prefixed = prefixed.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), string = string.asInstanceOf[js.Any], toBoolean = toBoolean.toJsFn, toExpression = toExpression.toJsFn, toJSON = toJSON.toJsFn)
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  extension [Self <: Literal](x: Self) {
    
    inline def setPrefixed(value: scala.Boolean): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setVal(value: java.lang.String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
