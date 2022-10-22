package typingsJapgolly.stylus.mod.Stylus.Nodes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group
  extends StObject
     with Node {
  
  var block: Block
  
  var hasOnlyPlaceholders: scala.Boolean
  
  var nodes: js.Array[Node]
  
  /**
    * Push the given `selector` node.
    */
  def push(node: Node): scala.Unit
}
object Group {
  
  inline def apply(
    block: Block,
    coerce: Node => Node,
    column: Double,
    eval: CallbackTo[Node],
    filename: java.lang.String,
    first: Node,
    hasOnlyPlaceholders: scala.Boolean,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: (java.lang.String, Node) => Node,
    push: Node => Callback,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: CallbackTo[Boolean],
    toExpression: CallbackTo[Expression],
    toJSON: CallbackTo[Column]
  ): Group = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = eval.toJsFn, filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hasOnlyPlaceholders = hasOnlyPlaceholders.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), push = js.Any.fromFunction1((t0: Node) => push(t0).runNow()), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = toBoolean.toJsFn, toExpression = toExpression.toJsFn, toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setHasOnlyPlaceholders(value: scala.Boolean): Self = StObject.set(x, "hasOnlyPlaceholders", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPush(value: Node => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
  }
}
