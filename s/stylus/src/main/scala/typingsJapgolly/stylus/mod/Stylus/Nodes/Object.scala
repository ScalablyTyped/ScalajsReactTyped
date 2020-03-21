package typingsJapgolly.stylus.mod.Stylus.Nodes

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stylus.AnonColumn
import typingsJapgolly.stylus.mod.Stylus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends Node {
  var length: Double
  var vals: Dictionary[Node]
  /**
    * Get `key`.
    */
  def get(key: java.lang.String): Node
  /**
    * Has `key`?
    */
  def has(key: java.lang.String): scala.Boolean
  /**
    * Set `key` to `val`.
    */
  def set(key: java.lang.String, value: Node): this.type
  /**
    * Convert object to string with properties.
    */
  def toBlock(): java.lang.String
}

object Object {
  @scala.inline
  def apply(
    coerce: Node => CallbackTo[Node],
    column: Double,
    eval: CallbackTo[Node],
    filename: java.lang.String,
    first: Node,
    get: java.lang.String => CallbackTo[Node],
    has: java.lang.String => CallbackTo[scala.Boolean],
    hash: java.lang.String,
    length: Double,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => CallbackTo[Node],
    set: (java.lang.String, Node) => CallbackTo[Object],
    shouldCoerce: java.lang.String => CallbackTo[scala.Boolean],
    toBlock: CallbackTo[java.lang.String],
    toBoolean: CallbackTo[Boolean],
    toExpression: CallbackTo[Expression],
    toJSON: CallbackTo[AnonColumn],
    vals: Dictionary[Node]
  ): Object = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
    __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => coerce(t0).runNow()))
    __obj.updateDynamic("eval")(eval.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("operate")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => operate(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => set(t0, t1).runNow()))
    __obj.updateDynamic("shouldCoerce")(js.Any.fromFunction1((t0: java.lang.String) => shouldCoerce(t0).runNow()))
    __obj.updateDynamic("toBlock")(toBlock.toJsFn)
    __obj.updateDynamic("toBoolean")(toBoolean.toJsFn)
    __obj.updateDynamic("toExpression")(toExpression.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Object]
  }
}

