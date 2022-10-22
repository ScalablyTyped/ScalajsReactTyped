package typingsJapgolly.stylus.mod.Stylus.Nodes

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /**
    *  Default coercion throws.
    */
  def coerce(other: Node): Node
  
  var column: Double
  
  /**
    * Nodes by default evaluate to themselves.
    */
  def eval(): Node
  
  var filename: java.lang.String
  
  var first: Node
  
  var hash: java.lang.String
  
  var lineno: Double
  
  var nodeName: java.lang.String
  
  /**
    * Operate on `right` with the given `op`.
    */
  def operate(op: java.lang.String, right: Node): Node
  
  /**
    * Return false if `op` is generally not coerced.
    */
  def shouldCoerce(op: java.lang.String): scala.Boolean
  
  /**
    * Return true.
    */
  // tslint:disable-next-line no-unnecessary-qualifier
  def toBoolean(): Boolean
  
  /**
    * Return the expression, or wrap this node in an expression.
    */
  def toExpression(): Expression
  
  /**
    * Return a JSON representation of this node.
    */
  def toJSON(): Column
}
object Node {
  
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
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: CallbackTo[Boolean],
    toExpression: CallbackTo[Expression],
    toJSON: CallbackTo[Column]
  ): Node = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = eval.toJsFn, filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = toBoolean.toJsFn, toExpression = toExpression.toJsFn, toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setCoerce(value: Node => Node): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setEval(value: CallbackTo[Node]): Self = StObject.set(x, "eval", value.toJsFn)
    
    inline def setFilename(value: java.lang.String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Node): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setHash(value: java.lang.String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: java.lang.String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setOperate(value: (java.lang.String, Node) => Node): Self = StObject.set(x, "operate", js.Any.fromFunction2(value))
    
    inline def setShouldCoerce(value: java.lang.String => scala.Boolean): Self = StObject.set(x, "shouldCoerce", js.Any.fromFunction1(value))
    
    inline def setToBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "toBoolean", value.toJsFn)
    
    inline def setToExpression(value: CallbackTo[Expression]): Self = StObject.set(x, "toExpression", value.toJsFn)
    
    inline def setToJSON(value: CallbackTo[Column]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
