package typingsJapgolly.stylus.mod.Stylus.Nodes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stylus.AnonColumn
import typingsJapgolly.stylus.mod.Stylus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arguments extends Expression {
  var map: Dictionary[Node]
}

object Arguments {
  @scala.inline
  def apply(
    coerce: Node => CallbackTo[Node],
    column: Double,
    eval: CallbackTo[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    isEmpty: scala.Boolean,
    isList: scala.Boolean,
    lineno: Double,
    map: Dictionary[Node],
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: (java.lang.String, Node) => CallbackTo[Node],
    push: Node => Callback,
    shouldCoerce: java.lang.String => CallbackTo[scala.Boolean],
    toBoolean: CallbackTo[Boolean],
    toExpression: CallbackTo[Expression],
    toJSON: CallbackTo[AnonColumn]
  ): Arguments = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isList = isList.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => coerce(t0).runNow()))
    __obj.updateDynamic("eval")(eval.toJsFn)
    __obj.updateDynamic("operate")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => operate(t0, t1).runNow()))
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => push(t0).runNow()))
    __obj.updateDynamic("shouldCoerce")(js.Any.fromFunction1((t0: java.lang.String) => shouldCoerce(t0).runNow()))
    __obj.updateDynamic("toBoolean")(toBoolean.toJsFn)
    __obj.updateDynamic("toExpression")(toExpression.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Arguments]
  }
}

