package typingsJapgolly.stylus.mod.Stylus.Nodes

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stylus.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait If extends Node {
  var block: Block
  var cond: Expression
  var elses: js.Array[Expression]
  var negate: scala.Boolean
}

object If {
  @scala.inline
  def apply(
    block: Block,
    coerce: Node => CallbackTo[Node],
    column: Double,
    cond: Expression,
    elses: js.Array[Expression],
    eval: CallbackTo[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    negate: scala.Boolean,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => CallbackTo[Node],
    shouldCoerce: java.lang.String => CallbackTo[scala.Boolean],
    toBoolean: CallbackTo[Boolean],
    toExpression: CallbackTo[Expression],
    toJSON: CallbackTo[AnonColumn]
  ): If = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], elses = elses.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => coerce(t0).runNow()))
    __obj.updateDynamic("eval")(eval.toJsFn)
    __obj.updateDynamic("operate")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => operate(t0, t1).runNow()))
    __obj.updateDynamic("shouldCoerce")(js.Any.fromFunction1((t0: java.lang.String) => shouldCoerce(t0).runNow()))
    __obj.updateDynamic("toBoolean")(toBoolean.toJsFn)
    __obj.updateDynamic("toExpression")(toExpression.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[If]
  }
}

